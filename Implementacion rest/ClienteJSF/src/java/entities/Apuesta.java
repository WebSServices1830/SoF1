//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.2-147 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.10.05 at 10:42:35 AM COT 
//


package entities;

//import static com.oracle.wls.shaded.org.apache.xalan.xsltc.compiler.util.Type.Int;
import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;
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
@Table(name = "Apuesta")
public class Apuesta implements Serializable{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="idApuesta", nullable = false, unique = true)
    private Integer idApuesta;
     
    @JoinColumn(name="piloto_id", nullable = false)
    @OneToOne
    private Piloto piloto;
    
    @JoinColumn(name="premio_id", nullable = false)
    @OneToOne
    private Premio premio;
    
    @JoinColumn(name="usuario_id")
    @OneToOne
    private Usuario usuario;
    
    @Column
    private Double puntos;
    
    @Column
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date fecha;
    
    @Column
    private Double cantidad;
    
    @Column
    private boolean efectuada;
    
    @Column
    private Double cantidadGanada;

    
    public boolean isEfectuada() {
        return efectuada;
    }

    public void setEfectuada(boolean efectuada) {
        this.efectuada = efectuada;
    }

    public Double getCantidadGanada() {
        return cantidadGanada;
    }

    /**
     * Gets the value of the piloto property.
     * 
     * @return
     *     possible object is
     *     {@link Piloto }
     *     
     */
    public void setCantidadGanada(Double cantidadGanada) {    
        this.cantidadGanada = cantidadGanada;
    }
    
    public Piloto getPiloto() {
        return piloto;
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
     * Gets the value of the premio property.
     * 
     * @return
     *     possible object is
     *     {@link Premio }
     *     
     */
    
    public Premio getPremio() {
        return premio;
    }

    /**
     * Sets the value of the premio property.
     * 
     * @param value
     *     allowed object is
     *     {@link Premio }
     *     
     */
    public void setPremio(Premio value) {
        this.premio = value;
    }

    /**
     * Gets the value of the usuario property.
     * 
     * @return
     *     possible object is
     *     {@link Usuario }
     *     
     */
    
    public Usuario getUsuario() {
        return usuario;
    }

    /**
     * Sets the value of the usuario property.
     * 
     * @param value
     *     allowed object is
     *     {@link Usuario }
     *     
     */
    public void setUsuario(Usuario value) {
        this.usuario = value;
    }

    /**
     * Gets the value of the puntos property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Double getPuntos() {
        return puntos;
    }

    /**
     * Sets the value of the puntos property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPuntos(Double value) {
        this.puntos = value;
    }

    /**
     * Gets the value of the fecha property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Date getFecha() {
        return fecha;
    }

    /**
     * Sets the value of the fecha property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFecha(Date value) {
        this.fecha = value;
    }

    /**
     * Gets the value of the cantidad property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCantidad() {
        return cantidad;
    }

    /**
     * Sets the value of the cantidad property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCantidad(Double value) {
        this.cantidad = value;
    }

    public Integer getId() {
        return idApuesta;
    }

    public void setId(Integer id) {
        this.idApuesta = id;
    }
    //
    public String getIdXml() {
        return idApuesta+"";
    }
    
    public Integer getIdApuesta() {
        return idApuesta;
    }

    public void setIdApuesta(Integer idApuesta) {
        this.idApuesta = idApuesta;
    }


    
}