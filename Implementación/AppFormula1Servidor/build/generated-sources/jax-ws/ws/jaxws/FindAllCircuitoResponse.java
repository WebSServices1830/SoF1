
package ws.jaxws;

import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "findAllCircuitoResponse", namespace = "http://ws/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "findAllCircuitoResponse", namespace = "http://ws/")
public class FindAllCircuitoResponse {

    @XmlElement(name = "return", namespace = "")
    private List<entities.Circuito> _return;

    /**
     * 
     * @return
     *     returns List<Circuito>
     */
    public List<entities.Circuito> getReturn() {
        return this._return;
    }

    /**
     * 
     * @param _return
     *     the value for the _return property
     */
    public void setReturn(List<entities.Circuito> _return) {
        this._return = _return;
    }

}
