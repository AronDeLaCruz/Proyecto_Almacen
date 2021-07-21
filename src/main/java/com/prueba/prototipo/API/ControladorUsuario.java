package com.prueba.prototipo.API;

import com.prueba.prototipo.Modelos.Usuario;
import com.prueba.prototipo.Servicio.UsuarioServicio;
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
@RequestMapping("/usuario")
public class ControladorUsuario {
    
    @Autowired
    private final UsuarioServicio usuarioServicio;
    
    public ControladorUsuario(UsuarioServicio usuarioServicio){
        this.usuarioServicio = usuarioServicio;
    }
    
    @GetMapping("/all")
    public ResponseEntity<List<Usuario>> obtenerTodosLosProductos(){
        List<Usuario> usuario = usuarioServicio.listaDeUsuarios();
        return new ResponseEntity<>(usuario, HttpStatus.OK);
    }
    
}
