package Estructuras.Nodo;

public class NodoLista{
    private final Object dato;
    private NodoLista siguiente;
    private NodoLista anterior;

    public NodoLista(Object dato, NodoLista siguiente ,NodoLista anterior) {
        this.dato = dato;
        this.siguiente = siguiente;
        this.anterior = anterior;
    }

    public void setAnterior(NodoLista anterior) {
        this.anterior = anterior;
    }
    public NodoLista getAnterior() {
        return anterior;
    }

    public void setSiguiente(NodoLista siguiente) {
        this.siguiente = siguiente;
    }

    public NodoLista getSiguiente() {
        return this.siguiente;
    }

    public Object getDato() {
        return dato;
    }
}
