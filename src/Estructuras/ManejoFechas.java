package Estructuras;
import java.time.LocalDate;

public class ManejoFechas {
    private LocalDate fecha;
    
    public ManejoFechas(int anio,int mes,int dia){
        this.fecha = LocalDate.of(anio,mes,dia);
    }
    
    public String devolverFecha(boolean formato){
        if (formato){
            return fecha.getDayOfMonth() + "-" + fecha.getMonthValue() + "-" + fecha.getYear();
        } else {
            return fecha.getMonthValue() + "-" + fecha.getDayOfMonth() + "-" + fecha.getYear();
        }
    }
    
    public boolean fechaEsMayor(LocalDate fecha){
        return this.fecha.isAfter(fecha);
    }
    
    public boolean fechaEsMenor(LocalDate fecha){
        return this.fecha.isBefore(fecha);
    }
    
    public String fechaEstaEntre(LocalDate fecha1,LocalDate fecha2){
        if ((fechaEsMenor(fecha1))&&(fechaEsMayor(fecha2))||
            ((fechaEsMayor(fecha1))&&(fechaEsMenor(fecha2)))){
            return "se encuentra entre las 2 fechas";
        } else if ((fechaEsMayor(fecha1))&&(fechaEsMayor(fecha2))){
            return "se encuentra después de las 2 fechas";
        } else {
            return "se encuentra antes de las 2 fechas";
        }
    }

    public void setFecha(int anio,int mes,int dia) {
        this.fecha = LocalDate.of(anio,mes,dia);
    }


}