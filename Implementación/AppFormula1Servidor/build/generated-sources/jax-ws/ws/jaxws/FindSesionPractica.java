
package ws.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "findSesionPractica", namespace = "http://ws/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "findSesionPractica", namespace = "http://ws/")
public class FindSesionPractica {

    @XmlElement(name = "idSesionPractica", namespace = "")
    private int idSesionPractica;

    /**
     * 
     * @return
     *     returns int
     */
    public int getIdSesionPractica() {
        return this.idSesionPractica;
    }

    /**
     * 
     * @param idSesionPractica
     *     the value for the idSesionPractica property
     */
    public void setIdSesionPractica(int idSesionPractica) {
        this.idSesionPractica = idSesionPractica;
    }

}
