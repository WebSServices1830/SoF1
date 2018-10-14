
package ws.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "createMonoplaza", namespace = "http://ws/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "createMonoplaza", namespace = "http://ws/")
public class CreateMonoplaza {

    @XmlElement(name = "monoplaza", namespace = "")
    private entities.Monoplaza monoplaza;

    /**
     * 
     * @return
     *     returns Monoplaza
     */
    public entities.Monoplaza getMonoplaza() {
        return this.monoplaza;
    }

    /**
     * 
     * @param monoplaza
     *     the value for the monoplaza property
     */
    public void setMonoplaza(entities.Monoplaza monoplaza) {
        this.monoplaza = monoplaza;
    }

}
