
package ws.jaxws;

import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "obtenerTopPilotosResponse", namespace = "http://ws/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "obtenerTopPilotosResponse", namespace = "http://ws/")
public class ObtenerTopPilotosResponse {

    @XmlElement(name = "return", namespace = "")
    private List<entities.Piloto> _return;

    /**
     * 
     * @return
     *     returns List<Piloto>
     */
    public List<entities.Piloto> getReturn() {
        return this._return;
    }

    /**
     * 
     * @param _return
     *     the value for the _return property
     */
    public void setReturn(List<entities.Piloto> _return) {
        this._return = _return;
    }

}
