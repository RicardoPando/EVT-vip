package pe.edu.upc.aaw.proyecto_awb.serviceinterfaces;

import pe.edu.upc.aaw.proyecto_awb.entities.Eventos;

import java.util.List;

public interface IEventosService {
    public void insertar(Eventos eventos);
    public List<Eventos> list();
    public void delete(int id);
    public Eventos ListId(int id);


}
