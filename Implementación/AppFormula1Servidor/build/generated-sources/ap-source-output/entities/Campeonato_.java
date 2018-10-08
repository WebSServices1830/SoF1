package entities;

import entities.Apuesta;
import entities.Circuito;
import entities.Escuderia;
import entities.Monoplaza;
import entities.Pais;
import entities.Piloto;
import entities.Premio;
import entities.Usuario;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-10-08T02:45:44")
@StaticMetamodel(Campeonato.class)
public class Campeonato_ { 

    public static volatile ListAttribute<Campeonato, Piloto> pilotos;
    public static volatile ListAttribute<Campeonato, Escuderia> escuderias;
    public static volatile ListAttribute<Campeonato, Circuito> circuitos;
    public static volatile ListAttribute<Campeonato, Premio> calendario;
    public static volatile ListAttribute<Campeonato, Apuesta> apuestas;
    public static volatile ListAttribute<Campeonato, Usuario> usuarios;
    public static volatile SingularAttribute<Campeonato, String> nombre;
    public static volatile ListAttribute<Campeonato, Monoplaza> monoplazas;
    public static volatile ListAttribute<Campeonato, Pais> paises;

}