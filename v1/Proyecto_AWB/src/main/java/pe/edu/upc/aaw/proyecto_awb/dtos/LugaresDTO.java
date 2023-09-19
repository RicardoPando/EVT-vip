package pe.edu.upc.aaw.proyecto_awb.dtos;

import pe.edu.upc.aaw.proyecto_awb.entities.D_Local;

public class LugaresDTO {
    private int id;
    private String Nombre;
    private String Direccion;
    private String Capacidad;
    private D_Local d_local;


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

    public D_Local getD_local() {
        return d_local;
    }

    public void setD_local(D_Local d_local) {
        this.d_local = d_local;
    }
}
