package Estructuras.Punto11;
import Estructuras.Punto11.Palabra;

public class Jugador {
    private String nombre;
    private final Palabra[] palabras;
    private int cantPalabras = 0;
    private int puntos;
    
    public Jugador(String nombre){
        this.nombre = nombre;
        this.palabras = new Palabra[30];
        this.puntos = 0;
    }
    
    private void calcularPuntajePalabraYSumar(Palabra palabra){
        this.puntos += palabra.calcularPuntos();
    }
    
    public boolean agregarPalabra(String palabra){
        Palabra nuevaPalabra = new Palabra(palabra);
        if (nuevaPalabra.estaEnDiccionario()){
            calcularPuntajePalabraYSumar(nuevaPalabra);
            palabras[cantPalabras] = nuevaPalabra;
            cantPalabras += 1;
            return true;
        } else {
            return false;
        }
    }

    public int getPuntos() {
        return puntos;
    }

    public String getNombre() {
        return nombre;
    }
}