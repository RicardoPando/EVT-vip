package pe.edu.upc.aaw.proyecto_awb.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.upc.aaw.proyecto_awb.entities.Usuarios_XEvento;
@Repository
public interface IAsistentes_XEventoRepository extends JpaRepository<Usuarios_XEvento,Integer> {
}
