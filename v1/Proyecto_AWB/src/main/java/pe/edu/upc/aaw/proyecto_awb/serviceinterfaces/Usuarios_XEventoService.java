package pe.edu.upc.aaw.proyecto_awb.serviceinterfaces;

import pe.edu.upc.aaw.proyecto_awb.entities.Usuarios_XEventos;

import java.util.List;

public interface Usuarios_XEventoService {
    public void insertar(Usuarios_XEventos usuarios_xEventos);
    List<Usuarios_XEventos>list();
    public void delete(int id);
    public Usuarios_XEventos listID(int id);
}
