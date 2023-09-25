package pe.edu.upc.aaw.proyecto_awb.dtos;

import pe.edu.upc.aaw.proyecto_awb.entities.Eventos;
import pe.edu.upc.aaw.proyecto_awb.entities.Usuario;

public class ComentarioDTO {

    private int idComentario;
    private Usuario usuario;
    private Eventos eventos;
    private int Valoracion;
    private String Contenido;

    public int getIdComentario() {
        return idComentario;
    }

    public void setIdComentario(int idComentario) {
        this.idComentario = idComentario;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Eventos getEventos() {
        return eventos;
    }

    public void setEventos(Eventos eventos) {
        this.eventos = eventos;
    }

    public int getValoracion() {
        return Valoracion;
    }

    public void setValoracion(int valoracion) {
        Valoracion = valoracion;
    }

    public String getContenido() {
        return Contenido;
    }

    public void setContenido(String contenido) {
        Contenido = contenido;
    }
}
