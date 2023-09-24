package pe.edu.upc.aaw.proyecto_awb.serviceimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.aaw.proyecto_awb.entities.Usuarios_XEventos;
import pe.edu.upc.aaw.proyecto_awb.repositories.IUsuarios_XEventoRepository;
import pe.edu.upc.aaw.proyecto_awb.serviceinterfaces.IUsuarios_XEventos;


import java.util.List;

@Service
public class Usuarios_XEventosImplement implements IUsuarios_XEventos {

    @Autowired
    private IUsuarios_XEventoRepository ueR;

    @Override
    public void insert(Usuarios_XEventos usuarios_xEventos) {
        ueR.save(usuarios_xEventos);
    }

    @Override
    public List<Usuarios_XEventos> list() {
        return ueR.findAll();
    }
}
