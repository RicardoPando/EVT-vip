package pe.edu.upc.aaw.proyecto_awb.serviceimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.aaw.proyecto_awb.entities.Organizador;
import pe.edu.upc.aaw.proyecto_awb.repositories.IOrganizadorRepository;
import pe.edu.upc.aaw.proyecto_awb.serviceinterfaces.IOrganizadorService;

import java.util.List;

@Service
public class OrganizadorServiceImplement implements IOrganizadorService {
    @Autowired
    private IOrganizadorRepository oR;

    @Override
    public void insertar(Organizador s) {

    }

    @Override
    public List<Organizador> list() {
        return null;
    }
}
