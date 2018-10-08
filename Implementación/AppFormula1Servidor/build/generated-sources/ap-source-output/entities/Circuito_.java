package entities;

import entities.Campeonato;
import entities.Foto;
import entities.Pais;
import entities.Piloto;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-10-08T02:45:44")
@StaticMetamodel(Circuito.class)
public class Circuito_ { 

    public static volatile SingularAttribute<Circuito, Double> longitud;
    public static volatile SingularAttribute<Circuito, Double> record;
    public static volatile SingularAttribute<Circuito, Integer> vueltas;
    public static volatile SingularAttribute<Circuito, String> ultimoGanador;
    public static volatile SingularAttribute<Circuito, Integer> idCircuito;
    public static volatile SingularAttribute<Circuito, String> nombre;
    public static volatile SingularAttribute<Circuito, Campeonato> campeonato;
    public static volatile SingularAttribute<Circuito, Piloto> piloto;
    public static volatile ListAttribute<Circuito, Foto> fotos;
    public static volatile SingularAttribute<Circuito, Pais> pais;
    public static volatile SingularAttribute<Circuito, Date> fechRecord;

}