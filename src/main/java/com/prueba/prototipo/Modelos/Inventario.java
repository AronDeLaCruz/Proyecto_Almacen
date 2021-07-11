package com.prueba.prototipo.Modelos;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
public class Inventario implements Serializable{
    
    private final static Long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    protected Long codInventariado;
    
    @NotEmpty
    protected int fechaInventariado;
    
//    @NotEmpty
    protected String descripcion;
    
    @NotEmpty
    @ManyToOne
    @JoinColumn(name = "cod_empleado")
    protected Empleado codEmpleado;
    
}
