package entities;

import entities.Piloto;
import entities.Premio;
import entities.Usuario;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-10-21T02:27:38")
@StaticMetamodel(Apuesta.class)
public class Apuesta_ { 

    public static volatile SingularAttribute<Apuesta, Date> fecha;
    public static volatile SingularAttribute<Apuesta, Double> cantidadGanada;
    public static volatile SingularAttribute<Apuesta, Premio> premio;
    public static volatile SingularAttribute<Apuesta, Boolean> efectuada;
    public static volatile SingularAttribute<Apuesta, Usuario> usuario;
    public static volatile SingularAttribute<Apuesta, Double> cantidad;
    public static volatile SingularAttribute<Apuesta, Double> puntos;
    public static volatile SingularAttribute<Apuesta, Integer> idApuesta;
    public static volatile SingularAttribute<Apuesta, Piloto> piloto;

}