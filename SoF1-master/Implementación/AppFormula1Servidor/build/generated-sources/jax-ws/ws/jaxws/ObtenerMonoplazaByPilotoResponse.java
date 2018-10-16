
package ws.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "obtenerMonoplazaByPilotoResponse", namespace = "http://ws/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "obtenerMonoplazaByPilotoResponse", namespace = "http://ws/")
public class ObtenerMonoplazaByPilotoResponse {

    @XmlElement(name = "return", namespace = "")
    private entities.Monoplaza _return;

    /**
     * 
     * @return
     *     returns Monoplaza
     */
    public entities.Monoplaza getReturn() {
        return this._return;
    }

    /**
     * 
     * @param _return
     *     the value for the _return property
     */
    public void setReturn(entities.Monoplaza _return) {
        this._return = _return;
    }

}
