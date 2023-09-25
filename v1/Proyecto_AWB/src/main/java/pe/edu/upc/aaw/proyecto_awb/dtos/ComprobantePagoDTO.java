package pe.edu.upc.aaw.proyecto_awb.dtos;

import pe.edu.upc.aaw.proyecto_awb.entities.Asistentes;
import pe.edu.upc.aaw.proyecto_awb.entities.Detalle;
import pe.edu.upc.aaw.proyecto_awb.entities.TipoComprobante;

import java.math.BigDecimal;
import java.time.LocalDate;

public class ComprobantePagoDTO {

    private int idcomBanPAgo;

    private BigDecimal monto;

    private LocalDate fecha;

    private String metodo;

    private String RUC;
    private BigDecimal igv;

    private Detalle detalle;

    private TipoComprobante tipoComprobante;

    public int getIdcomBanPAgo() {
        return idcomBanPAgo;
    }

    public void setIdcomBanPAgo(int idcomBanPAgo) {
        this.idcomBanPAgo = idcomBanPAgo;
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

    public BigDecimal getIgv() {
        return igv;
    }

    public void setIgv(BigDecimal igv) {
        this.igv = igv;
    }

    public Detalle getDetalle() {
        return detalle;
    }

    public void setDetalle(Detalle detalle) {
        this.detalle = detalle;
    }

    public TipoComprobante getTipoComprobante() {
        return tipoComprobante;
    }

    public void setTipoComprobante(TipoComprobante tipoComprobante) {
        this.tipoComprobante = tipoComprobante;
    }
}
