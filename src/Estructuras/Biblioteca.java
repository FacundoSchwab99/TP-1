package Estructuras;

import Estructuras.Nodo.Libro;

public class Biblioteca {
    private final Libro[] libros;
    private int cantidadLibros;

    public Biblioteca(){
        this.libros = new Libro[30];
        cantidadLibros = 0;
    }

    public void agregarLibro(Libro libro){
        this.libros[cantidadLibros] = libro;
        this.cantidadLibros += 1;
    };

    public String buscarAutor(String autor){
        for (int i = 0; cantidadLibros > i;i++){
            if (libros[i].getAutor().equals(autor)){
                libros[i].mostrarDatosLibro();
                if (libros[i].getCantEjemplares() > 1){
                    return "se encuentra disponible para prestar hasta " + (libros[i].getCantEjemplares() - 1) + " ejemplar/es";
                } else if (libros[i].getCantEjemplares() == 1) {
                    return "se encuentra disponible solo de muestra";
                } else {
                    return "no se encuentra disponible";
                }
            }
        }
        return "no se encuentra disponible";
    };

    public boolean buscarAutor(String autor,int cantidad, boolean prestar){
        for (int i = 0; cantidadLibros > i;i++){
            if (libros[i].getAutor().equals(autor)){
                if (libros[i].getCantEjemplares() > cantidad){
                    if (prestar){
                        libros[i].prestar(cantidad);
                    }
                    return true;
                } else {
                    return false;
                }
            }
        }
        return false;
    };

    public String buscarTitulo(String titulo){
        for (int i = 0; cantidadLibros > i;i++){
            if (libros[i].getTitulo().equals(titulo)){
                libros[i].mostrarDatosLibro();
                if (libros[i].getCantEjemplares() > 1){
                    return "se encuentra disponible para prestar hasta " + (libros[i].getCantEjemplares() - 1) + " ejemplar/es";
                } else if (libros[i].getCantEjemplares() == 1) {
                    return "se encuentra disponible solo de muestra";
                } else {
                    return "no se encuentra disponible";
                }
            }
        }
        return "no se encuentra disponible";
    };

    public boolean buscarTitulo(String titulo,int cantidad, boolean prestar){
        for (int i = 0; cantidadLibros > i;i++){
            if (libros[i].getTitulo().equals(titulo)){
                if (libros[i].getCantEjemplares() > cantidad){
                    if (prestar){
                        libros[i].prestar(cantidad);
                    }
                    return true;
                } else {
                    return false;
                }
            }
        }
        return false;
    };

    public void quienTieneMasPaginas(String titulo1, String titulo2){
        int cantidadPag1 = 0;
        int cantidadPag2 = 0;
        if (buscarTitulo(titulo1,1,false) && buscarTitulo(titulo2,1,false)){
            for (int i = 0; cantidadLibros > i; i++){
                if (libros[i].getTitulo().equals(titulo1)){
                    cantidadPag1 = libros[i].getPaginas();
                } else if (libros[i].getTitulo().equals(titulo2)){
                    cantidadPag2 = libros[i].getPaginas();
                }
            }
            if (cantidadPag1 > cantidadPag2){
                System.out.println("El libro " + titulo1 + " tiene mas páginas");
            } else if (cantidadPag1 < cantidadPag2){
                System.out.println("El libro " + titulo2 + " tiene mas páginas");
            } else {
                System.out.println("Los libros tienen la misma cantidad de páginas");
            }
        } else {
            System.out.println("Los libros no existen");
        }
    }

    public void cantidadPrestamosTotales(){
        int total = 0;
        for (int i = 0; cantidadLibros > i;i++){
            total += libros[i].getCantEjemplarePrestados();
        }
        System.out.println("La cantidad de libros prestados es " + total);
    }


}
