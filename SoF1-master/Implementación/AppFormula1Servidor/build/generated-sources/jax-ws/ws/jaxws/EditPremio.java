
package ws.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "editPremio", namespace = "http://ws/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "editPremio", namespace = "http://ws/")
public class EditPremio {

    @XmlElement(name = "premio", namespace = "")
    private entities.Premio premio;

    /**
     * 
     * @return
     *     returns Premio
     */
    public entities.Premio getPremio() {
        return this.premio;
    }

    /**
     * 
     * @param premio
     *     the value for the premio property
     */
    public void setPremio(entities.Premio premio) {
        this.premio = premio;
    }

}
