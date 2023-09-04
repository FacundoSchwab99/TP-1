package Estructuras.Nodo;

public class Libro {
    String titulo;
    String autor;
    String ISBN;
    int paginas;
    int cantEjemplares;
    int anio;
    int cantEjemplarePrestados;

    public Libro(String titulo,String autor,String ISBN,int paginas,int cantEjemplares ,int anio){
        this.titulo = titulo;
        this.autor = autor;
        this.ISBN = ISBN;
        this.paginas = paginas;
        this.cantEjemplares = cantEjemplares;
        this.anio = anio;
        this.cantEjemplarePrestados = 0;
    }

    public void mostrarDatosLibro(){
        System.out.println("El libro " + this.titulo + " creado por el autor " +
                this.autor + " en el año " + this.anio + ", tiene " +
                this.paginas + " páginas, quedan " +
                this.cantEjemplares + " ejemplares disponibles y se prestaron " +
                 this.cantEjemplarePrestados + " ejemplares.");
    }

    public void prestar(){
        this.cantEjemplarePrestados += 1;
        this.cantEjemplares -= 1;
    }

    public void prestar(int c){
        if (cantEjemplares > c){
            cantEjemplares= cantEjemplares-c;
            cantEjemplarePrestados= cantEjemplarePrestados+c;
        }
    }

    public void devolver(){
        this.cantEjemplares += 1;
        this.cantEjemplarePrestados -= 1;
    }

    public void devolver(int c){
        this.cantEjemplares += c;
        this.cantEjemplarePrestados -= c;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getPaginas() {
        return paginas;
    }

    public int getCantEjemplares() {
        return cantEjemplares;
    }

    public int getCantEjemplarePrestados() {
        return cantEjemplarePrestados;
    }
}
