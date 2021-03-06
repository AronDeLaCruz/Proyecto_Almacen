package com.prueba.prototipo.Modelos;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import lombok.Data;

/**
 *
 * @author Aron
 */
@Entity
@Data
@Table(name ="usuario")
public class Usuario {
    
    private final static Long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    protected Long codUsuario;
    
    @NotEmpty
    protected String nombreUsuario;
    
    protected int telefonoUsuario;
    
    @NotEmpty
    protected String correoUsuario;
    
    @NotEmpty
    protected String contraseñaUsuario; //Probar con otros codigos despues, para poder implementar bloqueo
    
    @NotEmpty
    @OneToOne
    @JoinColumn(name = "cod_empleado")
    protected Empleado codEmpleado;
    
    protected String RolUsuario;
    
}
