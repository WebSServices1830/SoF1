/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@Entity
@Table(name = "Escuderia")
public class Escuderia {

    @Id
    @Basic(optional = false)
    @NotNull
    @Column
    private Integer idEscuderia;
    
    @JoinColumn(name = "campeonatoE", referencedColumnName = "campeonatoE")
    
    @Size(max = 50)
    @Column
    private String imagen;
    
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "escuderiaM")
    private List<Monoplaza> monoplazas;
    
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "escuderiaP")
    private List<Piloto> pilotos;
    
    @Size(max = 100)
    @Column
    private String detalle;
    
    @Size(max = 50)
    @Column
    private String nombre;
    
    @Size(max = 50)
    @Column
    private String lider;
    
    @Size(max = 50)
    @Column
    private String tecnicoLider;

    /**
     * Gets the value of the pais property.
     * 
     * @return
     *     possible object is
     *     {@link Pais }
     *     
     */
  
    /**
     * Sets the value of the pais property.
     * 
     * @param value
     *     allowed object is
     *     {@link Pais }
     *     
     */
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
     * Gets the value of the monoplazas property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the monoplazas property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMonoplazas().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Monoplaza }
     * 
     * 
     */
    public List<Monoplaza> getMonoplazas() {
        if (monoplazas == null) {
            monoplazas = new ArrayList<Monoplaza>();
        }
        return this.monoplazas;
    }

    /**
     * Gets the value of the pilotos property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pilotos property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPilotos().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Piloto }
     * 
     * 
     */
    public List<Piloto> getPilotos() {
        if (pilotos == null) {
            pilotos = new ArrayList<Piloto>();
        }
        return this.pilotos;
    }

    /**
     * Gets the value of the detalles property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the detalles property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDetalles().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public String getDetalles() {
        
        return this.detalle;
    }

    /**
     * Gets the value of the idEscuderia property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIdEscuderia() {
        return idEscuderia;
    }

    /**
     * Sets the value of the idEscuderia property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIdEscuderia(Integer value) {
        this.idEscuderia = value;
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
     * Gets the value of the lider property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLider() {
        return lider;
    }

    /**
     * Sets the value of the lider property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLider(String value) {
        this.lider = value;
    }

    /**
     * Gets the value of the tecnicoLider property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTecnicoLider() {
        return tecnicoLider;
    }

    /**
     * Sets the value of the tecnicoLider property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTecnicoLider(String value) {
        this.tecnicoLider = value;
    }

    public String getDetalle() {
        return detalle;
    }

    public void setDetalle(String detalle) {
        this.detalle = detalle;
    }



    public Escuderia(){
    }
    
}