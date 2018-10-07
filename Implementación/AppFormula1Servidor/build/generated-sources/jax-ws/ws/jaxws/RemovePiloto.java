
package ws.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "removePiloto", namespace = "http://ws/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "removePiloto", namespace = "http://ws/")
public class RemovePiloto {

    @XmlElement(name = "piloto", namespace = "")
    private int piloto;

    /**
     * 
     * @return
     *     returns int
     */
    public int getPiloto() {
        return this.piloto;
    }

    /**
     * 
     * @param piloto
     *     the value for the piloto property
     */
    public void setPiloto(int piloto) {
        this.piloto = piloto;
    }

}
