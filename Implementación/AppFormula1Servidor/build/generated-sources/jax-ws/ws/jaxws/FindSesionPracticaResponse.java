
package ws.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "findSesionPracticaResponse", namespace = "http://ws/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "findSesionPracticaResponse", namespace = "http://ws/")
public class FindSesionPracticaResponse {

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
