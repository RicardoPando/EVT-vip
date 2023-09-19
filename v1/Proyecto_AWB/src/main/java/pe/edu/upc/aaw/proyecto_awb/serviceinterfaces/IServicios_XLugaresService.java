package pe.edu.upc.aaw.proyecto_awb.serviceinterfaces;

import pe.edu.upc.aaw.proyecto_awb.entities.Servicios_XLugares;

import java.util.List;

public interface IServicios_XLugaresService {
    public void insertar(Servicios_XLugares s);
    List<Servicios_XLugares> list();
}
