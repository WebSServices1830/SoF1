//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.2-147 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.10.05 at 10:42:35 AM COT 
//


package entities;

import java.io.Serializable;
import javax.persistence.Basic;
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
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlIDREF;
import javax.xml.bind.annotation.XmlType;

@Entity
@Table(name = "ResultadoPractica")
public class ResultadoPractica implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="resultadopractica_id", nullable = false, unique = true)
    private Integer idResultado;
    
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "sesionpractica_id")
    private SesionPractica sesionPractica;
    
    @JoinColumn(name="piloto_id")
    @OneToOne
    private Piloto piloto;

    @Column
    private Double tiempo;

    @Column
    private Integer vueltas;

    @Column
    private Integer posicion;

    @Column
    private Double recordVuelta;

    /**
     * Gets the value of the piloto property.
     * 
     * @return
     *     possible object is
     *     {@link Piloto }
     *     
     */
        //
    public Piloto getPiloto() {
        return piloto;
    }
    //
    public SesionPractica getSesionPractica() {
        return sesionPractica;
    }

    public void setSesionPractica(SesionPractica sesionPractica) {
        this.sesionPractica = sesionPractica;
    }


    /**
     * Sets the value of the piloto property.
     * 
     * @param value
     *     allowed object is
     *     {@link Piloto }
     *     
     */
    public void setPiloto(Piloto value) {
        this.piloto = value;
    }

    /**
     * Gets the value of the sesionPractica property.
     * 
     * @return
     *     possible object is
     *     {@link SesionPractica }
     *     
     */

    /**
     * Gets the value of the idResultado property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    //
    public String getIdXml() {
        return idResultado+"";
    }
    public Integer getIdResultado() {
        return idResultado;
    }

    /**
     * Sets the value of the idResultado property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIdResultado(Integer value) {
        this.idResultado = value;
    }

    /**
     * Gets the value of the tiempo property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getTiempo() {
        return tiempo;
    }

    /**
     * Sets the value of the tiempo property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setTiempo(Double value) {
        this.tiempo = value;
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
     * Gets the value of the posicion property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPosicion() {
        return posicion;
    }

    /**
     * Sets the value of the posicion property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPosicion(Integer value) {
        this.posicion = value;
    }

    /**
     * Gets the value of the recordVuelta property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getRecordVuelta() {
        return recordVuelta;
    }

    /**
     * Sets the value of the recordVuelta property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setRecordVuelta(Double value) {
        this.recordVuelta = value;
    }

}
