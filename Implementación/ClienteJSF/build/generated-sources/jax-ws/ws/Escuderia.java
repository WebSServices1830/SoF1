
package ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
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
 *         &lt;element name="monoplaza1" type="{http://ws/}monoplaza" minOccurs="0"/&gt;
 *         &lt;element name="monoplaza2" type="{http://ws/}monoplaza" minOccurs="0"/&gt;
 *         &lt;element name="nombre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="pais" type="{http://ws/}pais" minOccurs="0"/&gt;
 *         &lt;element name="piloto1" type="{http://ws/}piloto" minOccurs="0"/&gt;
 *         &lt;element name="piloto2" type="{http://ws/}piloto" minOccurs="0"/&gt;
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
    "monoplaza1",
    "monoplaza2",
    "nombre",
    "pais",
    "piloto1",
    "piloto2",
    "tecnicoLider"
})
public class Escuderia {

    protected Campeonato campeonato;
    protected String detalle;
    protected Integer idEscuderia;
    protected String imagen;
    protected String lider;
    protected Monoplaza monoplaza1;
    protected Monoplaza monoplaza2;
    protected String nombre;
    protected Pais pais;
    protected Piloto piloto1;
    protected Piloto piloto2;
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
     * Obtiene el valor de la propiedad monoplaza1.
     * 
     * @return
     *     possible object is
     *     {@link Monoplaza }
     *     
     */
    public Monoplaza getMonoplaza1() {
        return monoplaza1;
    }

    /**
     * Define el valor de la propiedad monoplaza1.
     * 
     * @param value
     *     allowed object is
     *     {@link Monoplaza }
     *     
     */
    public void setMonoplaza1(Monoplaza value) {
        this.monoplaza1 = value;
    }

    /**
     * Obtiene el valor de la propiedad monoplaza2.
     * 
     * @return
     *     possible object is
     *     {@link Monoplaza }
     *     
     */
    public Monoplaza getMonoplaza2() {
        return monoplaza2;
    }

    /**
     * Define el valor de la propiedad monoplaza2.
     * 
     * @param value
     *     allowed object is
     *     {@link Monoplaza }
     *     
     */
    public void setMonoplaza2(Monoplaza value) {
        this.monoplaza2 = value;
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
     * Obtiene el valor de la propiedad piloto1.
     * 
     * @return
     *     possible object is
     *     {@link Piloto }
     *     
     */
    public Piloto getPiloto1() {
        return piloto1;
    }

    /**
     * Define el valor de la propiedad piloto1.
     * 
     * @param value
     *     allowed object is
     *     {@link Piloto }
     *     
     */
    public void setPiloto1(Piloto value) {
        this.piloto1 = value;
    }

    /**
     * Obtiene el valor de la propiedad piloto2.
     * 
     * @return
     *     possible object is
     *     {@link Piloto }
     *     
     */
    public Piloto getPiloto2() {
        return piloto2;
    }

    /**
     * Define el valor de la propiedad piloto2.
     * 
     * @param value
     *     allowed object is
     *     {@link Piloto }
     *     
     */
    public void setPiloto2(Piloto value) {
        this.piloto2 = value;
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
