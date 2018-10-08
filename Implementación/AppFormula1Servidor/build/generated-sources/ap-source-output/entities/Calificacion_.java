package entities;

import entities.Piloto;
import entities.Premio;
import entities.Usuario;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-10-08T02:45:44")
@StaticMetamodel(Calificacion.class)
public class Calificacion_ { 

    public static volatile SingularAttribute<Calificacion, Date> fecha;
    public static volatile SingularAttribute<Calificacion, Premio> premio;
    public static volatile SingularAttribute<Calificacion, Double> puntaje;
    public static volatile SingularAttribute<Calificacion, Integer> idCalificacion;
    public static volatile SingularAttribute<Calificacion, Usuario> usuario;
    public static volatile SingularAttribute<Calificacion, String> comentario;
    public static volatile SingularAttribute<Calificacion, Piloto> piloto;

}