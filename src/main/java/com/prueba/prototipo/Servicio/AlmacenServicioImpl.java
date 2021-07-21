package com.prueba.prototipo.Servicio;

import com.prueba.prototipo.Modelos.Almacen;
import com.prueba.prototipo.ODA.AlmacenODA;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Aron
 */
@Service
public class AlmacenServicioImpl implements AlmacenServicio{
    
    @Autowired
    private AlmacenODA almacenODA;

    @Override
    @Transactional(readOnly = true)
    public List<Almacen> listaDeAlmacen() {
        return (List<Almacen>)almacenODA.findAll();
    }
    
}
