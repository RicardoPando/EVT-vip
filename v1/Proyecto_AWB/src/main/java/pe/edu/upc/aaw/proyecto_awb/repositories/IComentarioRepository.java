package pe.edu.upc.aww.comentario.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.upc.aww.comentario.entities.Comentario;
@Repository
public interface IComentarioRepository extends JpaRepository<Comentario,Integer> {
}
