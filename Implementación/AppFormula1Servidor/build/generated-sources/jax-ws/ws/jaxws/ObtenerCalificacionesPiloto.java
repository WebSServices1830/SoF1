
package ws.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "obtenerCalificacionesPiloto", namespace = "http://ws/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "obtenerCalificacionesPiloto", namespace = "http://ws/")
public class ObtenerCalificacionesPiloto {

    @XmlElement(name = "idPiloto", namespace = "")
    private int idPiloto;

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
