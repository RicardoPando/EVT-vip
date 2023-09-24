package pe.edu.upc.aaw.proyecto_awb.serviceinterfaces;



import org.springframework.beans.factory.annotation.Autowired;
import pe.edu.upc.aaw.proyecto_awb.entities.Usuarios_XEventos;

import java.util.List;

public interface IUsuarios_XEventos  {


    public void insert(Usuarios_XEventos usuarios_xEventos);

    public List<Usuarios_XEventos> list();

}
