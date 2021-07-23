package com.prueba.prototipo.API;

import com.prueba.prototipo.Modelos.Empleado;
import com.prueba.prototipo.Servicio.EmpleadoServicio;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
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
    
    @PostMapping("/add")
    public ResponseEntity<Empleado> agregarEmpleado(@RequestBody Empleado empleado){
        Empleado nuevoEmpleado = empleadoServicio.agregarEmpleado(empleado);
        return new ResponseEntity<>(nuevoEmpleado, HttpStatus.OK);
    }
    
    
    @PutMapping("/update")
    public ResponseEntity<Empleado> actualizarEmpleado(@RequestBody Empleado empleado) {
        Empleado actualizarEmpleado = empleadoServicio.actualizarEmpleado(empleado);
        return new ResponseEntity<>(actualizarEmpleado, HttpStatus.OK);
    }
    
    @DeleteMapping("/delete/{dniEmpleado}")
    public ResponseEntity<?> borrarEmpleado(Empleado empleado) {
        empleadoServicio.borrarEmpleado(empleado);
        return new ResponseEntity<>( HttpStatus.OK);
    }
    
}
