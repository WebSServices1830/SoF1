//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.2-147 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.10.05 at 10:42:35 AM COT 
//

    
package entities;

import java.io.Serializable;
import java.util.ArrayList;
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
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlIDREF;
import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.XmlType;

@Entity
@Table(name = "Escuderia")
public class Escuderia implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="escuderia_id", nullable = false, unique = true)
    private Integer idEscuderia;
    
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "campeonato_id")
    private Campeonato campeonato;
    
    @JoinColumn(name = "pais_id")
    @OneToOne
    private Pais pais;
    
    @JoinColumn(name ="piloto1_id")
    @OneToOne
    private Piloto piloto1;
    
    @JoinColumn(name ="piloto2_id")
    @OneToOne
    private Piloto piloto2;
    
    @JoinColumn(name ="monoplaza1_id")
    @OneToOne
    private Monoplaza monoplaza1;
    
    @JoinColumn(name ="monoplaza2_id")
    @OneToOne
    private Monoplaza monoplaza2;
    
    @Size(max=150)
    @Column
    private String imagen;
    
    @Size(max = 500)
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

    
    
    
    public Campeonato getCampeonato() {
        return campeonato;
    }

    public void setCampeonato(Campeonato campeonato) {
        this.campeonato = campeonato;
    }
       //
    public Pais getPais() {
        return pais;
    }

    public void setPais(Pais pais) {
        this.pais = pais;
    }

    public Piloto getPiloto1() {
        return piloto1;
    }

    public void setPiloto1(Piloto piloto1) {
        this.piloto1 = piloto1;
    }

    public Piloto getPiloto2() {
        return piloto2;
    }

    public void setPiloto2(Piloto piloto2) {
        this.piloto2 = piloto2;
    }

    public Monoplaza getMonoplaza1() {
        return monoplaza1;
    }

    public void setMonoplaza1(Monoplaza monoplaza1) {
        this.monoplaza1 = monoplaza1;
    }

    public Monoplaza getMonoplaza2() {
        return monoplaza2;
    }

    public void setMonoplaza2(Monoplaza monoplaza2) {
        this.monoplaza2 = monoplaza2;
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
    //
    public String getIdXml() {
        return idEscuderia+"";
    }
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

    
    
}
