
package ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para resultadoCarrera complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="resultadoCarrera"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="idResultado" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="piloto" type="{http://ws/}piloto" minOccurs="0"/&gt;
 *         &lt;element name="posicion" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="puntos" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="recordVuelta" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="sesionCarrera" type="{http://ws/}sesionCarrera" minOccurs="0"/&gt;
 *         &lt;element name="tiempo" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
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
@XmlType(name = "resultadoCarrera", propOrder = {
    "idResultado",
    "piloto",
    "posicion",
    "puntos",
    "recordVuelta",
    "sesionCarrera",
    "tiempo",
    "vueltas"
})
public class ResultadoCarrera {

    protected Integer idResultado;
    protected Piloto piloto;
    protected Integer posicion;
    protected Double puntos;
    protected Double recordVuelta;
    protected SesionCarrera sesionCarrera;
    protected Double tiempo;
    protected Integer vueltas;

    /**
     * Obtiene el valor de la propiedad idResultado.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIdResultado() {
        return idResultado;
    }

    /**
     * Define el valor de la propiedad idResultado.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIdResultado(Integer value) {
        this.idResultado = value;
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
     * Obtiene el valor de la propiedad posicion.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPosicion() {
        return posicion;
    }

    /**
     * Define el valor de la propiedad posicion.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPosicion(Integer value) {
        this.posicion = value;
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
     * Obtiene el valor de la propiedad recordVuelta.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getRecordVuelta() {
        return recordVuelta;
    }

    /**
     * Define el valor de la propiedad recordVuelta.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setRecordVuelta(Double value) {
        this.recordVuelta = value;
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
     * Obtiene el valor de la propiedad tiempo.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getTiempo() {
        return tiempo;
    }

    /**
     * Define el valor de la propiedad tiempo.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setTiempo(Double value) {
        this.tiempo = value;
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
