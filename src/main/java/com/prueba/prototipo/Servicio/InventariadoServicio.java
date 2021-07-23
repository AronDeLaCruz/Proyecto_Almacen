package com.prueba.prototipo.Servicio;

import com.prueba.prototipo.Modelos.Inventariado;
import java.util.List;

/**
 *
 * @author Aron
 */
public interface InventariadoServicio {
    
    public List<Inventariado> listaInventariado();
    
    public Inventariado iniciarInventariado(Inventariado inventariado);
    
    
}
