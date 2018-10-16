
package ws.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "findPremioResponse", namespace = "http://ws/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "findPremioResponse", namespace = "http://ws/")
public class FindPremioResponse {

    @XmlElement(name = "return", namespace = "")
    private entities.Premio _return;

    /**
     * 
     * @return
     *     returns Premio
     */
    public entities.Premio getReturn() {
        return this._return;
    }

    /**
     * 
     * @param _return
     *     the value for the _return property
     */
    public void setReturn(entities.Premio _return) {
        this._return = _return;
    }

}
