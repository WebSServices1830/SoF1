
package ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Clase Java para premio complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="premio"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="campeonato" type="{http://ws/}campeonato" minOccurs="0"/&gt;
 *         &lt;element name="circuito" type="{http://ws/}circuito" minOccurs="0"/&gt;
 *         &lt;element name="fechaFin" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="fechaInicio" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="idPremio" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="nombre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="sesionCarrera" type="{http://ws/}sesionCarrera" minOccurs="0"/&gt;
 *         &lt;element name="sesionClasificacion" type="{http://ws/}sesionClasificacion" minOccurs="0"/&gt;
 *         &lt;element name="sesionPractica" type="{http://ws/}sesionPractica" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "premio", propOrder = {
    "campeonato",
    "circuito",
    "fechaFin",
    "fechaInicio",
    "idPremio",
    "nombre",
    "sesionCarrera",
    "sesionClasificacion",
    "sesionPractica"
})
public class Premio {

    protected Campeonato campeonato;
    protected Circuito circuito;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fechaFin;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fechaInicio;
    protected Integer idPremio;
    protected String nombre;
    protected SesionCarrera sesionCarrera;
    protected SesionClasificacion sesionClasificacion;
    protected SesionPractica sesionPractica;

    /**
     * Obtiene el valor de la propiedad campeonato.
     * 
     * @return
     *     possible object is
     *     {@link Campeonato }
     *     
     */
    public Campeonato getCampeonato() {
        return campeonato;
    }

    /**
     * Define el valor de la propiedad campeonato.
     * 
     * @param value
     *     allowed object is
     *     {@link Campeonato }
     *     
     */
    public void setCampeonato(Campeonato value) {
        this.campeonato = value;
    }

    /**
     * Obtiene el valor de la propiedad circuito.
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
     * Define el valor de la propiedad circuito.
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
     * Obtiene el valor de la propiedad fechaFin.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFechaFin() {
        return fechaFin;
    }

    /**
     * Define el valor de la propiedad fechaFin.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFechaFin(XMLGregorianCalendar value) {
        this.fechaFin = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaInicio.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFechaInicio() {
        return fechaInicio;
    }

    /**
     * Define el valor de la propiedad fechaInicio.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFechaInicio(XMLGregorianCalendar value) {
        this.fechaInicio = value;
    }

    /**
     * Obtiene el valor de la propiedad idPremio.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIdPremio() {
        return idPremio;
    }

    /**
     * Define el valor de la propiedad idPremio.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIdPremio(Integer value) {
        this.idPremio = value;
    }

    /**
     * Obtiene el valor de la propiedad nombre.
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
     * Define el valor de la propiedad nombre.
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
     * Obtiene el valor de la propiedad sesionCarrera.
     * 
     * @return
     *     possible object is
     *     {@link SesionCarrera }
     *     
     */
    public SesionCarrera getSesionCarrera() {
        return sesionCarrera;
    }

    /**
     * Define el valor de la propiedad sesionCarrera.
     * 
     * @param value
     *     allowed object is
     *     {@link SesionCarrera }
     *     
     */
    public void setSesionCarrera(SesionCarrera value) {
        this.sesionCarrera = value;
    }

    /**
     * Obtiene el valor de la propiedad sesionClasificacion.
     * 
     * @return
     *     possible object is
     *     {@link SesionClasificacion }
     *     
     */
    public SesionClasificacion getSesionClasificacion() {
        return sesionClasificacion;
    }

    /**
     * Define el valor de la propiedad sesionClasificacion.
     * 
     * @param value
     *     allowed object is
     *     {@link SesionClasificacion }
     *     
     */
    public void setSesionClasificacion(SesionClasificacion value) {
        this.sesionClasificacion = value;
    }

    /**
     * Obtiene el valor de la propiedad sesionPractica.
     * 
     * @return
     *     possible object is
     *     {@link SesionPractica }
     *     
     */
    public SesionPractica getSesionPractica() {
        return sesionPractica;
    }

    /**
     * Define el valor de la propiedad sesionPractica.
     * 
     * @param value
     *     allowed object is
     *     {@link SesionPractica }
     *     
     */
    public void setSesionPractica(SesionPractica value) {
        this.sesionPractica = value;
    }

}
