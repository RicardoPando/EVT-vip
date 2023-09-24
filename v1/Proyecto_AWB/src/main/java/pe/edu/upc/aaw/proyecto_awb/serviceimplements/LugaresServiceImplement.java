package pe.edu.upc.aaw.proyecto_awb.serviceimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.aaw.proyecto_awb.entities.Locales;
import pe.edu.upc.aaw.proyecto_awb.repositories.ILugaresRepository;
import pe.edu.upc.aaw.proyecto_awb.serviceinterfaces.ILugaresService;

import java.util.List;

@Service
public class LugaresServiceImplement implements ILugaresService {
    @Autowired
    private ILugaresRepository lR;

    @Override
    public void insertar(Locales s) {
         lR.save(s);
    }

    @Override
    public List<Locales> list() {
        return lR.findAll();
    }

    @Override
    public void delete(int id) {
        lR.deleteById(id);
    }

    @Override
    public Locales listID(int id) {
        return lR.findById(id).orElse(new Locales());
    }
}
