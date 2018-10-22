/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negocio;

import entities.Apuesta;
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
import entities.Usuario;
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
        for(int j=0;j<premios.size();++j){
            simularPremio(premios.get(j), pilotos, idCampeonato);
            definirGanadoresApuesta(premios.get(j));
        }
        actualizarPosiciones(idCampeonato);
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
        int [] vectorPuntos = {25,18,15,12,10,8,6,4,2,1,0,0,0,0,0,0,0,0,0,0,0};
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
            rp.setPuntos(vectorPuntos[puesto]+0.0);
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
    
    private void actualizarPosiciones(int idCampeonato){
        List<TablaGeneral> total = getEntityManager().createQuery("select tg "+"from TablaGeneral tg "+"where tg.campeonato.idCampeonato = :idCampeonato "+"order by tg.puntos desc", TablaGeneral.class)
                .setParameter("idCampeonato", idCampeonato).getResultList();
        for(int i=0;i<total.size();++i){
            total.get(i).setPosicion(i+1);

        }
    }
    
    private void definirGanadoresApuesta(Premio p){
        
        SesionCarrera sc = getEntityManager().createQuery("select sc "+"from SesionCarrera sc "+"where sc.premio.idPremio = :idPremio",SesionCarrera.class)
                .setParameter("idPremio", p.getIdPremio()).getSingleResult();
        ResultadoCarrera rc = getEntityManager().createQuery("select rc "+"from ResultadoCarrera rc "+"where rc.sesionCarrera.idSesionCarrera = :idSesionCarrera"+" order by rc.puntos desc",ResultadoCarrera.class)
                .setParameter("idSesionCarrera", sc.getIdSesionCarrera()).getResultList().get(0);
        Piloto ganador = rc.getPiloto();
        
        List<Apuesta> apuestasPremio = null;
        apuestasPremio = getEntityManager().createQuery("select a "+"from Apuesta a "+"where a.premio.idPremio = :idPremio ", Apuesta.class).setParameter("idPremio", p.getIdPremio()).getResultList();
        double montoTotal = 0.0;
        if(apuestasPremio !=null){
            for(int h=0;h<apuestasPremio.size();++h){
                montoTotal += apuestasPremio.get(h).getCantidad();
                apuestasPremio.get(h).setEfectuada(true);
            }
        }
        
        
        List<Apuesta> apuestasGanadoras = null;
        apuestasGanadoras = getEntityManager().createQuery("select a "+"from Apuesta a "+"where a.premio.idPremio = :idPremio and a.piloto.idPiloto = :idPiloto ", Apuesta.class)
                .setParameter("idPremio", p.getIdPremio()).setParameter("idPiloto", ganador.getIdPiloto()).getResultList();
        if(apuestasGanadoras != null){
            double n = apuestasGanadoras.size()*1.0;

            double montoIndividual = montoTotal/n;

            for(int i=0;i<apuestasGanadoras.size();++i){
                //System.out.println("entro-----------------------------------------------------------------");
                apuestasGanadoras.get(i).setCantidadGanada(montoIndividual);
                apuestasGanadoras.get(i).setPuntos(montoIndividual);
            }
        }
    }
    
}
