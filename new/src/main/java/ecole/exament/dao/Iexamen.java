package ecole.exament.dao;

import java.util.List;

import ecole.exament.model.Clients;
import ecole.exament.model.Commande;
import ecole.exament.model.Detail;



public interface Iexamen {
	public List<Commande> getAllCommande();
	public List<Detail> getAllDetail();
	public List<Clients> getAllClient();
}
