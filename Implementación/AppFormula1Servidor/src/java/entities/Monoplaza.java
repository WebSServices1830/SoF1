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
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlIDREF;
import javax.xml.bind.annotation.XmlType;

@Entity
@Table(name = "Monoplaza")
public class Monoplaza implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="monoplaza_id", nullable = false, unique = true)
    private Integer idMonoplaza;
    
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "campeonato_id")
    private Campeonato campeonato;
    
    @Size (max = 30)
    @Column
    private String marca;

    @Size (max = 30)
    @Column
    private String modelo;

    @Column
    private Double velMax;

    @Column
    private Double potencia;

    @Column
    private Double torque;

    @Column
    private Double numCilindros;

    @Column
    private Double multiplicador;

    @Size (max = 150)
    @Column
    private String imagen;

    /**
     * Gets the value of the escuderia property.
     * 
     * @return
     *     possible object is
     *     {@link Escuderia }
     *     
     */
    
    //
    public Campeonato getCampeonato() {
        return campeonato;
    }

    public void setCampeonato(Campeonato campeonato) {
        this.campeonato = campeonato;
    }
    //

    /**
     * Gets the value of the idMonoplaza property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    //
    public String getIdXml() {
        return idMonoplaza+"";
    }
    public Integer getIdMonoplaza() {
        return idMonoplaza;
    }

    /**
     * Sets the value of the idMonoplaza property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIdMonoplaza(Integer value) {
        this.idMonoplaza = value;
    }

    /**
     * Gets the value of the marca property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMarca() {
        return marca;
    }

    /**
     * Sets the value of the marca property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMarca(String value) {
        this.marca = value;
    }

    /**
     * Gets the value of the modelo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModelo() {
        return modelo;
    }

    /**
     * Sets the value of the modelo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModelo(String value) {
        this.modelo = value;
    }

    /**
     * Gets the value of the velMax property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getVelMax() {
        return velMax;
    }

    /**
     * Sets the value of the velMax property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setVelMax(Double value) {
        this.velMax = value;
    }

    /**
     * Gets the value of the potencia property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getPotencia() {
        return potencia;
    }

    /**
     * Sets the value of the potencia property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setPotencia(Double value) {
        this.potencia = value;
    }

    /**
     * Gets the value of the torque property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getTorque() {
        return torque;
    }

    /**
     * Sets the value of the torque property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setTorque(Double value) {
        this.torque = value;
    }

    /**
     * Gets the value of the numCilindros property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getNumCilindros() {
        return numCilindros;
    }

    /**
     * Sets the value of the numCilindros property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setNumCilindros(Double value) {
        this.numCilindros = value;
    }

    /**
     * Gets the value of the multiplicador property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getMultiplicador() {
        return multiplicador;
    }

    /**
     * Sets the value of the multiplicador property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setMultiplicador(Double value) {
        this.multiplicador = value;
    }

    /**
     * Gets the value of the imagen property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImagen() {
        return imagen;
    }

    /**
     * Sets the value of the imagen property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImagen(String value) {
        this.imagen = value;
    }


    
}
