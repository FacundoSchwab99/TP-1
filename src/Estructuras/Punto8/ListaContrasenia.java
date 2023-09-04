package Estructuras.Punto8;

public class ListaContrasenia {
    
    private final Contrasenia[] contrasenias;
    private int cantContrasenias;
    
    public ListaContrasenia(){
        this.contrasenias = new Contrasenia[50];
        this.cantContrasenias = 0;
    }
    
    public void crearYAgregarContrasenia(){
        Contrasenia c = new Contrasenia();
        contrasenias[cantContrasenias] = c;
        cantContrasenias++;
    }
    
    public void crearYAgregarContrasenia(int longitud){
        Contrasenia c = new Contrasenia(longitud);
        contrasenias[cantContrasenias] = c;
        cantContrasenias++;
    }
    
    public void mostrarContrasenias(){
        for (int i = 0;i < this.cantContrasenias;i++){
            if (contrasenias[i].esContraseniaFuerte()){
                System.out.println((i+1) + " - Contraseña de longitud " + contrasenias[i].getLongitud() + ": " + contrasenias[i].getContrasenia() + " - Fuerte");
            } else {
                System.out.println((i+1) + " - Contraseña de longitud " + contrasenias[i].getLongitud() + ": " + contrasenias[i].getContrasenia() + " - Débil");
            }
        }
    }
    
    
    public boolean volverContraseniaFuerte(int indice){
        return contrasenias[indice-1].volverContraseniaFuerte();
    }
    
    
    public void cambiarLongitud(int indice, int longitud){
        if ((indice-1) < cantContrasenias){
            if (longitud >= 8){
                contrasenias[indice-1].setLongitud(longitud);
            } else {
                System.out.println("La longitud debe superar los 7 dígitos");
            }
        } else {
            System.out.println("Indice fuera de rango");
        }
    }
    
    
}