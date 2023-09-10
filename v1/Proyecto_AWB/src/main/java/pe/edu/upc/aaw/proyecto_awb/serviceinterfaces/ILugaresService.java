package pe.edu.upc.aaw.proyecto_awb.serviceinterfaces;

import pe.edu.upc.aaw.proyecto_awb.entities.Lugares;

import java.util.List;

public interface ILugaresService {
    public void insertar(Lugares s);
    List<Lugares> list();
}
