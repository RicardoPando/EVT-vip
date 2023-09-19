package pe.edu.upc.aaw.proyecto_awb.serviceimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.aaw.proyecto_awb.entities.Tipo_Documento;
import pe.edu.upc.aaw.proyecto_awb.repositories.ITipo_DocumentoRepository;
import pe.edu.upc.aaw.proyecto_awb.serviceinterfaces.ITipo_DocumentoService;

import java.util.List;
@Service
public class Tipo_DocumentoServiceImplement implements ITipo_DocumentoService {
    @Autowired
    private ITipo_DocumentoRepository tcR;

    @Override
    public void insertar(Tipo_Documento s) {
        tcR.save(s);
    }

    @Override
    public List<Tipo_Documento> list() {
        return tcR.findAll();
    }

    @Override
    public void delete(int id) {
        tcR.deleteById(id);

    }
}
