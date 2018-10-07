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
@Table(name = "MONOPLAZA")
@NamedQueries({
    @NamedQuery(name = "Monoplaza.findAll", query = "SELECT m FROM Monoplaza m")})
public class Monoplaza implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "IDMONOPLAZA")
    private Integer idmonoplaza;
    @Column(name = "IMAGEN")
    private String imagen;
    @Column(name = "MARCA")
    private String marca;
    @Column(name = "MODELO")
    private String modelo;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "MULTIPLICADOR")
    private Double multiplicador;
    @Column(name = "NUMCILINDROS")
    private Double numcilindros;
    @Column(name = "POTENCIA")
    private Double potencia;
    @Column(name = "TORQUE")
    private Double torque;
    @Column(name = "VELMAX")
    private Double velmax;
    @Column(name = "CAMPEONATOM")
    private String campeonatom;
    @Column(name = "ESCUDERIAM")
    private String escuderiam;

    public Monoplaza() {
    }

    public Monoplaza(Integer idmonoplaza) {
        this.idmonoplaza = idmonoplaza;
    }

    public Integer getIdmonoplaza() {
        return idmonoplaza;
    }

    public void setIdmonoplaza(Integer idmonoplaza) {
        this.idmonoplaza = idmonoplaza;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Double getMultiplicador() {
        return multiplicador;
    }

    public void setMultiplicador(Double multiplicador) {
        this.multiplicador = multiplicador;
    }

    public Double getNumcilindros() {
        return numcilindros;
    }

    public void setNumcilindros(Double numcilindros) {
        this.numcilindros = numcilindros;
    }

    public Double getPotencia() {
        return potencia;
    }

    public void setPotencia(Double potencia) {
        this.potencia = potencia;
    }

    public Double getTorque() {
        return torque;
    }

    public void setTorque(Double torque) {
        this.torque = torque;
    }

    public Double getVelmax() {
        return velmax;
    }

    public void setVelmax(Double velmax) {
        this.velmax = velmax;
    }

    public String getCampeonatom() {
        return campeonatom;
    }

    public void setCampeonatom(String campeonatom) {
        this.campeonatom = campeonatom;
    }

    public String getEscuderiam() {
        return escuderiam;
    }

    public void setEscuderiam(String escuderiam) {
        this.escuderiam = escuderiam;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idmonoplaza != null ? idmonoplaza.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Monoplaza)) {
            return false;
        }
        Monoplaza other = (Monoplaza) object;
        if ((this.idmonoplaza == null && other.idmonoplaza != null) || (this.idmonoplaza != null && !this.idmonoplaza.equals(other.idmonoplaza))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Monoplaza[ idmonoplaza=" + idmonoplaza + " ]";
    }
    
}
