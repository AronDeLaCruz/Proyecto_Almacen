package com.prueba.prototipo.ODA;

import com.prueba.prototipo.Modelos.Empleado;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author Aron
 */
public interface EmpleadoODA extends JpaRepository<Empleado, Long>{
    
}
