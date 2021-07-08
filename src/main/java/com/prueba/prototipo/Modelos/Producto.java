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
    @Column(nullable = false, updatable = false)
    protected Long codProd=100L + (long)(Math.random()*(999L-100L));
     
    @NotEmpty
    protected String nombreProducto;
    
    protected String descripcionProducto;
    
    /*
    public Producto(Long codProd,String nombreProducto, String descripcionProducto){   
        this.codProd=codProd;
        this.nombreProducto=nombreProducto;
        this.descripcionProducto=descripcionProducto;
    }
    
    public Producto(String nombreProducto, String descripcionProducto){
        this.codProd = 100L + (long)(Math.random()*(99L-10L));
        this.nombreProducto = nombreProducto;   
        this.descripcionProducto = descripcionProducto;
    }//En caso agregar mas constructores crear el predeterminado tmb
    
    
    //protected int stockProducto;
    
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
