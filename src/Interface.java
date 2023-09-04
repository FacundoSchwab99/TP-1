import Estructuras.*;
import Estructuras.Nodo.Libro;
import Estructuras.Nodo.Tarea;
import Estructuras.Punto11.Jugador;
import Estructuras.Punto8.ListaContrasenia;

import java.time.LocalDate;
import java.util.Scanner;

public class Interface {

    /*IMPORTANTE
    las interfaces de los puntos estan ordenados de manera creciente
    en el punto 5 se encuentra tambien sus variables (puntos 10,12,13)*/




    // Punto 1 Lista>
    public void interfaceLista(){
        int eleccion = -1;
        Lista L = new Lista();
        Scanner sc = new Scanner(System.in);

        //Agregado por defecto;
        L.agregar("coso");
        L.agregar("pepe");
        L.agregar("lala");

        while (eleccion!=0){


            System.out.println(" ");
            System.out.println("--- Prueba de punto 1 Lista ---");
            System.out.println("--- Agregado por defecto 3 elementos (coso, pepe, lala en ese orden)");
            System.out.println("1 - Agregar");
            System.out.println("2 - Eliminar");
            System.out.println("3 - Insertar");
            System.out.println("4 - Recuperar");
            System.out.println("5 - Longitud de la lista");
            System.out.println("0 - Salir");
            System.out.println("Que desea realizar con la Lista?");
            eleccion = sc.nextInt();
            sc.nextLine();

            if (eleccion == 1){

                System.out.println("Dato a Agregar: ");
                Object dato = sc.nextLine();
                L.agregar(dato);

            } else if (eleccion == 2) {

                System.out.println("Dato a Eliminar: ");
                Object dato = sc.nextLine();
                L.eliminar(dato);

            } else if (eleccion == 3) {

                System.out.println("Dato a Insertar: ");
                Object dato = sc.nextLine();
                System.out.println("Posicion en donde Insertar: ");
                int posicion = sc.nextInt();
                L.insertar(posicion,dato);

            } else if (eleccion == 4) {

                System.out.println("Posicion del dato a Recuperar: ");
                int posicion = sc.nextInt();
                Object dato = L.recuperar(posicion);
                System.out.println("El dato recuperado es " + dato);

            } else if (eleccion == 5) {

                if (L.estaVacia()){
                    System.out.println("En este momento la Lista se encuentra vacia");
                } else {
                    System.out.println("La Lista contiene " + L.getCantidad() + " elementos");
                }
            }

            System.out.println(" ");
            System.out.println("-------------------");
            Object pausa = sc.nextLine();

        }
    }

    // Punto 2 Lista Doble Enlace>
    public void interfaceListaDobleEnlace(){
        int eleccion = -1;
        ListaDobleEnlazada L = new ListaDobleEnlazada();
        Scanner sc = new Scanner(System.in);

        //Agregado por defecto;
        L.agregar("coso");
        L.agregar("pepe");
        L.agregar("lala");

        while (eleccion!=0) {

            System.out.println(" ");
            System.out.println("--- Prueba de punto 2 ListaDobleEnlace ---");
            System.out.println("--- Agregado por defecto 3 elementos (coso, pepe, lala en ese orden)");
            System.out.println("1 - Agregar");
            System.out.println("2 - Eliminar");
            System.out.println("3 - Insertar");
            System.out.println("4 - Recuperar");
            System.out.println("5 - Longitud de la lista");
            System.out.println("0 - Salir");
            System.out.println("Que desea realizar con la Lista?");
            eleccion = sc.nextInt();
            sc.nextLine();

            if (eleccion == 1){

                System.out.println("Dato a Agregar: ");
                Object dato = sc.nextLine();
                L.agregar(dato);

            } else if (eleccion == 2) {

                System.out.println("Dato a Eliminar: ");
                Object dato = sc.nextLine();
                L.eliminar(dato);

            } else if (eleccion == 3) {

                System.out.println("Dato a Insertar: ");
                Object dato = sc.nextLine();
                System.out.println("Posicion en donde Insertar: ");
                int posicion = sc.nextInt();
                L.insertar(posicion,dato);

            } else if (eleccion == 4) {

                System.out.println("Posicion del dato a Recuperar: ");
                int posicion = sc.nextInt();
                Object dato = L.recuperar(posicion);
                System.out.println("El dato recuperado es " + dato);

            } else if (eleccion == 5) {

                if (L.estaVacia()){
                    System.out.println("En este momento la Lista se encuentra vacia");
                } else {
                    System.out.println("La Lista contiene " + L.getCantidad() + " elementos");
                }
            }

            System.out.println(" ");
            System.out.println("-------------------");
            Object pausa = sc.nextLine();

        }
    }

