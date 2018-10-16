
package wsApuesta;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para hacerApuesta complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="hacerApuesta"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="idUsuario" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="cantidad" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="idPremio" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="idPiloto" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "hacerApuesta", propOrder = {
    "idUsuario",
    "cantidad",
    "idPremio",
    "idPiloto"
})
public class HacerApuesta {

    protected int idUsuario;
    protected double cantidad;
    protected int idPremio;
    protected int idPiloto;

    /**
     * Obtiene el valor de la propiedad idUsuario.
     * 
     */
    public int getIdUsuario() {
        return idUsuario;
    }

    /**
     * Define el valor de la propiedad idUsuario.
     * 
     */
    public void setIdUsuario(int value) {
        this.idUsuario = value;
    }

    /**
     * Obtiene el valor de la propiedad cantidad.
     * 
     */
    public double getCantidad() {
        return cantidad;
    }

    /**
     * Define el valor de la propiedad cantidad.
     * 
     */
    public void setCantidad(double value) {
        this.cantidad = value;
    }

    /**
     * Obtiene el valor de la propiedad idPremio.
     * 
     */
    public int getIdPremio() {
        return idPremio;
    }

    /**
     * Define el valor de la propiedad idPremio.
     * 
     */
    public void setIdPremio(int value) {
        this.idPremio = value;
    }

    /**
     * Obtiene el valor de la propiedad idPiloto.
     * 
     */
    public int getIdPiloto() {
        return idPiloto;
    }

    /**
     * Define el valor de la propiedad idPiloto.
     * 
     */
    public void setIdPiloto(int value) {
        this.idPiloto = value;
    }

}
