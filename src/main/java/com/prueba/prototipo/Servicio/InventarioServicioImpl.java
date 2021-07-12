
package com.prueba.prototipo.Servicio;

import com.prueba.prototipo.Modelos.Inventario;
import com.prueba.prototipo.ODA.InventarioODA;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Aron
 */
@Service
public class InventarioServicioImpl implements InventarioServicio{
    
    @Autowired
    public InventarioODA inventarioODA; 

    @Override
    @Transactional(readOnly=true)
    public List<Inventario> ListaInventario() {
        return (List<Inventario>)inventarioODA.findAll();
    }
    
}
