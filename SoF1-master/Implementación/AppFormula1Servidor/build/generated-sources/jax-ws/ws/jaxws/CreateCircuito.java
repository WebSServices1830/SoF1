
package ws.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "createCircuito", namespace = "http://ws/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "createCircuito", namespace = "http://ws/")
public class CreateCircuito {

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
