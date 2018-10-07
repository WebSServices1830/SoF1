package entities;

import entities.Piloto;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-10-07T15:13:09")
@StaticMetamodel(Resultadopractica.class)
public class Resultadopractica_ { 

    public static volatile SingularAttribute<Resultadopractica, Integer> posicion;
    public static volatile SingularAttribute<Resultadopractica, Double> tiempo;
    public static volatile SingularAttribute<Resultadopractica, Integer> vueltas;
    public static volatile SingularAttribute<Resultadopractica, Piloto> pilotoIdpiloto;
    public static volatile SingularAttribute<Resultadopractica, Integer> idresultado;
    public static volatile SingularAttribute<Resultadopractica, String> practicar;
    public static volatile SingularAttribute<Resultadopractica, Double> recordvuelta;

}