package entities;

import entities.Premio;
import entities.ResultadoPractica;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-10-14T18:10:21")
@StaticMetamodel(SesionPractica.class)
public class SesionPractica_ { 

    public static volatile SingularAttribute<SesionPractica, Date> fecha;
    public static volatile SingularAttribute<SesionPractica, Integer> idSesion;
    public static volatile SingularAttribute<SesionPractica, Premio> premio;
    public static volatile ListAttribute<SesionPractica, ResultadoPractica> resultados;
    public static volatile SingularAttribute<SesionPractica, String> nombre;

}