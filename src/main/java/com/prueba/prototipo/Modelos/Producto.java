//Tambien conocido como clase Bien
package com.prueba.prototipo.Modelos;

import javax.persistence.*;
import java.io.Serializable;
import javax.validation.constraints.NotEmpty;
import lombok.Data;

/**
 *
 * @author Aron
 */
@Entity
@Data
@Table(name ="producto")
public class Producto implements Serializable {
    
    private final static Long serialVersionUID=1L; 
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    protected Long codProd;
     
    @NotEmpty
    protected String nombreProducto;
    
    protected String descripcionProducto;
    /*
    Como denominas a cada columna tanto aqui como en la base de datos afecta a
    la recepcion de datos
    Para que funcione correctamente deben tener nombres iguales o similares(no 
    necesariamente el codigo en java tendra _ )
    Ejemplo:
        Java             Mysql
      codProd          cod_prod    
   nombreProducto   nombre_producto
    */
    
}
