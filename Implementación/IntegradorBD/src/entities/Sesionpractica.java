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
@Table(name = "SESIONPRACTICA")
@NamedQueries({
    @NamedQuery(name = "Sesionpractica.findAll", query = "SELECT s FROM Sesionpractica s")})
public class Sesionpractica implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "IDSESION")
    private Integer idsesion;
    @Column(name = "FECHA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecha;
    @Column(name = "NOMBRE")
    private String nombre;

    public Sesionpractica() {
    }

    public Sesionpractica(Integer idsesion) {
        this.idsesion = idsesion;
    }

    public Integer getIdsesion() {
        return idsesion;
    }

    public void setIdsesion(Integer idsesion) {
        this.idsesion = idsesion;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idsesion != null ? idsesion.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Sesionpractica)) {
            return false;
        }
        Sesionpractica other = (Sesionpractica) object;
        if ((this.idsesion == null && other.idsesion != null) || (this.idsesion != null && !this.idsesion.equals(other.idsesion))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Sesionpractica[ idsesion=" + idsesion + " ]";
    }
    
}
