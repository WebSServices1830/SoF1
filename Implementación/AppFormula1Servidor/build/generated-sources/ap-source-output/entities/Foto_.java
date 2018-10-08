package entities;

import entities.Circuito;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-10-08T02:45:44")
@StaticMetamodel(Foto.class)
public class Foto_ { 

    public static volatile SingularAttribute<Foto, Integer> idFoto;
    public static volatile SingularAttribute<Foto, String> descripcion;
    public static volatile SingularAttribute<Foto, Circuito> circuito;
    public static volatile SingularAttribute<Foto, String> imagen;
    public static volatile SingularAttribute<Foto, String> nombre;

}