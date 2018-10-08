
package proxy;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para obtenerCalificacionesPremio complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="obtenerCalificacionesPremio"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="idPremio" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "obtenerCalificacionesPremio", propOrder = {
    "idPremio"
})
public class ObtenerCalificacionesPremio {

    protected int idPremio;

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

}
