package com.prueba.prototipo.ODA;

import com.prueba.prototipo.Modelos.Almacen;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author Aron
 */
public interface AlmacenODA extends JpaRepository<Almacen, Long>{
    
}
