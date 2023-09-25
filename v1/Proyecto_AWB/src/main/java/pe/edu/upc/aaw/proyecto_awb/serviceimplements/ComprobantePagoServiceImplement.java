package pe.edu.upc.aaw.proyecto_awb.serviceimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.aaw.proyecto_awb.entities.ComprobantePago;
import pe.edu.upc.aaw.proyecto_awb.repositories.IComprobantePagoRepository;
import pe.edu.upc.aaw.proyecto_awb.serviceinterfaces.IComprobantePagoService;

import java.util.List;

@Service
public class ComprobantePagoServiceImplement implements IComprobantePagoService {
    @Autowired
    private IComprobantePagoRepository cpR;

    @Override
    public void insertar(ComprobantePago s) {cpR.save(s);

    }
    @Override
    public List<ComprobantePago> list() {return cpR.findAll();
    }

    @Override
    public void delete(int id) { cpR.deleteById(id);
    }

    @Override
    public ComprobantePago listID(int id) { return cpR.findById(id).orElse(new ComprobantePago());
    }
}
