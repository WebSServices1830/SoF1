
package ws.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "editCampeonato", namespace = "http://ws/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "editCampeonato", namespace = "http://ws/")
public class EditCampeonato {

    @XmlElement(name = "campeonato", namespace = "")
    private entities.Campeonato campeonato;

    /**
     * 
     * @return
     *     returns Campeonato
     */
    public entities.Campeonato getCampeonato() {
        return this.campeonato;
    }

    /**
     * 
     * @param campeonato
     *     the value for the campeonato property
     */
    public void setCampeonato(entities.Campeonato campeonato) {
        this.campeonato = campeonato;
    }

}
