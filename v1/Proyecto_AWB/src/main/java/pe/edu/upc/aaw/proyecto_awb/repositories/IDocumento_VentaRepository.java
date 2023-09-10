package pe.edu.upc.aaw.proyecto_awb.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.upc.aaw.proyecto_awb.entities.Documento_Venta;

@Repository
public interface IDocumento_VentaRepository extends JpaRepository<Documento_Venta,Integer> {
}
