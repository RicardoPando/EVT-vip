package pe.edu.upc.aaw.proyecto_awb.serviceimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.aaw.proyecto_awb.entities.Eventos;
import pe.edu.upc.aaw.proyecto_awb.repositories.IEventosRepository;
import pe.edu.upc.aaw.proyecto_awb.serviceinterfaces.IEventosService;

import java.util.List;

@Service
public class EventosServiceImplement implements IEventosService {
    @Autowired
    private IEventosRepository eR;

    @Override
    public void insertar(Eventos s) {

    }

    @Override
    public List<Eventos> list() {
        return null;
    }

    @Override
    public List<String[]> comentByPerson() {
        return eR.comentByPerson();
    }
}
