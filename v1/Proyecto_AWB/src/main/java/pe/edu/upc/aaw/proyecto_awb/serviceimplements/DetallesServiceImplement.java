package pe.edu.upc.aaw.proyecto_awb.serviceimplements;

import org.springframework.stereotype.Service;
import pe.edu.upc.aaw.proyecto_awb.entities.Detalles;
import pe.edu.upc.aaw.proyecto_awb.repositories.IDetallesRepository;
import pe.edu.upc.aaw.proyecto_awb.serviceinterfaces.IDetallesService;

import java.util.List;

@Service
public class DetallesServiceImplement implements IDetallesService {
    private IDetallesRepository dR;

    @Override
    public void insertar(Detalles s) {dR.save(s);
    }

    @Override
    public List<Detalles> list() {
        return dR.findAll();
    }

    @Override
    public void delete(int id) { dR.deleteById(id);
    }

    @Override
    public Detalles listID(int id) { return dR.findById(id).orElse(new Detalles());
    }

}