package com.prueba.prototipo.Servicio;

import com.prueba.prototipo.Modelos.SolicitudSalida;
import com.prueba.prototipo.ODA.SolicitudSalidaODA;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
public class SolicitudSalidaServicioImpl implements SolicitudSalidaServicio{
 
    @Autowired
    private SolicitudSalidaODA solicitudSalidaODA;


    @Override
    @Transactional(readOnly = true)
    public List<SolicitudSalida> listaDeSolicitudesSal() {
        return (List<SolicitudSalida>)solicitudSalidaODA.findAll();    
    }

    @Override
    @Transactional
    public SolicitudSalida agregarSolicitudSal(SolicitudSalida solicitudSalida) {
        return solicitudSalidaODA.save(solicitudSalida);
    }

    @Override
    public void borrarSolicitudSal(SolicitudSalida solicitudSalida) {
        solicitudSalidaODA.delete(solicitudSalida);
    }

    @Override
    @Transactional
    public SolicitudSalida actualizarSolicitudSal(SolicitudSalida solicitudSalida) {
        return solicitudSalidaODA.save(solicitudSalida);
    }
}
