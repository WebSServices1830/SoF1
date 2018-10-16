
package ws.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "removeCampeonato", namespace = "http://ws/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "removeCampeonato", namespace = "http://ws/")
public class RemoveCampeonato {

    @XmlElement(name = "campeonato", namespace = "")
    private int campeonato;

    /**
     * 
     * @return
     *     returns int
     */
    public int getCampeonato() {
        return this.campeonato;
    }

    /**
     * 
     * @param campeonato
     *     the value for the campeonato property
     */
    public void setCampeonato(int campeonato) {
        this.campeonato = campeonato;
    }

}
