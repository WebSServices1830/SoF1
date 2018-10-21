package entities;

import entities.Premio;
import entities.ResultadoPractica;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-10-21T17:38:41")
@StaticMetamodel(SesionPractica.class)
public class SesionPractica_ { 

    public static volatile SingularAttribute<SesionPractica, Date> fecha;
    public static volatile ListAttribute<SesionPractica, ResultadoPractica> resultados;
    public static volatile SingularAttribute<SesionPractica, Premio> premio;
    public static volatile SingularAttribute<SesionPractica, Integer> idSesionPractica;
    public static volatile SingularAttribute<SesionPractica, String> nombre;

}