package pe.edu.upc.aaw.proyecto_awb.dtos;

import pe.edu.upc.aaw.proyecto_awb.entities.Asistentes;
import pe.edu.upc.aaw.proyecto_awb.entities.Usuario;

public class Usuarios_XEventoDTO {
    private int idUsuXEve;
    private Usuario usuario;
    private Asistentes asistentes;
    private String descripcion;

    public int getIdUsuXEve() {
        return idUsuXEve;
    }

    public void setIdUsuXEve(int idUsuXEve) {
        this.idUsuXEve = idUsuXEve;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Asistentes getAsistentes() {
        return asistentes;
    }

    public void setAsistentes(Asistentes asistentes) {
        this.asistentes = asistentes;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
