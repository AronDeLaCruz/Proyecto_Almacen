package com.prueba.prototipo.API;

import com.prueba.prototipo.Servicio.ProductoServicio;
import com.prueba.prototipo.Modelos.Producto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;


@RestController
@RequestMapping("/producto")
public class ControladorProducto {
    
    @Autowired
    private final ProductoServicio productoServicio;

    public ControladorProducto(ProductoServicio productoServicio) {
        this.productoServicio = productoServicio;
    }
    
    @GetMapping("/all")
    public ResponseEntity<List<Producto>> obtenerTodosLosProductos(){
        List<Producto> producto = productoServicio.listarProductos();
        return new ResponseEntity<>(producto, HttpStatus.OK);
    }
    
    @PostMapping("/add")
    public ResponseEntity<Producto> agregarProducto(@RequestBody Producto producto){
        Producto nuevoProducto = productoServicio.almacenarProducto(producto);
        return new ResponseEntity<>(nuevoProducto, HttpStatus.OK);
    }
    
    @DeleteMapping("/delete/{codProd}")//Se puede colar mensajes en el resultado para probar
    public ResponseEntity<?> borrarProducto(Producto producto) {
       productoServicio.borrarProducto(producto);
       return new ResponseEntity<>(HttpStatus.OK);
    }
    
    @PutMapping("/update")
    public ResponseEntity<Producto> actualizarProducto(@RequestBody Producto producto) {
        Producto actualizarProducto = productoServicio.actualizarProducto(producto);
        return new ResponseEntity<>(actualizarProducto, HttpStatus.OK);
    }
    
    
}


