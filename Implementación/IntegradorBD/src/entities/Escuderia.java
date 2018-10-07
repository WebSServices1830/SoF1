/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author Michael
 */
@Entity
@Table(name = "ESCUDERIA")
@NamedQueries({
    @NamedQuery(name = "Escuderia.findAll", query = "SELECT e FROM Escuderia e")})
public class Escuderia implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "IDESCUDERIA")
    private Integer idescuderia;
    @Column(name = "DETALLE")
    private String detalle;
    @Column(name = "IMAGEN")
    private String imagen;
    @Column(name = "LIDER")
    private String lider;
    @Column(name = "NOMBRE")
    private String nombre;
    @Column(name = "TECNICOLIDER")
    private String tecnicolider;
    @Column(name = "CAMPEONATOE")
    private String campeonatoe;
    @Column(name = "PAISE")
    private String paise;

    public Escuderia() {
    }

    public Escuderia(Integer idescuderia) {
        this.idescuderia = idescuderia;
    }

    public Integer getIdescuderia() {
        return idescuderia;
    }

    public void setIdescuderia(Integer idescuderia) {
        this.idescuderia = idescuderia;
    }

    public String getDetalle() {
        return detalle;
    }

    public void setDetalle(String detalle) {
        this.detalle = detalle;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public String getLider() {
        return lider;
    }

    public void setLider(String lider) {
        this.lider = lider;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTecnicolider() {
        return tecnicolider;
    }

    public void setTecnicolider(String tecnicolider) {
        this.tecnicolider = tecnicolider;
    }

    public String getCampeonatoe() {
        return campeonatoe;
    }

    public void setCampeonatoe(String campeonatoe) {
        this.campeonatoe = campeonatoe;
    }

    public String getPaise() {
        return paise;
    }

    public void setPaise(String paise) {
        this.paise = paise;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idescuderia != null ? idescuderia.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Escuderia)) {
            return false;
        }
        Escuderia other = (Escuderia) object;
        if ((this.idescuderia == null && other.idescuderia != null) || (this.idescuderia != null && !this.idescuderia.equals(other.idescuderia))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Escuderia[ idescuderia=" + idescuderia + " ]";
    }
    
}
