package entities;

import entities.Calificacion;
import entities.Campeonato;
import entities.Escuderia;
import entities.Monoplaza;
import entities.Pais;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-10-08T02:45:44")
@StaticMetamodel(Piloto.class)
public class Piloto_ { 

    public static volatile SingularAttribute<Piloto, Integer> podios;
    public static volatile SingularAttribute<Piloto, Integer> numero;
    public static volatile SingularAttribute<Piloto, Date> fechaNacimiento;
    public static volatile SingularAttribute<Piloto, String> biografia;
    public static volatile SingularAttribute<Piloto, String> imagen;
    public static volatile SingularAttribute<Piloto, String> nombre;
    public static volatile SingularAttribute<Piloto, Campeonato> campeonato;
    public static volatile SingularAttribute<Piloto, Escuderia> escuderia;
    public static volatile SingularAttribute<Piloto, Pais> pais;
    public static volatile SingularAttribute<Piloto, Monoplaza> monoplaza;
    public static volatile ListAttribute<Piloto, Calificacion> calificaciones;
    public static volatile SingularAttribute<Piloto, Double> multiplicador;
    public static volatile SingularAttribute<Piloto, String> experiencia;
    public static volatile SingularAttribute<Piloto, Integer> idPiloto;
    public static volatile SingularAttribute<Piloto, String> paisNacimiento;
    public static volatile SingularAttribute<Piloto, Integer> campeonatos;

}