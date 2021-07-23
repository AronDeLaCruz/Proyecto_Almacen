package com.prueba.prototipo.Modelos;

//Se define al encargado del inventariado

import java.io.Serializable;
import javax.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name ="enc_invent")
public class EncInvent implements Serializable{
    
    private final static Long serialVersionUID = 1L;
    
    @Id
    @OneToOne
    @JoinColumn(name = "dni_empleado")
    protected Empleado dniEmpleado;
    
}
