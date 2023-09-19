package pe.edu.upc.aaw.proyecto_awb.serviceinterfaces;

import pe.edu.upc.aaw.proyecto_awb.entities.Comentario;

import java.util.List;

public interface IComentarioService {

    public void insert(Comentario comentario);
    public List<Comentario> list();
    public void delete(int comentarioId);
    public Comentario listarId(int comentarioId);
}