    // Punto 3 Pila>
    public void interfacePila(){
        int eleccion = -1;
        Pila L = new Pila();
        Scanner sc = new Scanner(System.in);

        //Agregado por defecto;
        L.Apilar("coso");
        L.Apilar("pepe");
        L.Apilar("lala");

        while (eleccion!=0) {

            System.out.println(" ");
            System.out.println("--- Prueba de punto 3 Pila ---");
            System.out.println("--- Agregado por defecto 3 elementos (coso, pepe, lala en ese orden)");
            System.out.println("1 - Apilar");
            System.out.println("2 - Desapilar");
            System.out.println("3 - Cantidad de elementos");
            System.out.println("0 - Salir");
            System.out.println("Qué desea realizar con la Pila?");
            eleccion = sc.nextInt();
            sc.nextLine();

            if (eleccion == 1) {

                System.out.println("Dato a Apilar: ");
                Object dato = sc.nextLine();
                L.Apilar(dato);

            } else if (eleccion == 2) {

                Object dato = L.Desapilar();
                System.out.println("El dato Desapilado es: " + dato);

            } else if (eleccion == 3) {

                if (L.getCantidad() == 0) {
                    System.out.println("En este momento la Pila se encuentra vacia");
                } else {
                    System.out.println("La Pila contiene " + L.getCantidad() + " elementos");
                }

            }

            System.out.println(" ");
            System.out.println("-------------------");
            Object pausa = sc.nextLine();
        }
    }

    // Punto 4 Cola>
    public void interfaceCola(){
        int eleccion = -1;
        Cola L = new Cola();
        Scanner sc = new Scanner(System.in);

        //Agregado por defecto;
        L.Encolar("coso");
        L.Encolar("pepe");
        L.Encolar("lala");

        while (eleccion!=0) {

            System.out.println(" ");
            System.out.println("--- Prueba de punto 4 Cola ---");
            System.out.println("--- Agregado por defecto 3 elementos (coso, pepe, lala en ese orden)");
            System.out.println("1 - Encolar");
            System.out.println("2 - Desencolar");
            System.out.println("3 - Cantidad de elementos");
            System.out.println("0 - Salir");
            System.out.println("Qué desea realizar con la Cola?");
            eleccion = sc.nextInt();
            sc.nextLine();

            if (eleccion == 1) {

                System.out.println("Dato a Encolar: ");
                Object dato = sc.nextLine();
                L.Encolar(dato);

            } else if (eleccion == 2) {

                Object dato = L.Desencolar();
                System.out.println("El dato Desencolado es: " + dato);

            } else if (eleccion == 3) {

                if (L.getCantidad() == 0) {
                    System.out.println("En este momento la Cola se encuentra vacia");
                } else {
                    System.out.println("La Cola contiene " + L.getCantidad() + " elementos");
                }

            }

            System.out.println(" ");
            System.out.println("-------------------");
            Object pausa = sc.nextLine();
        }
    }


