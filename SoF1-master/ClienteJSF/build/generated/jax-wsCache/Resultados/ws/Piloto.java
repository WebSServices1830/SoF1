
package ws;

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
 * <p>Clase Java para piloto complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="piloto"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="biografia" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="campeonato" type="{http://www.w3.org/2001/XMLSchema}IDREF" minOccurs="0"/&gt;
 *         &lt;element name="campeonatos" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="escuderia" type="{http://www.w3.org/2001/XMLSchema}IDREF" minOccurs="0"/&gt;
 *         &lt;element name="experiencia" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="fechaNacimiento" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="idPiloto" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="idXml" type="{http://www.w3.org/2001/XMLSchema}ID" minOccurs="0"/&gt;
 *         &lt;element name="imagen" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="multiplicador" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="nombre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="numero" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="pais" type="{http://www.w3.org/2001/XMLSchema}IDREF" minOccurs="0"/&gt;
 *         &lt;element name="paisNacimiento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="podios" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "piloto", propOrder = {
    "biografia",
    "campeonato",
    "campeonatos",
    "escuderia",
    "experiencia",
    "fechaNacimiento",
    "idPiloto",
    "idXml",
    "imagen",
    "multiplicador",
    "nombre",
    "numero",
    "pais",
    "paisNacimiento",
    "podios"
})
public class Piloto {

    protected String biografia;
    @XmlIDREF
    @XmlSchemaType(name = "IDREF")
    protected Object campeonato;
    protected Integer campeonatos;
    @XmlIDREF
    @XmlSchemaType(name = "IDREF")
    protected Object escuderia;
    protected String experiencia;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fechaNacimiento;
    protected Integer idPiloto;
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String idXml;
    protected String imagen;
    protected Double multiplicador;
    protected String nombre;
    protected Integer numero;
    @XmlIDREF
    @XmlSchemaType(name = "IDREF")
    protected Object pais;
    protected String paisNacimiento;
    protected Integer podios;

    /**
     * Obtiene el valor de la propiedad biografia.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBiografia() {
        return biografia;
    }

    /**
     * Define el valor de la propiedad biografia.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBiografia(String value) {
        this.biografia = value;
    }

    /**
     * Obtiene el valor de la propiedad campeonato.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getCampeonato() {
        return campeonato;
    }

    /**
     * Define el valor de la propiedad campeonato.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setCampeonato(Object value) {
        this.campeonato = value;
    }

    /**
     * Obtiene el valor de la propiedad campeonatos.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCampeonatos() {
        return campeonatos;
    }

    /**
     * Define el valor de la propiedad campeonatos.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCampeonatos(Integer value) {
        this.campeonatos = value;
    }

    /**
     * Obtiene el valor de la propiedad escuderia.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getEscuderia() {
        return escuderia;
    }

    /**
     * Define el valor de la propiedad escuderia.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setEscuderia(Object value) {
        this.escuderia = value;
    }

    /**
     * Obtiene el valor de la propiedad experiencia.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExperiencia() {
        return experiencia;
    }

    /**
     * Define el valor de la propiedad experiencia.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExperiencia(String value) {
        this.experiencia = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaNacimiento.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFechaNacimiento() {
        return fechaNacimiento;
    }

    /**
     * Define el valor de la propiedad fechaNacimiento.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFechaNacimiento(XMLGregorianCalendar value) {
        this.fechaNacimiento = value;
    }

    /**
     * Obtiene el valor de la propiedad idPiloto.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIdPiloto() {
        return idPiloto;
    }

    /**
     * Define el valor de la propiedad idPiloto.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIdPiloto(Integer value) {
        this.idPiloto = value;
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
     * Obtiene el valor de la propiedad imagen.
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
     * Define el valor de la propiedad imagen.
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
     * Obtiene el valor de la propiedad multiplicador.
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
     * Define el valor de la propiedad multiplicador.
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
     * Obtiene el valor de la propiedad numero.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumero() {
        return numero;
    }

    /**
     * Define el valor de la propiedad numero.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumero(Integer value) {
        this.numero = value;
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
     * Obtiene el valor de la propiedad paisNacimiento.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaisNacimiento() {
        return paisNacimiento;
    }

    /**
     * Define el valor de la propiedad paisNacimiento.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaisNacimiento(String value) {
        this.paisNacimiento = value;
    }

    /**
     * Obtiene el valor de la propiedad podios.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPodios() {
        return podios;
    }

    /**
     * Define el valor de la propiedad podios.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPodios(Integer value) {
        this.podios = value;
    }

}