package com.prueba.prototipo.Modelos;

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
@Entity //: Al bloquear entity, esta clase no requiere un dato principal
@Data
@Table(name ="rol")
public class Rol {
    
   private final static Long serialVersionUID=1L; 
   
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   private Long codRol;
    
   @NotEmpty
   private String rolUsuario;
    
    
}
