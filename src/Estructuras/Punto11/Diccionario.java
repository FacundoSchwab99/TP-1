package Estructuras.Punto11;

public class Diccionario {
    String[] palabras = new String[50];

    public Diccionario() {
        this.palabras[0] = "humanidad";
        this.palabras[1] = "humano";
        this.palabras[2] = "persona";
        this.palabras[3] = "gente";
        this.palabras[4] = "hombre";
        this.palabras[5] = "mujer";
        this.palabras[6] = "bebe";
        this.palabras[7] = "niño";
        this.palabras[8] = "niña";
        this.palabras[9] = "adolescente";
        this.palabras[10] = "adulto";
        this.palabras[11] = "adulta";
        this.palabras[12] = "anciano";
        this.palabras[13] = "anciana";
        this.palabras[14] = "don";
        this.palabras[15] = "señor";
        this.palabras[16] = "señora";
        this.palabras[17] = "doña";
        this.palabras[18] = "caballero";
        this.palabras[19] = "dama";
        this.palabras[20] = "individuo";
        this.palabras[21] = "cuerpo";
        this.palabras[22] = "pierna";
        this.palabras[23] = "pie";
        this.palabras[24] = "talon";
        this.palabras[25] = "espinilla";
        this.palabras[26] = "rodilla";
        this.palabras[27] = "muslo";
        this.palabras[28] = "cabeza";
        this.palabras[29] = "cara";
        this.palabras[30] = "boca";
        this.palabras[31] = "labio";
        this.palabras[32] = "diente";
        this.palabras[33] = "ojo";
        this.palabras[34] = "nariz";
        this.palabras[35] = "barba";
        this.palabras[36] = "bigote";
        this.palabras[37] = "queso";
        this.palabras[38] = "xilofon";
        this.palabras[39] = "windows";
        this.palabras[40] = "zapatilla";
        this.palabras[41] = "kilo";
        this.palabras[42] = "karma";
        this.palabras[43] = "kilometro";
        this.palabras[44] = "yarara";
        this.palabras[45] = "yerba";
        this.palabras[46] = "xenofobia";
        this.palabras[47] = "whisky";
        this.palabras[48] = "kiwi";
        this.palabras[49] = "supercalifragilisticoespialidoso";
    }

    public boolean estaEnDiccionario(String palabra){
        for (String s : this.palabras) {
            if (s.equals(palabra)) {
                return true;
            }
        }
        return false;
    }


}
