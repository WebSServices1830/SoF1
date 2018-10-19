
package ws.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "iniciarSesion", namespace = "http://ws/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "iniciarSesion", namespace = "http://ws/", propOrder = {
    "usuario",
    "contrasena"
})
public class IniciarSesion {

    @XmlElement(name = "usuario", namespace = "")
    private String usuario;
    @XmlElement(name = "contrasena", namespace = "")
    private String contrasena;

    /**
     * 
     * @return
     *     returns String
     */
    public String getUsuario() {
        return this.usuario;
    }

    /**
     * 
     * @param usuario
     *     the value for the usuario property
     */
    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    /**
     * 
     * @return
     *     returns String
     */
    public String getContrasena() {
        return this.contrasena;
    }

    /**
     * 
     * @param contrasena
     *     the value for the contrasena property
     */
    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

}
