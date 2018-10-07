package entities;

import entities.Piloto;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-10-07T15:13:09")
@StaticMetamodel(Apuesta.class)
public class Apuesta_ { 

    public static volatile SingularAttribute<Apuesta, Date> fecha;
    public static volatile SingularAttribute<Apuesta, Integer> idapuesta;
    public static volatile SingularAttribute<Apuesta, Integer> premioIdpremio;
    public static volatile SingularAttribute<Apuesta, String> usuario;
    public static volatile SingularAttribute<Apuesta, Double> cantidad;
    public static volatile SingularAttribute<Apuesta, Piloto> pilotoIdpiloto;
    public static volatile SingularAttribute<Apuesta, Double> puntos;
    public static volatile SingularAttribute<Apuesta, String> campeonatoa;

}