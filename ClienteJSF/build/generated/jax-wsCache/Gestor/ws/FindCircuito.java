
package ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para findCircuito complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="findCircuito"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="idCircuito" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "findCircuito", propOrder = {
    "idCircuito"
})
public class FindCircuito {

    protected int idCircuito;

    /**
     * Obtiene el valor de la propiedad idCircuito.
     * 
     */
    public int getIdCircuito() {
        return idCircuito;
    }

    /**
     * Define el valor de la propiedad idCircuito.
     * 
     */
    public void setIdCircuito(int value) {
        this.idCircuito = value;
    }

}
