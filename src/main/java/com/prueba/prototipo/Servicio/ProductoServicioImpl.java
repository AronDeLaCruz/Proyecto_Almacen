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
   /* 
    
    public List<Producto> encontrarTodosLosProductos(){
        return (List<Producto>)productoODA.findAll();
    }
    
    @Transactional
    public Producto actualizarProducto(Producto producto1){
        return productoODA.save(producto1);
    }

   
    public void borrarProducto(Producto producto){
        productoODA.borrarPorId(producto);
    }*/

    @Override
    @Transactional(readOnly=true)
    public List<Producto> listarProductos() {
        return (List<Producto>)productoODA.findAll(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void almacenarProducto(Producto producto) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void borrarProducto(Producto producto) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Producto encontrarProducto(Producto producto) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
