package pe.edu.upc.aaw.proyecto_awb.entities;

import javax.persistence.*;

@Entity
@Table(name="Locales")
public class Locales {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name ="Nombre", length = 250, nullable = false )
    private String Nombre;

    @Column(name ="Direccion", length = 250, nullable = false )
    private String Direccion;

    @Column(name ="Capacidad", length = 250, nullable = false )
    private String Capacidad;

    public Locales() {
    }

    public Locales(int id, String nombre, String direccion, String capacidad) {
        this.id = id;
        Nombre = nombre;
        Direccion = direccion;
        Capacidad = capacidad;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String direccion) {
        Direccion = direccion;
    }

    public String getCapacidad() {
        return Capacidad;
    }

    public void setCapacidad(String capacidad) {
        Capacidad = capacidad;
    }

}
