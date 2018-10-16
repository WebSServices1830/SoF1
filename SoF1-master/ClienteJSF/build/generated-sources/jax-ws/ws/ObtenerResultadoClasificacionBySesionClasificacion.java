
package ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para obtenerResultadoClasificacionBySesionClasificacion complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="obtenerResultadoClasificacionBySesionClasificacion"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="idSesionClasificacion" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "obtenerResultadoClasificacionBySesionClasificacion", propOrder = {
    "idSesionClasificacion"
})
public class ObtenerResultadoClasificacionBySesionClasificacion {

    protected int idSesionClasificacion;

    /**
     * Obtiene el valor de la propiedad idSesionClasificacion.
     * 
     */
    public int getIdSesionClasificacion() {
        return idSesionClasificacion;
    }

    /**
     * Define el valor de la propiedad idSesionClasificacion.
     * 
     */
    public void setIdSesionClasificacion(int value) {
        this.idSesionClasificacion = value;
    }

}
