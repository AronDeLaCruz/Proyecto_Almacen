package com.prueba.prototipo.Servicio;

import com.prueba.prototipo.Modelos.SolicitudEntrada;
import java.util.List;

/**
 *
 * @author Aron
 */
public interface SolicitudEntradaServicio {
    
    public List<SolicitudEntrada> listaDeSolicitudesEnt();
    
    public SolicitudEntrada agregarSolicitudEntr(SolicitudEntrada solicitudEntrada);
    
    public void borrarSolicitudEntr(SolicitudEntrada solicitudEntrada);
    
    public SolicitudEntrada actualizarSolicitudEntr(SolicitudEntrada solicitudEntrada);
    
}
