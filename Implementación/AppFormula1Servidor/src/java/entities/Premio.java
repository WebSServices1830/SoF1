/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.util.Date;
import java.util.List;

/**
 *
 * @author TAURET
 */
public class Premio {
    private int idPremio;
    private String nombre;
    private Date fecha_inicio;
    private Date fecha_fin;
    private List<Circuito> circuitos;

    public Premio() {
    }

    public Premio(String nombre, Date fecha_inicio, Date fecha_fin, List<Circuito> circuitos) {
        this.nombre = nombre;
        this.fecha_inicio = fecha_inicio;
        this.fecha_fin = fecha_fin;
        this.circuitos = circuitos;
    }

    public List<Circuito> getCircuito() {
        return circuitos;
    }

    public void setCircuito(List<Circuito> circuito) {
        this.circuitos = circuito;
    }
    
    

    public int getIdPremio() {
        return idPremio;
    }

    public void setIdPremio(int idPremio) {
        this.idPremio = idPremio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getFecha_inicio() {
        return fecha_inicio;
    }

    public void setFecha_inicio(Date fecha_inicio) {
        this.fecha_inicio = fecha_inicio;
    }

    public Date getFecha_fin() {
        return fecha_fin;
    }

    public void setFecha_fin(Date fecha_fin) {
        this.fecha_fin = fecha_fin;
    }
    
    
}
