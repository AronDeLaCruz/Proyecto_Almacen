package com.prueba.prototipo.ODA;

import com.prueba.prototipo.Modelos.Producto;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

import javax.transaction.Transactional;

/**
 *
 * @author Aron
 */
public interface ProductoODA extends JpaRepository<Producto,Long> {
 
}
