package pe.edu.upc.aww.comentario.serviceimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.aww.comentario.entities.Comentario;
import pe.edu.upc.aww.comentario.repositories.IComentarioRepository;
import pe.edu.upc.aww.comentario.serviceinterfaces.IComentarioService;

import java.util.List;

@Service
public class ComentarioServiceImplement implements IComentarioService {

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
