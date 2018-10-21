
package ws.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "calificarPiloto", namespace = "http://ws/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "calificarPiloto", namespace = "http://ws/", propOrder = {
    "idUsuario",
    "idPiloto",
    "calificacionPiloto"
})
public class CalificarPiloto {

    @XmlElement(name = "idUsuario", namespace = "")
    private int idUsuario;
    @XmlElement(name = "idPiloto", namespace = "")
    private int idPiloto;
    @XmlElement(name = "calificacionPiloto", namespace = "")
    private entities.CalificacionPiloto calificacionPiloto;

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

    /**
     * 
     * @return
     *     returns CalificacionPiloto
     */
    public entities.CalificacionPiloto getCalificacionPiloto() {
        return this.calificacionPiloto;
    }

    /**
     * 
     * @param calificacionPiloto
     *     the value for the calificacionPiloto property
     */
    public void setCalificacionPiloto(entities.CalificacionPiloto calificacionPiloto) {
        this.calificacionPiloto = calificacionPiloto;
    }

}
