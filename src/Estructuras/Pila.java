package Estructuras;

import Estructuras.Nodo.Nodo;

public class Pila {
    private Nodo Tope;
    private int cantidad;

    public Pila(){
        Tope = null;
        cantidad = 0;
    }

    public void Apilar(Object dato){
        Nodo nodo = new Nodo(dato,null);
        if (Tope != null) {
            nodo.setSiguiente(Tope);
        }
        Tope = nodo;
        this.cantidad += 1;
    }

    public Object Desapilar(){
        if (Tope == null){
            return null;
        } else {
            Object valor = Tope.getDato();
            this.Tope = this.Tope.getSiguiente();
            cantidad -= 1;
            return valor;
        }
    }

    public int getCantidad() {
        return cantidad;
    }
}
