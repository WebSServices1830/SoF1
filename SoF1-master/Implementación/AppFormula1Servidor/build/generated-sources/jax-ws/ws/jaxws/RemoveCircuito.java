
package ws.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "removeCircuito", namespace = "http://ws/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "removeCircuito", namespace = "http://ws/")
public class RemoveCircuito {

    @XmlElement(name = "escuderia", namespace = "")
    private int escuderia;

    /**
     * 
     * @return
     *     returns int
     */
    public int getEscuderia() {
        return this.escuderia;
    }

    /**
     * 
     * @param escuderia
     *     the value for the escuderia property
     */
    public void setEscuderia(int escuderia) {
        this.escuderia = escuderia;
    }

}
