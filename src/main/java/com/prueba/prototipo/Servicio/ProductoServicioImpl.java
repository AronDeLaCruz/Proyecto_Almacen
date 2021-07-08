package com.prueba.prototipo.Servicio;

import com.prueba.prototipo.Modelos.Producto;
import com.prueba.prototipo.Excepciones.ProductoNotFoundException;
import com.prueba.prototipo.ODA.ProductoODA;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ProductoServicioImpl implements ProductoServicio {

    @Autowired
    private ProductoODA productoODA;

    /* 
    @Transactional
    public Producto actualizarProducto(Producto producto1){
        return productoODA.save(producto1);
    }

   
    public void borrarProducto(Producto producto){
        
    }*/
    
    @Override
    @Transactional(readOnly = true)
    public List<Producto> listarProductos() {
        return (List<Producto>) productoODA.findAll();
    }

    @Override
    @Transactional
    public Producto almacenarProducto(Producto producto) {
        return productoODA.save(producto);
    }

    @Override
    @Transactional
    public void borrarProducto(Producto producto/*Long codProd*/) {
        productoODA.delete(producto);
    }

    @Override
    public Producto encontrarProducto(Producto producto) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Producto actualizarProducto(Producto producto) {
        return productoODA.save(producto);
    }
}
