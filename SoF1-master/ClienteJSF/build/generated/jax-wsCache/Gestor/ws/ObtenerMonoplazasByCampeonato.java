
package ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para obtenerMonoplazasByCampeonato complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="obtenerMonoplazasByCampeonato"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="idCampeonato" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "obtenerMonoplazasByCampeonato", propOrder = {
    "idCampeonato"
})
public class ObtenerMonoplazasByCampeonato {

    protected int idCampeonato;

    /**
     * Obtiene el valor de la propiedad idCampeonato.
     * 
     */
    public int getIdCampeonato() {
        return idCampeonato;
    }

    /**
     * Define el valor de la propiedad idCampeonato.
     * 
     */
    public void setIdCampeonato(int value) {
        this.idCampeonato = value;
    }

}
