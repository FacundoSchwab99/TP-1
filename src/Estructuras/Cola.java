package Estructuras;

import Estructuras.Nodo.Nodo;

public class Cola {
    private Nodo primero;
    private int cantidad;

    public Cola(){
        this.primero = null;
        this.cantidad = 0;
    }


    public int getCantidad() {
        return cantidad;
    }

    public void Encolar(Object dato){
        Nodo nodo = new Nodo(dato,null);
        Nodo nodoAux = primero;
        if (primero == null){
            primero = nodo;
        } else {
            while (nodoAux.getSiguiente() != null){
                nodoAux = nodoAux.getSiguiente();
            }
            nodoAux.setSiguiente(nodo);
        }
        cantidad += 1;
    }

    public Object Desencolar(){
        if (primero == null){
            return null;
        } else {
            Object valor = primero.getDato();
            primero = primero.getSiguiente();
            cantidad -= 1;
            return valor;
        }
    }
}
