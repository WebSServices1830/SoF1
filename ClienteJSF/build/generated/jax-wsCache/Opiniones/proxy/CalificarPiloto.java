
package proxy;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para calificarPiloto complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="calificarPiloto"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="idUsuario" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="idPiloto" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="calificacion" type="{http://ws/}calificacion" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "calificarPiloto", propOrder = {
    "idUsuario",
    "idPiloto",
    "calificacion"
})
public class CalificarPiloto {

    protected int idUsuario;
    protected int idPiloto;
    protected Calificacion calificacion;

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
     * Obtiene el valor de la propiedad idPiloto.
     * 
     */
    public int getIdPiloto() {
        return idPiloto;
    }

    /**
     * Define el valor de la propiedad idPiloto.
     * 
     */
    public void setIdPiloto(int value) {
        this.idPiloto = value;
    }

    /**
     * Obtiene el valor de la propiedad calificacion.
     * 
     * @return
     *     possible object is
     *     {@link Calificacion }
     *     
     */
    public Calificacion getCalificacion() {
        return calificacion;
    }

    /**
     * Define el valor de la propiedad calificacion.
     * 
     * @param value
     *     allowed object is
     *     {@link Calificacion }
     *     
     */
    public void setCalificacion(Calificacion value) {
        this.calificacion = value;
    }

}
