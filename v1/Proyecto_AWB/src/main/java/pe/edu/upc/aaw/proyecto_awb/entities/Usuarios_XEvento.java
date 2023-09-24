package pe.edu.upc.aaw.proyecto_awb.entities;

import javax.persistence.*;

@Entity
@Table(name = "Asistentes_XEvento")
public class Usuarios_XEvento {
    @Id // PK-FK
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idAsisXEve;

    @ManyToOne
    @JoinColumn(name = "asistentes_id")
    private Asistentes asistentes;



    @ManyToOne
    @JoinColumn(name = "eventos_id")
    private Eventos eventos;

    public Usuarios_XEvento() {
    }

    public Usuarios_XEvento(Asistentes asistentes, Eventos eventos) {
        this.asistentes = asistentes;
        this.eventos = eventos;
    }

    public Asistentes getAsistentes() {
        return asistentes;
    }

    public void setAsistentes(Asistentes asistentes) {
        this.asistentes = asistentes;
    }

    public Eventos getEventos() {
        return eventos;
    }

    public void setEventos(Eventos eventos) {
        this.eventos = eventos;
    }
}
