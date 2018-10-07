/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Michael
 */
@Entity
@Table(name = "APUESTA")
@NamedQueries({
    @NamedQuery(name = "Apuesta.findAll", query = "SELECT a FROM Apuesta a")})
public class Apuesta implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "IDAPUESTA")
    private Integer idapuesta;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "CANTIDAD")
    private Double cantidad;
    @Column(name = "FECHA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecha;
    @Column(name = "PUNTOS")
    private Double puntos;
    @Column(name = "CAMPEONATOA")
    private String campeonatoa;
    @Column(name = "USUARIO")
    private String usuario;
    @Column(name = "PREMIO_IDPREMIO")
    private Integer premioIdpremio;
    @JoinColumn(name = "PILOTO_IDPILOTO", referencedColumnName = "IDPILOTO")
    @ManyToOne
    private Piloto pilotoIdpiloto;

    public Apuesta() {
    }

    public Apuesta(Integer idapuesta) {
        this.idapuesta = idapuesta;
    }

    public Integer getIdapuesta() {
        return idapuesta;
    }

    public void setIdapuesta(Integer idapuesta) {
        this.idapuesta = idapuesta;
    }

    public Double getCantidad() {
        return cantidad;
    }

    public void setCantidad(Double cantidad) {
        this.cantidad = cantidad;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Double getPuntos() {
        return puntos;
    }

    public void setPuntos(Double puntos) {
        this.puntos = puntos;
    }

    public String getCampeonatoa() {
        return campeonatoa;
    }

    public void setCampeonatoa(String campeonatoa) {
        this.campeonatoa = campeonatoa;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public Integer getPremioIdpremio() {
        return premioIdpremio;
    }

    public void setPremioIdpremio(Integer premioIdpremio) {
        this.premioIdpremio = premioIdpremio;
    }

    public Piloto getPilotoIdpiloto() {
        return pilotoIdpiloto;
    }

    public void setPilotoIdpiloto(Piloto pilotoIdpiloto) {
        this.pilotoIdpiloto = pilotoIdpiloto;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idapuesta != null ? idapuesta.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Apuesta)) {
            return false;
        }
        Apuesta other = (Apuesta) object;
        if ((this.idapuesta == null && other.idapuesta != null) || (this.idapuesta != null && !this.idapuesta.equals(other.idapuesta))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Apuesta[ idapuesta=" + idapuesta + " ]";
    }
    
}
