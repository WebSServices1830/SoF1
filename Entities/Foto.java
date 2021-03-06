//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.2-147 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.10.05 at 10:42:35 AM COT 
//


package entities;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@Entity
@Table(name = "Foto")
public class Foto {

    @Id
    @Basic(optional = false)
    @NotNull
    @Column
    private Integer idFoto;
    
    @JoinColumn(name = "circuito", referencedColumnName = "circuito")
    @ManyToOne(optional = false)
    private Circuito circuito;

    @Size (max = 30)
    @Column
    private String nombre;
    
    @Size (max = 50)
    @Column
    private String imagen;
    
    @Size (max = 200)
    @Column
    private String descripcion;

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
     * Gets the value of the idFoto property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIdFoto() {
        return idFoto;
    }

    /**
     * Sets the value of the idFoto property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIdFoto(Integer value) {
        this.idFoto = value;
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

    /**
     * Gets the value of the descripcion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * Sets the value of the descripcion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescripcion(String value) {
        this.descripcion = value;
    }

    
    
}
