/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negocio;

import entities.Campeonato;
import entities.Piloto;
import entities.Premio;
import entities.ResultadoCarrera;
import entities.ResultadoClasificacion;
import entities.ResultadoPractica;
import entities.SesionCarrera;
import entities.SesionClasificacion;
import entities.SesionPractica;
import entities.TablaGeneral;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.concurrent.ThreadLocalRandom;
import javax.annotation.PreDestroy;
import javax.enterprise.context.SessionScoped;

/**
 *
 * @author andre
 */
@Stateless
public class SimularFacade {
    
    @PersistenceContext(unitName = "AppFormula1ServidorPU")
    private EntityManager em;
    
    protected EntityManager getEntityManager() {
        return em;
    }
      
    public void simularTorneo(int idCampeonato){
        List<Premio> premios = getEntityManager().createQuery("select p "+"from Premio p "+"where p.campeonato.idCampeonato = :idCampeonato", Premio.class).setParameter("idCampeonato", idCampeonato).getResultList();
        List<Piloto> pilotos = getEntityManager().createQuery("select p "+"from Piloto p "+"where p.campeonato.idCampeonato = :idCampeonato "+"order by p.multiplicador desc", Piloto.class).setParameter("idCampeonato", idCampeonato).getResultList();
        initTablaGeneral(idCampeonato,pilotos);
        for(Premio p: premios){
            simularPremio(p, pilotos, idCampeonato);
        }
    }
    
    private void simularPremio(Premio premio, List<Piloto> pilotos, int idCampeonato){
        Calendar today = Calendar.getInstance();
        today.set(Calendar.HOUR_OF_DAY, 0);
                
        //getEntityManager().getTransaction().begin();
        SesionPractica sp = new SesionPractica();
        sp.setFecha(today.getTime());
        sp.setNombre("Sesion practica ");
        sp.setPremio(premio);
        getEntityManager().persist(sp);
        //getEntityManager().getTransaction().commit();
        
        //getEntityManager().getTransaction().begin();
        SesionClasificacion scl = new SesionClasificacion();
        scl.setFecha(today.getTime());
        scl.setNombre("Sesion clasificacion ");
        scl.setPremio(premio);
        getEntityManager().persist(scl);
        //getEntityManager().getTransaction().commit();
        
        //getEntityManager().getTransaction().begin();
        SesionCarrera sc = new SesionCarrera();
        sc.setFecha(today.getTime());
        sc.setNombre("Sesion carrera ");
        sc.setPremio(premio);
        getEntityManager().persist(sc);
        //getEntityManager().getTransaction().commit();
        //Premio premioActual = getEntityManager().find(Premio.class, idPremio);

        //getEntityManager().getTransaction().commit();
          simularSesionPractica(sp, pilotos);
          simularSesionClasificacion(scl, pilotos);
          simularSesionCarrera(sc, pilotos,idCampeonato);
        
        
        //Falta Definir resultado apuestas
    }
    
