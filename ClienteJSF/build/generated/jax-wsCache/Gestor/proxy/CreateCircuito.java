
package proxy;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para createCircuito complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="createCircuito"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="circuito" type="{http://ws/}circuito" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "createCircuito", propOrder = {
    "circuito"
})
public class CreateCircuito {

    protected Circuito circuito;

    /**
     * Obtiene el valor de la propiedad circuito.
     * 
     * @return
     *     possible object is
     *     {@link Circuito }
     *     
     */
    public Circuito getCircuito() {
        return circuito;
    }

    /**
     * Define el valor de la propiedad circuito.
     * 
     * @param value
     *     allowed object is
     *     {@link Circuito }
     *     
     */
    public void setCircuito(Circuito value) {
        this.circuito = value;
    }

}
