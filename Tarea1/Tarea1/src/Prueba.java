import java.util.Scanner;

public class Prueba {
    public static void main(String[] args) throws Exception {
        Scanner leer = new Scanner(System.in);

        int regreso1, regreso2, pasajero1, pasajero2, pasajero3;

                System.out.println("\n\n************ Bienvenido al juego del lobo, la Caperucita y las uvas ************\n\n");
                System.out.println("\nEl observador sera quien maneje siempre la canoa");
                System.out.println("Ingrese quien ira en la canoa con el observador, tenemos a: \n");
                System.out.println("1. LOBO         2. UVAS         3. CAPERUCITA ");
                System.out.println("\nIngrese su eleccion: ");
                pasajero1 = leer.nextInt();
                    switch(pasajero1){
                        case 1: {
                            System.out.println("\n\n********** Ha perdido, la Caperucita se comio las uvas, vuelve a intentarlo ********** ");
                            break;}
                        case 2: {
                            System.out.println("\n\n********** Ha perdido, el lobo se comio a la Caperucita, vuelve a intentarlo **********");
                            break;}
                        case 3: {
                            System.out.println("\n\nLa Caperucita se encuentra del otro lado.....");
                            System.out.println("El observador regresa en la canoa ....., ¿ahora a quien llevara?");
                            System.out.println("\n1. UVAS         2. LOBO \n");
                            System.out.println("Ingrese su eleccion: ");
                            pasajero2 = leer.nextInt();
                                switch (pasajero2){
                                    case 1:{
                                        System.out.println("\n\n********* Ha perdido, la Caperucita se comio las uvas, vuelve a intentarlo *********** ");
                                        break;}
                                    case 2: {
                                        System.out.println("\n\nA elegido al lobo, ahora se encuentra del otro lado con la Caperucita....");
                                        System.out.println("¿Desea regresar con alguien?\n");
                                        System.out.println("1. NADIE            2. LOBO         3. CAPERUCITA  \n");
                                        System.out.println("Ingrese su eleccion: ");
                                        regreso1 = leer.nextInt();
                                            switch (regreso1){
                                                case 1: {
                                                    System.out.println("\n\n********* Ha perdido, el lobo se comio a la Caperucita, vuelve a intentarlo *********");
                                                    break;}
                                                case 2: {
                                                    System.out.println("\n\n********* Ha perdido, volvio a la posicion anterior, vuelve a intentarlo *********");
                                                    break;}
                                                case 3: {
                                                    System.out.println("\n\nA elegido a Caperucita, ahora se encuentra del otro lado con las uvas......");
                                                    System.out.println("¿Ahora a quien llevara del otro lado del rio?\n");
                                                    System.out.println("1. NADIE            2. CAPERUCITA           3. UVAS\n");
                                                    System.out.println("Ingrese su eleccion: ");
                                                    pasajero3 = leer.nextInt();
                                                        switch(pasajero3){
                                                            case 1: {
                                                                System.out.println("\n\n********* Ha perdido, la Caperucita se comio las uvas, vuelve a intentarlo ");
                                                                break;}
                                                            case 2: {
                                                                System.out.println("\n\n********* Ha perdido, volvio a la posicion anterior, vuelve a intentarlo ");
                                                                break;}
                                                            case 3: {
                                                                System.out.println("\n\nA elegido a las uvas, ahora se encuentran del otro lado del rio con el lobo......");
                                                                System.out.println("¿Desea regresar con alguien?\n");
                                                                System.out.println("1. NADIE            2. LOBO         3. UVAS  \n");
                                                                System.out.println("Ingrese su eleccion: ");
                                                                regreso2 = leer.nextInt();
                                                                    switch(regreso2){
                                                                        case 1:{
                                                                            System.out.println("\n\nEl observador no regreso con nadie");
                                                                            System.out.println("Ahora, Caperucita se sube a la canoa por ser la unica que queda del otro lado\n");
                                                                            System.out.println("   ******************************************************************");
                                                                            System.out.println("    El lobo, uvas y Caperucita se encuentran del otro lado del rio ");
                                                                            System.out.println("                        FELICIDADES, HA GANADO                     ");
                                                                            System.out.println("   ******************************************************************\n");
                                                                            break;}
                                                                        case 2: {
                                                                            System.out.println("\n\n********* Ha perdido, el lobo se comio a la Caperucita, vuelve a intentarlo *********");
                                                                            break;}
                                                                        case 3: {
                                                                            System.out.println("\n\n********* Ha perdido, volvio a la posicion anterior, vuelve a intentarlo *********");
                                                                            break;}
                                                                    }                      
                                                        }
                                                }
                                            }
                                    }
                                }
                        }
                }
            }
        }
    }