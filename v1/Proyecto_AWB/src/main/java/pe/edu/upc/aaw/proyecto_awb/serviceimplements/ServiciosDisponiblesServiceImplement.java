package pe.edu.upc.aaw.proyecto_awb.serviceimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.aaw.proyecto_awb.entities.ServiciosDisponibles;
import pe.edu.upc.aaw.proyecto_awb.repositories.IServiciosDisponiblesRepository;
import pe.edu.upc.aaw.proyecto_awb.serviceinterfaces.IServiciosDispoblesService;

import java.util.List;

@Service
public class ServiciosDisponiblesServiceImplement implements IServiciosDispoblesService {
    @Autowired
    private IServiciosDisponiblesRepository sdR;

    @Override
    public void insert(ServiciosDisponibles s) {
        sdR.save(s);
    }

    @Override
    public List<ServiciosDisponibles> list() {
        return sdR.findAll();
    }

    @Override
    public void delete(int id) {
        sdR.deleteById(id);
    }
}
