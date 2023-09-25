package pe.edu.upc.aaw.proyecto_awb.serviceimplements;

import org.springframework.stereotype.Service;
import pe.edu.upc.aaw.proyecto_awb.entities.Detalle;
import pe.edu.upc.aaw.proyecto_awb.repositories.IDetallesRepository;
import pe.edu.upc.aaw.proyecto_awb.serviceinterfaces.IDetallesService;

import java.util.List;

@Service
public class DetallesServiceImplement implements IDetallesService {
    private IDetallesRepository dR;

    @Override
    public void insertar(Detalle s) {dR.save(s);
    }

    @Override
    public List<Detalle> list() {
        return dR.findAll();
    }

    @Override
    public void delete(int id) { dR.deleteById(id);
    }

    @Override
    public Detalle listID(int id) { return dR.findById(id).orElse(new Detalle());
    }

}