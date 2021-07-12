package com.prueba.prototipo.Modelos;

import javax.persistence.Entity;
import javax.persistence.Table;
import lombok.Data;

/**
 *
 * @author Aron
 */
@Entity
@Data
@Table(name = "inventario")
public class Inventario extends Producto {
    
    protected Long codInventariado; //probar pk con codProducto
    
    protected int StockProducto;
    
    protected Long codEmpleado;
    
    //intentar implemetar todo el codigo ademas del procedimiento almacenado
    
    
}
