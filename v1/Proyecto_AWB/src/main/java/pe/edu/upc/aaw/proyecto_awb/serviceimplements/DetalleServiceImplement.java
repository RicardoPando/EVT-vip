package pe.edu.upc.aaw.proyecto_awb.serviceimplements;

import org.springframework.stereotype.Service;
import pe.edu.upc.aaw.proyecto_awb.entities.Detalle;
import pe.edu.upc.aaw.proyecto_awb.repositories.IDetalleRepository;
import pe.edu.upc.aaw.proyecto_awb.serviceinterfaces.IDetalleService;

import java.util.List;

@Service
public class DetalleServiceImplement implements IDetalleService {
    private IDetalleRepository dR;

    @Override
    public void insertar(Detalle s) {

    }

    @Override
    public List<Detalle> list() {
        return null;
    }
}
