
package ws.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "findSesionCarreraResponse", namespace = "http://ws/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "findSesionCarreraResponse", namespace = "http://ws/")
public class FindSesionCarreraResponse {

    @XmlElement(name = "return", namespace = "")
    private entities.SesionCarrera _return;

    /**
     * 
     * @return
     *     returns SesionCarrera
     */
    public entities.SesionCarrera getReturn() {
        return this._return;
    }

    /**
     * 
     * @param _return
     *     the value for the _return property
     */
    public void setReturn(entities.SesionCarrera _return) {
        this._return = _return;
    }

}
