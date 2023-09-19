package pe.edu.upc.aaw.proyecto_awb.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.upc.aaw.proyecto_awb.entities.Servicios_XLugares;

@Repository
public interface IServicios_XLugaresRepository extends JpaRepository<Servicios_XLugares,Integer> {
}
