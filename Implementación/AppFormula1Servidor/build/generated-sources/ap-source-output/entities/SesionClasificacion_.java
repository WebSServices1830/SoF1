package entities;

import entities.ResultadoClasificacion;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-10-08T02:45:44")
@StaticMetamodel(SesionClasificacion.class)
public class SesionClasificacion_ { 

    public static volatile SingularAttribute<SesionClasificacion, Date> fecha;
    public static volatile SingularAttribute<SesionClasificacion, Integer> idSesion;
    public static volatile ListAttribute<SesionClasificacion, ResultadoClasificacion> resultados;
    public static volatile SingularAttribute<SesionClasificacion, String> nombre;

}