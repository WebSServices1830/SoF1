
package ws.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "createPiloto", namespace = "http://ws/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "createPiloto", namespace = "http://ws/")
public class CreatePiloto {

    @XmlElement(name = "piloto", namespace = "")
    private entities.Piloto piloto;

    /**
     * 
     * @return
     *     returns Piloto
     */
    public entities.Piloto getPiloto() {
        return this.piloto;
    }

    /**
     * 
     * @param piloto
     *     the value for the piloto property
     */
    public void setPiloto(entities.Piloto piloto) {
        this.piloto = piloto;
    }

}
