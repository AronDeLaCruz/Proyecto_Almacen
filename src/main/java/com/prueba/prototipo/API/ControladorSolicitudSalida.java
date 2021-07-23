package com.prueba.prototipo.API;


import com.prueba.prototipo.Modelos.SolicitudSalida;
import com.prueba.prototipo.Servicio.SolicitudSalidaServicio;
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
@RequestMapping("/solicitud_salida")
public class ControladorSolicitudSalida {
    
    @Autowired
    private final SolicitudSalidaServicio solicitudSalidaServicio;
    
    public ControladorSolicitudSalida(
            SolicitudSalidaServicio solicitudSalidaServicio){
        this.solicitudSalidaServicio = solicitudSalidaServicio;
    }
    
    @GetMapping("/all")
    public ResponseEntity<List<SolicitudSalida>> obtenerDatosIngreso(){
        List<SolicitudSalida> solicitudEntrada 
                = solicitudSalidaServicio.listaDeSolicitudesSal();
        return new ResponseEntity<>(solicitudEntrada, HttpStatus.OK);
    }
    
    @PostMapping("/add")
    public ResponseEntity<SolicitudSalida> agregarSolicitudSal(@RequestBody SolicitudSalida solicitudSalida){
        SolicitudSalida nuevaSolicitud = solicitudSalidaServicio.agregarSolicitudSal(solicitudSalida);
        return new ResponseEntity<>(nuevaSolicitud, HttpStatus.OK);
    }
    
    
    @PutMapping("/update")
    public ResponseEntity<SolicitudSalida> actualizarSolicitudSal(@RequestBody SolicitudSalida solicitudSalida) {
        SolicitudSalida actualizarSolicitud = solicitudSalidaServicio.actualizarSolicitudSal(solicitudSalida);
        return new ResponseEntity<>(actualizarSolicitud, HttpStatus.OK);
    }
    
    @DeleteMapping("/delete/{codSolicitud}")
    public ResponseEntity<?> borrarSolicitudSal(SolicitudSalida solicitudSalida) {
        solicitudSalidaServicio.borrarSolicitudSal(solicitudSalida);
        return new ResponseEntity<>( HttpStatus.OK);
    }
    
}
