package com.prueba.prototipo.API;

import com.prueba.prototipo.Modelos.Almacen;
import com.prueba.prototipo.Modelos.Producto;
import com.prueba.prototipo.Servicio.AlmacenServicio;
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
@RequestMapping("/almacen")
public class ControladorAlmacen {
    
    @Autowired
    private final AlmacenServicio almacenServicio;
    
    public ControladorAlmacen(AlmacenServicio almacenServicio){
        this.almacenServicio = almacenServicio;
    }
    
    @GetMapping("/all")
    public ResponseEntity<List<Almacen>> obtenerDatosAlmacen(){
        List<Almacen> almacen = almacenServicio.listaDeAlmacen();
        return new ResponseEntity<>(almacen, HttpStatus.OK);
    }
    
}
