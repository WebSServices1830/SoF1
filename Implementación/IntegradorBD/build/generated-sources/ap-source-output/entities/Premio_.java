package entities;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-10-07T15:13:09")
@StaticMetamodel(Premio.class)
public class Premio_ { 

    public static volatile SingularAttribute<Premio, Date> fechainicio;
    public static volatile SingularAttribute<Premio, Integer> sesioncarreraIdsesion;
    public static volatile SingularAttribute<Premio, Integer> sesionpracticaIdsesion;
    public static volatile SingularAttribute<Premio, Integer> idpremio;
    public static volatile SingularAttribute<Premio, String> campeonatopr;
    public static volatile SingularAttribute<Premio, Integer> sesionclasificacionIdsesion;
    public static volatile SingularAttribute<Premio, Date> fechafin;
    public static volatile SingularAttribute<Premio, String> nombre;
    public static volatile SingularAttribute<Premio, Integer> circuitoIdcircuito;

}