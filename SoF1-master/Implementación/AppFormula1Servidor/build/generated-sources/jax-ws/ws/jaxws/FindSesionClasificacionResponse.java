
package ws.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "findSesionClasificacionResponse", namespace = "http://ws/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "findSesionClasificacionResponse", namespace = "http://ws/")
public class FindSesionClasificacionResponse {

    @XmlElement(name = "return", namespace = "")
    private entities.SesionClasificacion _return;

    /**
     * 
     * @return
     *     returns SesionClasificacion
     */
    public entities.SesionClasificacion getReturn() {
        return this._return;
    }

    /**
     * 
     * @param _return
     *     the value for the _return property
     */
    public void setReturn(entities.SesionClasificacion _return) {
        this._return = _return;
    }

}
