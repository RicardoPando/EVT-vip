package pe.edu.upc.aaw.proyecto_awb.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import pe.edu.upc.aaw.proyecto_awb.entities.Eventos;

import java.util.List;

@Repository
public interface IEventosRepository extends JpaRepository<Eventos,Integer> {

    @Query(value = "SELECT e.descripcion, c.valoracion, c.contenido\n" +
            " FROM eventos e\n" +
            " JOIN comentario c ON e.id = c.eventos_id\n" +
            " WHERE e.id = 1;", nativeQuery = true)
    public List<String[]> comentByPerson();
}
