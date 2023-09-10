package pe.edu.upc.aaw.proyecto_awb.serviceinterfaces;

import pe.edu.upc.aaw.proyecto_awb.entities.Comentario;

import java.util.List;

public interface IComentarioService {
    public void insertar(Comentario s);
    List<Comentario> list();
}
