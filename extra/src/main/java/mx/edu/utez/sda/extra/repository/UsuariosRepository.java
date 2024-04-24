package mx.edu.utez.sda.extra.repository;


import mx.edu.utez.sda.extra.model.Usuario;
import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuariosRepository extends JpaRepositoryImplementation <Usuario, Integer> {


}
