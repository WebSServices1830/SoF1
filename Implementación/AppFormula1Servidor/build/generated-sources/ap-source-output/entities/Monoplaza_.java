package entities;

import entities.Campeonato;
import entities.Escuderia;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-10-08T02:45:44")
@StaticMetamodel(Monoplaza.class)
public class Monoplaza_ { 

    public static volatile SingularAttribute<Monoplaza, String> marca;
    public static volatile SingularAttribute<Monoplaza, Double> potencia;
    public static volatile SingularAttribute<Monoplaza, Double> multiplicador;
    public static volatile SingularAttribute<Monoplaza, Integer> idMonoplaza;
    public static volatile SingularAttribute<Monoplaza, Double> numCilindros;
    public static volatile SingularAttribute<Monoplaza, Double> torque;
    public static volatile SingularAttribute<Monoplaza, String> imagen;
    public static volatile SingularAttribute<Monoplaza, Double> velMax;
    public static volatile SingularAttribute<Monoplaza, String> modelo;
    public static volatile SingularAttribute<Monoplaza, Escuderia> escuderia;
    public static volatile SingularAttribute<Monoplaza, Campeonato> campeonato;

}