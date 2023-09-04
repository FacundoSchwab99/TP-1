package Estructuras.Nodo;

public class Nodo {
    private Nodo siguiente;
    private final Object dato;

    public Nodo(Object dato, Nodo siguiente){
        this.dato = dato;
        this.siguiente = siguiente;
    }

    public Object getDato(){
        return dato;
    }

    public Nodo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }


}
