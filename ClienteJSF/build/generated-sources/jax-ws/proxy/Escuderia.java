
package proxy;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para escuderia complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="escuderia"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="campeonato" type="{http://ws/}campeonato" minOccurs="0"/&gt;
 *         &lt;element name="detalle" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="idEscuderia" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="imagen" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="lider" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="monoplazas" type="{http://ws/}monoplaza" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="nombre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="pais" type="{http://ws/}pais" minOccurs="0"/&gt;
 *         &lt;element name="pilotos" type="{http://ws/}piloto" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="tecnicoLider" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "escuderia", propOrder = {
    "campeonato",
    "detalle",
    "idEscuderia",
    "imagen",
    "lider",
    "monoplazas",
    "nombre",
    "pais",
    "pilotos",
    "tecnicoLider"
})
public class Escuderia {

    protected Campeonato campeonato;
    protected String detalle;
    protected Integer idEscuderia;
    protected String imagen;
    protected String lider;
    @XmlElement(nillable = true)
    protected List<Monoplaza> monoplazas;
    protected String nombre;
    protected Pais pais;
    @XmlElement(nillable = true)
    protected List<Piloto> pilotos;
    protected String tecnicoLider;

    /**
     * Obtiene el valor de la propiedad campeonato.
     * 
     * @return
     *     possible object is
     *     {@link Campeonato }
     *     
     */
    public Campeonato getCampeonato() {
        return campeonato;
    }

    /**
     * Define el valor de la propiedad campeonato.
     * 
     * @param value
     *     allowed object is
     *     {@link Campeonato }
     *     
     */
    public void setCampeonato(Campeonato value) {
        this.campeonato = value;
    }

    /**
     * Obtiene el valor de la propiedad detalle.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDetalle() {
        return detalle;
    }

    /**
     * Define el valor de la propiedad detalle.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDetalle(String value) {
        this.detalle = value;
    }

    /**
     * Obtiene el valor de la propiedad idEscuderia.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIdEscuderia() {
        return idEscuderia;
    }

    /**
     * Define el valor de la propiedad idEscuderia.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIdEscuderia(Integer value) {
        this.idEscuderia = value;
    }

    /**
     * Obtiene el valor de la propiedad imagen.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImagen() {
        return imagen;
    }

    /**
     * Define el valor de la propiedad imagen.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImagen(String value) {
        this.imagen = value;
    }

    /**
     * Obtiene el valor de la propiedad lider.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLider() {
        return lider;
    }

    /**
     * Define el valor de la propiedad lider.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLider(String value) {
        this.lider = value;
    }

    /**
     * Gets the value of the monoplazas property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the monoplazas property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMonoplazas().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Monoplaza }
     * 
     * 
     */
    public List<Monoplaza> getMonoplazas() {
        if (monoplazas == null) {
            monoplazas = new ArrayList<Monoplaza>();
        }
        return this.monoplazas;
    }

    /**
     * Obtiene el valor de la propiedad nombre.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Define el valor de la propiedad nombre.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombre(String value) {
        this.nombre = value;
    }

    /**
     * Obtiene el valor de la propiedad pais.
     * 
     * @return
     *     possible object is
     *     {@link Pais }
     *     
     */
    public Pais getPais() {
        return pais;
    }

    /**
     * Define el valor de la propiedad pais.
     * 
     * @param value
     *     allowed object is
     *     {@link Pais }
     *     
     */
    public void setPais(Pais value) {
        this.pais = value;
    }

    /**
     * Gets the value of the pilotos property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pilotos property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPilotos().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Piloto }
     * 
     * 
     */
    public List<Piloto> getPilotos() {
        if (pilotos == null) {
            pilotos = new ArrayList<Piloto>();
        }
        return this.pilotos;
    }

    /**
     * Obtiene el valor de la propiedad tecnicoLider.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTecnicoLider() {
        return tecnicoLider;
    }

    /**
     * Define el valor de la propiedad tecnicoLider.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTecnicoLider(String value) {
        this.tecnicoLider = value;
    }

}
