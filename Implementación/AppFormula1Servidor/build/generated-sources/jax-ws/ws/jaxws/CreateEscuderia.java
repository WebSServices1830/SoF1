
package ws.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "createEscuderia", namespace = "http://ws/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "createEscuderia", namespace = "http://ws/")
public class CreateEscuderia {

    @XmlElement(name = "escuderia", namespace = "")
    private entities.Escuderia escuderia;

    /**
     * 
     * @return
     *     returns Escuderia
     */
    public entities.Escuderia getEscuderia() {
        return this.escuderia;
    }

    /**
     * 
     * @param escuderia
     *     the value for the escuderia property
     */
    public void setEscuderia(entities.Escuderia escuderia) {
        this.escuderia = escuderia;
    }

}
