/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.prueba.prototipo.Servicio;

import com.prueba.prototipo.Modelos.Empleado;
import com.prueba.prototipo.Modelos.Usuario;
import java.util.List;

/**
 *
 * @author Aron
 */
public interface UsuarioServicio {
    
    public List<Usuario> listaDeUsuarios();
    
    public Usuario agregarUsuario(Usuario usuario);
    
    public void borrarUsuario(Usuario usuario);
    
    public Usuario actualizarUsuario(Usuario usuario);

}
