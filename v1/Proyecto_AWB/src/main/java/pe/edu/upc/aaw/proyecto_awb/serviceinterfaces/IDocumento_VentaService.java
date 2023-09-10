package pe.edu.upc.aaw.proyecto_awb.serviceinterfaces;

import pe.edu.upc.aaw.proyecto_awb.entities.Documento_Venta;

import java.util.List;

public interface IDocumento_VentaService {
    public void insertar(Documento_Venta s);
    List<Documento_Venta> list();
}
