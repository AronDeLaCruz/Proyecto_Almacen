package com.prueba.prototipo.Servicio;

import com.prueba.prototipo.Modelos.Empleado;
import java.util.List;

/**
 *
 * @author Aron
 */
public interface EmpleadoServicio {
    
    public List<Empleado> listaEmpleados();
    
    public Empleado agregarEmpleado(Empleado empleado);
    
    public void borrarEmpleado(Empleado empleado);
    
    public Empleado actualizarEmpleado(Empleado empleado);
    
}
