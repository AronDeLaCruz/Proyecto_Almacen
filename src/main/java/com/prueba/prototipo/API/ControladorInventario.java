package com.prueba.prototipo.API;

import com.prueba.prototipo.Modelos.Inventario;
import com.prueba.prototipo.Servicio.InventarioServicio;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Aron
 */
@RestController
@RequestMapping("/inventario")
public class ControladorInventario {
    
    @Autowired
    public final InventarioServicio inventarioServicio;
    
    public ControladorInventario(InventarioServicio inventarioServicio){
        this.inventarioServicio = inventarioServicio; 
    }
    
    @GetMapping("/all")
    public ResponseEntity<List<Inventario>> obtenerTodosLosProductos(){
        List<Inventario> inventario = inventarioServicio.ListaInventario();
        return new ResponseEntity<>(inventario, HttpStatus.OK);
    }
    
}
