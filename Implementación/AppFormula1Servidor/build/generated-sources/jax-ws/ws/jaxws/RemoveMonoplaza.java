
package ws.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "removeMonoplaza", namespace = "http://ws/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "removeMonoplaza", namespace = "http://ws/")
public class RemoveMonoplaza {

    @XmlElement(name = "monoplaza", namespace = "")
    private int monoplaza;

    /**
     * 
     * @return
     *     returns int
     */
    public int getMonoplaza() {
        return this.monoplaza;
    }

    /**
     * 
     * @param monoplaza
     *     the value for the monoplaza property
     */
    public void setMonoplaza(int monoplaza) {
        this.monoplaza = monoplaza;
    }

}
