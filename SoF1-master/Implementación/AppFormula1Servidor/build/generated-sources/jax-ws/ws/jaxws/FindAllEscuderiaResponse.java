
package ws.jaxws;

import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "findAllEscuderiaResponse", namespace = "http://ws/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "findAllEscuderiaResponse", namespace = "http://ws/")
public class FindAllEscuderiaResponse {

    @XmlElement(name = "return", namespace = "")
    private List<entities.Escuderia> _return;

    /**
     * 
     * @return
     *     returns List<Escuderia>
     */
    public List<entities.Escuderia> getReturn() {
        return this._return;
    }

    /**
     * 
     * @param _return
     *     the value for the _return property
     */
    public void setReturn(List<entities.Escuderia> _return) {
        this._return = _return;
    }

}
