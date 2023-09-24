package pe.edu.upc.aaw.proyecto_awb.serviceinterfaces;

import pe.edu.upc.aaw.proyecto_awb.entities.Detalles;

import java.util.List;

public interface IDetallesService {
    public void insertar(Detalles s);
    List<Detalles> list();

    public void delete(int id);

    public Detalles listID(int id);
}
