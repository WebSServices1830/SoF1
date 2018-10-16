
package ws.jaxws;

import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "obtenerMonoplazasByEscuderiaResponse", namespace = "http://ws/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "obtenerMonoplazasByEscuderiaResponse", namespace = "http://ws/")
public class ObtenerMonoplazasByEscuderiaResponse {

    @XmlElement(name = "return", namespace = "")
    private List<entities.Monoplaza> _return;

    /**
     * 
     * @return
     *     returns List<Monoplaza>
     */
    public List<entities.Monoplaza> getReturn() {
        return this._return;
    }

    /**
     * 
     * @param _return
     *     the value for the _return property
     */
    public void setReturn(List<entities.Monoplaza> _return) {
        this._return = _return;
    }

}
