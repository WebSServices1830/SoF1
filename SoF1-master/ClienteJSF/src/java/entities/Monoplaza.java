//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.2-147 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.10.02 at 07:39:52 AM COT 
//


package entities;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Monoplaza complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Monoplaza">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="idMonoplaza" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="marca" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="modelo" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="velMax" type="{http://www.w3.org/2001/XMLSchema}double" />
 *       &lt;attribute name="potencia" type="{http://www.w3.org/2001/XMLSchema}double" />
 *       &lt;attribute name="torque" type="{http://www.w3.org/2001/XMLSchema}double" />
 *       &lt;attribute name="numCilindros" type="{http://www.w3.org/2001/XMLSchema}double" />
 *       &lt;attribute name="multiplicador" type="{http://www.w3.org/2001/XMLSchema}double" />
 *       &lt;attribute name="imagen" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Monoplaza")
public class Monoplaza {

    @XmlAttribute(name = "idMonoplaza")
    protected Integer idMonoplaza;
    @XmlAttribute(name = "marca")
    protected String marca;
    @XmlAttribute(name = "modelo")
    protected String modelo;
    @XmlAttribute(name = "velMax")
    protected Double velMax;
    @XmlAttribute(name = "potencia")
    protected Double potencia;
    @XmlAttribute(name = "torque")
    protected Double torque;
    @XmlAttribute(name = "numCilindros")
    protected Double numCilindros;
    @XmlAttribute(name = "multiplicador")
    protected Double multiplicador;
    @XmlAttribute(name = "imagen")
    protected String imagen;

    /**
     * Gets the value of the idMonoplaza property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
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
