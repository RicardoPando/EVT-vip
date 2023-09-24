package pe.edu.upc.aaw.proyecto_awb.dtos;

import pe.edu.upc.aaw.proyecto_awb.entities.Locales;
import pe.edu.upc.aaw.proyecto_awb.entities.ServiciosDisponibles;

public class Servicios_XLugaresDTO {
    private int idSerxL;
    private Locales lugares;
    private ServiciosDisponibles serviciosdisponibles;
    private String Descripcion;

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
