package mx.edu.utez.sda.extra.service;

import mx.edu.utez.sda.extra.model.Usuario;
import mx.edu.utez.sda.extra.repository.UsuariosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Period;
import java.util.List;
import java.util.Optional;

@Service
public class UsuariosService {
    @Autowired
    private UsuariosRepository usuariosRepository;

    public Usuario saveUsuario(Usuario usuario){
        return usuariosRepository.save(usuario);
    }

    public List<Usuario> getAllUsuarios(){
        return usuariosRepository.findAll();
    }

    public Optional<Usuario> getById(int id){
    Optional<Usuario> usuarioOptional = usuariosRepository.findById(id);

    if (usuarioOptional.isPresent()) {
        Usuario usuario = usuarioOptional.get();
        LocalDate fechaNacimiento = usuario.getFeha_nacimiento();
        LocalDate fechaActual = LocalDate.now();
        Period edad = Period.between(fechaNacimiento,
                fechaActual);
        if (edad.getYears() >= 18) {
            return usuarioOptional;
        } else {
            return Optional.empty();
        }
    } else {
        return usuarioOptional;
    }
    }

}
