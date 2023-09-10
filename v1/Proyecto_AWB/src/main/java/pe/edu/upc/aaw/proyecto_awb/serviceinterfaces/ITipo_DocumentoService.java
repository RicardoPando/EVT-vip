package pe.edu.upc.aaw.proyecto_awb.serviceinterfaces;


import pe.edu.upc.aaw.proyecto_awb.entities.Tipo_Documento;

import java.util.List;

public interface ITipo_DocumentoService {
    public void insertar(Tipo_Documento s);
    List<Tipo_Documento> list();
    public void delete(int id);
}
