package entities;

import entities.ResultadoPractica;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-10-08T02:45:44")
@StaticMetamodel(SesionPractica.class)
public class SesionPractica_ { 

    public static volatile SingularAttribute<SesionPractica, Date> fecha;
    public static volatile SingularAttribute<SesionPractica, Integer> idSesion;
    public static volatile ListAttribute<SesionPractica, ResultadoPractica> resultados;
    public static volatile SingularAttribute<SesionPractica, String> nombre;

}