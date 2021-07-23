package com.prueba.prototipo.Servicio;

import com.prueba.prototipo.Modelos.Usuario;
import com.prueba.prototipo.ODA.UsuarioODA;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Aron
 */
@Service
public class UsuarioServicioImpl implements UsuarioServicio{
    
    @Autowired
    private UsuarioODA usuarioODA;

    @Override
    @Transactional(readOnly = true)
    public List<Usuario> listaDeUsuarios() {
        return (List<Usuario>)usuarioODA.findAll();
    }

    @Override
    @Transactional
    public Usuario agregarUsuario(Usuario usuario) {
        return usuarioODA.save(usuario);
    }

    @Override
    public void borrarUsuario(Usuario usuario) {
        usuarioODA.delete(usuario);
    }

    @Override
    @Transactional
    public Usuario actualizarUsuario(Usuario usuario) {
       return usuarioODA.save(usuario);
    }
    
}
