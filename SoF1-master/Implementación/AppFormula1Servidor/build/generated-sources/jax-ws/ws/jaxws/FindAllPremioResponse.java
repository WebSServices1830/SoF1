
package ws.jaxws;

import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "findAllPremioResponse", namespace = "http://ws/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "findAllPremioResponse", namespace = "http://ws/")
public class FindAllPremioResponse {

    @XmlElement(name = "return", namespace = "")
    private List<entities.Premio> _return;

    /**
     * 
     * @return
     *     returns List<Premio>
     */
    public List<entities.Premio> getReturn() {
        return this._return;
    }

    /**
     * 
     * @param _return
     *     the value for the _return property
     */
    public void setReturn(List<entities.Premio> _return) {
        this._return = _return;
    }

}
