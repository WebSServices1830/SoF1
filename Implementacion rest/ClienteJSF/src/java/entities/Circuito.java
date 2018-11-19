//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.2-147 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.10.05 at 10:42:35 AM COT 
//


package entities;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlIDREF;
import javax.xml.bind.annotation.XmlType;

@Entity
@Table(name = "Circuito")
public class Circuito implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="circuito_id", nullable = false, unique = true)
    private Integer idCircuito;

    @JoinColumn(name="pais_id")
    @OneToOne
    private Pais pais;

    @Size(max = 50)
    @Column
    private String nombre;

    @Column
    private Integer vueltas;

    @Column
    private Double longitud;

    @Column
    private Double record;

    @Column
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date fechRecord;

    @Size(max = 50)
    @Column
    private String ultimoGanador;

    @Size(max = 200)
    @Column
    private String foto;


    /**
     * Gets the value of the pais property.
     * 
     * @return
     *     possible object is
     *     {@link Pais }
     *     
     */
    //
    public Pais getPais() {
        return pais;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    /**
     * Sets the value of the pais property.
     * 
     * @param value
     *     allowed object is
     *     {@link Pais }
     *     
     */
    public void setPais(Pais value) {
        this.pais = value;
    }

    /**
     * Gets the value of the idCircuito property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    //
    public String getIdXml() {
        return idCircuito+"";
    }
    public Integer getIdCircuito() {
        return idCircuito;
    }

    /**
     * Sets the value of the idCircuito property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIdCircuito(Integer value) {
        this.idCircuito = value;
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
     * Gets the value of the vueltas property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getVueltas() {
        return vueltas;
    }

    /**
     * Sets the value of the vueltas property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setVueltas(Integer value) {
        this.vueltas = value;
    }

    /**
     * Gets the value of the longitud property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getLongitud() {
        return longitud;
    }

    /**
     * Sets the value of the longitud property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setLongitud(Double value) {
        this.longitud = value;
    }

    /**
     * Gets the value of the record property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getRecord() {
        return record;
    }

    /**
     * Sets the value of the record property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setRecord(Double value) {
        this.record = value;
    }

    /**
     * Gets the value of the fechRecord property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Date getFechRecord() {
        return fechRecord;
    }

    /**
     * Sets the value of the fechRecord property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFechRecord(Date value) {
        this.fechRecord = value;
    }

    /**
     * Gets the value of the ultimoGanador property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUltimoGanador() {
        return ultimoGanador;
    }

    /**
     * Sets the value of the ultimoGanador property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUltimoGanador(String value) {
        this.ultimoGanador = value;
    }
    
    
}