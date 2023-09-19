package pe.edu.upc.aaw.proyecto_awb.dtos;

import pe.edu.upc.aaw.proyecto_awb.entities.Lugares;
import pe.edu.upc.aaw.proyecto_awb.entities.ServiciosDisponibles;

public class Servicios_XLugaresDTO {
    private int idSerxL;
    private Lugares lugares;
    private ServiciosDisponibles serviciosdisponibles;
    private String Descripcion;

    public int getIdSerxL() {
        return idSerxL;
    }

    public void setIdSerxL(int idSerxL) {
        this.idSerxL = idSerxL;
    }

    public Lugares getLugares() {
        return lugares;
    }

    public void setLugares(Lugares lugares) {
        this.lugares = lugares;
    }

    public ServiciosDisponibles getServiciosdisponibles() {
        return serviciosdisponibles;
    }

    public void setServiciosdisponibles(ServiciosDisponibles serviciosdisponibles) {
        this.serviciosdisponibles = serviciosdisponibles;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String descripcion) {
        Descripcion = descripcion;
    }
}
