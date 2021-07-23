package com.prueba.prototipo.API;


import com.prueba.prototipo.Modelos.SolicitudEntrada;
import com.prueba.prototipo.Servicio.SolicitudEntradaServicio;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/solicitud_entrada")
public class ControladorSolicitudEntrada {
    
    @Autowired
    private final SolicitudEntradaServicio solicitudEntradaServicio;
    
    public ControladorSolicitudEntrada(
            SolicitudEntradaServicio solicitudEntradaServicio){
        this.solicitudEntradaServicio = solicitudEntradaServicio;
    }
    
    @GetMapping("/all")
    public ResponseEntity<List<SolicitudEntrada>> obtenerDatosIngreso(){
        List<SolicitudEntrada> solicitudEntrada 
                = solicitudEntradaServicio.listaDeSolicitudesEnt();
        return new ResponseEntity<>(solicitudEntrada, HttpStatus.OK);
    }
    
    @PostMapping("/add")
    public ResponseEntity<SolicitudEntrada> agregarSolicitudIng(@RequestBody SolicitudEntrada solicitudEntrada){
        SolicitudEntrada nuevaSolicitud = solicitudEntradaServicio.agregarSolicitudEntr(solicitudEntrada);
        return new ResponseEntity<>(nuevaSolicitud, HttpStatus.OK);
    }
    
    
    @PutMapping("/update")
    public ResponseEntity<SolicitudEntrada> actualizarSolicitudIng(@RequestBody SolicitudEntrada solicitudEntrada) {
        SolicitudEntrada actualizarSolicitud = solicitudEntradaServicio.actualizarSolicitudEntr(solicitudEntrada);
        return new ResponseEntity<>(actualizarSolicitud, HttpStatus.OK);
    }
    
    @DeleteMapping("/delete/{codSolicitud}")
    public ResponseEntity<?> borrarSolicitudIng(SolicitudEntrada solicitudEntrada) {
        solicitudEntradaServicio.borrarSolicitudEntr(solicitudEntrada);
        return new ResponseEntity<>( HttpStatus.OK);
    }
    
}
