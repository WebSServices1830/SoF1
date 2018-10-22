package entities;

import entities.Campeonato;
import entities.Monoplaza;
import entities.Pais;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-10-21T21:31:00")
@StaticMetamodel(Piloto.class)
public class Piloto_ { 

    public static volatile SingularAttribute<Piloto, Integer> podios;
    public static volatile SingularAttribute<Piloto, Integer> numero;
    public static volatile SingularAttribute<Piloto, Date> fechaNacimiento;
    public static volatile SingularAttribute<Piloto, String> biografia;
    public static volatile SingularAttribute<Piloto, String> imagen;
    public static volatile SingularAttribute<Piloto, String> nombre;
    public static volatile SingularAttribute<Piloto, Campeonato> campeonato;
    public static volatile SingularAttribute<Piloto, Pais> pais;
    public static volatile SingularAttribute<Piloto, Monoplaza> monoplaza;
    public static volatile SingularAttribute<Piloto, Double> multiplicador;
    public static volatile SingularAttribute<Piloto, String> experiencia;
    public static volatile SingularAttribute<Piloto, Integer> idPiloto;
    public static volatile SingularAttribute<Piloto, String> paisNacimiento;
    public static volatile SingularAttribute<Piloto, Integer> campeonatos;

}