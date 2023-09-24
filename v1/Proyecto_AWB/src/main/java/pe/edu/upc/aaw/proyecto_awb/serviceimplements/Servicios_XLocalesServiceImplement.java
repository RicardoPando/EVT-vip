package pe.edu.upc.aaw.proyecto_awb.serviceimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.aaw.proyecto_awb.entities.Servicios_XLocales;
import pe.edu.upc.aaw.proyecto_awb.repositories.IServicios_XLugaresRepository;
import pe.edu.upc.aaw.proyecto_awb.serviceinterfaces.IServicios_XLocalesService;

import java.util.List;
@Service
public class Servicios_XLocalesServiceImplement implements IServicios_XLocalesService {
    @Autowired
    private IServicios_XLugaresRepository slR;

    @Override
    public void insertar(Servicios_XLocales s) {

    }

    @Override
    public List<Servicios_XLocales> list() {
        return null;
    }
}
