package pe.edu.upc.aaw.proyecto_awb.serviceimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.aaw.proyecto_awb.entities.TipoComprobante;
import pe.edu.upc.aaw.proyecto_awb.repositories.ITipoComprobanteRepository;
import pe.edu.upc.aaw.proyecto_awb.serviceinterfaces.ITipoComprobanteService;

import java.util.List;
@Service
public class TipoComprobanteServiceImplement implements ITipoComprobanteService {
    @Autowired
    private ITipoComprobanteRepository tcR;

    @Override
    public void insertar(TipoComprobante s) {
        tcR.save(s);
    }

    @Override
    public List<TipoComprobante> list() {
        return tcR.findAll();
    }

    @Override
    public void delete(int id) {
        tcR.deleteById(id);

    }
}
