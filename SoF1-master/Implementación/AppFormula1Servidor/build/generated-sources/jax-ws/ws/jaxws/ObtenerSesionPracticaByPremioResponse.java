
package ws.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "obtenerSesionPracticaByPremioResponse", namespace = "http://ws/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "obtenerSesionPracticaByPremioResponse", namespace = "http://ws/")
public class ObtenerSesionPracticaByPremioResponse {

    @XmlElement(name = "return", namespace = "")
    private entities.SesionPractica _return;

    /**
     * 
     * @return
     *     returns SesionPractica
     */
    public entities.SesionPractica getReturn() {
        return this._return;
    }

    /**
     * 
     * @param _return
     *     the value for the _return property
     */
    public void setReturn(entities.SesionPractica _return) {
        this._return = _return;
    }

}
