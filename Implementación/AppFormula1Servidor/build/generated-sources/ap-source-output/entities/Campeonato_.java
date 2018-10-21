package entities;

import entities.Escuderia;
import entities.Monoplaza;
import entities.Piloto;
import entities.Premio;
import entities.TablaGeneral;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-10-21T02:27:38")
@StaticMetamodel(Campeonato.class)
public class Campeonato_ { 

    public static volatile ListAttribute<Campeonato, Piloto> pilotos;
    public static volatile ListAttribute<Campeonato, Escuderia> escuderias;
    public static volatile SingularAttribute<Campeonato, Integer> idCampeonato;
    public static volatile ListAttribute<Campeonato, TablaGeneral> tablaGeneral;
    public static volatile ListAttribute<Campeonato, Premio> calendario;
    public static volatile SingularAttribute<Campeonato, String> nombre;
    public static volatile ListAttribute<Campeonato, Monoplaza> monoplazas;

}