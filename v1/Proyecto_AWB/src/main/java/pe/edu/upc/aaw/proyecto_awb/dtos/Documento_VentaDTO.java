package pe.edu.upc.aaw.proyecto_awb.dtos;

import pe.edu.upc.aaw.proyecto_awb.entities.Asistentes;
import pe.edu.upc.aaw.proyecto_awb.entities.Detalle;
import pe.edu.upc.aaw.proyecto_awb.entities.Tipo_Documento;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;

public class Documento_VentaDTO {

    private int id;

    private BigDecimal monto;

    private LocalDate fecha;

    private String metodo;

    private String RUC;

    private Asistentes asistentes;

    private Detalle detalle;

    private Tipo_Documento tipo_documento;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public BigDecimal getMonto() {
        return monto;
    }

    public void setMonto(BigDecimal monto) {
        this.monto = monto;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public String getMetodo() {
        return metodo;
    }

    public void setMetodo(String metodo) {
        this.metodo = metodo;
    }

    public String getRUC() {
        return RUC;
    }

    public void setRUC(String RUC) {
        this.RUC = RUC;
    }

    public Asistentes getAsistentes() {
        return asistentes;
    }

    public void setAsistentes(Asistentes asistentes) {
        this.asistentes = asistentes;
    }

    public Detalle getDetalle() {
        return detalle;
    }

    public void setDetalle(Detalle detalle) {
        this.detalle = detalle;
    }

    public Tipo_Documento getTipo_documento() {
        return tipo_documento;
    }

    public void setTipo_documento(Tipo_Documento tipo_documento) {
        this.tipo_documento = tipo_documento;
    }
}
