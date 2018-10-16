
package ws.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "hacerApuesta", namespace = "http://ws/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "hacerApuesta", namespace = "http://ws/", propOrder = {
    "idUsuario",
    "cantidad",
    "idPremio",
    "idPiloto"
})
public class HacerApuesta {

    @XmlElement(name = "idUsuario", namespace = "")
    private int idUsuario;
    @XmlElement(name = "cantidad", namespace = "")
    private double cantidad;
    @XmlElement(name = "idPremio", namespace = "")
    private int idPremio;
    @XmlElement(name = "idPiloto", namespace = "")
    private int idPiloto;

    /**
     * 
     * @return
     *     returns int
     */
    public int getIdUsuario() {
        return this.idUsuario;
    }

    /**
     * 
     * @param idUsuario
     *     the value for the idUsuario property
     */
    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    /**
     * 
     * @return
     *     returns double
     */
    public double getCantidad() {
        return this.cantidad;
    }

    /**
     * 
     * @param cantidad
     *     the value for the cantidad property
     */
    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }

    /**
     * 
     * @return
     *     returns int
     */
    public int getIdPremio() {
        return this.idPremio;
    }

    /**
     * 
     * @param idPremio
     *     the value for the idPremio property
     */
    public void setIdPremio(int idPremio) {
        this.idPremio = idPremio;
    }

    /**
     * 
     * @return
     *     returns int
     */
    public int getIdPiloto() {
        return this.idPiloto;
    }

    /**
     * 
     * @param idPiloto
     *     the value for the idPiloto property
     */
    public void setIdPiloto(int idPiloto) {
        this.idPiloto = idPiloto;
    }

}
