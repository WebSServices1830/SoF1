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
@Table(name = "RESULTADOCARRERA")
@NamedQueries({
    @NamedQuery(name = "Resultadocarrera.findAll", query = "SELECT r FROM Resultadocarrera r")})
public class Resultadocarrera implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "IDRESULTADO")
    private Integer idresultado;
    @Column(name = "POSICION")
    private Integer posicion;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "PUNTOS")
    private Double puntos;
    @Column(name = "RECORDVUELTA")
    private Double recordvuelta;
    @Column(name = "TIEMPO")
    private Double tiempo;
    @Column(name = "VUELTAS")
    private Integer vueltas;
    @Column(name = "CARRERAR")
    private String carrerar;
    @Column(name = "PILOTO_IDPILOTO")
    private Integer pilotoIdpiloto;

    public Resultadocarrera() {
    }

    public Resultadocarrera(Integer idresultado) {
        this.idresultado = idresultado;
    }

    public Integer getIdresultado() {
        return idresultado;
    }

    public void setIdresultado(Integer idresultado) {
        this.idresultado = idresultado;
    }

    public Integer getPosicion() {
        return posicion;
    }

    public void setPosicion(Integer posicion) {
        this.posicion = posicion;
    }

    public Double getPuntos() {
        return puntos;
    }

    public void setPuntos(Double puntos) {
        this.puntos = puntos;
    }

    public Double getRecordvuelta() {
        return recordvuelta;
    }

    public void setRecordvuelta(Double recordvuelta) {
        this.recordvuelta = recordvuelta;
    }

    public Double getTiempo() {
        return tiempo;
    }

    public void setTiempo(Double tiempo) {
        this.tiempo = tiempo;
    }

    public Integer getVueltas() {
        return vueltas;
    }

    public void setVueltas(Integer vueltas) {
        this.vueltas = vueltas;
    }

    public String getCarrerar() {
        return carrerar;
    }

    public void setCarrerar(String carrerar) {
        this.carrerar = carrerar;
    }

    public Integer getPilotoIdpiloto() {
        return pilotoIdpiloto;
    }

    public void setPilotoIdpiloto(Integer pilotoIdpiloto) {
        this.pilotoIdpiloto = pilotoIdpiloto;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idresultado != null ? idresultado.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Resultadocarrera)) {
            return false;
        }
        Resultadocarrera other = (Resultadocarrera) object;
        if ((this.idresultado == null && other.idresultado != null) || (this.idresultado != null && !this.idresultado.equals(other.idresultado))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Resultadocarrera[ idresultado=" + idresultado + " ]";
    }
    
}
