
package proxy;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para findEscuderia complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="findEscuderia"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="idEscuderia" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "findEscuderia", propOrder = {
    "idEscuderia"
})
public class FindEscuderia {

    protected int idEscuderia;

    /**
     * Obtiene el valor de la propiedad idEscuderia.
     * 
     */
    public int getIdEscuderia() {
        return idEscuderia;
    }

    /**
     * Define el valor de la propiedad idEscuderia.
     * 
     */
    public void setIdEscuderia(int value) {
        this.idEscuderia = value;
    }

}
