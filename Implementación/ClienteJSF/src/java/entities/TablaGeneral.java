/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 *
 * @author andre
 */
@Entity
@Table(name = "TablaGeneral")
public class TablaGeneral implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="tablageneral_id", nullable = false, unique = true)
    private Integer idTablaGeneral;
    
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="campeonato_id")
    private Campeonato campeonato;
    
    @Column
    private Integer posicion;
    
    @JoinColumn(name="piloto_id")
    @OneToOne
    private Piloto piloto;
    
    @Column
    private Integer vueltas;
    
    @Column
    private Double tiempo;
    
    @Column
    private Integer puntos;

    public Integer getIdTablaGeneral() {
        return idTablaGeneral;
    }

    public void setIdTablaGeneral(Integer idTablaGeneral) {
        this.idTablaGeneral = idTablaGeneral;
    }


    public Integer getPosicion() {
        return posicion;
    }

    public void setPosicion(Integer posicion) {
        this.posicion = posicion;
    }
    //
    public Piloto getPiloto() {
        return piloto;
    }

    public void setPiloto(Piloto piloto) {
        this.piloto = piloto;
    }

    public Integer getVueltas() {
        return vueltas;
    }

    public void setVueltas(Integer vueltas) {
        this.vueltas = vueltas;
    }

    public Double getTiempo() {
        return tiempo;
    }

    public void setTiempo(Double tiempo) {
        this.tiempo = tiempo;
    }

    public Integer getPuntos() {
        return puntos;
    }

    public void setPuntos(Integer puntos) {
        this.puntos = puntos;
    }
    //
    public Campeonato getCampeonato() {
        return campeonato;
    }

    public void setCampeonato(Campeonato campeonato) {
        this.campeonato = campeonato;
    }

    
}