    // Punto 5 Lista de Tareas (Inclusión punto 10,12,13)>
    public void interfaceTareas(){
        int eleccion = -1;
        ListaTareas L = new ListaTareas();
        Scanner sc = new Scanner(System.in);

        //Agregado por defecto;
        L.agregarTarea("Ir al supermercado mañana","15-9-2023",false);
        L.agregarTarea("Consultar repuesto del auto","5-9-2023",false);
        L.tareaTerminada("Consultar repuesto del auto","Facundo","4-9-2023");
        L.agregarTarea("Ir al cine a ver la nueva película de Marvel","5-9-2023",false);
        L.agregarTarea("Comprar pan","20-9-2023","17-9-2023",false);
        L.agregarTarea("Consultar el listado de alumnos","30-9-2023","20-9-2023",true);
        L.agregarTarea("Devolver los libros","15-9-2023",true);
        L.agregarTarea("Cocinar las verduras antes que se pudran","22-9-2023",true);
        L.agregarTarea("Pagar las cuentas","16-9-2023",true);
        L.agregarTarea("Limpiar la pieza","25-9-2023",false);
        L.agregarTarea("Bañar al gato","27-9-2023",false);

        while (eleccion!=0){


            System.out.println(" ");
            System.out.println("--- Prueba de punto 5 Lista de Tareas ---");
            System.out.println("--- Agregado por defecto 10 Tareas (utilizar 'Mostrar todas las tareas' para verlas)");
            System.out.println("1 - Agregar Tarea (Inclusion con punto 10 'recordatorio')");
            System.out.println("2 - Mostrar todas las tareas");
            System.out.println("3 - Mostrar las tareas incompletas ordenadas por prioridad y fechas (Punto 12)");
            System.out.println("4 - Cambiar Prioridad de una tarea");
            System.out.println("5 - Cambiar detalle de una tarea");
            System.out.println("6 - Marcar como completa una tarea (Inclusion con punto 13 'Colaboradores')");
            System.out.println("7 - Mostrar listado de tareas realizadas por un colaborador");
            System.out.println("0 - Salir");
            System.out.println("Que desea realizar con la Lista de Tareas?");
            eleccion = sc.nextInt();
            sc.nextLine();

            if (eleccion == 1){

                System.out.println("Dime el detalle de tu Tarea a realizar: ");
                String detalle = sc.nextLine();
                System.out.println("Dime la fecha limite para realizarla (respetar el formato 'dd-mm-yyyy'): ");
                String fechaLimite = sc.nextLine();
                System.out.println("Desea darle una prioridad alta? (S/N): ");
                String p = sc.nextLine();
                boolean prioridad = (p.equals("S")) || (p.equals("s"));
                System.out.println("Desea darle una fecha de Recordatorio? En caso de que no, se automatizará a 5 días antes (S/N) ");
                p = sc.nextLine();
                if ((p.equals("s"))||(p.equals("S"))){
                    System.out.println("Dime la fecha de recordatorio que deseas utilizar (respetar el formato 'dd-mm-yyyy'): ");
                    String fechaRecordatorio = sc.nextLine();
                    L.agregarTarea(detalle,fechaLimite,fechaRecordatorio,prioridad);
                } else {
                    L.agregarTarea(detalle,fechaLimite,prioridad);
                }


            } else if (eleccion == 2) {

                L.mostrarTodasLasTareas();

            } else if (eleccion == 3) {

                L.MostrarTareasIncompletasOrdenadas();

            } else if (eleccion == 4) {

                System.out.println("Dime el detalle de la tarea que deseas cambiar la prioridad: ");
                String detalle = sc.nextLine();
                System.out.println("Que prioridad desea darle? (Alta: 'A' / Baja: 'B') ");
                String p = sc.nextLine();
                boolean prioridad = ((p.equals("A"))||(p.equals("a")));
                if (L.cambiarPrioridadTarea(detalle,prioridad)){
                    System.out.println("Cambiada la prioridad correctamente");
                    System.out.println("En caso de que la prioridad no haya cambiado de 'alta' a 'baja' (al haber elegido la opción), " +
                            "es porque no es posible realizar esa opcion con esta tarea por la fecha de Recordatorio");
                } else {
                    System.out.println("No se encontro el detalle de la tarea a cambiar");
                }

            } else if (eleccion == 5) {

                System.out.println("Dime el detalle de la tarea a cambiar: ");
                String detalle = sc.nextLine();
                System.out.println("Dime el detalle nuevo que deseas introducirle a la tarea: ");
                String detalleCambiar = sc.nextLine();
                L.cambiarDetalleTarea(detalle,detalleCambiar);

            } else if (eleccion == 6){

                System.out.println("Dime el detalle de la tarea que quieres dar como terminada: ");
                String detalle = sc.nextLine();
                System.out.println("Quien completo la tarea? ");
                String colaborador = sc.nextLine();
                System.out.println("Dime la fecha en la que se completo la tarea (respetar formato 'dd-mm-yyyy'): ");
                String fechaDeFinalizacion = sc.nextLine();
                if (L.tareaTerminada(detalle,colaborador,fechaDeFinalizacion)) {
                    System.out.println("Tarea completada exitosamente");
                } else {
                    System.out.println("La tarea ya expiró");
                };

            } else if (eleccion == 7){

                System.out.println("Dime el nombre del colaborador que quieres verificar: ");
                String colaborador = sc.nextLine();
                if (!L.mostrarTareasDeColaborador(colaborador)){
                    System.out.println("El colaborador no se encuentra en mi listado");
                };

            }

            System.out.println(" ");
            System.out.println("-------------------");
            Object pausa = sc.nextLine();

        }
    }


