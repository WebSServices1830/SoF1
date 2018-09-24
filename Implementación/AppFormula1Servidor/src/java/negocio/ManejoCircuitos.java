/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negocio;

import entities.Circuito;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author TAURET
 */
public class ManejoCircuitos {
    private List<Circuito> circuitos;

    public ManejoCircuitos() {
        this.circuitos = new ArrayList<>();
    }
    
    public void create(Circuito escuderias){
        this.circuitos.add(escuderias);
    }
    
    public List<Circuito> findAll(){
        return this.circuitos;
    }
    
    public void remove(int id){
        int i = 0;
        for(Circuito p : circuitos){
            if(p.getIdCircuito() == id){
                this.circuitos.remove(i);
                break;
            }
            ++i;
        }
    }
    
    public void edit(Circuito escuderia){
        int i = 0;
        for(Circuito p : circuitos){
            if(p.getIdCircuito() == escuderia.getIdCircuito()){
                this.circuitos.set(i, escuderia);
                break;
            }
            ++i;
        }
    }
    
    public Circuito findById(int id){
        for(Circuito p : circuitos){
            if(p.getIdCircuito() == id){
                return p;
            }
        }
        return null;
    }
}
