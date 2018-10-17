
package ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para removeMonoplaza complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="removeMonoplaza"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="monoplaza" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "removeMonoplaza", propOrder = {
    "monoplaza"
})
public class RemoveMonoplaza {

    protected int monoplaza;

    /**
     * Obtiene el valor de la propiedad monoplaza.
     * 
     */
    public int getMonoplaza() {
        return monoplaza;
    }

    /**
     * Define el valor de la propiedad monoplaza.
     * 
     */
    public void setMonoplaza(int value) {
        this.monoplaza = value;
    }

}
