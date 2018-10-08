
package proxy;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


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
 *         &lt;element name="campeonato" type="{http://ws/}campeonato" minOccurs="0"/&gt;
 *         &lt;element name="escuderia" type="{http://ws/}escuderia" minOccurs="0"/&gt;
 *         &lt;element name="idMonoplaza" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="imagen" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="marca" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="modelo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="multiplicador" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="numCilindros" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
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
    "imagen",
    "marca",
    "modelo",
    "multiplicador",
    "numCilindros",
    "potencia",
    "torque",
    "velMax"
})
public class Monoplaza {

    protected Campeonato campeonato;
    protected Escuderia escuderia;
    protected Integer idMonoplaza;
    protected String imagen;
    protected String marca;
    protected String modelo;
    protected Double multiplicador;
    protected Double numCilindros;
    protected Double potencia;
    protected Double torque;
    protected Double velMax;

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
     * Obtiene el valor de la propiedad escuderia.
     * 
     * @return
     *     possible object is
     *     {@link Escuderia }
     *     
     */
    public Escuderia getEscuderia() {
        return escuderia;
    }

    /**
     * Define el valor de la propiedad escuderia.
     * 
     * @param value
     *     allowed object is
     *     {@link Escuderia }
     *     
     */
    public void setEscuderia(Escuderia value) {
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
