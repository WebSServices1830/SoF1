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
import javax.validation.constraints.Size;


@Entity
@Table(name = "Premio")
public class Premio implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="premio_id", nullable = false, unique = true)
    private Integer idPremio;
    
    @Column
    private Boolean finalizado;
    
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="campeonato_id")
    private Campeonato campeonato;

    @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy ="premio")
    private SesionCarrera sesionCarrera;

    @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy ="premio")
    private SesionClasificacion sesionClasificacion;

    @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy ="premio")
    private SesionPractica sesionPractica;

    @JoinColumn(name="circuito_id")
    private Circuito circuito;

    @Size(max = 30)
    @Column
    private String nombre;

    @Column
    private Date fechaInicio;

    @Column
    private Date fechaFin;

    public Boolean getFinalizado() {
        return finalizado;
    }

    public void setFinalizado(Boolean finalizado) {
        this.finalizado = finalizado;
    }

    
    public SesionCarrera getSesionCarrera() {
        return sesionCarrera;
    }


    public void setSesionCarrera(SesionCarrera sesionCarrera) {
        this.sesionCarrera = sesionCarrera;
    }

    public SesionClasificacion getSesionClasificacion() {
        return sesionClasificacion;
    }

    public void setSesionClasificacion(SesionClasificacion sesionClasificacion) {
        this.sesionClasificacion = sesionClasificacion;
    }

    public SesionPractica getSesionPractica() {
        return sesionPractica;
    }

    /**
     * Gets the value of the sesionesCarrera property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sesionesCarrera property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSesionesCarrera().add(newItem);
     * </pre>
     *
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SesionCarrera }
     *
     * 
     */
    /**
     * Gets the value of the sesionesClasificacion property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sesionesClasificacion property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSesionesClasificacion().add(newItem);
     * </pre>
     *
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SesionClasificacion }
     *
     * 
     */
    /**
     * Gets the value of the sesionesPractica property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sesionesPractica property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSesionesPractica().add(newItem);
     * </pre>
     *
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SesionPractica }
     *
     * 
     */
    public void setSesionPractica(SesionPractica sesionPractica) {
        this.sesionPractica = sesionPractica;
    }

    /**
     * Gets the value of the circuito property.
     * 
     * @return
     *     possible object is
     *     {@link Circuito }
     *     
     */
    public Circuito getCircuito() {
        return circuito;
    }

    /**
     * Sets the value of the circuito property.
     * 
     * @param value
     *     allowed object is
     *     {@link Circuito }
     *     
     */
    public void setCircuito(Circuito value) {
        this.circuito = value;
    }

    /**
     * Gets the value of the calificaciones property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the calificaciones property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCalificaciones().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Calificacion }
     * 
     * 
     */


    /**
     * Gets the value of the idPremio property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
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

    public Campeonato getCampeonato() {
        return campeonato;
    }

    public void setCampeonato(Campeonato campeonato) {
        this.campeonato = campeonato;
    }

    
    
}
