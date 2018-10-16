
package ws.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "obtenerApuestasByUsuario", namespace = "http://ws/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "obtenerApuestasByUsuario", namespace = "http://ws/")
public class ObtenerApuestasByUsuario {

    @XmlElement(name = "idUsuario", namespace = "")
    private int idUsuario;

    /**
     * 
     * @return
     *     returns int
     */
    public int getIdUsuario() {
        return this.idUsuario;
    }

    /**
     * 
     * @param idUsuario
     *     the value for the idUsuario property
     */
    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

}
