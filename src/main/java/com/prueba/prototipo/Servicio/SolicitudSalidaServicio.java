package com.prueba.prototipo.Servicio;

import com.prueba.prototipo.Modelos.SolicitudSalida;
import java.util.List;

/**
 *
 * @author Aron
 */
public interface SolicitudSalidaServicio {
    
    public List<SolicitudSalida> listaDeSolicitudesSal();
    
    public SolicitudSalida agregarSolicitudSal(SolicitudSalida solicitudSalida);
    
    public void borrarSolicitudSal(SolicitudSalida solicitudSalida);
    
    public SolicitudSalida actualizarSolicitudSal(SolicitudSalida solicitudSalida);
}
