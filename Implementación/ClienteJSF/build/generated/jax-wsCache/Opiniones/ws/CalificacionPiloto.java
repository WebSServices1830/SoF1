
package ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Clase Java para calificacionPiloto complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="calificacionPiloto"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="comentario" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="fecha" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="idCalificacion" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="piloto" type="{http://ws/}piloto" minOccurs="0"/&gt;
 *         &lt;element name="puntaje" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
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
@XmlType(name = "calificacionPiloto", propOrder = {
    "comentario",
    "fecha",
    "idCalificacion",
    "piloto",
    "puntaje",
    "usuario"
})
public class CalificacionPiloto {

    protected String comentario;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fecha;
    protected Integer idCalificacion;
    protected Piloto piloto;
    protected Double puntaje;
    protected Usuario usuario;

    /**
     * Obtiene el valor de la propiedad comentario.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComentario() {
        return comentario;
    }

    /**
     * Define el valor de la propiedad comentario.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComentario(String value) {
        this.comentario = value;
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
     * Obtiene el valor de la propiedad idCalificacion.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIdCalificacion() {
        return idCalificacion;
    }

    /**
     * Define el valor de la propiedad idCalificacion.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIdCalificacion(Integer value) {
        this.idCalificacion = value;
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
     * Obtiene el valor de la propiedad puntaje.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getPuntaje() {
        return puntaje;
    }

    /**
     * Define el valor de la propiedad puntaje.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setPuntaje(Double value) {
        this.puntaje = value;
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
