package pe.edu.upc.aaw.proyecto_awb.entities;

import javax.persistence.*;

@Entity
@Table(name = "Asistentes_XEvento")
public class Usuarios_XEvento {
    @Id // PK-FK
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idUsuXEve;

    @ManyToOne
    @JoinColumn(name = "asistentes_id")
    private Usuario usuario;

    @ManyToOne
    @JoinColumn(name = "eventos_id")
    private Eventos eventos;

    @Column(name = "descripcion", length=400, nullable = false)
    private String descripcion;

    public Usuarios_XEvento() {
    }

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

    public Eventos getEventos() {
        return eventos;
    }

    public void setEventos(Eventos eventos) {
        this.eventos = eventos;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
