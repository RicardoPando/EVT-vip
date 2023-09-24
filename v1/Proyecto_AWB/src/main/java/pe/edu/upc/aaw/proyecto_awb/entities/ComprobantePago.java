package pe.edu.upc.aaw.proyecto_awb.entities;

import javax.persistence.*;

import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Table(name = "ComprobantePago")
public class ComprobantePago {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "monto")
    private BigDecimal monto;

    @Column(name = "fecha", nullable = false)
    private LocalDate fecha;

    @Column(name ="metodo", length = 50, nullable = false )
    private String metodo;

    @Column(name ="RUC", length = 10, nullable = false )
    private String RUC;

    @ManyToOne
    @JoinColumn(name = "asistentes_id")
    private Asistentes asistentes;

    @ManyToOne
    @JoinColumn(name = "detalle_id")
    private Detalle detalle;

    @ManyToOne
    @JoinColumn(name = "Tipo_Documento_id")
    private TipoComprobante tipoComprobante;


    public ComprobantePago() {
    }

    public ComprobantePago(int id, BigDecimal monto, LocalDate fecha, String metodo, String RUC, Asistentes asistentes, Detalle detalle, TipoComprobante tipoComprobante) {
        this.id = id;
        this.monto = monto;
        this.fecha = fecha;
        this.metodo = metodo;
        this.RUC = RUC;
        this.asistentes = asistentes;
        this.detalle = detalle;
        this.tipoComprobante = tipoComprobante;
    }

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

    public TipoComprobante getTipo_comprobante() {
        return tipoComprobante;
    }

    public void setTipo_comprobante(TipoComprobante tipoComprobante) {
        this.tipoComprobante = tipoComprobante;
    }
}
