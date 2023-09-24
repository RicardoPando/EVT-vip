package pe.edu.upc.aaw.proyecto_awb.entities;

import javax.persistence.*;

@Entity
@Table(name = "Servicios_XLocales")
public class Servicios_XLocales {
    @Id // PK-FK
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idSerxL;
    @ManyToOne
    @JoinColumn(name = "locales_id")
    private Locales locales;


    @ManyToOne
    @JoinColumn(name = "servicios_id")
    private Servicios serviciosdisponibles;

    @Column(name = "Descripcion", length = 250, nullable = false)
    private String Descripcion;

    public Servicios_XLocales() {
    }

    public Servicios_XLocales(int idSerxL, Locales locales, Servicios serviciosdisponibles, String descripcion) {
        this.idSerxL = idSerxL;
        this.locales = locales;
        this.serviciosdisponibles = serviciosdisponibles;
        Descripcion = descripcion;
    }

    public int getIdSerxL() {
        return idSerxL;
    }

    public void setIdSerxL(int idSerxL) {
        this.idSerxL = idSerxL;
    }

    public Locales getLocales() {
        return locales;
    }

    public void setLocales(Locales locales) {
        this.locales = locales;
    }

    public Servicios getServiciosdisponibles() {
        return serviciosdisponibles;
    }

    public void setServiciosdisponibles(Servicios serviciosdisponibles) {
        this.serviciosdisponibles = serviciosdisponibles;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String descripcion) {
        Descripcion = descripcion;
    }
}
