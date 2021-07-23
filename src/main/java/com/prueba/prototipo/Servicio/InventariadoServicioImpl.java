package com.prueba.prototipo.Servicio;

import com.prueba.prototipo.Modelos.Inventariado;
import com.prueba.prototipo.ODA.InventariadoODA;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Aron
 */
@Service
public class InventariadoServicioImpl implements InventariadoServicio{
    
    @Autowired
    private InventariadoODA inventariadoODA;
    
    @Override
    @Transactional(readOnly = true)
    public List<Inventariado> listaInventariado() {
        return (List<Inventariado>)inventariadoODA.findAll();
    }

    @Override
    @Transactional
    public Inventariado iniciarInventariado(Inventariado inventariado) {
        return inventariadoODA.save(inventariado);
    }
    
    
    
}
