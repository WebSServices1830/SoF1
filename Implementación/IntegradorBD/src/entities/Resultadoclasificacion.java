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
@Table(name = "RESULTADOCLASIFICACION")
@NamedQueries({
    @NamedQuery(name = "Resultadoclasificacion.findAll", query = "SELECT r FROM Resultadoclasificacion r")})
public class Resultadoclasificacion implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "IDRESULTADO")
    private Integer idresultado;
    @Column(name = "POSICION")
    private Integer posicion;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "Q1")
    private Double q1;
    @Column(name = "Q2")
    private Double q2;
    @Column(name = "Q3")
    private Double q3;
    @Column(name = "RECORDVUELTA")
    private Double recordvuelta;
    @Column(name = "VUELTAS")
    private Integer vueltas;
    @Column(name = "CLASIR")
    private String clasir;
    @Column(name = "PILOTO_IDPILOTO")
    private Integer pilotoIdpiloto;

    public Resultadoclasificacion() {
    }

    public Resultadoclasificacion(Integer idresultado) {
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

    public Double getQ1() {
        return q1;
    }

    public void setQ1(Double q1) {
        this.q1 = q1;
    }

    public Double getQ2() {
        return q2;
    }

    public void setQ2(Double q2) {
        this.q2 = q2;
    }

    public Double getQ3() {
        return q3;
    }

    public void setQ3(Double q3) {
        this.q3 = q3;
    }

    public Double getRecordvuelta() {
        return recordvuelta;
    }

    public void setRecordvuelta(Double recordvuelta) {
        this.recordvuelta = recordvuelta;
    }

    public Integer getVueltas() {
        return vueltas;
    }

    public void setVueltas(Integer vueltas) {
        this.vueltas = vueltas;
    }

    public String getClasir() {
        return clasir;
    }

    public void setClasir(String clasir) {
        this.clasir = clasir;
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
        if (!(object instanceof Resultadoclasificacion)) {
            return false;
        }
        Resultadoclasificacion other = (Resultadoclasificacion) object;
        if ((this.idresultado == null && other.idresultado != null) || (this.idresultado != null && !this.idresultado.equals(other.idresultado))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Resultadoclasificacion[ idresultado=" + idresultado + " ]";
    }
    
}
