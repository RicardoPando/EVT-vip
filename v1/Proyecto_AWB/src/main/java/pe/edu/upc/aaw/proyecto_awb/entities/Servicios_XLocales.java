package pe.edu.upc.aaw.proyecto_awb.entities;

import javax.persistence.*;

@Entity
@Table(name = "Servicios_XLocales")
public class Servicios_XLocales {
    @Id // PK-FK
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idSerxL;
    @ManyToOne
    @JoinColumn(name = "lugares_id")
    private Locales lugares;

    @ManyToOne
    @JoinColumn(name = "servicios_id")
    private Servicios servicios;

    @Column(name = "Descripcion", length = 250, nullable = false)
    private String Descripcion;

    public Servicios_XLocales() {
    }

    public Servicios_XLocales(int idSerxL, Locales lugares, Servicios servicios, String descripcion) {
        this.idSerxL = idSerxL;
        this.lugares = lugares;
        this.servicios = servicios;
        Descripcion = descripcion;
    }

    public int getIdSerxL() {
        return idSerxL;
    }

    public void setIdSerxL(int idSerxL) {
        this.idSerxL = idSerxL;
    }

    public Locales getLugares() {
        return lugares;
    }

    public void setLugares(Locales lugares) {
        this.lugares = lugares;
    }

    public Servicios getServicios() {
        return servicios;
    }

    public void setServicios(Servicios servicios) {
        this.servicios = servicios;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String descripcion) {
        Descripcion = descripcion;
    }
}
