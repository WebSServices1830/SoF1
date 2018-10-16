
package ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlIDREF;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Clase Java para monoplaza complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="monoplaza"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="campeonato" type="{http://www.w3.org/2001/XMLSchema}IDREF" minOccurs="0"/&gt;
 *         &lt;element name="escuderia" type="{http://www.w3.org/2001/XMLSchema}IDREF" minOccurs="0"/&gt;
 *         &lt;element name="idMonoplaza" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="idXml" type="{http://www.w3.org/2001/XMLSchema}ID" minOccurs="0"/&gt;
 *         &lt;element name="imagen" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="marca" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="modelo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="multiplicador" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="numCilindros" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="piloto" type="{http://www.w3.org/2001/XMLSchema}IDREF" minOccurs="0"/&gt;
 *         &lt;element name="potencia" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="torque" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="velMax" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "monoplaza", propOrder = {
    "campeonato",
    "escuderia",
    "idMonoplaza",
    "idXml",
    "imagen",
    "marca",
    "modelo",
    "multiplicador",
    "numCilindros",
    "piloto",
    "potencia",
    "torque",
    "velMax"
})
public class Monoplaza {

    @XmlIDREF
    @XmlSchemaType(name = "IDREF")
    protected Object campeonato;
    @XmlIDREF
    @XmlSchemaType(name = "IDREF")
    protected Object escuderia;
    protected Integer idMonoplaza;
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String idXml;
    protected String imagen;
    protected String marca;
    protected String modelo;
    protected Double multiplicador;
    protected Double numCilindros;
    @XmlIDREF
    @XmlSchemaType(name = "IDREF")
    protected Object piloto;
    protected Double potencia;
    protected Double torque;
    protected Double velMax;

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
     * Obtiene el valor de la propiedad idMonoplaza.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIdMonoplaza() {
        return idMonoplaza;
    }

    /**
     * Define el valor de la propiedad idMonoplaza.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIdMonoplaza(Integer value) {
        this.idMonoplaza = value;
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
     * Obtiene el valor de la propiedad marca.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMarca() {
        return marca;
    }

    /**
     * Define el valor de la propiedad marca.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMarca(String value) {
        this.marca = value;
    }

    /**
     * Obtiene el valor de la propiedad modelo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModelo() {
        return modelo;
    }

    /**
     * Define el valor de la propiedad modelo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModelo(String value) {
        this.modelo = value;
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
     * Obtiene el valor de la propiedad numCilindros.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getNumCilindros() {
        return numCilindros;
    }

    /**
     * Define el valor de la propiedad numCilindros.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setNumCilindros(Double value) {
        this.numCilindros = value;
    }

    /**
     * Obtiene el valor de la propiedad piloto.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getPiloto() {
        return piloto;
    }

    /**
     * Define el valor de la propiedad piloto.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setPiloto(Object value) {
        this.piloto = value;
    }

    /**
     * Obtiene el valor de la propiedad potencia.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getPotencia() {
        return potencia;
    }

    /**
     * Define el valor de la propiedad potencia.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setPotencia(Double value) {
        this.potencia = value;
    }

    /**
     * Obtiene el valor de la propiedad torque.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getTorque() {
        return torque;
    }

    /**
     * Define el valor de la propiedad torque.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setTorque(Double value) {
        this.torque = value;
    }

    /**
     * Obtiene el valor de la propiedad velMax.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getVelMax() {
        return velMax;
    }

    /**
     * Define el valor de la propiedad velMax.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setVelMax(Double value) {
        this.velMax = value;
    }

}
