
package ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Clase Java para apuesta complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="apuesta"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="cantidad" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="cantidadGanada" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="efectuada" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="fecha" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="idApuesta" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="piloto" type="{http://ws/}piloto" minOccurs="0"/&gt;
 *         &lt;element name="premio" type="{http://ws/}premio" minOccurs="0"/&gt;
 *         &lt;element name="puntos" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="usuario" type="{http://ws/}usuario" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "apuesta", propOrder = {
    "cantidad",
    "cantidadGanada",
    "efectuada",
    "fecha",
    "id",
    "idApuesta",
    "piloto",
    "premio",
    "puntos",
    "usuario"
})
public class Apuesta {

    protected Double cantidad;
    protected Double cantidadGanada;
    protected boolean efectuada;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fecha;
    protected Integer id;
    protected Integer idApuesta;
    protected Piloto piloto;
    protected Premio premio;
    protected Double puntos;
    protected Usuario usuario;

    /**
     * Obtiene el valor de la propiedad cantidad.
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
     * Define el valor de la propiedad cantidad.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCantidad(Double value) {
        this.cantidad = value;
    }

    /**
     * Obtiene el valor de la propiedad cantidadGanada.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCantidadGanada() {
        return cantidadGanada;
    }

    /**
     * Define el valor de la propiedad cantidadGanada.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCantidadGanada(Double value) {
        this.cantidadGanada = value;
    }

    /**
     * Obtiene el valor de la propiedad efectuada.
     * 
     */
    public boolean isEfectuada() {
        return efectuada;
    }

    /**
     * Define el valor de la propiedad efectuada.
     * 
     */
    public void setEfectuada(boolean value) {
        this.efectuada = value;
    }

    /**
     * Obtiene el valor de la propiedad fecha.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFecha() {
        return fecha;
    }

    /**
     * Define el valor de la propiedad fecha.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFecha(XMLGregorianCalendar value) {
        this.fecha = value;
    }

    /**
     * Obtiene el valor de la propiedad id.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getId() {
        return id;
    }

    /**
     * Define el valor de la propiedad id.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setId(Integer value) {
        this.id = value;
    }

    /**
     * Obtiene el valor de la propiedad idApuesta.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIdApuesta() {
        return idApuesta;
    }

    /**
     * Define el valor de la propiedad idApuesta.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIdApuesta(Integer value) {
        this.idApuesta = value;
    }

    /**
     * Obtiene el valor de la propiedad piloto.
     * 
     * @return
     *     possible object is
     *     {@link Piloto }
     *     
     */
    public Piloto getPiloto() {
        return piloto;
    }

    /**
     * Define el valor de la propiedad piloto.
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
     * Obtiene el valor de la propiedad premio.
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
     * Define el valor de la propiedad premio.
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
     * Obtiene el valor de la propiedad puntos.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getPuntos() {
        return puntos;
    }

    /**
     * Define el valor de la propiedad puntos.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setPuntos(Double value) {
        this.puntos = value;
    }

    /**
     * Obtiene el valor de la propiedad usuario.
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
     * Define el valor de la propiedad usuario.
     * 
     * @param value
     *     allowed object is
     *     {@link Usuario }
     *     
     */
    public void setUsuario(Usuario value) {
        this.usuario = value;
    }

}
