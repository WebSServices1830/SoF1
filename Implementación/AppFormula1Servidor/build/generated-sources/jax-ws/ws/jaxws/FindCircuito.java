
package ws.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "findCircuito", namespace = "http://ws/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "findCircuito", namespace = "http://ws/")
public class FindCircuito {

    @XmlElement(name = "idCircuito", namespace = "")
    private int idCircuito;

    /**
     * 
     * @return
     *     returns int
     */
    public int getIdCircuito() {
        return this.idCircuito;
    }

    /**
     * 
     * @param idCircuito
     *     the value for the idCircuito property
     */
    public void setIdCircuito(int idCircuito) {
        this.idCircuito = idCircuito;
    }

}
