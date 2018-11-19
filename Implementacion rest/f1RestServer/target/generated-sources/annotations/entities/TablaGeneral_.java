package entities;

import entities.Campeonato;
import entities.Piloto;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-11-19T01:02:21")
@StaticMetamodel(TablaGeneral.class)
public class TablaGeneral_ { 

    public static volatile SingularAttribute<TablaGeneral, Integer> posicion;
    public static volatile SingularAttribute<TablaGeneral, Double> tiempo;
    public static volatile SingularAttribute<TablaGeneral, Integer> vueltas;
    public static volatile SingularAttribute<TablaGeneral, Integer> puntos;
    public static volatile SingularAttribute<TablaGeneral, Integer> idTablaGeneral;
    public static volatile SingularAttribute<TablaGeneral, Campeonato> campeonato;
    public static volatile SingularAttribute<TablaGeneral, Piloto> piloto;

}