package entities;

import entities.Calificacion;
import entities.Campeonato;
import entities.Circuito;
import entities.SesionCarrera;
import entities.SesionClasificacion;
import entities.SesionPractica;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-10-08T02:45:44")
@StaticMetamodel(Premio.class)
public class Premio_ { 

    public static volatile SingularAttribute<Premio, SesionCarrera> sesionCarrera;
    public static volatile SingularAttribute<Premio, Circuito> circuito;
    public static volatile SingularAttribute<Premio, SesionClasificacion> sesionClasificacion;
    public static volatile ListAttribute<Premio, Calificacion> calificaciones;
    public static volatile SingularAttribute<Premio, Date> fechaInicio;
    public static volatile SingularAttribute<Premio, String> nombre;
    public static volatile SingularAttribute<Premio, Date> fechaFin;
    public static volatile SingularAttribute<Premio, Campeonato> campeonato;
    public static volatile SingularAttribute<Premio, Integer> idPremio;
    public static volatile SingularAttribute<Premio, SesionPractica> sesionPractica;

}