package pe.edu.upc.aaw.proyecto_awb.entities;

import javax.persistence.*;

@Entity
@Table(name = "Usuarios_XEventos")
public class Usuarios_XEventos {
    @Id // PK-FK
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idUsuXEve;

    @ManyToOne
    @JoinColumn(name = "id_Evento")
    private Eventos eventos;

    @ManyToOne
    @JoinColumn(name = "id_Usuario")
    private Usuario usuario;

    @Column(name = "descripcion", length = 250)
    private String descripcion;


    public Usuarios_XEventos() {
    }

    public Usuarios_XEventos(int idUsuXEve, Eventos eventos, Usuario usuario, String descripcion) {
        this.idUsuXEve = idUsuXEve;
        this.eventos = eventos;
        this.usuario = usuario;
        this.descripcion = descripcion;
    }

    public int getIdUsuXEve() {
        return idUsuXEve;
    }

    public void setIdUsuXEve(int idUsuXEve) {
        this.idUsuXEve = idUsuXEve;
    }

    public Eventos getEventos() {
        return eventos;
    }

    public void setEventos(Eventos eventos) {
        this.eventos = eventos;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}




