package entities;

import entities.Premio;
import entities.ResultadoCarrera;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-11-12T13:40:18")
@StaticMetamodel(SesionCarrera.class)
public class SesionCarrera_ { 

    public static volatile SingularAttribute<SesionCarrera, Date> fecha;
    public static volatile ListAttribute<SesionCarrera, ResultadoCarrera> resultados;
    public static volatile SingularAttribute<SesionCarrera, Premio> premio;
    public static volatile SingularAttribute<SesionCarrera, Integer> idSesionCarrera;
    public static volatile SingularAttribute<SesionCarrera, String> nombre;

}