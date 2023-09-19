package pe.edu.upc.aww.comentario.serviceinterfaces;

import pe.edu.upc.aww.comentario.entities.Comentario;

import java.util.List;

public interface IComentarioService {

    public void insert(Comentario comentario);
    public List<Comentario> list();
    public void delete(int comentarioId);
    public Comentario listarId(int comentarioId);
}
