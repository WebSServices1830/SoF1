
package wsApuesta;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlIDREF;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Clase Java para circuito complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="circuito"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="fechRecord" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="foto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="idCircuito" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="idXml" type="{http://www.w3.org/2001/XMLSchema}ID" minOccurs="0"/&gt;
 *         &lt;element name="longitud" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="nombre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="pais" type="{http://www.w3.org/2001/XMLSchema}IDREF" minOccurs="0"/&gt;
 *         &lt;element name="record" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="ultimoGanador" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="vueltas" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "circuito", propOrder = {
    "fechRecord",
    "foto",
    "idCircuito",
    "idXml",
    "longitud",
    "nombre",
    "pais",
    "record",
    "ultimoGanador",
    "vueltas"
})
public class Circuito {

    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fechRecord;
    protected String foto;
    protected Integer idCircuito;
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String idXml;
    protected Double longitud;
    protected String nombre;
    @XmlIDREF
    @XmlSchemaType(name = "IDREF")
    protected Object pais;
    protected Double record;
    protected String ultimoGanador;
    protected Integer vueltas;

    /**
     * Obtiene el valor de la propiedad fechRecord.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFechRecord() {
        return fechRecord;
    }

    /**
     * Define el valor de la propiedad fechRecord.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFechRecord(XMLGregorianCalendar value) {
        this.fechRecord = value;
    }

    /**
     * Obtiene el valor de la propiedad foto.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFoto() {
        return foto;
    }

    /**
     * Define el valor de la propiedad foto.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFoto(String value) {
        this.foto = value;
    }

    /**
     * Obtiene el valor de la propiedad idCircuito.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIdCircuito() {
        return idCircuito;
    }

    /**
     * Define el valor de la propiedad idCircuito.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIdCircuito(Integer value) {
        this.idCircuito = value;
    }

    /**
     * Obtiene el valor de la propiedad idXml.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdXml() {
        return idXml;
    }

    /**
     * Define el valor de la propiedad idXml.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdXml(String value) {
        this.idXml = value;
    }

    /**
     * Obtiene el valor de la propiedad longitud.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getLongitud() {
        return longitud;
    }

    /**
     * Define el valor de la propiedad longitud.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setLongitud(Double value) {
        this.longitud = value;
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
     * Obtiene el valor de la propiedad pais.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getPais() {
        return pais;
    }

    /**
     * Define el valor de la propiedad pais.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setPais(Object value) {
        this.pais = value;
    }

    /**
     * Obtiene el valor de la propiedad record.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getRecord() {
        return record;
    }

    /**
     * Define el valor de la propiedad record.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setRecord(Double value) {
        this.record = value;
    }

    /**
     * Obtiene el valor de la propiedad ultimoGanador.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUltimoGanador() {
        return ultimoGanador;
    }

    /**
     * Define el valor de la propiedad ultimoGanador.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUltimoGanador(String value) {
        this.ultimoGanador = value;
    }

    /**
     * Obtiene el valor de la propiedad vueltas.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getVueltas() {
        return vueltas;
    }

    /**
     * Define el valor de la propiedad vueltas.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setVueltas(Integer value) {
        this.vueltas = value;
    }

}
