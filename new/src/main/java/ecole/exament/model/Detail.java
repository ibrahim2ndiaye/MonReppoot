/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ecole.exament.model;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author imac
 */
@Entity
@Table(name = "detail")
//@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Detail.findAll", query = "SELECT d FROM Detail d")
    , @NamedQuery(name = "Detail.findByQte", query = "SELECT d FROM Detail d WHERE d.qte = :qte")
    , @NamedQuery(name = "Detail.findById", query = "SELECT d FROM Detail d WHERE d.id = :id")})
public class Detail implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @NotNull
    @Column(name = "qte")
    private int qte;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @JoinColumn(name = "idCom", referencedColumnName = "idCom")
    @ManyToOne(optional = false)
    private Commande idCom;
    @JoinColumn(name = "idProd", referencedColumnName = "idProd")
    @ManyToOne(optional = false)
    private Produit idProd;

    public Detail() {
    }

    public Detail(Integer id) {
        this.id = id;
    }

    public Detail(Integer id, int qte) {
        this.id = id;
        this.qte = qte;
    }

    public int getQte() {
        return qte;
    }

    public void setQte(int qte) {
        this.qte = qte;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Commande getIdCom() {
        return idCom;
    }

    public void setIdCom(Commande idCom) {
        this.idCom = idCom;
    }

    public Produit getIdProd() {
        return idProd;
    }

    public void setIdProd(Produit idProd) {
        this.idProd = idProd;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Detail)) {
            return false;
        }
        Detail other = (Detail) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ecole.exament.model.Detail[ id=" + id + " ]";
    }
    
}
