
package proxy;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para findMonoplaza complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="findMonoplaza"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="idMonoplaza" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "findMonoplaza", propOrder = {
    "idMonoplaza"
})
public class FindMonoplaza {

    protected int idMonoplaza;

    /**
     * Obtiene el valor de la propiedad idMonoplaza.
     * 
     */
    public int getIdMonoplaza() {
        return idMonoplaza;
    }

    /**
     * Define el valor de la propiedad idMonoplaza.
     * 
     */
    public void setIdMonoplaza(int value) {
        this.idMonoplaza = value;
    }

}
