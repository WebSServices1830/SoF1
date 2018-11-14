package entities;

import entities.Piloto;
import entities.Usuario;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-11-12T13:40:18")
@StaticMetamodel(CalificacionPiloto.class)
public class CalificacionPiloto_ { 

    public static volatile SingularAttribute<CalificacionPiloto, Date> fecha;
    public static volatile SingularAttribute<CalificacionPiloto, Double> puntaje;
    public static volatile SingularAttribute<CalificacionPiloto, Integer> idCalificacion;
    public static volatile SingularAttribute<CalificacionPiloto, Usuario> usuario;
    public static volatile SingularAttribute<CalificacionPiloto, String> comentario;
    public static volatile SingularAttribute<CalificacionPiloto, Piloto> piloto;

}