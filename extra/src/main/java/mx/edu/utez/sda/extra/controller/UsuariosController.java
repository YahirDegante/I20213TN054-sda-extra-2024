package mx.edu.utez.sda.extra.controller;

import mx.edu.utez.sda.extra.model.Usuario;
import mx.edu.utez.sda.extra.service.UsuariosService;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/usuarios")
public class UsuariosController {

    @Autowired
    private UsuariosService service;

    @PostMapping("/create")
    public Object Usuario(@RequestBody(required = true)Usuario usuario){
        return service.saveUsuario(usuario);
    }

    @GetMapping("/getAll")
    public List<Usuario> getAllUsers(){
        return service.getAllUsuarios();
    }

    @GetMapping("/verificacion/{id}")
    public Usuario getIdUsuario(@PathVariable int id){
        return service.getById(id).orElse(null);
    }

}