    // Punto 6 Biblioteca>
    public void interfaceBiblioteca(){
        int eleccion = -1;
        Biblioteca B = new Biblioteca();
        Scanner sc = new Scanner(System.in);

        //Agregado por defecto;
        System.out.println(" ");
        System.out.println("-----------------------------------------");
        Libro L = new Libro("Don Quijote","Miguel de Cervantes","ASD123",300,10,1910);
        B.agregarLibro(L);
        L.mostrarDatosLibro();
        L =  new Libro("La cucaracha","Pedro Picapiedra","ADQ234",10,5,2010);
        B.agregarLibro(L);
        L.mostrarDatosLibro();
        L = new Libro("La tierra","Harry Cliford","AJK531",50,1,2005);
        B.agregarLibro(L);
        L.mostrarDatosLibro();
        System.out.println("-----------------------------------------");
        System.out.println(" ");

        while (eleccion!=0) {

            System.out.println(" ");
            System.out.println("--- Prueba de punto 6 Libros ---");
            System.out.println("-- Agregado por defecto 3 Libros (Titulos: Don Quijote,La cucaracha,La tierra)");
            System.out.println("1 - Agregar Libro a la Biblioteca");
            System.out.println("2 - Pedir Libro");
            System.out.println("3 - Buscar Libro por Titulo");
            System.out.println("4 - Buscar Libro por Autor");
            System.out.println("5 - Cantidad de Prestamos totales");
            System.out.println("6 - Que libro tiene mas páginas?");
            System.out.println("0 - Salir");
            System.out.println("Qué desea realizar con la Biblioteca?");
            eleccion = sc.nextInt();
            sc.nextLine();

            if (eleccion == 1) {

                System.out.println("Titulo del Libro: ");
                String titulo = sc.nextLine();
                System.out.println("Nombre del Autor del Libro: ");
                String autor = sc.nextLine();
                System.out.println("Cantidad de páginas: ");
                int paginas = sc.nextInt();
                sc.nextLine();
                System.out.println("Cantidad de ejemplares: ");
                int cantEjemp = sc.nextInt();
                sc.nextLine();
                L = new Libro(titulo,autor,"ABC123",paginas,cantEjemp,2023);
                L.mostrarDatosLibro();
                B.agregarLibro(L);

            } else if (eleccion == 2) {

                System.out.println("Pedir por Titulo o por Autor? (Seleccionar 'T' o 'A')");
                String Busqueda = sc.nextLine();

                if (Busqueda.equals("A") || Busqueda.equals("a")) {

                    System.out.println("Dime el Autor del Libro que quieres: ");
                    String autor = sc.nextLine();
                    System.out.println("Cuantos Libros quieres? ");
                    int cantidad = sc.nextInt();
                    sc.nextLine();
                    if (B.buscarAutor(autor,cantidad,true)){
                        System.out.println("Prestado correctamente");
                    } else {
                        System.out.println("No se encuentra la cantidad solicitada");
                    }

                }  else if (Busqueda.equals("T") || Busqueda.equals("t")){
                    System.out.println("Dime el Titulo del Libro que quieres: ");
                    String titulo = sc.nextLine();
                    System.out.println("Cuantos Libros quieres? ");
                    int cantidad = sc.nextInt();
                    sc.nextLine();
                    if (B.buscarTitulo(titulo,cantidad,true)){
                        System.out.println("Prestado correctamente");
                    } else {
                        System.out.println("No se encuentra la cantidad solicitada");
                    }
                }


            } else if (eleccion == 3) {

                System.out.println("Dime el Titulo del Libro que quieres Buscar: ");
                String titulo = sc.nextLine();
                System.out.println("El libro " + titulo + " " + B.buscarTitulo(titulo));

            } else if (eleccion == 4){

                System.out.println("Dime el Autor del Libro que quieres Buscar: ");
                String autor = sc.nextLine();
                System.out.println("El libro " + autor + " " + B.buscarAutor(autor));

            } else if (eleccion == 5){

                B.cantidadPrestamosTotales();

            } else if (eleccion == 6){

                System.out.println("Dime uno de los titulos que deseas comparar: ");
                String titulo1 = sc.nextLine();
                System.out.println("Dime el otro titulo: ");
                String tiutlo2 = sc.nextLine();
                B.quienTieneMasPaginas(titulo1,tiutlo2);

            }

            System.out.println(" ");
            System.out.println("-------------------");
            Object pausa = sc.nextLine();
        }
    }

