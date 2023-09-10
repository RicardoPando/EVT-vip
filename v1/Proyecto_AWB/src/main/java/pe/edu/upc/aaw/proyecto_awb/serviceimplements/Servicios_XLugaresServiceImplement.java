package pe.edu.upc.aaw.proyecto_awb.serviceimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.aaw.proyecto_awb.entities.Servicios_XLugares;
import pe.edu.upc.aaw.proyecto_awb.repositories.IServicios_XLugaresRepository;
import pe.edu.upc.aaw.proyecto_awb.serviceinterfaces.IServicios_XLugaresService;

import java.util.List;
@Service
public class Servicios_XLugaresServiceImplement implements IServicios_XLugaresService {
    @Autowired
    private IServicios_XLugaresRepository slR;

    @Override
    public void insertar(Servicios_XLugares s) {

    }

    @Override
    public List<Servicios_XLugares> list() {
        return null;
    }
}
