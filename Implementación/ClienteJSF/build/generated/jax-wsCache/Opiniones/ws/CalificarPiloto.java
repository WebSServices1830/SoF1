
package ws;

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
 *         &lt;element name="calificacionPiloto" type="{http://ws/}calificacionPiloto" minOccurs="0"/&gt;
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
    "calificacionPiloto"
})
public class CalificarPiloto {

    protected int idUsuario;
    protected int idPiloto;
    protected CalificacionPiloto calificacionPiloto;

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
     * Obtiene el valor de la propiedad calificacionPiloto.
     * 
     * @return
     *     possible object is
     *     {@link CalificacionPiloto }
     *     
     */
    public CalificacionPiloto getCalificacionPiloto() {
        return calificacionPiloto;
    }

    /**
     * Define el valor de la propiedad calificacionPiloto.
     * 
     * @param value
     *     allowed object is
     *     {@link CalificacionPiloto }
     *     
     */
    public void setCalificacionPiloto(CalificacionPiloto value) {
        this.calificacionPiloto = value;
    }

}
