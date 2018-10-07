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
@Table(name = "PREMIO")
@NamedQueries({
    @NamedQuery(name = "Premio.findAll", query = "SELECT p FROM Premio p")})
public class Premio implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "IDPREMIO")
    private Integer idpremio;
    @Column(name = "FECHAFIN")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechafin;
    @Column(name = "FECHAINICIO")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechainicio;
    @Column(name = "NOMBRE")
    private String nombre;
    @Column(name = "CAMPEONATOPR")
    private String campeonatopr;
    @Column(name = "CIRCUITO_IDCIRCUITO")
    private Integer circuitoIdcircuito;
    @Column(name = "SESIONCARRERA_IDSESION")
    private Integer sesioncarreraIdsesion;
    @Column(name = "SESIONCLASIFICACION_IDSESION")
    private Integer sesionclasificacionIdsesion;
    @Column(name = "SESIONPRACTICA_IDSESION")
    private Integer sesionpracticaIdsesion;

    public Premio() {
    }

    public Premio(Integer idpremio) {
        this.idpremio = idpremio;
    }

    public Integer getIdpremio() {
        return idpremio;
    }

    public void setIdpremio(Integer idpremio) {
        this.idpremio = idpremio;
    }

    public Date getFechafin() {
        return fechafin;
    }

    public void setFechafin(Date fechafin) {
        this.fechafin = fechafin;
    }

    public Date getFechainicio() {
        return fechainicio;
    }

    public void setFechainicio(Date fechainicio) {
        this.fechainicio = fechainicio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCampeonatopr() {
        return campeonatopr;
    }

    public void setCampeonatopr(String campeonatopr) {
        this.campeonatopr = campeonatopr;
    }

    public Integer getCircuitoIdcircuito() {
        return circuitoIdcircuito;
    }

    public void setCircuitoIdcircuito(Integer circuitoIdcircuito) {
        this.circuitoIdcircuito = circuitoIdcircuito;
    }

    public Integer getSesioncarreraIdsesion() {
        return sesioncarreraIdsesion;
    }

    public void setSesioncarreraIdsesion(Integer sesioncarreraIdsesion) {
        this.sesioncarreraIdsesion = sesioncarreraIdsesion;
    }

    public Integer getSesionclasificacionIdsesion() {
        return sesionclasificacionIdsesion;
    }

    public void setSesionclasificacionIdsesion(Integer sesionclasificacionIdsesion) {
        this.sesionclasificacionIdsesion = sesionclasificacionIdsesion;
    }

    public Integer getSesionpracticaIdsesion() {
        return sesionpracticaIdsesion;
    }

    public void setSesionpracticaIdsesion(Integer sesionpracticaIdsesion) {
        this.sesionpracticaIdsesion = sesionpracticaIdsesion;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idpremio != null ? idpremio.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Premio)) {
            return false;
        }
        Premio other = (Premio) object;
        if ((this.idpremio == null && other.idpremio != null) || (this.idpremio != null && !this.idpremio.equals(other.idpremio))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Premio[ idpremio=" + idpremio + " ]";
    }
    
}
