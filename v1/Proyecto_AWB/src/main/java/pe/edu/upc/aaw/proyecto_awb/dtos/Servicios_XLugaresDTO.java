package pe.edu.upc.aaw.proyecto_awb.dtos;

import pe.edu.upc.aaw.proyecto_awb.entities.Locales;
import pe.edu.upc.aaw.proyecto_awb.entities.Servicios;

public class Servicios_XLugaresDTO {
    private int idSerxL;
    private Locales lugares;
    private Servicios serviciosdisponibles;
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
