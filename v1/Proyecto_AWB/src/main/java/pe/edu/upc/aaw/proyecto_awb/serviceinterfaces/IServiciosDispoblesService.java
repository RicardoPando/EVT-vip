package pe.edu.upc.aaw.proyecto_awb.serviceinterfaces;

import pe.edu.upc.aaw.proyecto_awb.entities.ServiciosDisponibles;

import java.util.List;

public interface IServiciosDispoblesService {
    public void insert(ServiciosDisponibles s);
    List<ServiciosDisponibles>list();
    public void delete(int id);

}
