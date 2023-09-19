package pe.edu.upc.aaw.proyecto_awb.serviceinterfaces;

import pe.edu.upc.aaw.proyecto_awb.entities.Organizador;

import java.util.List;

public interface IOrganizadorService {
    public void insert(Organizador s);
    public List<Organizador> list();
    public void delete (int id);
    public Organizador ListId(int id);
}
