package pe.edu.upc.aaw.proyecto_awb.serviceinterfaces;

import pe.edu.upc.aaw.proyecto_awb.entities.Usuario;

import java.util.List;

public interface IUserService {
    public void insert(Usuario usuario);
    public List<Usuario> list();
    public void delete (int id);
    public Usuario listID(int id);
}
