package entities;

import entities.Piloto;
import entities.SesionClasificacion;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-11-12T13:40:18")
@StaticMetamodel(ResultadoClasificacion.class)
public class ResultadoClasificacion_ { 

    public static volatile SingularAttribute<ResultadoClasificacion, Double> q1;
    public static volatile SingularAttribute<ResultadoClasificacion, Integer> posicion;
    public static volatile SingularAttribute<ResultadoClasificacion, Double> q2;
    public static volatile SingularAttribute<ResultadoClasificacion, Double> q3;
    public static volatile SingularAttribute<ResultadoClasificacion, SesionClasificacion> sesionClasificacion;
    public static volatile SingularAttribute<ResultadoClasificacion, Integer> vueltas;
    public static volatile SingularAttribute<ResultadoClasificacion, Double> recordVuelta;
    public static volatile SingularAttribute<ResultadoClasificacion, Piloto> piloto;
    public static volatile SingularAttribute<ResultadoClasificacion, Integer> idResultado;

}