
package ws.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "findCircuitoResponse", namespace = "http://ws/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "findCircuitoResponse", namespace = "http://ws/")
public class FindCircuitoResponse {

    @XmlElement(name = "return", namespace = "")
    private entities.Circuito _return;

    /**
     * 
     * @return
     *     returns Circuito
     */
    public entities.Circuito getReturn() {
        return this._return;
    }

    /**
     * 
     * @param _return
     *     the value for the _return property
     */
    public void setReturn(entities.Circuito _return) {
        this._return = _return;
    }

}
