
package ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para resultadoClasificacion complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="resultadoClasificacion"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="idResultado" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="piloto" type="{http://ws/}piloto" minOccurs="0"/&gt;
 *         &lt;element name="posicion" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="q1" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="q2" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="q3" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="recordVuelta" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="sesionClasificacion" type="{http://ws/}sesionClasificacion" minOccurs="0"/&gt;
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
@XmlType(name = "resultadoClasificacion", propOrder = {
    "idResultado",
    "piloto",
    "posicion",
    "q1",
    "q2",
    "q3",
    "recordVuelta",
    "sesionClasificacion",
    "vueltas"
})
public class ResultadoClasificacion {

    protected Integer idResultado;
    protected Piloto piloto;
    protected Integer posicion;
    protected Double q1;
    protected Double q2;
    protected Double q3;
    protected Double recordVuelta;
    protected SesionClasificacion sesionClasificacion;
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
     * Obtiene el valor de la propiedad q1.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getQ1() {
        return q1;
    }

    /**
     * Define el valor de la propiedad q1.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setQ1(Double value) {
        this.q1 = value;
    }

    /**
     * Obtiene el valor de la propiedad q2.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getQ2() {
        return q2;
    }

    /**
     * Define el valor de la propiedad q2.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setQ2(Double value) {
        this.q2 = value;
    }

    /**
     * Obtiene el valor de la propiedad q3.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getQ3() {
        return q3;
    }

    /**
     * Define el valor de la propiedad q3.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setQ3(Double value) {
        this.q3 = value;
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
