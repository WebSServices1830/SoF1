
package ws.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "editCircuito", namespace = "http://ws/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "editCircuito", namespace = "http://ws/")
public class EditCircuito {

    @XmlElement(name = "circuito", namespace = "")
    private entities.Circuito circuito;

    /**
     * 
     * @return
     *     returns Circuito
     */
    public entities.Circuito getCircuito() {
        return this.circuito;
    }

    /**
     * 
     * @param circuito
     *     the value for the circuito property
     */
    public void setCircuito(entities.Circuito circuito) {
        this.circuito = circuito;
    }

}
