package pe.edu.upc.aaw.proyecto_awb.serviceimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.aaw.proyecto_awb.entities.Asistentes;
import pe.edu.upc.aaw.proyecto_awb.repositories.IAsitentesRepository;
import pe.edu.upc.aaw.proyecto_awb.serviceinterfaces.IAsistentesService;

import java.util.List;

@Service
public class AsistentesServiceImplement implements IAsistentesService {
    @Autowired
    private IAsitentesRepository aR;

    @Override
    public void insertar(Asistentes s) {

    }
    @Override
    public List<Asistentes> list() {
        return null;
    }

    public void delete(int id) {
        aR.deleteById(id);
    }

}
