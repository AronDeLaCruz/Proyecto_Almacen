package com.prueba.prototipo.Modelos;

import java.io.Serializable;
import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import lombok.Data;

@Entity
@Data
@Table(name ="prod_sol_entr")
public class ProdSolEntr implements Serializable{
    
    private final static Long serialVersionUID=1L; 
    
    @Id
    @ManyToOne
    @JoinColumn(name = "codigo_producto")
    protected Producto codigoProducto;
    
    @NotEmpty
    protected int cantIngreso;
}
