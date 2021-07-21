package com.prueba.prototipo.API;

import com.prueba.prototipo.Modelos.Empleado;
import com.prueba.prototipo.Servicio.EmpleadoServicio;
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
@RequestMapping("/empleado")
public class ControladorEmpleado {
    
    @Autowired
    private final EmpleadoServicio empleadoServicio;
    
    public ControladorEmpleado(EmpleadoServicio empleadoServicio){
        this.empleadoServicio = empleadoServicio;
    }
    
    @GetMapping("/all")
    public ResponseEntity<List<Empleado>> obtenerTodosLosEmpleados(){
        List<Empleado> empleado = empleadoServicio.listaEmpleados();
        return new ResponseEntity<>(empleado, HttpStatus.OK);
    }
    
}
