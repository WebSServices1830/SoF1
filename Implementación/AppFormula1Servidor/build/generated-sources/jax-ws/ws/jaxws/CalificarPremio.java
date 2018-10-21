
package ws.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "calificarPremio", namespace = "http://ws/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "calificarPremio", namespace = "http://ws/", propOrder = {
    "idUsuario",
    "idPremio",
    "calificacionPremio"
})
public class CalificarPremio {

    @XmlElement(name = "idUsuario", namespace = "")
    private int idUsuario;
    @XmlElement(name = "idPremio", namespace = "")
    private int idPremio;
    @XmlElement(name = "calificacionPremio", namespace = "")
    private entities.CalificacionPremio calificacionPremio;

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
     *     returns CalificacionPremio
     */
    public entities.CalificacionPremio getCalificacionPremio() {
        return this.calificacionPremio;
    }

    /**
     * 
     * @param calificacionPremio
     *     the value for the calificacionPremio property
     */
    public void setCalificacionPremio(entities.CalificacionPremio calificacionPremio) {
        this.calificacionPremio = calificacionPremio;
    }

}
