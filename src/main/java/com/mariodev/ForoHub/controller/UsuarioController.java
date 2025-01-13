package com.mariodev.ForoHub.controller;

import com.mariodev.ForoHub.usuario.Usuario;
import com.mariodev.ForoHub.usuario.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/forohub/usuarios")
public class UsuarioController {

    @Autowired
    private UsuarioRepository usuarioRepository;

    // Obtener todos los usuarios
    @GetMapping
    public List<Usuario> obtenerTodosLosUsuarios() {
        return usuarioRepository.findAll();
    }

    // Obtener un usuario por ID
    @GetMapping("/{id}")
    public Optional<Usuario> obtenerUsuarioPorId(@PathVariable Long id) {
        return usuarioRepository.findById(id);
    }

    // Crear un nuevo usuario
    @PostMapping
    public Usuario crearUsuario(@RequestBody Usuario usuario) {
        return usuarioRepository.save(usuario);
    }

    // Actualizar un usuario existente
    @PutMapping("/{id}")
    public Usuario actualizarUsuario(@PathVariable Long id, @RequestBody Usuario usuarioActualizado) {
        return usuarioRepository.findById(id)
                .map(usuario -> {
                    usuario.setNombre(usuarioActualizado.getNombre());
                    usuario.setEmail(usuarioActualizado.getEmail());
                    usuario.setContrasena(usuarioActualizado.getContrasena());
                    return usuarioRepository.save(usuario);
                }).orElseThrow(() -> new RuntimeException("Usuario no encontrado con id: " + id));
    }

    // Eliminar un usuario
    @DeleteMapping("/{id}")
    public String eliminarUsuario(@PathVariable Long id) {
        usuarioRepository.deleteById(id);
        return "Usuario eliminado con éxito con id: " + id;
    }
}
