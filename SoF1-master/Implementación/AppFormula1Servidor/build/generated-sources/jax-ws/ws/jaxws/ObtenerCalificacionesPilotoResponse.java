
package ws.jaxws;

import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "obtenerCalificacionesPilotoResponse", namespace = "http://ws/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "obtenerCalificacionesPilotoResponse", namespace = "http://ws/")
public class ObtenerCalificacionesPilotoResponse {

    @XmlElement(name = "return", namespace = "")
    private List<entities.CalificacionPiloto> _return;

    /**
     * 
     * @return
     *     returns List<CalificacionPiloto>
     */
    public List<entities.CalificacionPiloto> getReturn() {
        return this._return;
    }

    /**
     * 
     * @param _return
     *     the value for the _return property
     */
    public void setReturn(List<entities.CalificacionPiloto> _return) {
        this._return = _return;
    }

}
