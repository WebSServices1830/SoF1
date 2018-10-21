
package ws.jaxws;

import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "obtenerResultadoCarreraBySesionCarreraResponse", namespace = "http://ws/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "obtenerResultadoCarreraBySesionCarreraResponse", namespace = "http://ws/")
public class ObtenerResultadoCarreraBySesionCarreraResponse {

    @XmlElement(name = "return", namespace = "")
    private List<entities.ResultadoCarrera> _return;

    /**
     * 
     * @return
     *     returns List<ResultadoCarrera>
     */
    public List<entities.ResultadoCarrera> getReturn() {
        return this._return;
    }

    /**
     * 
     * @param _return
     *     the value for the _return property
     */
    public void setReturn(List<entities.ResultadoCarrera> _return) {
        this._return = _return;
    }

}
