package Estructuras.Punto8;
import java.util.Random;

public class Ramdomizador {
    
    private final Random r = new Random();


    public char randomizadorAlfanumericos(){
        String alfanumerico = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        return alfanumerico.charAt(r.nextInt(alfanumerico.length()));
    }
        
        
    public char randomizadorEnteros(){
        String enteros = "0123456789";
        return enteros.charAt(r.nextInt(enteros.length()));
    }
        
        
    public char randomizadorAlfabeticos(){
        String alfabeticos = "abcdefghijklmnopqrstuvwxyz";
        return alfabeticos.charAt(r.nextInt(alfabeticos.length()));
    }

    public char randomizadorAlfabeticosM(){
        String alfabeticosM = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        return alfabeticosM.charAt(r.nextInt(alfabeticosM.length()));
    }
}
