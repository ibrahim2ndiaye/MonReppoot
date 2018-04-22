package ecole.exament.dao;

import java.util.List;

import org.hibernate.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import ecole.exament.model.Clients;
import ecole.exament.model.Commande;
import ecole.exament.model.Detail;
import ecole.exament.model.Utils;

@Repository //obligatoire pour les classe daxé au donnée
@Transactional//obligatoire pour les transaction
public class IexamenIMP extends Utils implements Iexamen{

	public List<Commande> getAllCommande() {
		Query q=getSession().createQuery("From  Commande as c ORDER BY c.dateCom DESC");
		try {
			return  q.list();
		} catch (Exception e) {
			return null;
		}
	}

	public List<Detail> getAllDetail() {
		Query q=getSession().createQuery("From  Detail as d join d.idCom c ORDER BY c.dateCom DESC");
		try {
			return  q.list();
		} catch (Exception e) {
			return null;
		}
	}

	public List<Clients> getAllClient() {
		Query q=getSession().createQuery("From  Clients as c");
		try {
			return  q.list();
		} catch (Exception e) {
			return null;
		}
	}

}
