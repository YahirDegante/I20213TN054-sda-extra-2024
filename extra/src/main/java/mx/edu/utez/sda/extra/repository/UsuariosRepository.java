package mx.edu.utez.sda.extra.repository;


import mx.edu.utez.sda.extra.model.Usuario;
import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;
import org.springframework.stereotype.Repository;
import java.util.Optional;

@Repository
public interface UsuariosRepository extends JpaRepositoryImplementation <Usuario, Integer> {


}
