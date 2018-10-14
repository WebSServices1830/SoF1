
package ws.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "cerrarSesion", namespace = "http://ws/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "cerrarSesion", namespace = "http://ws/")
public class CerrarSesion {

    @XmlElement(name = "usuario", namespace = "")
    private entities.Usuario usuario;

    /**
     * 
     * @return
     *     returns Usuario
     */
    public entities.Usuario getUsuario() {
        return this.usuario;
    }

    /**
     * 
     * @param usuario
     *     the value for the usuario property
     */
    public void setUsuario(entities.Usuario usuario) {
        this.usuario = usuario;
    }

}
