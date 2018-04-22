package ecole.exament.service;

import java.util.List;

import org.springframework.stereotype.Service;

import ecole.exament.model.Clients;
import ecole.exament.model.Commande;
import ecole.exament.model.Detail;

@Service
public interface IexemService {
	public List<Commande> getAllCommande();
	public List<Detail> getAllDetail();
	public List<Clients> getAllClient();
}
