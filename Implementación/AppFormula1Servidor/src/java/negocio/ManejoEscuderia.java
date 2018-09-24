/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negocio;

import entities.Escuderia;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author TAURET
 */
public class ManejoEscuderia {
    private List<Escuderia> escuderias;

    public ManejoEscuderia() {
        this.escuderias = new ArrayList<>();
    }
    
    public void create(Escuderia escuderias){
        this.escuderias.add(escuderias);
    }
    
    public List<Escuderia> findAll(){
        return this.escuderias;
    }
    
    public void remove(int id){
        int i = 0;
        for(Escuderia p : escuderias){
            if(p.getIdEscuderia() == id){
                this.escuderias.remove(i);
                break;
            }
            ++i;
        }
    }
    
    public void edit(Escuderia escuderia){
        int i = 0;
        for(Escuderia p : escuderias){
            if(p.getIdEscuderia() == escuderia.getIdEscuderia()){
                this.escuderias.set(i, escuderia);
                break;
            }
            ++i;
        }
    }
    
    public Escuderia findById(int id){
        for(Escuderia p : escuderias){
            if(p.getIdEscuderia() == id){
                return p;
            }
        }
        return null;
    }
}
