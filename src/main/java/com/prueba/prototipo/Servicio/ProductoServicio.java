/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.prueba.prototipo.Servicio;

import com.prueba.prototipo.Modelos.Producto;
import java.util.List;

/**
 *
 * @author Aron
 */
public interface ProductoServicio {
    
    public List<Producto> listarProductos();
    
    public Producto almacenarProducto(Producto producto);
    
    public void borrarProducto(Producto producto);
    
    public Producto actualizarProducto(Producto producto);
                   
}
