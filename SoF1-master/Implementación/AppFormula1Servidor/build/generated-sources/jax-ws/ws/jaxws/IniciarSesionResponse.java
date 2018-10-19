
package ws.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "iniciarSesionResponse", namespace = "http://ws/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "iniciarSesionResponse", namespace = "http://ws/")
public class IniciarSesionResponse {

    @XmlElement(name = "return", namespace = "")
    private entities.Usuario _return;

    /**
     * 
     * @return
     *     returns Usuario
     */
    public entities.Usuario getReturn() {
        return this._return;
    }

    /**
     * 
     * @param _return
     *     the value for the _return property
     */
    public void setReturn(entities.Usuario _return) {
        this._return = _return;
    }

}
