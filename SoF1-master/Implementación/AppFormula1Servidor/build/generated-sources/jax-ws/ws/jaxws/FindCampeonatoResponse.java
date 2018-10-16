
package ws.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "findCampeonatoResponse", namespace = "http://ws/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "findCampeonatoResponse", namespace = "http://ws/")
public class FindCampeonatoResponse {

    @XmlElement(name = "return", namespace = "")
    private entities.Campeonato _return;

    /**
     * 
     * @return
     *     returns Campeonato
     */
    public entities.Campeonato getReturn() {
        return this._return;
    }

    /**
     * 
     * @param _return
     *     the value for the _return property
     */
    public void setReturn(entities.Campeonato _return) {
        this._return = _return;
    }

}
