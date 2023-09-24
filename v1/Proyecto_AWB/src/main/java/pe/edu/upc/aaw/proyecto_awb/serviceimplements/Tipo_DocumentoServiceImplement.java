package pe.edu.upc.aaw.proyecto_awb.serviceimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.aaw.proyecto_awb.entities.TipoComprobante;
import pe.edu.upc.aaw.proyecto_awb.repositories.ITipo_DocumentoRepository;
import pe.edu.upc.aaw.proyecto_awb.serviceinterfaces.ITipo_DocumentoService;

import java.util.List;
@Service
public class Tipo_DocumentoServiceImplement implements ITipo_DocumentoService {
    @Autowired
    private ITipo_DocumentoRepository tcR;

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
