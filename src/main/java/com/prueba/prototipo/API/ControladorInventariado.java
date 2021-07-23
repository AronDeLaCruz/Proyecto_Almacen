package com.prueba.prototipo.API;

import com.prueba.prototipo.Modelos.Inventariado;
import com.prueba.prototipo.Servicio.InventariadoServicio;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/inventariado")
public class ControladorInventariado {
    
    @Autowired
    private final InventariadoServicio inventariadoServicio;
    
    public ControladorInventariado(InventariadoServicio inventariadoServicio){
        this.inventariadoServicio = inventariadoServicio;
    }
    
    @GetMapping("/all")
    public ResponseEntity<List<Inventariado>> obtenerDatosInventariado(){
        List<Inventariado> inventariado = inventariadoServicio.listaInventariado();
        return new ResponseEntity<>(inventariado, HttpStatus.OK);
    }
    
    @PostMapping("/add")
    public ResponseEntity<Inventariado> iniciarInventariado(@RequestBody Inventariado inventariado){
        Inventariado nuevoInventariado = inventariadoServicio.iniciarInventariado(inventariado);
        return new ResponseEntity<>(nuevoInventariado, HttpStatus.OK);
    }
    
    
    
}
