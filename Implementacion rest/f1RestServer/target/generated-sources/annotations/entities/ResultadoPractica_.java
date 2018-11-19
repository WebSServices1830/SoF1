package entities;

import entities.Piloto;
import entities.SesionPractica;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-11-19T01:02:21")
@StaticMetamodel(ResultadoPractica.class)
public class ResultadoPractica_ { 

    public static volatile SingularAttribute<ResultadoPractica, Integer> posicion;
    public static volatile SingularAttribute<ResultadoPractica, Double> tiempo;
    public static volatile SingularAttribute<ResultadoPractica, Integer> vueltas;
    public static volatile SingularAttribute<ResultadoPractica, Double> recordVuelta;
    public static volatile SingularAttribute<ResultadoPractica, Piloto> piloto;
    public static volatile SingularAttribute<ResultadoPractica, Integer> idResultado;
    public static volatile SingularAttribute<ResultadoPractica, SesionPractica> sesionPractica;

}