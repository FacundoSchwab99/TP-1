package Estructuras;

import Estructuras.Nodo.EstadoTarea;
import Estructuras.Nodo.Tarea;

import java.time.LocalDate;

public class ListaTareas {
    private final Tarea[] tareas;
    private int cantTareas;

    public ListaTareas(){
        tareas = new Tarea[100];
        cantTareas = 0;
    }

    public void agregarTarea(String detalle, String fecha,boolean prioridad){
        LocalDate fecha1 = formateoFecha(fecha);
        Tarea tarea = new Tarea(detalle,fecha1,prioridad);
        tareas[cantTareas] = tarea;
        cantTareas++;
    }

    public void agregarTarea(String detalle, String fecha,String fechaRecordatorio,boolean prioridad){
        LocalDate fecha1 = formateoFecha(fecha);
        LocalDate fechaR = formateoFecha(fechaRecordatorio);
        Tarea tarea = new Tarea(detalle,fecha1,fechaR,prioridad);
        tareas[cantTareas] = tarea;
        cantTareas++;
    }

    private LocalDate formateoFecha(String fechaSF){
        int anio = 0;
        int mes = 0;
        int dia = 0;
        LocalDate fecha;
        String aux = "";
        for (int i=0;fechaSF.length()>i;i++){
            if ((fechaSF.charAt(i) == '-') || (i == (fechaSF.length() - 1)) ){
                if (dia == 0){    //12-10-2010
                    dia = Integer.parseInt(aux);
                } else if (mes == 0) {
                    mes = Integer.parseInt(aux);
                } else {
                    aux = aux + fechaSF.charAt(i);
                    anio = Integer.parseInt(aux);
                }
                aux = "";
            } else {
                aux = aux + fechaSF.charAt(i);
            }
        }
        fecha = LocalDate.of(anio,mes,dia);
        return fecha;
    }

    public void mostrarTodasLasTareas(){
        for (int i = 0; cantTareas > i; i++){
            System.out.println((i+1) + " - " + tareas[i].mostrarTarea());
        }
    }

    public boolean cambiarDetalleTarea(String detalle, String detalleCambiar){
        for (int i = 0; cantTareas > i; i++){
            if (tareas[i].getDetalle().equals(detalle)){
                tareas[i].cambiarDetalle(detalleCambiar);
                return true;
            }
        }
        return false;
    }
    
    public boolean tareaTerminada(String detalle,String colaborador,String fechaDeFinalizacion){
        for (Tarea t: this.tareas){
            if (t.getDetalle().equals(detalle)){
                LocalDate fecha = formateoFecha(fechaDeFinalizacion);
                t.tareaTerminada(colaborador,fecha);
                return true;
            }
        }
        return false;
    }
    
    private Tarea[] burbujeoPorFechas(Tarea[] tareas,int cant){
        boolean intercambio = true;
        int i;
        Tarea tAux;
        while (intercambio){
            intercambio = false;
            i = 0;
            while ((i+1) < cant){
                if (tareas[i].getFechaLimite().isAfter(tareas[i+1].getFechaLimite())){
                    tAux = tareas[i];
                    tareas[i] = tareas[i+1];
                    tareas[i+1] = tAux;
                    intercambio = true;
                }
                i++;
            }
        }
        return tareas;
    }
    
    public void MostrarTareasIncompletasOrdenadas(){
        
        //Separacion de tareas de prioridad alta
        Tarea[] tareas = new Tarea[this.cantTareas];
        int cant = 0;
        for (Tarea t: (this.tareas)){
            if (!(null == t)){
                if (t.getPrioridad().equals("alta") && (t.getEstado() == EstadoTarea.INCOMPLETA)){
                    tareas[cant] = t;
                    cant++;
                }
            }
        }
        
        //Burbujeo para acomodar las tareas de prioridad alta por fechas
        tareas = burbujeoPorFechas(tareas,cant);

        //Muestro las tareas de prioridad alta ordenadas
        System.out.println("Tareas de prioridad Alta");
        for (int i = 0; i < cant; i++){
            System.out.println(tareas[i].mostrarTarea());
        }

        System.out.println("---------------------------");
        System.out.println("Tareas de prioridad Baja");
        
        //Separacion de tareas de prioridad baja
        tareas = new Tarea[this.cantTareas];
        cant = 0;
        for (Tarea t: this.tareas){
            if (!(null == t)){
                if (t.getPrioridad().equals("baja") && (t.getEstado() == EstadoTarea.INCOMPLETA)){
                    tareas[cant] = t;
                    cant++;
                }
            }
        }

        //Burbujeo para acomodar las tareas de prioridad baja por fechas
        tareas = burbujeoPorFechas(tareas,cant);
        
        //Muestro las tareas de prioridad baja ordenadas
        for (int i = 0; i < cant; i++){
            System.out.println(tareas[i].mostrarTarea());
        }
        System.out.println("-----------------------------");
    }
    
    
    public boolean mostrarTareasDeColaborador(String colaborador){
        boolean estaColaborador = false;
        for (int i = 0;i < this.cantTareas;i++){
            if (tareas[i].getColaborador() != null){
                if (tareas[i].getColaborador().equals(colaborador)){
                    System.out.println(tareas[i].mostrarTarea());
                    estaColaborador = true;
                }
            }
        }
        return estaColaborador;
    }

    public boolean cambiarPrioridadTarea(String detalle,boolean prioridad){
        for (int i = 0; i < this.cantTareas; i++){
            if (tareas[i].getDetalle().equals(detalle)){
                tareas[i].cambiarPrioridad(prioridad);
                return true;
            }
        }
        return false;
    }
}
