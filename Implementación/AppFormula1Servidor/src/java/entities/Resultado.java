/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.util.Calendar;

/**
 *
 * @author nikme
 */
class Resultado {
    private Piloto piloto;
    private Calendar fecha;
    private Double tiempoVuelta; 

    public Resultado(Piloto piloto, Calendar fecha, Double tiempoVuelta) {
        this.piloto = piloto;
        this.fecha = fecha;
        this.tiempoVuelta = tiempoVuelta;
    }

    public Resultado() {
    }

    public Piloto getPiloto() {
        return piloto;
    }

    public void setPiloto(Piloto piloto) {
        this.piloto = piloto;
    }

    public Calendar getFecha() {
        return fecha;
    }

    public void setFecha(Calendar fecha) {
        this.fecha = fecha;
    }

    public Double getTiempoVuelta() {
        return tiempoVuelta;
    }

    public void setTiempoVuelta(Double tiempoVuelta) {
        this.tiempoVuelta = tiempoVuelta;
    }
    
}
