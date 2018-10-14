package entities;

import entities.Piloto;
import entities.SesionCarrera;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-10-14T18:10:21")
@StaticMetamodel(ResultadoCarrera.class)
public class ResultadoCarrera_ { 

    public static volatile SingularAttribute<ResultadoCarrera, Integer> posicion;
    public static volatile SingularAttribute<ResultadoCarrera, SesionCarrera> sesionCarrera;
    public static volatile SingularAttribute<ResultadoCarrera, Double> tiempo;
    public static volatile SingularAttribute<ResultadoCarrera, Integer> vueltas;
    public static volatile SingularAttribute<ResultadoCarrera, Double> recordVuelta;
    public static volatile SingularAttribute<ResultadoCarrera, Double> puntos;
    public static volatile SingularAttribute<ResultadoCarrera, Piloto> piloto;
    public static volatile SingularAttribute<ResultadoCarrera, Integer> idResultado;

}