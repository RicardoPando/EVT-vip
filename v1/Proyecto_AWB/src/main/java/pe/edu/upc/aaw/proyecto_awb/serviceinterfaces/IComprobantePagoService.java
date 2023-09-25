package pe.edu.upc.aaw.proyecto_awb.serviceinterfaces;

import pe.edu.upc.aaw.proyecto_awb.entities.ComprobantePago;
import pe.edu.upc.aaw.proyecto_awb.entities.Eventos;
import pe.edu.upc.aaw.proyecto_awb.entities.Usuarios_XEventos;

import java.util.List;

public interface IComprobantePagoService {
    public void insertar(ComprobantePago comprobantePago);
    List<ComprobantePago> list();
    public void delete(int id);
    public ComprobantePago listID(int id);
}