    //Punto 7 Calculadora de Cuadráticas>
    public void interfaceCalculadora(){
        CalculadoraCuadraticas C;
        Scanner sc = new Scanner(System.in);

        //Prueba automática;
        System.out.println(" ");
        C = new CalculadoraCuadraticas(1,2,4); // x2 + 2x + 4
        C.raices(); // x1 =
        System.out.println("con X = 2:");
        C.calcularEcuacionEnBaseX(2); // valor = 12;
        System.out.println("---------------------------------------");

        C = new CalculadoraCuadraticas(1,2,-3); // x2 + 2x + (-3)
        C.raices(); // x1 = ; x2 =
        System.out.println("con X = 2");
        C.calcularEcuacionEnBaseX(2); // valor = 5
        System.out.println("---------------------------------------");

        C = new CalculadoraCuadraticas(1,2,1); // x2 + 2x + 1
        C.raices(); //imaginarias
        System.out.println("con X = 2");
        C.calcularEcuacionEnBaseX(2); // valor 9
        System.out.println("---------------------------------------");


        System.out.println(" ");
        Object pausa = sc.nextLine(); // enter y se despausa

    }

    // Punto 8 Contrasenias>
    public void interfaceContrasenias(){
        int eleccion = -1;
        ListaContrasenia L = new ListaContrasenia();
        Scanner sc = new Scanner(System.in);
        L.crearYAgregarContrasenia();
        L.crearYAgregarContrasenia();
        L.crearYAgregarContrasenia(10);


        while (eleccion!=0) {

            System.out.println(" ");
            System.out.println("--- Prueba de punto 8 Contraseñas Automaticas ---");
            System.out.println("--- Agregado por defecto 3 contraseñas (2 de 8 dígitos y 1 de 10, usar 'mostrar' para verificarlas)");
            System.out.println("1 - Crear y Agregar contrasenias");
            System.out.println("2 - Mostrar todas las contrasenias");
            System.out.println("3 - Modificar la contraseña para hacerla Fuerte obligatoriamente");
            System.out.println("4 - Cambiar longitud de una contraseña");
            System.out.println("0 - Salir");
            System.out.println("Qué desea realizar con la Lista de Contraseñas?");
            eleccion = sc.nextInt();
            sc.nextLine();
            System.out.println(" ");

            if (eleccion == 1) {

                System.out.println("Defina el tamaño de la Contraseña (En caso de ser menor a 8, automáticamente la creara con 8 dígitos): ");
                int longitud = sc.nextInt();
                if (longitud > 8){
                    L.crearYAgregarContrasenia(longitud);
                } else {
                    L.crearYAgregarContrasenia();
                };

            } else if (eleccion == 2) {

                L.mostrarContrasenias();

            } else if (eleccion == 3) {

                System.out.println("Introduzca el índice de la contraseña: ");
                int indice = sc.nextInt();
                if (L.volverContraseniaFuerte(indice)){
                    System.out.println("Contraseña modificada correctamente");
                } else {
                    System.out.println("La contraseña no es necesario modificarla, ya es Fuerte");
                }

            } else if (eleccion == 4){

                System.out.println("Introduzca el índice de la contraseña: ");
                int indice = sc.nextInt();
                System.out.println("Introduzca la longitud de la contraseña a modificar (siempre siendo mayor o igual a 8 dígitos): ");
                int longitud = sc.nextInt();
                L.cambiarLongitud(indice,longitud);

            }

            System.out.println(" ");
            System.out.println("-------------------");
            Object pausa = sc.nextLine();
        }
    }


