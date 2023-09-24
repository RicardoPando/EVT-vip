package pe.edu.upc.aaw.proyecto_awb.serviceimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.aaw.proyecto_awb.entities.Usuarios_XEvento;
import pe.edu.upc.aaw.proyecto_awb.repositories.IAsistentes_XEventoRepository;
import pe.edu.upc.aaw.proyecto_awb.serviceinterfaces.IAsisntetes_XEventoService;

import java.util.List;

@Service
public class Asistentes_XEventoServiceImplement implements IAsisntetes_XEventoService {
    @Autowired
    private IAsistentes_XEventoRepository aeR;

    @Override
    public void insertar(Usuarios_XEvento s) { aeR.save(s);
    }

    @Override
    public List<Usuarios_XEvento> list() { return aeR.findAll();
    }

    @Override
    public void delete(int id) { aeR.deleteById(id);
    }

    @Override
    public Usuarios_XEvento listID(int id) { return aeR.findById(id).orElse(new Usuarios_XEvento());
    }

}
