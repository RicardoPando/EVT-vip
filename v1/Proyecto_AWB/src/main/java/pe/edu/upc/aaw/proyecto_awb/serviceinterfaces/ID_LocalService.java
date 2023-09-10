package pe.edu.upc.aaw.proyecto_awb.serviceinterfaces;

import pe.edu.upc.aaw.proyecto_awb.entities.D_Local;

import java.util.List;

public interface ID_LocalService {
    public void insertar(D_Local s);
    List<D_Local> list();
}
