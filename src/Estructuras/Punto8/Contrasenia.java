package Estructuras.Punto8;

public class Contrasenia {
    
    private String contrasenia = "";
    private int longitud;
    
    public Contrasenia(){
        Ramdomizador r = new Ramdomizador();
        for (int i = 0;i<8;i++){
            this.contrasenia = this.contrasenia + r.randomizadorAlfanumericos();
        }
        this.longitud = 8;    
    }
    
    public Contrasenia(int index){
        Ramdomizador r = new Ramdomizador();
        for (int i = 0;i<index;i++){
            this.contrasenia = this.contrasenia + r.randomizadorAlfanumericos();
        }
        this.longitud = index;    
    }
    
    public boolean esContraseniaFuerte(){
        int minus = 0;
        int mayus = 0;
        int num = 0;
        for (char S : this.contrasenia.toCharArray()){    // A12 = ['A' , '1' , '2'] ; "A" = string ; 'A' = char ;
            if ((S >= 65)&&(S <= 90)){ // 65 = 'A' ; 90 = 'Z'
                mayus++;
            } else if ((S >= 97)&&(S <= 122)) {
                minus++;
            } else {
                num++;
            }
        }
        return ((mayus > 2)&&(minus > 1)&&(num >= 2));
    }
    
    public boolean volverContraseniaFuerte(){
        if (!esContraseniaFuerte()){
            int mayus = 0;
            int minus = 0;
            int num = 0;
            Ramdomizador r = new Ramdomizador();
            this.contrasenia = "";
            for (int i = 0; i < longitud;i++){
                if (mayus < 3){
                    this.contrasenia = this.contrasenia + r.randomizadorAlfabeticosM();
                    mayus++;
                } else if (minus < 2){
                    this.contrasenia = this.contrasenia + r.randomizadorAlfabeticos();
                    minus++;
                } else if (num < 2){
                    this.contrasenia = this.contrasenia + r.randomizadorEnteros();
                    num++;
                } else {
                    this.contrasenia = this.contrasenia + r.randomizadorAlfanumericos();
                }
            }
            return true;
        } else {
            return false;
        }
    }
    
    
    
    public String getContrasenia(){
        return this.contrasenia;
    }
    
    public int getLongitud(){
        return this.longitud;
    }
    
    public void setLongitud(int longitud){
        if (longitud > this.longitud){
            Ramdomizador r = new Ramdomizador();
            for (int i = 0; i < (longitud - this.longitud); i++){
                this.contrasenia = this.contrasenia + r.randomizadorAlfanumericos();
            }
        } else if (longitud < this.longitud){
            String aux = "";
            for (int i = 0; i < longitud; i++){
                aux = aux + contrasenia.charAt(i);
            }
            this.contrasenia = aux;
        }
        this.longitud = longitud;
    }
}