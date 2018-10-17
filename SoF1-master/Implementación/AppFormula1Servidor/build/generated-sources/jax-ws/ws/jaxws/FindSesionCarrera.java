
package ws.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "findSesionCarrera", namespace = "http://ws/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "findSesionCarrera", namespace = "http://ws/")
public class FindSesionCarrera {

    @XmlElement(name = "idSesionCarrera", namespace = "")
    private int idSesionCarrera;

    /**
     * 
     * @return
     *     returns int
     */
    public int getIdSesionCarrera() {
        return this.idSesionCarrera;
    }

    /**
     * 
     * @param idSesionCarrera
     *     the value for the idSesionCarrera property
     */
    public void setIdSesionCarrera(int idSesionCarrera) {
        this.idSesionCarrera = idSesionCarrera;
    }

}
