package Estructuras;

import static java.lang.Math.sqrt;

public class CalculadoraCuadraticas {
    private final int a;
    private final int b;
    private final int c;
    private String ecuacion;

    public CalculadoraCuadraticas(int a,int b,int c){
        this.a = a;
        this.b = b;
        this.c = c;
        this.ecuacion = "(" + a + ")*x^2+(" + b + ")*x+(" + c + ")";
        System.out.println("La ecuación designada es " + this.ecuacion);
    };

    public void raices(){
        int discriminante = (b*b) - (4*a*c);
        if (discriminante == 0){
            double raiz = (double) (-b)/(2*a);
            System.out.println("La raiz de la ecuación es " + raiz);
        } else if (discriminante > 0){
            double raiz = (double) (-b + sqrt(discriminante)) /(2*a);
            double raiz1 = (double) (-b - sqrt(discriminante)) /(2*a);
            System.out.println("Las raices de la ecuación son "+ raiz +" y "+ raiz1);
        } else {
            System.out.println("Las raices son imaginarias");
        }
    };

    public void calcularEcuacionEnBaseX(int x){
        int valor = (a * x * x) + (b * x) + c;
        System.out.println("El valor de la ecuación es " + valor);
    };

    public String getEcuacion() {
        return ecuacion;
    }
}