    private void simularSesionPractica(SesionPractica sesion, List<Piloto> pilotos){
        List<Integer> puestosDispobibles = obtenerPuestosDisponibles(pilotos.size());
        for(int i=0; i<pilotos.size();++i){
            List<Integer> vectorProbabilidad = vectorProbabilidad(puestosDispobibles.size());
            int index =obtenerPuesto(vectorProbabilidad);
            int puesto = puestosDispobibles.get(index);
            puestosDispobibles.remove(index);
            double record = 1.0+ThreadLocalRandom.current().nextInt(60, 120);
            //getEntityManager().getTransaction().begin();
            ResultadoPractica rp = new ResultadoPractica();
            rp.setPiloto(pilotos.get(i));
            rp.setPosicion(puesto);
            rp.setRecordVuelta(record);
            rp.setSesionPractica(sesion);
            rp.setTiempo(4000.0+puesto);
            rp.setVueltas(50+puesto);
            getEntityManager().persist(rp);
            //getEntityManager().getTransaction().commit();
        }
    }
    private void simularSesionClasificacion(SesionClasificacion sesion, List<Piloto> pilotos){
        List<Integer> puestosDispobibles = obtenerPuestosDisponibles(pilotos.size());
        for(int i=0; i<pilotos.size();++i){
            List<Integer> vectorProbabilidad = vectorProbabilidad(puestosDispobibles.size());
            int index =obtenerPuesto(vectorProbabilidad);
            int puesto = puestosDispobibles.get(index);
            puestosDispobibles.remove(index);
            double record = 1.0+ThreadLocalRandom.current().nextInt(60, 120);
            
            //getEntityManager().getTransaction().begin();
            ResultadoClasificacion rp = new ResultadoClasificacion();
            rp.setPiloto(pilotos.get(i));
            rp.setPosicion(puesto);
            rp.setRecordVuelta(record);
            rp.setSesionClasificacion(sesion);
            rp.setQ1(1.0+ThreadLocalRandom.current().nextInt(100, 200));
            rp.setQ2(1.0+ThreadLocalRandom.current().nextInt(100, 200));
            rp.setQ3(1.0+ThreadLocalRandom.current().nextInt(100, 200));
            rp.setVueltas(50+puesto);
            getEntityManager().persist(rp);
            //getEntityManager().getTransaction().commit();
        }
    }
    private void simularSesionCarrera(SesionCarrera sesion, List<Piloto> pilotos, int idCampeonato){
        List<Integer> puestosDispobibles = obtenerPuestosDisponibles(pilotos.size());
        for(int i=0; i<pilotos.size();++i){
            List<Integer> vectorProbabilidad = vectorProbabilidad(puestosDispobibles.size());
            int index =obtenerPuesto(vectorProbabilidad);
            int puesto = puestosDispobibles.get(index);
            puestosDispobibles.remove(index);
            
            //getEntityManager().getTransaction().begin();
            ResultadoCarrera rp = new ResultadoCarrera();
            rp.setPiloto(pilotos.get(i));
            rp.setPosicion(puesto);
            rp.setRecordVuelta(1.0+ThreadLocalRandom.current().nextInt(60, 120));
            rp.setSesionCarrera(sesion);
            rp.setPuntos(1.0+(pilotos.size()-puesto));
            rp.setTiempo(4000.0+puesto);
            rp.setVueltas(50+puesto);
            getEntityManager().persist(rp);
            //getEntityManager().getTransaction().commit();
            
            //getEntityManager().getTransaction().begin();
            //getEntityManager().flush();
            TablaGeneral tg = getEntityManager().createQuery("select tg "+"from TablaGeneral tg "+"where tg.piloto.idPiloto = :idPiloto", TablaGeneral.class).setParameter("idPiloto", pilotos.get(i).getIdPiloto()).getSingleResult();

            tg.setPuntos(tg.getPuntos()+rp.getPuntos().intValue());
            tg.setTiempo(tg.getTiempo()+rp.getTiempo());
            tg.setVueltas(tg.getVueltas()+rp.getVueltas());
            //getEntityManager().getTransaction().commit();
            
        }
    }
    
    private List<Integer> vectorProbabilidad(int total){
        List<Integer> respuesta = new ArrayList<>();
        int temp = total;
        for(int i=0; i<total;++i){
            for(int j=0; j<temp;++j){
                respuesta.add(i);
            }
            --temp;
        }
        return respuesta;
    }
    
    private int obtenerPuesto(List<Integer> vectorProbabilidad){
        int randomNum = ThreadLocalRandom.current().nextInt(0, vectorProbabilidad.size());
        return vectorProbabilidad.get(randomNum);
    }
    
    private List<Integer> obtenerPuestosDisponibles(int totalPuestos){
        List<Integer> respuesta = new ArrayList<>();
        for(int i=0;i<totalPuestos;++i){
            respuesta.add(i+1);
        }
        return respuesta;
    }
    
    private void initTablaGeneral(int idCampeonato,List<Piloto> pilotos){
        Campeonato camp= getEntityManager().find(Campeonato.class, idCampeonato);
        for(Piloto p:pilotos){
            //getEntityManager().getTransaction().begin();
            TablaGeneral tg = new TablaGeneral();
            tg.setCampeonato(camp);
            tg.setPiloto(p);
            tg.setPosicion(0);
            tg.setPuntos(0);
            tg.setTiempo(0.0);
            tg.setVueltas(0);
            getEntityManager().persist(tg);
            //getEntityManager().getTransaction().commit();
        }
        
    }
}
