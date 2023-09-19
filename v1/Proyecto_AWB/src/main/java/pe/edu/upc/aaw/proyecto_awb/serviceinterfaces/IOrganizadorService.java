package pe.edu.upc.aaw.proyecto_awb.serviceinterfaces;

import pe.edu.upc.aaw.proyecto_awb.entities.Organizador;

import java.util.List;

public interface IOrganizadorService {
    public void insertar(Organizador s);
    List<Organizador> list();
}
