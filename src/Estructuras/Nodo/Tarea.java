package Estructuras.Nodo;
import java.time.LocalDate;
import static Estructuras.Nodo.EstadoTarea.*;

public class Tarea {

    private String detalle;
    private final LocalDate fechaLimite;
    private final LocalDate fechaRecordatorio;
    private LocalDate fechaDeFinalizacion;
    private String colaborador;
    private String prioridad;
    private EstadoTarea estado;

    public Tarea(String tarea,LocalDate fecha, boolean prioridad){
        this.detalle = tarea;
        this.fechaLimite = fecha;
        if (prioridad){
            this.prioridad = "alta";
        } else {
            this.prioridad = "baja";
        }
        this.estado = EstadoTarea.INCOMPLETA;
        this.fechaRecordatorio = fecha.minusDays(5); 
        this.colaborador = "";
    }
    
    public Tarea(String tarea,LocalDate fecha, LocalDate fechaRecordatorio, boolean prioridad){
        this.detalle = tarea;
        this.fechaLimite = fecha;
        if (prioridad){
            this.prioridad = "alta";
        } else {
            this.prioridad = "baja";
        }
        this.estado = EstadoTarea.INCOMPLETA;
        this.fechaRecordatorio = fechaRecordatorio; 
    }

    public void cambiarDetalle(String detalle) {
        this.detalle = detalle;
    }

    public void cambiarPrioridad(boolean prioridad){
        if (prioridad || estaPorVencer()) {
            this.prioridad = "alta";
        } else {
            this.prioridad = "baja";
        }
    }

    public boolean estaVencida(){
        LocalDate hoy = LocalDate.now();
        return ((this.estado == INCOMPLETA) && (hoy.isAfter(this.fechaLimite)));
    }
    
    private boolean estaPorVencer(){
        LocalDate hoy = LocalDate.now();
        if (((hoy.isEqual(this.fechaRecordatorio)) || (hoy.isAfter(this.fechaRecordatorio)))){
            this.prioridad = "alta";
            return true;
        } else {
            return false;
        }
    }

    public void tareaTerminada(String colaborador,LocalDate fechaDeFinalizacion){
        this.colaborador = colaborador;
        this.fechaDeFinalizacion = fechaDeFinalizacion;
        this.estado = COMPLETA;
    }

    public String mostrarTarea(){
        if (this.estado == COMPLETA){
            return ("(Completa) " + this.detalle + ", se realizó por : " + this.colaborador + ", y fue realizada la fecha: " + this.fechaDeFinalizacion);
        } else if (estaVencida()) {
            return ("(Vencida)" + this.detalle + ", Limite de fecha: " + this.fechaLimite);
        } else if (estaPorVencer()){
            return ("(Por vencer)" + this.detalle + ", Limite de fecha: " + this.fechaLimite);
        } else {
            return (this.detalle + ", Limite de fecha: " + this.fechaLimite);
        }
    }
    
    
    public String getDetalle(){
        return this.detalle;
    }

    
    public String getPrioridad(){
        if (estaPorVencer()){
            return this.prioridad;
        } else {
            return this.prioridad;
        }
    }
    
    public LocalDate getFechaLimite(){
        return this.fechaLimite;
    }

    public String getColaborador() {
        return colaborador;
    }

    public EstadoTarea getEstado() {
        return estado;
    }
}
