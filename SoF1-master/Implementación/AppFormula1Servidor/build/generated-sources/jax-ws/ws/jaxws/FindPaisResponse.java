
package ws.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "findPaisResponse", namespace = "http://ws/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "findPaisResponse", namespace = "http://ws/")
public class FindPaisResponse {

    @XmlElement(name = "return", namespace = "")
    private entities.Pais _return;

    /**
     * 
     * @return
     *     returns Pais
     */
    public entities.Pais getReturn() {
        return this._return;
    }

    /**
     * 
     * @param _return
     *     the value for the _return property
     */
    public void setReturn(entities.Pais _return) {
        this._return = _return;
    }

}
