package pe.edu.upc.aaw.proyecto_awb.serviceinterfaces;

import pe.edu.upc.aaw.proyecto_awb.entities.Servicios;

import java.util.List;

public interface IServiciosDispoblesService {
    public void insert(Servicios s);
    List<Servicios>list();
    public void delete(int id);

}
