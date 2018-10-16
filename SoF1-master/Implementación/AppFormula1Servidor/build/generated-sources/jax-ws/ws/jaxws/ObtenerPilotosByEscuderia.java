
package ws.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "obtenerPilotosByEscuderia", namespace = "http://ws/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "obtenerPilotosByEscuderia", namespace = "http://ws/")
public class ObtenerPilotosByEscuderia {

    @XmlElement(name = "idEscuderia", namespace = "")
    private int idEscuderia;

    /**
     * 
     * @return
     *     returns int
     */
    public int getIdEscuderia() {
        return this.idEscuderia;
    }

    /**
     * 
     * @param idEscuderia
     *     the value for the idEscuderia property
     */
    public void setIdEscuderia(int idEscuderia) {
        this.idEscuderia = idEscuderia;
    }

}
