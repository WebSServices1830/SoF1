/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Michael
 */
@Entity
@Table(name = "PILOTO")
@NamedQueries({
    @NamedQuery(name = "Piloto.findAll", query = "SELECT p FROM Piloto p")})
public class Piloto implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "IDPILOTO")
    private Integer idpiloto;
    @Column(name = "BIOGRAFIA")
    private String biografia;
    @Column(name = "CAMPEONATOS")
    private Integer campeonatos;
    @Column(name = "EXPERIENCIA")
    private String experiencia;
    @Column(name = "FECHANACIMIENTO")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechanacimiento;
    @Column(name = "IMAGEN")
    private String imagen;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "MULTIPLICADOR")
    private Double multiplicador;
    @Column(name = "NOMBRE")
    private String nombre;
    @Column(name = "NUMERO")
    private Integer numero;
    @Column(name = "PAISNACIMIENTO")
    private String paisnacimiento;
    @Column(name = "PODIOS")
    private Integer podios;
    @Column(name = "CAMPEONATOP")
    private String campeonatop;
    @Column(name = "ESCUDERIAP")
    private String escuderiap;
    @Column(name = "MONOPLAZA_IDMONOPLAZA")
    private Integer monoplazaIdmonoplaza;
    @Column(name = "PAISP")
    private String paisp;
    @OneToMany(mappedBy = "pilotoIdpiloto")
    private List<Resultadopractica> resultadopracticaList;
    @OneToMany(mappedBy = "pilotoIdpiloto")
    private List<Apuesta> apuestaList;

    public Piloto() {
    }

    public Piloto(Integer idpiloto) {
        this.idpiloto = idpiloto;
    }

    public Integer getIdpiloto() {
        return idpiloto;
    }

    public void setIdpiloto(Integer idpiloto) {
        this.idpiloto = idpiloto;
    }

    public String getBiografia() {
        return biografia;
    }

    public void setBiografia(String biografia) {
        this.biografia = biografia;
    }

    public Integer getCampeonatos() {
        return campeonatos;
    }

    public void setCampeonatos(Integer campeonatos) {
        this.campeonatos = campeonatos;
    }

    public String getExperiencia() {
        return experiencia;
    }

    public void setExperiencia(String experiencia) {
        this.experiencia = experiencia;
    }

    public Date getFechanacimiento() {
        return fechanacimiento;
    }

    public void setFechanacimiento(Date fechanacimiento) {
        this.fechanacimiento = fechanacimiento;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public Double getMultiplicador() {
        return multiplicador;
    }

    public void setMultiplicador(Double multiplicador) {
        this.multiplicador = multiplicador;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public String getPaisnacimiento() {
        return paisnacimiento;
    }

    public void setPaisnacimiento(String paisnacimiento) {
        this.paisnacimiento = paisnacimiento;
    }

    public Integer getPodios() {
        return podios;
    }

    public void setPodios(Integer podios) {
        this.podios = podios;
    }

    public String getCampeonatop() {
        return campeonatop;
    }

    public void setCampeonatop(String campeonatop) {
        this.campeonatop = campeonatop;
    }

    public String getEscuderiap() {
        return escuderiap;
    }

    public void setEscuderiap(String escuderiap) {
        this.escuderiap = escuderiap;
    }

    public Integer getMonoplazaIdmonoplaza() {
        return monoplazaIdmonoplaza;
    }

    public void setMonoplazaIdmonoplaza(Integer monoplazaIdmonoplaza) {
        this.monoplazaIdmonoplaza = monoplazaIdmonoplaza;
    }

    public String getPaisp() {
        return paisp;
    }

    public void setPaisp(String paisp) {
        this.paisp = paisp;
    }

    public List<Resultadopractica> getResultadopracticaList() {
        return resultadopracticaList;
    }

    public void setResultadopracticaList(List<Resultadopractica> resultadopracticaList) {
        this.resultadopracticaList = resultadopracticaList;
    }

    public List<Apuesta> getApuestaList() {
        return apuestaList;
    }

    public void setApuestaList(List<Apuesta> apuestaList) {
        this.apuestaList = apuestaList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idpiloto != null ? idpiloto.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Piloto)) {
            return false;
        }
        Piloto other = (Piloto) object;
        if ((this.idpiloto == null && other.idpiloto != null) || (this.idpiloto != null && !this.idpiloto.equals(other.idpiloto))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Piloto[ idpiloto=" + idpiloto + " ]";
    }
    
}
