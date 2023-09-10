package pe.edu.upc.aaw.proyecto_awb.serviceimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.aaw.proyecto_awb.entities.D_Local;
import pe.edu.upc.aaw.proyecto_awb.repositories.ID_LocalRepository;
import pe.edu.upc.aaw.proyecto_awb.serviceinterfaces.ID_LocalService;

import java.util.List;

@Service
public class D_LocalServiceImplement implements ID_LocalService {
    @Autowired
    private ID_LocalRepository dlR;

    @Override
    public void insertar(D_Local s) {

    }

    @Override
    public List<D_Local> list() {
        return null;
    }
}
