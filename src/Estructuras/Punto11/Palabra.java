package Estructuras.Punto11;

public class Palabra {
    private final String palabra;
    private final Diccionario diccionario = new Diccionario();
    
    public Palabra(String palabra){
        this.palabra = palabra;
    }
    
    public boolean estaEnDiccionario(){
        return diccionario.estaEnDiccionario(palabra);
    }

    public int calcularPuntos(){
        int puntos = 0;
        for (char L : palabra.toCharArray()){
            if ((L >= 119 && L <= 122)||(L == 113)||(L == 107)){
                puntos += 2;
            } else {
                puntos++;
            }
        }
        return puntos;
    }
    
    
}