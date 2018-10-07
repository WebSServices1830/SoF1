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
@Table(name = "CIRCUITO")
@NamedQueries({
    @NamedQuery(name = "Circuito.findAll", query = "SELECT c FROM Circuito c")})
public class Circuito implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "IDCIRCUITO")
    private Integer idcircuito;
    @Column(name = "FECHRECORD")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechrecord;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "LONGITUD")
    private Double longitud;
    @Column(name = "NOMBRE")
    private String nombre;
    @Column(name = "RECORD")
    private Double record;
    @Column(name = "ULTIMOGANADOR")
    private String ultimoganador;
    @Column(name = "VUELTAS")
    private Integer vueltas;
    @Column(name = "CAMPEONATOCIR")
    private String campeonatocir;
    @Column(name = "PAIS_IDPAIS")
    private Integer paisIdpais;
    @Column(name = "PILOTO_IDPILOTO")
    private Integer pilotoIdpiloto;

    public Circuito() {
    }

    public Circuito(Integer idcircuito) {
        this.idcircuito = idcircuito;
    }

    public Integer getIdcircuito() {
        return idcircuito;
    }

    public void setIdcircuito(Integer idcircuito) {
        this.idcircuito = idcircuito;
    }

    public Date getFechrecord() {
        return fechrecord;
    }

    public void setFechrecord(Date fechrecord) {
        this.fechrecord = fechrecord;
    }

    public Double getLongitud() {
        return longitud;
    }

    public void setLongitud(Double longitud) {
        this.longitud = longitud;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Double getRecord() {
        return record;
    }

    public void setRecord(Double record) {
        this.record = record;
    }

    public String getUltimoganador() {
        return ultimoganador;
    }

    public void setUltimoganador(String ultimoganador) {
        this.ultimoganador = ultimoganador;
    }

    public Integer getVueltas() {
        return vueltas;
    }

    public void setVueltas(Integer vueltas) {
        this.vueltas = vueltas;
    }

    public String getCampeonatocir() {
        return campeonatocir;
    }

    public void setCampeonatocir(String campeonatocir) {
        this.campeonatocir = campeonatocir;
    }

    public Integer getPaisIdpais() {
        return paisIdpais;
    }

    public void setPaisIdpais(Integer paisIdpais) {
        this.paisIdpais = paisIdpais;
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
        hash += (idcircuito != null ? idcircuito.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Circuito)) {
            return false;
        }
        Circuito other = (Circuito) object;
        if ((this.idcircuito == null && other.idcircuito != null) || (this.idcircuito != null && !this.idcircuito.equals(other.idcircuito))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Circuito[ idcircuito=" + idcircuito + " ]";
    }
    
}
