package entities;

import entities.Campeonato;
import entities.Piloto;
import entities.Premio;
import entities.Usuario;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-10-08T02:45:44")
@StaticMetamodel(Apuesta.class)
public class Apuesta_ { 

    public static volatile SingularAttribute<Apuesta, Date> fecha;
    public static volatile SingularAttribute<Apuesta, Premio> premio;
    public static volatile SingularAttribute<Apuesta, Usuario> usuario;
    public static volatile SingularAttribute<Apuesta, Double> cantidad;
    public static volatile SingularAttribute<Apuesta, Double> puntos;
    public static volatile SingularAttribute<Apuesta, Integer> idApuesta;
    public static volatile SingularAttribute<Apuesta, Campeonato> campeonato;
    public static volatile SingularAttribute<Apuesta, Piloto> piloto;

}