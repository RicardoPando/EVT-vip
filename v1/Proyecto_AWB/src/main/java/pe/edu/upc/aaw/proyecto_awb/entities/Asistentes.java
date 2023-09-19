package pe.edu.upc.aaw.proyecto_awb.entities;


import javax.persistence.*;

@Entity
@Table(name = "Asistentes")
public class Asistentes {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne
    @JoinColumn(name = "usuario_id")
    private Usuario usuario;

    public Asistentes() {
    }

    public Asistentes(int id, Usuario usuario) {
        this.id = id;
        this.usuario = usuario;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
}
