package pe.edu.upc.aaw.proyecto_awb.serviceinterfaces;

import pe.edu.upc.aaw.proyecto_awb.entities.Usuarios_XEvento;

import java.util.List;

public interface Usuarios_XEventoService {
    public void insertar(Usuarios_XEvento s);
    List<Usuarios_XEvento>list();
    public void delete(int id);

    public Usuarios_XEvento listID(int id);
}
