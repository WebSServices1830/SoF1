
package ws.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "obtenerPremiosByCampeonato", namespace = "http://ws/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "obtenerPremiosByCampeonato", namespace = "http://ws/")
public class ObtenerPremiosByCampeonato {

    @XmlElement(name = "idCampeonato", namespace = "")
    private int idCampeonato;

    /**
     * 
     * @return
     *     returns int
     */
    public int getIdCampeonato() {
        return this.idCampeonato;
    }

    /**
     * 
     * @param idCampeonato
     *     the value for the idCampeonato property
     */
    public void setIdCampeonato(int idCampeonato) {
        this.idCampeonato = idCampeonato;
    }

}
