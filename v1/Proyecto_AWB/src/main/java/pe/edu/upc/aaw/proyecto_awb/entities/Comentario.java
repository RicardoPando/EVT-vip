package pe.edu.upc.aaw.proyecto_awb.entities;

import javax.persistence.*;

@Entity
@Table(name = "Comentario")
public class Comentario {

    @Id // PK-FK
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idComentario;
    @ManyToOne
    @JoinColumn(name = "usuario_id")
    private Usuario usuario;

    // PK-FK
    @ManyToOne
    @JoinColumn(name = "eventos_id")
    private Eventos eventos;

    @Column(name = "Valoracion", length = 5, nullable = false)
    private int Valoracion;

    @Column(name = "Contenido", length = 50, nullable = false)
    private String Contenido;

    public Comentario() {
    }

    public Comentario(int idComentario, Usuario usuario, Eventos eventos, int valoracion, String contenido) {
        this.idComentario = idComentario;
        this.usuario = usuario;
        this.eventos = eventos;
        Valoracion = valoracion;
        Contenido = contenido;
    }

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
