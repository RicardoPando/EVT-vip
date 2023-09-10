package pe.edu.upc.aaw.proyecto_awb.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.upc.aaw.proyecto_awb.entities.Organizador;
@Repository
public interface IOrganizadorRepository extends JpaRepository<Organizador, Integer> {


}


