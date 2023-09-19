package pe.edu.upc.aaw.proyecto_awb.dtos;

import pe.edu.upc.aaw.proyecto_awb.entities.Lugares;
import pe.edu.upc.aaw.proyecto_awb.entities.Organizador;

import javax.persistence.Column;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalTime;

public class EventosDTO {
    private int id;
    private String nombre;
    private String descripcion;
    private LocalDate fecha;
    private LocalTime hora;
    private int capacidad;
    private BigDecimal costo;
    private Organizador organizador;
    private Lugares lugares;

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

    public Organizador getOrganizador() {
        return organizador;
    }

    public void setOrganizador(Organizador organizador) {
        this.organizador = organizador;
    }

    public Lugares getLugares() {
        return lugares;
    }

    public void setLugares(Lugares lugares) {
        this.lugares = lugares;
    }
}
