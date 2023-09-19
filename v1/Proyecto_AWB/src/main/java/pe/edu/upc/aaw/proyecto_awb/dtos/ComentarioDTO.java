package pe.edu.upc.aww.comentario.dtos;

public class ComentarioDTO {

    private int comentarioId;
    private int usuarioId;
    private int eventosId;
    private int valorancion;
    private String contenido;

    public int getComentarioId() {
        return comentarioId;
    }

    public void setComentarioId(int comentarioId) {
        this.comentarioId = comentarioId;
    }

    public int getUsuarioId() {
        return usuarioId;
    }

    public void setUsuarioId(int usuarioId) {
        this.usuarioId = usuarioId;
    }

    public int getEventosId() {
        return eventosId;
    }

    public void setEventosId(int eventosId) {
        this.eventosId = eventosId;
    }

    public int getValorancion() {
        return valorancion;
    }

    public void setValorancion(int valorancion) {
        this.valorancion = valorancion;
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }
}
