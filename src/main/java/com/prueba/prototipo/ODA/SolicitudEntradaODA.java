package com.prueba.prototipo.ODA;

import com.prueba.prototipo.Modelos.SolicitudEntrada;
import org.springframework.data.jpa.repository.JpaRepository;


public interface SolicitudEntradaODA extends JpaRepository<SolicitudEntrada, Long>{
    
}
