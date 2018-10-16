
package ws.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "obtenerSesionCarreraByPremio", namespace = "http://ws/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "obtenerSesionCarreraByPremio", namespace = "http://ws/")
public class ObtenerSesionCarreraByPremio {

    @XmlElement(name = "idPremio", namespace = "")
    private int idPremio;

    /**
     * 
     * @return
     *     returns int
     */
    public int getIdPremio() {
        return this.idPremio;
    }

    /**
     * 
     * @param idPremio
     *     the value for the idPremio property
     */
    public void setIdPremio(int idPremio) {
        this.idPremio = idPremio;
    }

}
