package com.prueba.prototipo.Servicio;

import com.prueba.prototipo.Modelos.SolicitudEntrada;
import com.prueba.prototipo.ODA.SolicitudEntradaODA;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
public class SolicitudEntradaServicioImpl implements SolicitudEntradaServicio{
 
    @Autowired
    private SolicitudEntradaODA solicitudEntradaODA;

    @Override
    @Transactional(readOnly = true)
    public List<SolicitudEntrada> listaDeSolicitudesEnt() {
        return (List<SolicitudEntrada>)solicitudEntradaODA.findAll();
    }

    @Override
    @Transactional
    public SolicitudEntrada agregarSolicitudEntr(SolicitudEntrada solicitudEntrada) {
       return solicitudEntradaODA.save(solicitudEntrada);
    }

    @Override
    public void borrarSolicitudEntr(SolicitudEntrada solicitudEntrada) {
        solicitudEntradaODA.delete(solicitudEntrada);
    }

    @Override
    @Transactional
    public SolicitudEntrada actualizarSolicitudEntr(SolicitudEntrada solicitudEntrada) {
        return solicitudEntradaODA.save(solicitudEntrada);
    }
}
