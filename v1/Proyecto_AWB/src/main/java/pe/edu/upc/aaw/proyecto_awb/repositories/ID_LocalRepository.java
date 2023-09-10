package pe.edu.upc.aaw.proyecto_awb.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.upc.aaw.proyecto_awb.entities.D_Local;

@Repository
public interface ID_LocalRepository extends JpaRepository<D_Local,Integer> {
}
