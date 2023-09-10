package pe.edu.upc.aaw.proyecto_awb.serviceimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.aaw.proyecto_awb.entities.Documento_Venta;
import pe.edu.upc.aaw.proyecto_awb.repositories.IDocumento_VentaRepository;
import pe.edu.upc.aaw.proyecto_awb.serviceinterfaces.IDocumento_VentaService;

import java.util.List;

@Service
public class Documento_VentaServiceImplement implements IDocumento_VentaService {
    @Autowired
    private IDocumento_VentaRepository dvR;

    @Override
    public void insertar(Documento_Venta s) {

    }

    @Override
    public List<Documento_Venta> list() {
        return null;
    }
}
