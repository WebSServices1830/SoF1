package entities;

import entities.Premio;
import entities.Usuario;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-10-21T02:27:38")
@StaticMetamodel(CalificacionPremio.class)
public class CalificacionPremio_ { 

    public static volatile SingularAttribute<CalificacionPremio, Date> fecha;
    public static volatile SingularAttribute<CalificacionPremio, Premio> premio;
    public static volatile SingularAttribute<CalificacionPremio, Double> puntaje;
    public static volatile SingularAttribute<CalificacionPremio, Integer> idCalificacion;
    public static volatile SingularAttribute<CalificacionPremio, Usuario> usuario;
    public static volatile SingularAttribute<CalificacionPremio, String> comentario;

}