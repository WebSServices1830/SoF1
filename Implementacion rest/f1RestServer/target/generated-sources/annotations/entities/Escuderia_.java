package entities;

import entities.Campeonato;
import entities.Monoplaza;
import entities.Pais;
import entities.Piloto;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-11-19T01:02:21")
@StaticMetamodel(Escuderia.class)
public class Escuderia_ { 

    public static volatile SingularAttribute<Escuderia, Piloto> piloto1;
    public static volatile SingularAttribute<Escuderia, Piloto> piloto2;
    public static volatile SingularAttribute<Escuderia, String> lider;
    public static volatile SingularAttribute<Escuderia, Integer> idEscuderia;
    public static volatile SingularAttribute<Escuderia, String> imagen;
    public static volatile SingularAttribute<Escuderia, Monoplaza> monoplaza1;
    public static volatile SingularAttribute<Escuderia, Monoplaza> monoplaza2;
    public static volatile SingularAttribute<Escuderia, String> nombre;
    public static volatile SingularAttribute<Escuderia, String> tecnicoLider;
    public static volatile SingularAttribute<Escuderia, Campeonato> campeonato;
    public static volatile SingularAttribute<Escuderia, Pais> pais;
    public static volatile SingularAttribute<Escuderia, String> detalle;

}