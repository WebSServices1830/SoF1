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
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlIDREF;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.XmlType;

@Entity
@Table(name = "Campeonato")
public class Campeonato implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="campeonato_id", nullable = false)
    protected Integer idCampeonato;
    
    @Column
    protected String nombre;
    
    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy = "campeonato")
    private List<Escuderia> escuderias;
    
    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy = "campeonato")
    private List<Monoplaza> monoplazas;
    
    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy = "campeonato")
    private List<Piloto> pilotos;
    
    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy = "campeonato")
    protected List<Premio> calendario;
    
    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy = "campeonato")
    private List<TablaGeneral> tablaGeneral;

    @XmlTransient
    public List<TablaGeneral> getTablaGeneral() {
        return tablaGeneral;
    }

    public void setTablaGeneral(List<TablaGeneral> tablaGeneral) {
        this.tablaGeneral = tablaGeneral;
    }

    public String getNombre() {
        return nombre;
    }
    
    public Integer getIdCampeonato() {
        return idCampeonato;
    }
    @XmlTransient
    public List<Escuderia> getEscuderias() {
        return escuderias;
    }

    public void setCalendario(List<Premio> calendario) {
        this.calendario = calendario;
    }

    public void setEscuderias(List<Escuderia> escuderias) {
        this.escuderias = escuderias;
    }
    @XmlTransient
    public List<Monoplaza> getMonoplazas() {
        return monoplazas;
    }

    public void setMonoplazas(List<Monoplaza> monoplazas) {
        this.monoplazas = monoplazas;
    }
    @XmlTransient
    public List<Piloto> getPilotos() {
        return pilotos;
    }

    public void setPilotos(List<Piloto> pilotos) {
        this.pilotos = pilotos;
    }

    public void setIdCampeonato(Integer idCampeonato) {
        this.idCampeonato = idCampeonato;
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
     * Gets the value of the escuderias property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the escuderias property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEscuderias().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Escuderia }
     * 
     * 
     */


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
     * Gets the value of the apuestas property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the apuestas property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getApuestas().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Apuesta }
     * 
     * 
     */


    /**
     * Gets the value of the paises property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the paises property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPaises().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Pais }
     * 
     * 
     */


    /**
     * Gets the value of the usuarios property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the usuarios property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUsuarios().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Usuario }
     * 
     * 


    /**
     * Gets the value of the calendario property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the calendario property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCalendario().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Premio }
     * 
     * 
     */
    @XmlTransient
    public List<Premio> getCalendario() {
        if (calendario == null) {
            calendario = new ArrayList<Premio>();
        }
        return this.calendario;
    }

    /**
     * Gets the value of the circuitos property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the circuitos property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCircuitos().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Circuito }
     * 
     * 
     */

    
    

}
