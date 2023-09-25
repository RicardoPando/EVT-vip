package pe.edu.upc.aaw.proyecto_awb.serviceimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.aaw.proyecto_awb.entities.Comentario;
import pe.edu.upc.aaw.proyecto_awb.repositories.IComentarioRepository;
import pe.edu.upc.aaw.proyecto_awb.serviceinterfaces.IComentariosService;

import java.util.List;

@Service
public class ComentarioServiceImplement implements IComentariosService {

    @Autowired
    private IComentarioRepository cR;

    @Override
    public void insert(Comentario comentario) { cR.save(comentario);

    }

    @Override
    public List<Comentario> list() {
        return cR.findAll();
    }

    @Override
    public void delete(int comentarioId) {cR.deleteById(comentarioId);

    }

    @Override
    public Comentario listarId(int comentarioId) {
        return cR.findById(comentarioId).orElse(new Comentario());
    }
}