    //Punto 9 Manejo de Fechas>
    public void interfaceFechas(){
        ManejoFechas F;
        Scanner sc = new Scanner(System.in);

        //Prueba automática;
        System.out.println(" ");
        F = new ManejoFechas(2023,5,28);

        //Ejemplo 1
        System.out.println("Fecha ejemplo 1: 28-5-2023");
        LocalDate fecha1 = LocalDate.of(2023,6,19);
        System.out.println("Fecha a comparar: ");
        System.out.println("Fecha 1 -> 19-6-2023");
        if (F.fechaEsMenor(fecha1)){
            System.out.println("La fecha es Menor");
        } else {
            System.out.println("La fecha es Mayor"); //No deberia
        }
        System.out.println("---------------------------------------");
        System.out.println(" ");


        //Ejemplo 2
        System.out.println("Fecha ejemplo 2: 28-5-2023");
        LocalDate fecha2 = LocalDate.of(2023,4,30);
        System.out.println("Fecha a comparar: ");
        System.out.println("Fecha 2 -> 30-4-2023");
        if (F.fechaEsMayor(fecha2)){
            System.out.println("La fecha es Mayor");
        } else {
            System.out.println("La fecha es Menor"); //No deberia
        }
        System.out.println("---------------------------------------");
        System.out.println(" ");


        //Ejemplo 3
        System.out.println("Fecha ejemplo 3: 28-5-2023");
        System.out.println("Fechas a comparar: ");
        System.out.println("Fecha 1 -> 19-6-2023");
        System.out.println("Fecha 2 -> 30-4-2023");
        System.out.println("La fecha: " + F.fechaEstaEntre(fecha1,fecha2));
        System.out.println("---------------------------------------");
        System.out.println(" ");

        //Ejemplo 4
        System.out.println("Fecha ejemplo 4: 28-5-2023");
        fecha1 = LocalDate.of(2023,5,29);
        fecha2 = LocalDate.of(2023,7,30);
        System.out.println("Fechas a comparar: ");
        System.out.println("Fecha 1 -> 29-5-2023");
        System.out.println("Fecha 2 -> 30-7-2023");
        System.out.println("La fecha: " + F.fechaEstaEntre(fecha1,fecha2));
        System.out.println("---------------------------------------");
        System.out.println(" ");

        //Ejemplo 5
        F.setFecha(2023,6,15);
        System.out.println("Fecha ejemplo 5: 15-6-2023");
        fecha1 = LocalDate.of(2023,5,29);
        fecha2 = LocalDate.of(2023,2,15);
        System.out.println("Fechas a comparar: ");
        System.out.println("Fecha 1 -> 29-5-2023");
        System.out.println("Fecha 2 -> 15-2-2023");
        System.out.println("La fecha: " + F.fechaEstaEntre(fecha1,fecha2));


        System.out.println(" ");
        Object pausa = sc.nextLine();

    }

    //Punto 11 Juego de Palabras
    public void interfaceJuegodePalabras(){
        int eleccion = -1;
        Scanner sc = new Scanner(System.in);


        //Nombre de los Jugadores
        System.out.println(" ");
        System.out.println("-----------------------------------------");
        System.out.println("Jugador 1: ");
        String nombre1 = sc.nextLine();
        Jugador J1 = new Jugador(nombre1);
        System.out.println("Jugador 2: ");
        String nombre2= sc.nextLine();
        Jugador J2 = new Jugador(nombre2);

        while (eleccion!=0) {

            System.out.println(" ");
            System.out.println("--- Prueba de punto 11 Juego de Palabras ---");
            System.out.println("--- Al querer agregar palabras, antes verificar en el listado del Diccionario las mismas (Consejo: supercalifragilisticoespialidoso)");
            System.out.println("1 - Agregar Palabras a J1");
            System.out.println("2 - Agregar Palabras a J2");
            System.out.println("3 - Quién es el ganador?");
            System.out.println("0 - Salir");
            System.out.println("Qué desea hacer en el Juego?");
            eleccion = sc.nextInt();
            sc.nextLine();
            Jugador J;

            if ((eleccion == 1)||(eleccion == 2)) {
                if (eleccion == 1){
                    J = J1;
                    System.out.println("Palabra a Agregar a J1: ");
                } else {
                    J = J2;
                    System.out.println("Palabra a Agregar a J2: ");
                }

                String palabra = sc.nextLine();
                if (J.agregarPalabra(palabra)){
                    System.out.println("Agregado correctamente");
                } else {
                    System.out.println("La palabra no aparece en el Diccionario");
                };


            } else if (eleccion == 3) {

                if (J1.getPuntos() > J2.getPuntos()){
                    System.out.println("El ganador es el Jugador 1: " + J1.getNombre());
                } else if (J1.getPuntos() < J2.getPuntos()){
                    System.out.println("El ganador es el Jugador 2: " + J2.getNombre());
                } else {
                    System.out.println("Hay un empate entre los jugadores");
                }

            }

            System.out.println(" ");
            System.out.println("-------------------");
            Object pausa = sc.nextLine();
        }
    }

}
