

var app=angular.module('app',['ui.router']);

app.factory('examService',function($http,$window,$location,$q) {
	var service={};
	service.data=false;
	service.getAllCommande=getAllCommande;
	service.getAllClient=getAllClient;
	service.getAllDetail=getAllDetail;
	return service;

	function getAllDetail() {
		var deferred=$q.defer();
        $http({
			url : 'exam/getAllDetail',
			method : 'GET',
			dataType : 'json'
        }).success(function(data) {
            service.data=data;
            deferred.resolve(service.data);
        }).error(function (data,status) {
            deferred.reject('impossible de contacter le serveur');
        });
        return deferred.promise;
	}
	
	function getAllCommande() {
		var deferred=$q.defer();
        $http({
			url : 'exam/getAllCommande',
			method : 'GET',
			dataType : 'json'
        }).success(function(data) {
            service.data=data;
            deferred.resolve(service.data);
        }).error(function (data,status) {
            deferred.reject('impossible de contacter le serveur');
        });
        return deferred.promise;
	}
	
	function getAllClient() {
		var deferred=$q.defer();
        $http({
			url : 'exam/getAllClients',
			method : 'GET',
			dataType : 'json'
        }).success(function(data) {
            service.data=data;
            deferred.resolve(service.data);
        }).error(function (data,status) {
            deferred.reject('impossible de contacter le serveur');
        });
        return deferred.promise;
	}

});




app.controller('defaultCTRL',['$location','examService','$scope',function($location,examService,$scope){
	 var ct=this;
	 ct.getAllCommande=getAllCommande;
	 ct.getAllClient=getAllClient;
	 ct.getAllDetail=getAllDetail;
	 initController();
	 
	 function initController(){
	   ct.getAllCommande();
	   ct.getAllClient();
	   ct.getAllDetail();
	 }
	 
	 function getAllDetail() {
		 examService.getAllDetail().then(function(listDetail){
			     ct.listDetail=listDetail;
			     },function(msg){
			         alert(msg);
			     });
		}
	 
	 function getAllCommande() {
		 examService.getAllCommande().then(function(listCom){
			     ct.ListCom=listCom;
			     },function(msg){
			         alert(msg);
			     });
		}
	 
	 function getAllClient() {
		 examService.getAllClient().then(function(listClients){
			     ct.ListClients=listClients;
			     },function(msg){
			         alert(msg);
			     });
		}
	 
	  $scope.rechercher=function() {
		  $scope.noclient="";
		  $scope.trouver=0;
		  var values=ct.ListClients;
		  angular.forEach(values, function(value, key) {
		         if(value.codeClient==$scope.codeClient){
		        	 $scope.trouver=1;
		        	$scope.idClient=value.idClient;
		        	 $scope.nomClient=value.nomClient;
		         }
		     });
		  if($scope.trouver==1){
			  $scope.noclient="";
			  $scope.rechercherComClient($scope.idClient);
		  }else{
			  $scope.noclient="Un client avec ce code n'existe pas"; 
		  }
		  
		}
	  $scope.ChargerCommande=function() {
		  var values=ct.listDetail;
		  angular.forEach(values, function(value, key) {
			  alert(value[0].idCom.idClient.codeClient);
		         if(value[0].idCom.idClient.codeClient==$scope.codeClient){
		        	 $scope.TabNex=value;
		         }
		     });
		 
		  
		}
	  
	  $scope.rechercherComClient=function(idClient) {
		  $scope.nocommande="";
		  $scope.trouver=0;
		  var values=ct.ListCom;
		  angular.forEach(values, function(value, key) {
		         if(value.idClient.codeClient==$scope.codeClient){
		        	 $scope.trouver=1;
		        	 $scope.nomClient=value.idClient.nomClient;
		         }
		     });
		  if($scope.trouver==1){
			  $scope.noclient="";
			  $scope.nocommande="";
			  $scope.ChargerCommande();
		  }else{
			  $scope.nocommande="Ce client N'a pas passer de commande"; 
		  }
		  
		}
	  
	 
	  
	  
	 
	
	}]);