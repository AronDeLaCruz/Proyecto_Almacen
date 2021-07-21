package com.prueba.prototipo.Servicio;

import com.prueba.prototipo.Modelos.Producto;
import com.prueba.prototipo.Excepciones.ProductoNotFoundException;
import com.prueba.prototipo.ODA.ProductoODA;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import org.springframework.transaction.annotation.Transactional;


@Service
public class ProductoServicioImpl implements ProductoServicio{
    
    @Autowired
    private ProductoODA productoODA;

    @Override
    @Transactional(readOnly=true)
    public List<Producto> listarProductos() {
        return (List<Producto>)productoODA.findAll(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    @Transactional
    public Producto almacenarProducto(Producto producto) {
        return productoODA.save(producto);
    }

    @Override
    public void borrarProducto(Producto producto) {
        productoODA.delete(producto);
    }

    @Override
    @Transactional
    public Producto actualizarProducto(Producto producto) {
        return productoODA.save(producto);
    }
}
