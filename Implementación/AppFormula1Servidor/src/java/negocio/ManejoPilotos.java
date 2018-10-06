/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negocio;

import Persistencia.Campeonato;
import Persistencia.JaxbWriterReader;
import entities.Piloto;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author TAURET
 */
public class ManejoPilotos {
    
    private List<Piloto> pilotos;
    private JaxbWriterReader jaxb;
    private Campeonato campeonato;

    public ManejoPilotos() {
        this.pilotos = new ArrayList<>();
        this.jaxb = new JaxbWriterReader();
	this.campeonato = (Campeonato) this.jaxb.jaxbReader(Campeonato.class, "C:\\Users\\Michael\\Documents\\WS\\Implementacion\\AppFormula1Servidor\\Data\\campeonato.xml");
        System.out.println(campeonato.getPiloto().size()+"+++++++++");
    }
    
    public void create(Piloto piloto){
        //this.pilotos.add(piloto);
        
        Persistencia.Piloto pil = new Persistencia.Piloto();
        pil.setNombre(piloto.getNombre());
        pil.setFechaNacimiento(null);
        pil.setLugarNacimiento(piloto.getLugar_nacimiento());
        pil.setPodios(piloto.getPodios());
        pil.setCampeonatos(piloto.getCampeonatos());
        pil.setNumero(piloto.getNumero());
        pil.setBiografia(piloto.getBiografia());
        pil.setFoto(piloto.getFoto());
        pil.setMultiplicador(piloto.getMultiplicador());
        pil.setIdPiloto(piloto.getIdPiloto());
        
        this.campeonato.getPiloto().add(pil);
        this.jaxb.jaxbWriter(this.campeonato, "C:\\Users\\Michael\\Documents\\WS\\Implementacion\\AppFormula1Servidor\\campeonato.xml");
    }
    
    public List<Piloto> findAll(){
        List<entities.Piloto> pts = new ArrayList<entities.Piloto>();
        
        for(Persistencia.Piloto p : this.campeonato.getPiloto()){
            
            entities.Piloto pil = new entities.Piloto(
                    p.getNombre(),null, p.getLugarNacimiento(), p.getPodios(), p.getCampeonatos(), p.getNumero(),
                    p.getBiografia(), p.getFoto(),p.getMultiplicador()  );
            pil.setIdPiloto(p.getIdPiloto());
            pts.add(pil);
            
        }
        
        //return pilotos;
        //return this.campeonato.getPiloto();
        
        return pts;
    }
    
    public void remove(int id){
        int i = 0;
        for(Persistencia.Piloto p : this.campeonato.getPiloto()){
            if(p.getIdPiloto() == id){
                this.campeonato.getPiloto().remove(i);
                break;
            }
            ++i;
        }
        
        this.jaxb.jaxbWriter(this.campeonato, "C:\\Users\\Michael\\Documents\\WS\\Implementacion\\AppFormula1Servidor\\campeonato.xml");
    }
    
    public void edit(Piloto piloto){
        
        
    
        Persistencia.Piloto pil = new Persistencia.Piloto();
        pil.setNombre(piloto.getNombre());
        pil.setFechaNacimiento(null);
        pil.setLugarNacimiento(piloto.getLugar_nacimiento());
        pil.setPodios(piloto.getPodios());
        pil.setCampeonatos(piloto.getCampeonatos());
        pil.setNumero(piloto.getNumero());
        pil.setBiografia(piloto.getBiografia());
        pil.setFoto(piloto.getFoto());
        pil.setMultiplicador(piloto.getMultiplicador());
        
        
        int i = 0;
        for(Persistencia.Piloto p : this.campeonato.getPiloto()){
            if(p.getIdPiloto() == piloto.getIdPiloto()){
                this.campeonato.getPiloto().set(i, pil);
                break;
            }
            ++i;
        }
        
            this.jaxb.jaxbWriter(this.campeonato, "C:\\Users\\Michael\\Documents\\WS\\Implementacion\\AppFormula1Servidor\\campeonato.xml");
    }
    
    public Piloto findById(int id){
        for(Persistencia.Piloto p : this.campeonato.getPiloto()){
            if(p.getIdPiloto() == id){
                
                Piloto pil = new Piloto(
                    p.getNombre(),null, p.getLugarNacimiento(), p.getPodios(), p.getCampeonatos(), p.getNumero(),
                    p.getBiografia(), p.getFoto(),p.getMultiplicador()  );
                pil.setIdPiloto(id);
                return pil;
            }
        }
        return null;
    }
    
    
}
