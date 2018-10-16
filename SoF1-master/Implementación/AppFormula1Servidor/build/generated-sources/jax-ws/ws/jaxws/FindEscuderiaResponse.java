
package ws.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "findEscuderiaResponse", namespace = "http://ws/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "findEscuderiaResponse", namespace = "http://ws/")
public class FindEscuderiaResponse {

    @XmlElement(name = "return", namespace = "")
    private entities.Escuderia _return;

    /**
     * 
     * @return
     *     returns Escuderia
     */
    public entities.Escuderia getReturn() {
        return this._return;
    }

    /**
     * 
     * @param _return
     *     the value for the _return property
     */
    public void setReturn(entities.Escuderia _return) {
        this._return = _return;
    }

}
