package entities;

import entities.Apuesta;
import entities.Campeonato;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-10-08T02:45:44")
@StaticMetamodel(Usuario.class)
public class Usuario_ { 

    public static volatile SingularAttribute<Usuario, String> descripcion;
    public static volatile SingularAttribute<Usuario, Integer> idUsuario;
    public static volatile SingularAttribute<Usuario, String> imagen;
    public static volatile ListAttribute<Usuario, Apuesta> apuestas;
    public static volatile SingularAttribute<Usuario, String> usuario;
    public static volatile SingularAttribute<Usuario, String> nombre;
    public static volatile SingularAttribute<Usuario, Integer> edad;
    public static volatile SingularAttribute<Usuario, Campeonato> campeonato;
    public static volatile SingularAttribute<Usuario, String> rol;

}