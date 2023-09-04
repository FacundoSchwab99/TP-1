package Estructuras;
import Estructuras.Nodo.Nodo;
public class Lista {
    private Nodo inicio;
    private int cantidad;
    private Nodo fin;

    public Lista(){
        this.inicio = null;
        this.fin = null;
        this.cantidad = 0;
    }

    public boolean estaVacia(){
        return (this.cantidad == 0);
    }
    public int getCantidad() {
        return cantidad;
    }

    public void agregar(Object dato){
        Nodo nodo = new Nodo(dato,null);
        if (estaVacia()){
            inicio = nodo;
        } else {
            fin.setSiguiente(nodo);
        }
        fin = nodo;
        cantidad += 1;
    }

    public void eliminar(Object dato){
        Nodo nodo = inicio;
        Nodo aux = inicio;
        while (nodo != null){
            boolean coso = (nodo.getDato().equals(dato));
            if (nodo.getDato().equals(dato)){
                if (nodo == inicio){
                    if (inicio == fin){
                        fin = fin.getSiguiente();
                    }
                    inicio = nodo.getSiguiente();
                } else if(nodo == fin){
                    aux.setSiguiente(null);
                    fin = aux;
                } else {
                    aux.setSiguiente(nodo.getSiguiente());
                }
                cantidad -= 1;
            }
            if (nodo != inicio){
                aux = aux.getSiguiente();
            }
            nodo = nodo.getSiguiente();
        }
    }

    public Object recuperar(int posicion){
        if ((posicion > cantidad) && (posicion > 0)){
            return null;
        } else {
            int i = 1;
            Nodo nodo = inicio;
            while (i != posicion){
                nodo = nodo.getSiguiente();
                i += 1;
            }
            return nodo.getDato();
        }
    }

    public void insertar(int posicion,Object dato){
        if ((posicion > 0) && (posicion <= cantidad) ){
            int i = 1;
            Nodo nodo = new Nodo(dato , null);
            Nodo nodoAux = inicio;
            Nodo nodoAnt = inicio;
            boolean insertado = false;
            while (!insertado){
                if (i == posicion){
                    if (nodoAux == inicio){
                        nodo.setSiguiente(inicio);
                        inicio = nodo;
                    } else {
                        nodo.setSiguiente(nodoAux);
                        nodoAnt.setSiguiente(nodo);
                    }
                    cantidad +=1;
                    insertado = true;
                }
                if (nodoAux != inicio){
                    nodoAnt = nodoAnt.getSiguiente();
                }
                nodoAux = nodoAux.getSiguiente();
                i += 1;
            }
        }
    }


}
