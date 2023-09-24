package pe.edu.upc.aaw.proyecto_awb.entities;

import javax.persistence.*;

@Entity
@Table(name = "Servicios")
public class Servicios {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idServicios;

    @Column(name ="Nombre", length = 250, nullable = false )
    private String nombre;

    @Column(name ="Descripcion", length = 250, nullable = false )
    private String descripcion;

    @Column(name = "costo",nullable = false,scale = 2)
    private double costo;

    @Column(name ="estado", length = 50, nullable = false )
    private String estado;

    public Servicios() {
    }

    public Servicios(int idServicios, String nombre, String descripcion, double costo, String estado) {
        this.idServicios = idServicios;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.costo = costo;
        this.estado = estado;
    }

    public int getIdServicios() {
        return idServicios;
    }

    public void setIdServicios(int idServicios) {
        this.idServicios = idServicios;
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

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}
