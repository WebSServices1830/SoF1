package entities;

import entities.Apuesta;
import entities.Resultadopractica;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-10-07T15:13:08")
@StaticMetamodel(Piloto.class)
public class Piloto_ { 

    public static volatile SingularAttribute<Piloto, Integer> podios;
    public static volatile SingularAttribute<Piloto, String> paisp;
    public static volatile SingularAttribute<Piloto, Integer> numero;
    public static volatile ListAttribute<Piloto, Resultadopractica> resultadopracticaList;
    public static volatile SingularAttribute<Piloto, String> biografia;
    public static volatile SingularAttribute<Piloto, String> imagen;
    public static volatile SingularAttribute<Piloto, String> paisnacimiento;
    public static volatile SingularAttribute<Piloto, String> escuderiap;
    public static volatile SingularAttribute<Piloto, Integer> monoplazaIdmonoplaza;
    public static volatile SingularAttribute<Piloto, String> nombre;
    public static volatile SingularAttribute<Piloto, String> campeonatop;
    public static volatile SingularAttribute<Piloto, Integer> idpiloto;
    public static volatile SingularAttribute<Piloto, Date> fechanacimiento;
    public static volatile SingularAttribute<Piloto, Double> multiplicador;
    public static volatile SingularAttribute<Piloto, String> experiencia;
    public static volatile SingularAttribute<Piloto, Integer> campeonatos;
    public static volatile ListAttribute<Piloto, Apuesta> apuestaList;

}