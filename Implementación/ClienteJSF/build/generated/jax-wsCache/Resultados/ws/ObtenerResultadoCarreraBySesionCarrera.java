
package ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para obtenerResultadoCarreraBySesionCarrera complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="obtenerResultadoCarreraBySesionCarrera"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="idSesionCarrera" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "obtenerResultadoCarreraBySesionCarrera", propOrder = {
    "idSesionCarrera"
})
public class ObtenerResultadoCarreraBySesionCarrera {

    protected int idSesionCarrera;

    /**
     * Obtiene el valor de la propiedad idSesionCarrera.
     * 
     */
    public int getIdSesionCarrera() {
        return idSesionCarrera;
    }

    /**
     * Define el valor de la propiedad idSesionCarrera.
     * 
     */
    public void setIdSesionCarrera(int value) {
        this.idSesionCarrera = value;
    }

}
