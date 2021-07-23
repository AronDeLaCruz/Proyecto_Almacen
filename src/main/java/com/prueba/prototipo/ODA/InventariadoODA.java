/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.prueba.prototipo.ODA;

import com.prueba.prototipo.Modelos.Inventariado;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author Aron
 */
public interface InventariadoODA extends JpaRepository<Inventariado, Long>{
    
}
