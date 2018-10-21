
package ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para calificarPremio complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="calificarPremio"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="idUsuario" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="idPremio" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="calificacionPremio" type="{http://ws/}calificacionPremio" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "calificarPremio", propOrder = {
    "idUsuario",
    "idPremio",
    "calificacionPremio"
})
public class CalificarPremio {

    protected int idUsuario;
    protected int idPremio;
    protected CalificacionPremio calificacionPremio;

    /**
     * Obtiene el valor de la propiedad idUsuario.
     * 
     */
    public int getIdUsuario() {
        return idUsuario;
    }

    /**
     * Define el valor de la propiedad idUsuario.
     * 
     */
    public void setIdUsuario(int value) {
        this.idUsuario = value;
    }

    /**
     * Obtiene el valor de la propiedad idPremio.
     * 
     */
    public int getIdPremio() {
        return idPremio;
    }

    /**
     * Define el valor de la propiedad idPremio.
     * 
     */
    public void setIdPremio(int value) {
        this.idPremio = value;
    }

    /**
     * Obtiene el valor de la propiedad calificacionPremio.
     * 
     * @return
     *     possible object is
     *     {@link CalificacionPremio }
     *     
     */
    public CalificacionPremio getCalificacionPremio() {
        return calificacionPremio;
    }

    /**
     * Define el valor de la propiedad calificacionPremio.
     * 
     * @param value
     *     allowed object is
     *     {@link CalificacionPremio }
     *     
     */
    public void setCalificacionPremio(CalificacionPremio value) {
        this.calificacionPremio = value;
    }

}
