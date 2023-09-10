package pe.edu.upc.aaw.proyecto_awb.serviceimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.aaw.proyecto_awb.entities.Asistentes_XEvento;
import pe.edu.upc.aaw.proyecto_awb.repositories.IAsistentes_XEventoRepository;
import pe.edu.upc.aaw.proyecto_awb.serviceinterfaces.IAsisntetes_XEventoService;

import java.util.List;

@Service
public class Asistentes_XEventoServiceImplement implements IAsisntetes_XEventoService {
    @Autowired
    private IAsistentes_XEventoRepository aeR;

    @Override
    public void insertar(Asistentes_XEvento s) {

    }

    @Override
    public List<Asistentes_XEvento> list() {
        return null;
    }
}
