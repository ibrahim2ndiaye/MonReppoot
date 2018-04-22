<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html ng-app="app">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no" name="viewport" />
	<meta content="" name="description" />
	<meta content="" name="author" />


<meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no">
<meta name="apple-mobile-web-app-capable" content="yes">
<title>Insert title here</title>

</head>
<body ng-controller="defaultCTRL">
  <pre>
  <fieldset>
  <legend>Rechercher une Commande</legend>
  <p style="color:red">{{noclient}}</p><br>
   <p style="color:red">{{nocommande}}</p><br>
  Code client    :<input type="text"  ng-model="codeClient" /> <button ng-click="rechercher()">Rechercher</button><br>
  Nom Client    :{{nomClient}} <br>
  
  La derniere Commande : <br>
  
  <table border="1"><tr>
  <th>Nom Prod</th><th>Prix Produit</th><th>Quantité Produit</th><th>Montant</th></tr>
<tr ng-repeat="cm in TabNex">
<td>jjj</td>
<td></td>
<td></td>
<td></td>
<td></td>
<td></td></tr>

</table>
  </fieldset>
  </pre>


<!-- Le javascript================================================= --> 



 <script language="javascript" type="text/javascript" src='<c:url value="static/js/angular/angular.min.js"></c:url>'></script>
 <script language="javascript" type="text/javascript" src='<c:url value="static/js/ui-route/angular-ui-router.min.js"></c:url>'></script>
 <script language="javascript" type="text/javascript" src='<c:url value="static/js/controller/app.js"></c:url>'></script>
 
    
</body>
</html>