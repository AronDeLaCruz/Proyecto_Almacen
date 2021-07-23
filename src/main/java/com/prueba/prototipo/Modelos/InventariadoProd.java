package com.prueba.prototipo.Modelos;

import java.io.Serializable;
import java.util.List;
import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import lombok.Data;

@Entity
@Data
@Table(name ="inventariado_prod")
public class InventariadoProd implements Serializable {
    
    private final static Long serialVersionUID = 1L;

    @Id
    @ManyToOne
    @JoinColumn(name = "codigo_producto")
    private Producto codigoProducto;
    
    @NotEmpty
    private int stockProdInvent;
    
}
