
package ws.jaxws;

import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "obtenerApuestasByUsuarioResponse", namespace = "http://ws/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "obtenerApuestasByUsuarioResponse", namespace = "http://ws/")
public class ObtenerApuestasByUsuarioResponse {

    @XmlElement(name = "return", namespace = "")
    private List<entities.Apuesta> _return;

    /**
     * 
     * @return
     *     returns List<Apuesta>
     */
    public List<entities.Apuesta> getReturn() {
        return this._return;
    }

    /**
     * 
     * @param _return
     *     the value for the _return property
     */
    public void setReturn(List<entities.Apuesta> _return) {
        this._return = _return;
    }

}
