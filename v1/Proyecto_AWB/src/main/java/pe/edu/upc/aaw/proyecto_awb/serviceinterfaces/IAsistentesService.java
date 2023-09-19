package pe.edu.upc.aaw.proyecto_awb.serviceinterfaces;

import pe.edu.upc.aaw.proyecto_awb.entities.Asistentes;


import java.util.List;

public interface IAsistentesService {
    public void insertar(Asistentes s);
    List<Asistentes> list();
}
