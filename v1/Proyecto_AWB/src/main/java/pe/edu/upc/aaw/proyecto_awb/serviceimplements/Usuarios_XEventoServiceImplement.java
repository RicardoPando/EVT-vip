package pe.edu.upc.aaw.proyecto_awb.serviceimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.aaw.proyecto_awb.entities.Usuarios_XEventos;
import pe.edu.upc.aaw.proyecto_awb.repositories.IUsuarios_XEventoRepository;
import pe.edu.upc.aaw.proyecto_awb.serviceinterfaces.Usuarios_XEventoService;

import java.util.List;

@Service
public class Usuarios_XEventoServiceImplement implements Usuarios_XEventoService {
    @Autowired
    private IUsuarios_XEventoRepository aeR;

    @Override
    public void insertar(Usuarios_XEventos s) { aeR.save(s);
    }

    @Override
    public List<Usuarios_XEventos> list() { return aeR.findAll();
    }

    @Override
    public void delete(int id) { aeR.deleteById(id);
    }

    @Override
    public Usuarios_XEventos listID(int id) { return aeR.findById(id).orElse(new Usuarios_XEventos());
    }

}
