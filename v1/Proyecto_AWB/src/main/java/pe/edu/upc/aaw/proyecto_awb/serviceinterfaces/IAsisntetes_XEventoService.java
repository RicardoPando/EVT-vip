package pe.edu.upc.aaw.proyecto_awb.serviceinterfaces;

import pe.edu.upc.aaw.proyecto_awb.entities.Asistentes_XEvento;

import java.util.List;

public interface IAsisntetes_XEventoService {
    public void insertar(Asistentes_XEvento s);
    List<Asistentes_XEvento>list();
}
