
package proxy;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para editEscuderia complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="editEscuderia"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="escuderia" type="{http://ws/}escuderia" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "editEscuderia", propOrder = {
    "escuderia"
})
public class EditEscuderia {

    protected Escuderia escuderia;

    /**
     * Obtiene el valor de la propiedad escuderia.
     * 
     * @return
     *     possible object is
     *     {@link Escuderia }
     *     
     */
    public Escuderia getEscuderia() {
        return escuderia;
    }

    /**
     * Define el valor de la propiedad escuderia.
     * 
     * @param value
     *     allowed object is
     *     {@link Escuderia }
     *     
     */
    public void setEscuderia(Escuderia value) {
        this.escuderia = value;
    }

}
