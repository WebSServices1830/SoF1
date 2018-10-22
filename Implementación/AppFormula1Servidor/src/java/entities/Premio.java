package entities;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlIDREF;
import javax.xml.bind.annotation.XmlTransient;


@Entity
@Table(name = "Premio")
public class Premio implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="premio_id", nullable = false, unique = true)
    private Integer idPremio;
    
    @Column
    private Boolean fin;
    
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="campeonato_id")
    private Campeonato campeonato;
    
    @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy = "premio")
    private SesionCarrera sesionCarrera;

    @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy = "premio")
    private SesionClasificacion sesionClasificacion;

    @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy = "premio")
    private SesionPractica sesionPractica;

    @JoinColumn(name="circuito_id")
    @OneToOne
    private Circuito circuito;
    
    @Size(max = 30)
    @Column
    private String nombre;

    @Column
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date fechaInicio;

    @Column
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date fechaFin;

    
    
    
    
    
    public Boolean getFin() {
        return fin;
    }

    public void setFin(Boolean fin) {
        this.fin = fin;
    }

    

    @XmlTransient
    public SesionCarrera getSesionCarrera() {
        return sesionCarrera;
    }

    
    public void setSesionCarrera(SesionCarrera sesionCarrera) {
        this.sesionCarrera = sesionCarrera;
    }
    @XmlTransient
    public SesionClasificacion getSesionClasificacion() {
        return sesionClasificacion;
    }
    
    public void setSesionClasificacion(SesionClasificacion sesionClasificacion) {
        this.sesionClasificacion = sesionClasificacion;
    }
    @XmlTransient
    public SesionPractica getSesionPractica() {
        return sesionPractica;
    }
    public void setSesionPractica(SesionPractica sesionPractica) {
        this.sesionPractica = sesionPractica;
    }

    public Circuito getCircuito() {
        return circuito;
    }

    public void setCircuito(Circuito value) {
        this.circuito = value;
    }



    /**
     * Gets the value of the idPremio property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    //

    public Integer getIdPremio() {
        return idPremio;
    }

    /**
     * Sets the value of the idPremio property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIdPremio(Integer value) {
        this.idPremio = value;
    }

    /**
     * Gets the value of the nombre property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Sets the value of the nombre property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombre(String value) {
        this.nombre = value;
    }

    /**
     * Gets the value of the fechaInicio property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Date getFechaInicio() {
        return fechaInicio;
    }

    /**
     * Sets the value of the fechaInicio property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFechaInicio(Date value) {
        this.fechaInicio = value;
    }

    /**
     * Gets the value of the fechaFin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Date getFechaFin() {
        return fechaFin;
    }

    /**
     * Sets the value of the fechaFin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFechaFin(Date value) {
        this.fechaFin = value;
    }
        //
    public Campeonato getCampeonato() {
        return campeonato;
    }

    public void setCampeonato(Campeonato campeonato) {
        this.campeonato = campeonato;
    }

    
    
}
