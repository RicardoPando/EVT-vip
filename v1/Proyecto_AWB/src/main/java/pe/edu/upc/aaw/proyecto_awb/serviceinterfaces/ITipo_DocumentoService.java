package pe.edu.upc.aaw.proyecto_awb.serviceinterfaces;


import pe.edu.upc.aaw.proyecto_awb.entities.TipoComprobante;

import java.util.List;

public interface ITipo_DocumentoService {
    public void insertar(TipoComprobante s);
    List<TipoComprobante> list();
    public void delete(int id);
}
