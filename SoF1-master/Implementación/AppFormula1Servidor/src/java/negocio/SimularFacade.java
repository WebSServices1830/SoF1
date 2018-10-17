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
import java.util.Date;
import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.concurrent.ThreadLocalRandom;
import javax.annotation.PreDestroy;

/**
 *
 * @author andre
 */
@Stateless
public class SimularFacade {
    
    @PersistenceContext(unitName = "AppFormula1ServidorPU")
    private EntityManager em;
    
    @EJB
    private PremioFacade premioFacade;
    
    @EJB
    private PilotoFacade pilotoFacade;
    
    @EJB
    private SesionCarreraFacade sesionCarreraFacade;
    
    @EJB
    private SesionClasificacionFacade sesionClasificacionFacade;
    
    @EJB
    private SesionPracticaFacade sesionPracticaFacade;
    
    @EJB
    private ResultadoCarreraFacade resultadoCarreraFacade;
    
    @EJB
    private ResultadoClasificacionFacade resultadoClasificacionFacade;
    
    @EJB
    private ResultadoPracticaFacade resultadoPracticaFacade;
    
    @EJB
    private TablaGeneralFacade tablaGeneralFacade;
    
    @EJB 
    private CampeonatoFacade campeonatoFacade;
    
    protected EntityManager getEntityManager() {
        return em;
    }
    
        @PreDestroy
public void destruct()
{
    em.close();
}
    
    public void simularTorneo(int idCampeonato){
        List<Premio> premios = premioFacade.obtenerPremiosByCampeonato(idCampeonato);
        List<Piloto> pilotos = pilotoFacade.obtenerPilotosByCampeonato(idCampeonato);
        initTablaGeneral(idCampeonato,pilotos);
        for(Premio p: premios){
            simularPremio(p, pilotos, idCampeonato);
            System.out.println("entro");
        }
    }
    
    private void simularPremio(Premio premio, List<Piloto> pilotos, int idCampeonato){
        SesionPractica sp = new SesionPractica();
        //sp.setFecha(new Date());
        //sp.setNombre("Sesion practica "+premio.getNombre());
        //sp.setResultados(new ArrayList<>());
        sesionPracticaFacade.create(sp);
        sp = sesionPracticaFacade.find(sesionPracticaFacade.count());
        premio.setSesionPractica(sp);
        SesionClasificacion scl = new SesionClasificacion();
        //scl.setFecha(new Date());
        //scl.setResultados(null);
        //scl.setNombre("Sesion clasificacion "+premio.getNombre());
        //scl.setResultados(new ArrayList<>());
        sesionClasificacionFacade.create(scl);
        scl = sesionClasificacionFacade.find(sesionClasificacionFacade.count());
        premio.setSesionClasificacion(scl);
        SesionCarrera sc = new SesionCarrera();
        //sc.setFecha(new Date());
        //sc.setNombre("Sesion carrera "+premio.getNombre());
        //sc.setResultados(new ArrayList<>());
        sesionCarreraFacade.create(sc);
        sc = sesionCarreraFacade.find(sesionCarreraFacade.count());
        premio.setSesionCarrera(sc);
        premio.setFinalizado(true);       
        simularSesionPractica(sp, pilotos);
        simularSesionClasificacion(scl, pilotos);
        simularSesionCarrera(sc, pilotos,idCampeonato);
        premioFacade.edit(premio);
        //Falta Definir resultado apuestas
    }
    
    private void simularSesionPractica(SesionPractica sesion, List<Piloto> pilotos){
        List<Integer> puestosDispobibles = obtenerPuestosDisponibles(pilotos.size());
        for(int i=0; i<pilotos.size();++i){
            List<Integer> vectorProbabilidad = vectorProbabilidad(puestosDispobibles.size());
            int index =obtenerPuesto(vectorProbabilidad);
            int puesto = puestosDispobibles.get(index);
            puestosDispobibles.remove(index);
            ResultadoPractica rp = new ResultadoPractica();
            rp.setPiloto(pilotos.get(i));
            rp.setPosicion(puesto);
            rp.setRecordVuelta(1.0+ThreadLocalRandom.current().nextInt(60, 120));
            rp.setSesionPractica(sesion);
            rp.setTiempo(4000.0+puesto);
            rp.setVueltas(50+puesto);
            resultadoPracticaFacade.create(rp);
        }
    }
    private void simularSesionClasificacion(SesionClasificacion sesion, List<Piloto> pilotos){
        List<Integer> puestosDispobibles = obtenerPuestosDisponibles(pilotos.size());
        for(int i=0; i<pilotos.size();++i){
            List<Integer> vectorProbabilidad = vectorProbabilidad(puestosDispobibles.size());
            int index =obtenerPuesto(vectorProbabilidad);
            int puesto = puestosDispobibles.get(index);
            puestosDispobibles.remove(index);
            ResultadoClasificacion rp = new ResultadoClasificacion();
            rp.setPiloto(pilotos.get(i));
            rp.setPosicion(puesto);
            rp.setRecordVuelta(1.0+ThreadLocalRandom.current().nextInt(60, 120));
            rp.setSesionClasificacion(sesion);
            rp.setQ1(1.0+ThreadLocalRandom.current().nextInt(100, 200));
            rp.setQ2(1.0+ThreadLocalRandom.current().nextInt(100, 200));
            rp.setQ3(1.0+ThreadLocalRandom.current().nextInt(100, 200));
            rp.setVueltas(50+puesto);
            resultadoClasificacionFacade.create(rp);
        }
    }
    private void simularSesionCarrera(SesionCarrera sesion, List<Piloto> pilotos, int idCampeonato){
        List<Integer> puestosDispobibles = obtenerPuestosDisponibles(pilotos.size());
        for(int i=0; i<pilotos.size();++i){
            List<Integer> vectorProbabilidad = vectorProbabilidad(puestosDispobibles.size());
            int index =obtenerPuesto(vectorProbabilidad);
            int puesto = puestosDispobibles.get(index);
            puestosDispobibles.remove(index);
            ResultadoCarrera rp = new ResultadoCarrera();
            rp.setPiloto(pilotos.get(i));
            rp.setPosicion(puesto);
            rp.setRecordVuelta(1.0+ThreadLocalRandom.current().nextInt(60, 120));
            rp.setSesionCarrera(sesion);
            rp.setPuntos(1.0+(pilotos.size()-puesto));
            rp.setTiempo(4000.0+puesto);
            rp.setVueltas(50+puesto);
            resultadoCarreraFacade.create(rp);
            TablaGeneral tg = tablaGeneralFacade.obtenerTablaGeneralByPiloto(pilotos.get(i).getIdPiloto());
            tg.setPuntos(tg.getPuntos()+rp.getPuntos().intValue());
            tg.setTiempo(tg.getTiempo()+rp.getTiempo());
            tg.setVueltas(tg.getVueltas()+rp.getVueltas());
            tablaGeneralFacade.edit(tg);
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
        Campeonato camp=campeonatoFacade.find(idCampeonato);
        for(Piloto p:pilotos){
            TablaGeneral tg = new TablaGeneral();
            tg.setCampeonato(camp);
            tg.setPiloto(p);
            tg.setPosicion(0);
            tg.setPuntos(0);
            tg.setTiempo(0.0);
            tg.setVueltas(0);
            tablaGeneralFacade.create(tg);
        }
    }
}
