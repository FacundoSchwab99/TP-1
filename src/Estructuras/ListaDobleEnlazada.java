package Estructuras;
import Estructuras.Nodo.NodoLista;
public class ListaDobleEnlazada {
    NodoLista inicio;
    NodoLista fin;
    int cantidad;

    public ListaDobleEnlazada(){
        inicio = null;
        fin = null;
        cantidad = 0;
    }

    public int getCantidad() {
        return cantidad;
    }

    public boolean estaVacia(){
        return (cantidad == 0);
    }

    public void agregar(Object dato){
        NodoLista nodo = new NodoLista(dato,null,null);
        if (estaVacia()){
            inicio = nodo;
        } else {
            fin.setSiguiente(nodo);
            nodo.setAnterior(fin);
        }
        fin = nodo;
        cantidad += 1;
    }

    public void eliminar(Object dato){
        NodoLista nodo = inicio;
        while (nodo != null){
            if (nodo.getDato().equals(dato)){
                if (nodo == inicio){
                    if (inicio == fin){
                        fin = fin.getSiguiente();
                        inicio = nodo.getSiguiente();
                    } else {
                        inicio = nodo.getSiguiente();
                        inicio.setAnterior(null);
                    }
                } else if(nodo == fin){
                    fin = fin.getAnterior();
                    fin.setSiguiente(null);
                } else {
                    NodoLista nodoSiguiente = nodo.getSiguiente();
                    NodoLista nodoAnterior = nodo.getAnterior();
                    nodoAnterior.setSiguiente(nodo.getSiguiente());
                    nodoSiguiente.setAnterior(nodo.getAnterior());
                }
                cantidad -= 1;
            }
            nodo = nodo.getSiguiente();
        }
    }

    public Object recuperar(int posicion){
        if ((posicion > cantidad) && (posicion > 0)){
            return null;
        } else {
            int i = 1;
            NodoLista nodo = inicio;
            while (i != posicion){
                nodo = nodo.getSiguiente();
                i += 1;
            }
            return nodo.getDato();
        }
    }

    public void insertar(int posicion,Object dato){
        if ((posicion <= cantidad) && (posicion > 0)){
            int i = 1;
            NodoLista nodo = new NodoLista(dato,null,null);
            NodoLista nodoAux = inicio;
            boolean insertado = false;
            while (!insertado){
                if (posicion == i){
                    if (nodoAux == inicio){
                       nodo.setSiguiente(inicio);
                       inicio.setAnterior(nodo);
                       inicio = nodo;
                    } else {
                       NodoLista nodoAnt = nodoAux.getAnterior();
                       nodoAnt.setSiguiente(nodo);
                       nodo.setSiguiente(nodoAux);
                       nodoAux.setAnterior(nodo);
                       nodo.setAnterior(nodoAnt);
                    }
                    cantidad += 1;
                    insertado = true;
                }
                nodoAux = nodoAux.getSiguiente();
                i += 1;
            }
        }
    }


}

