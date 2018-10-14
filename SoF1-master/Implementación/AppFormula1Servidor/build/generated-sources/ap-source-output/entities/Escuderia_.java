package entities;

import entities.Campeonato;
import entities.Monoplaza;
import entities.Pais;
import entities.Piloto;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-10-14T18:10:21")
@StaticMetamodel(Escuderia.class)
public class Escuderia_ { 

    public static volatile ListAttribute<Escuderia, Piloto> pilotos;
    public static volatile SingularAttribute<Escuderia, String> lider;
    public static volatile SingularAttribute<Escuderia, Integer> idEscuderia;
    public static volatile SingularAttribute<Escuderia, String> imagen;
    public static volatile SingularAttribute<Escuderia, String> nombre;
    public static volatile SingularAttribute<Escuderia, String> tecnicoLider;
    public static volatile SingularAttribute<Escuderia, Campeonato> campeonato;
    public static volatile ListAttribute<Escuderia, Monoplaza> monoplazas;
    public static volatile SingularAttribute<Escuderia, Pais> pais;
    public static volatile SingularAttribute<Escuderia, String> detalle;

}