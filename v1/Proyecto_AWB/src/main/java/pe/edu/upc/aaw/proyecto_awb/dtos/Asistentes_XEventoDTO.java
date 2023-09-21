package pe.edu.upc.aaw.proyecto_awb.dtos;

import pe.edu.upc.aaw.proyecto_awb.entities.Asistentes;

public class Asistentes_XEventoDTO {
    private int idAsisXEve;
    private Asistentes asistentes;

    public int getIdAsisXEve() {
        return idAsisXEve;
    }

    public void setIdAsisXEve(int idAsisXEve) {
        this.idAsisXEve = idAsisXEve;
    }

    public Asistentes getAsistentes() {
        return asistentes;
    }

    public void setAsistentes(Asistentes asistentes) {
        this.asistentes = asistentes;
    }
}
