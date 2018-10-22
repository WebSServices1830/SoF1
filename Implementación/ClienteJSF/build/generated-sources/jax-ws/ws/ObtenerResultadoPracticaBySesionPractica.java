
package ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para obtenerResultadoPracticaBySesionPractica complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="obtenerResultadoPracticaBySesionPractica"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="idSesionPractica" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "obtenerResultadoPracticaBySesionPractica", propOrder = {
    "idSesionPractica"
})
public class ObtenerResultadoPracticaBySesionPractica {

    protected int idSesionPractica;

    /**
     * Obtiene el valor de la propiedad idSesionPractica.
     * 
     */
    public int getIdSesionPractica() {
        return idSesionPractica;
    }

    /**
     * Define el valor de la propiedad idSesionPractica.
     * 
     */
    public void setIdSesionPractica(int value) {
        this.idSesionPractica = value;
    }

}
