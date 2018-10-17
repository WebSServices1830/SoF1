
package ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para createMonoplaza complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="createMonoplaza"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="monoplaza" type="{http://ws/}monoplaza" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "createMonoplaza", propOrder = {
    "monoplaza"
})
public class CreateMonoplaza {

    protected Monoplaza monoplaza;

    /**
     * Obtiene el valor de la propiedad monoplaza.
     * 
     * @return
     *     possible object is
     *     {@link Monoplaza }
     *     
     */
    public Monoplaza getMonoplaza() {
        return monoplaza;
    }

    /**
     * Define el valor de la propiedad monoplaza.
     * 
     * @param value
     *     allowed object is
     *     {@link Monoplaza }
     *     
     */
    public void setMonoplaza(Monoplaza value) {
        this.monoplaza = value;
    }

}
