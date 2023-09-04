import java.util.Scanner;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {

        int eleccion = -1;
        while (eleccion != 0){
            Scanner sc = new Scanner(System.in);
            System.out.println("1 - Para punto 1 Lista Simple");
            System.out.println("2 - Para punto 2 Lista Doble Enlace");
            System.out.println("3 - Para punto 3 Pila");
            System.out.println("4 - Para punto 4 Cola");
            System.out.println("5 - Para punto 5 ListaTareas (Inclusión de punto 10,12,13)");
            System.out.println("6 - Para punto 6 Libros");
            System.out.println("7 - Para punto 7 Calculadora de Cuadráticas");
            System.out.println("8 - Para punto 8 Contraseñas");
            System.out.println("9 - Para punto 9 Operaciones con fechas");
            System.out.println("10- Para punto 11 Juego de Palabras");
            System.out.println("0 - Para Salir ");
            System.out.println("Que punto desea probar?");
            eleccion = sc.nextInt();
            Interface I = new Interface();

            if (eleccion == 1){
                I.interfaceLista();
            } else if (eleccion == 2){
                I.interfaceListaDobleEnlace();
            } else if (eleccion == 3){
                I.interfacePila();
            } else if (eleccion == 4){
                I.interfaceCola();
            } else if (eleccion == 5){
                I.interfaceTareas();
            } else if (eleccion == 6){
                I.interfaceBiblioteca();
            } else if (eleccion == 7){
                I.interfaceCalculadora();
            } else if (eleccion == 8){
                I.interfaceContrasenias();
            } else if (eleccion == 9){
                I.interfaceFechas();
            } else if (eleccion == 10){
                I.interfaceJuegodePalabras();
            }

        }
    }
}

