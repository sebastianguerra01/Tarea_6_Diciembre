import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner leer = new Scanner(System.in);

        int inicio = 1;
        int regreso1,regreso2;
        int pasajero1, pasajero2, pasajero3;

        System.out.println("\n\n\t************ Tarea *************");
        System.out.println("Debes encontrar la forma de pasar de un lado a otro del rio al lobo, caperucita y las uvas");
        System.out.println("En cada caso, ingrese el numero correspondiente a la opcion deseada");
        System.out.println("Comencemos: \n");
            while(inicio==1){
                System.out.println("\nEl observador sera quien maneje siempre la canoa");
                System.out.println("Ingrese quien ira en la canoa con el observador, tenemos a: \n");
                System.out.println("1. LOBO ");
                System.out.println("2. UVAS ");
                System.out.println("3. CAPERUCITA ");
                System.out.println("Ingrese su eleccion: ");
                pasajero1 = leer.nextInt();
                    switch(pasajero1){
                        case 1: {
                            System.out.println("\n\n   ********************************************");
                            System.out.println("    Ha perdido, la Caperucita se comio las uvas ");
                            System.out.println("   *********************************************\n");
                            System.out.println("¿Desea continuar?");
                            System.out.println("1. SI       2. NO ");
                            System.out.println("Ingrese su eleccion: ");
                            inicio = leer.nextInt();
                            break;
                        }
                        case 2: {
                            System.out.println("   \n\n   *********************************************");
                            System.out.println("    Ha perdido, el lobo se comio a la Caperucita ");
                            System.out.println("   *********************************************\n");
                            System.out.println("¿Desea continuar?");
                            System.out.println("1. SI       2. NO ");
                            System.out.println("Ingrese su eleccion: ");
                            inicio = leer.nextInt();
                            break;
                        }
                        case 3: {
                            System.out.println("\n\nLa Caperucita se encuentra del otro lado");
                            System.out.println("El observador regresa en la canoa ....., ¿ahora a quien llevara?");
                            System.out.println("1. UVAS ");
                            System.out.println("2. LOBO ");
                            System.out.println("Ingrese su eleccion: ");
                            pasajero2 = leer.nextInt();
                                switch (pasajero2){
                                    case 1:{
                                        System.out.println("\n\n   *********************************************");
                                        System.out.println("    Ha perdido, la Caperucita se comio las uvas ");
                                        System.out.println("   *********************************************\n");
                                        System.out.println("¿Desea continuar?");
                                        System.out.println("1. SI       2. NO ");
                                        System.out.println("Ingrese su eleccion: ");
                                        inicio = leer.nextInt();
                                        break;
                                    }
                                    case 2: {
                                        System.out.println("\n\nA elegido al lobo, ahora se encuentra del otro lado con la Caperucita....");
                                        System.out.println("¿Desea regresar con alguien?");
                                        System.out.println("1. NADIE ");
                                        System.out.println("2. LOBO ");
                                        System.out.println("3. CAPERUCITA ");
                                        System.out.println("Ingrese su eleccion: ");
                                        regreso1 = leer.nextInt();
                                            switch (regreso1){
                                                case 1: {
                                                    System.out.println("\n\n   *********************************************");
                                                    System.out.println("    Ha perdido, el lobo se comio a la Caperucita ");
                                                    System.out.println("   *********************************************\n");
                                                    System.out.println("¿Desea continuar?");
                                                    System.out.println("1. SI       2. NO ");
                                                    System.out.println("Ingrese su eleccion: ");
                                                    inicio = leer.nextInt();
                                                    break;
                                                }
                                                case 2: {
                                                    System.out.println("\n\n   *********************************************");
                                                    System.out.println("    Ha perdido, volvio a la posicion anterior ");
                                                    System.out.println("   *********************************************\n");
                                                    System.out.println("¿Desea continuar?");
                                                    System.out.println("1. SI       2. NO ");
                                                    System.out.println("Ingrese su eleccion: ");
                                                    inicio = leer.nextInt();
                                                    break;
                                                }
                                                case 3: {
                                                    System.out.println("\n\nA elegido a Caperucita, ahora se encuentra del otro lado con las uvas");
                                                    System.out.println("¿Ahora a quien llevara del otro lado del rio?");
                                                    System.out.println("1. NADIE ");
                                                    System.out.println("2. CAPERUCITA  ");
                                                    System.out.println("3. UVAS ");
                                                    System.out.println("Ingrese su eleccion: ");
                                                    pasajero3 = leer.nextInt();
                                                        switch(pasajero3){
                                                            case 1: {
                                                                System.out.println("\n\n   *********************************************");
                                                                System.out.println("    Ha perdido, la Caperucita se comio las uvas ");
                                                                System.out.println("   *********************************************\n");
                                                                System.out.println("¿Desea continuar?");
                                                                System.out.println("1. SI       2. NO ");
                                                                 System.out.println("Ingrese su eleccion: ");
                                                                inicio = leer.nextInt();
                                                                break;
                                                            }
                                                            case 2: {
                                                                System.out.println("\n\n   *********************************************");
                                                                System.out.println("    Ha perdido, volvio a la posicion anterior ");
                                                                System.out.println("   *********************************************\n");
                                                                System.out.println("¿Desea continuar?");
                                                                System.out.println("1. SI       2. NO ");
                                                                System.out.println("Ingrese su eleccion: ");
                                                                inicio = leer.nextInt();
                                                                break;
                                                            }
                                                            case 3: {
                                                                System.out.println("\n\nA elegido a las uvas, ahora se encuentran del otro lado con el lobo");
                                                                System.out.println("¿Desea regresar con alguien?");
                                                                System.out.println("1. NADIE ");
                                                                System.out.println("2. LOBO ");
                                                                System.out.println("3. UVAS ");
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
                                                                            inicio = 2;
                                                                            break;
                                                                        }
                                                                        case 2: {
                                                                            System.out.println("\n\n   *********************************************");
                                                                            System.out.println("    Ha perdido, el lobo se comio a la Caperucita ");
                                                                            System.out.println("   *********************************************\n");
                                                                            System.out.println("¿Desea continuar?");
                                                                            System.out.println("1. SI       2. NO ");
                                                                            System.out.println("Ingrese su eleccion: ");
                                                                            inicio = leer.nextInt();
                                                                            break;
                                                                        }
                                                                        case 3: {
                                                                            System.out.println("\n\n   *********************************************");
                                                                            System.out.println("    Ha perdido, volvio a la posicion anterior ");
                                                                            System.out.println("   *********************************************\n");
                                                                            System.out.println("¿Desea continuar?");
                                                                            System.out.println("1. SI       2. NO ");
                                                                            System.out.println("Ingrese su eleccion: ");
                                                                            inicio = leer.nextInt();
                                                                            break;
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
        }
}
