package com.prueba.prototipo.Modelos;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import lombok.Data;

/**
 *
 * @author Aron
 */
@Entity
@Data
@Table(name ="almacen")
public class Almacen implements Serializable{
    
    private final static Long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    protected Long codAlmacen;
    
    @NotEmpty
    protected String nombreAlmacen;
    
    @NotEmpty
    protected String ubicacionAlmacen;
    
    protected String descripcionAlmacen;
    
}
