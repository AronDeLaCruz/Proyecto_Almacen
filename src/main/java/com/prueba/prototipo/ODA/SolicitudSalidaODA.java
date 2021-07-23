package com.prueba.prototipo.ODA;

import com.prueba.prototipo.Modelos.SolicitudSalida;
import org.springframework.data.jpa.repository.JpaRepository;


public interface SolicitudSalidaODA extends JpaRepository<SolicitudSalida, String>{
    
}
