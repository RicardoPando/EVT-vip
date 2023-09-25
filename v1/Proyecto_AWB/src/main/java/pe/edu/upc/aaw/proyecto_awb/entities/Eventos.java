package pe.edu.upc.aaw.proyecto_awb.entities;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalTime;

@Entity
@Table(name="Eventos")
public class Eventos {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "nombre", length = 100, nullable = false)
    private String nombre;

    @Column(name = "descripcion", length = 255)
    private String descripcion;

    @Column(name = "fecha", nullable = false)
    private LocalDate fecha;

    @Column(name = "hora_inicio")
    private LocalTime hora;

    @Column(name = "hora_fin")
    private LocalTime horafin;


    @Column(name = "capacidad")
    private int capacidad;

    @Column(name = "costo")
    private BigDecimal costo;

    @ManyToOne
    @JoinColumn(name = "lugares_id")
    private Locales locales;

    @ManyToOne
    @JoinColumn(name = "usuario_id")
    private Users users;

    public Eventos() {
    }

    public Eventos(int id, String nombre, String descripcion, LocalDate fecha, LocalTime hora, LocalTime horafin, int capacidad, BigDecimal costo, Locales locales, Users users) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.fecha = fecha;
        this.hora = hora;
        this.horafin = horafin;
        this.capacidad = capacidad;
        this.costo = costo;
        this.locales = locales;
        this.users = users;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public LocalTime getHora() {
        return hora;
    }

    public void setHora(LocalTime hora) {
        this.hora = hora;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public BigDecimal getCosto() {
        return costo;
    }

    public void setCosto(BigDecimal costo) {
        this.costo = costo;
    }

    public Locales getLugares() {
        return locales;
    }

    public void setLugares(Locales locales) {
        this.locales = locales;
    }

    public Locales getLocales() {
        return locales;
    }

    public void setLocales(Locales locales) {
        this.locales = locales;
    }

    public Users getUsers() {
        return users;
    }

    public void setUsers(Users users) {
        this.users = users;
    }

    public LocalTime getHorafin() {
        return horafin;
    }

    public void setHorafin(LocalTime horafin) {
        this.horafin = horafin;
    }
}
