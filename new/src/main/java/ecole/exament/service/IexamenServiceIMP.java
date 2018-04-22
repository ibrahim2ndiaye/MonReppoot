package ecole.exament.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ecole.exament.dao.Iexamen;
import ecole.exament.model.Clients;
import ecole.exament.model.Commande;
import ecole.exament.model.Detail;



@Service
public class IexamenServiceIMP  implements IexemService{
 
	@Autowired
	private Iexamen servEx;

	public List<Commande> getAllCommande() {
		// TODO Auto-generated method stub
		return servEx.getAllCommande();
	}

	public List<Detail> getAllDetail() {
		// TODO Auto-generated method stub
		return servEx.getAllDetail();
	}

	public List<Clients> getAllClient() {
		// TODO Auto-generated method stub
		return servEx.getAllClient();
	}
}
