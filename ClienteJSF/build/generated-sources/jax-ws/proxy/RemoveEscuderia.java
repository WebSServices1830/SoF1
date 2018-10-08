
package proxy;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para removeEscuderia complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="removeEscuderia"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="escuderia" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "removeEscuderia", propOrder = {
    "escuderia"
})
public class RemoveEscuderia {

    protected int escuderia;

    /**
     * Obtiene el valor de la propiedad escuderia.
     * 
     */
    public int getEscuderia() {
        return escuderia;
    }

    /**
     * Define el valor de la propiedad escuderia.
     * 
     */
    public void setEscuderia(int value) {
        this.escuderia = value;
    }

}
