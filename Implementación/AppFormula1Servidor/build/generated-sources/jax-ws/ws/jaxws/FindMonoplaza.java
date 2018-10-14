
package ws.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "findMonoplaza", namespace = "http://ws/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "findMonoplaza", namespace = "http://ws/")
public class FindMonoplaza {

    @XmlElement(name = "idMonoplaza", namespace = "")
    private int idMonoplaza;

    /**
     * 
     * @return
     *     returns int
     */
    public int getIdMonoplaza() {
        return this.idMonoplaza;
    }

    /**
     * 
     * @param idMonoplaza
     *     the value for the idMonoplaza property
     */
    public void setIdMonoplaza(int idMonoplaza) {
        this.idMonoplaza = idMonoplaza;
    }

}
