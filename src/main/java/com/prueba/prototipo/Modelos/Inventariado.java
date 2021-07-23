package com.prueba.prototipo.Modelos;

import java.io.Serializable;
import java.util.List;
import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import lombok.Data;

/**
 *
 * @author Aron
 */
@Entity
@Data
@Table(name ="inventariado")
public class Inventariado implements Serializable{
    
    private final static Long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    protected Long codInventariado;
    
    @NotEmpty
    protected int fechaInventariado;
    
    @NotEmpty
    protected String descripcion;
   
    @NotEmpty
    @OneToMany
    @JoinColumn(name = "cod_inventariado")
    protected List<InventariadoProd> codInventariadoProd;
    
    @NotEmpty
    @OneToOne
    @JoinColumn(name = "cod_inventariado")
    protected EncInvent dniEmpleado;
   
}
