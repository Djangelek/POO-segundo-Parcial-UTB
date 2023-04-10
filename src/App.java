//Proyecto Parcial POO Segundo Corte primer semestre 2023
//Creado por: Angel De Jesus Tuñon Cuello - T00061280
//Juan David González Jiménez -T00068276

//scaner
import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {

    //creamos los equipos
    Equipo equipo1= new Equipo("Garmin", "Inglaterra");
    Equipo equipo2= new Equipo("Movistar", "España");

    //menu
    int opcion=0;
    Scanner scan= new Scanner(System.in);
    do{
        System.out.println("----------------------------------------------------------------");
        System.out.println("|                             Menu                             |");
        System.out.println("----------------------------------------------------------------");
        System.out.println("1. Añadir ciclista a un equipo");
        System.out.println("2. Imprimir datos de un equipo");
        System.out.println("3. Listar nombres de los ciclistas de un equipo por tipo");
        System.out.println("4. Buscar ciclista en un equipo");
        System.out.println("5. Salir");
        System.out.println("----------------------------------------------------------------");
        System.out.print("Ingrese una opcion: ");
        opcion= scan.nextInt();
        switch(opcion){
            case 1:
                //Menu para añadir ciclista a un equipo
                //preguntar que equipo
                //añadir ciclista al equipo
                do{
                    System.out.println("----------------------------------------------------------------");
                    System.out.println("|                 Añadir ciclista a un equipo                  |");
                    System.out.println("----------------------------------------------------------------");
                    System.out.println("A Cual equipo desea agregar un ciclista?");
                    System.out.println("1. Garmin");
                    System.out.println("2. Movistar");
                    System.out.println("----------------------------------------------------------------");
                    System.out.print("Ingrese una opcion: ");
                    opcion= scan.nextInt();
                    switch(opcion){
                        case 1:
                            equipo1.agregarCiclista();
                            break;
                        case 2:
                            equipo2.agregarCiclista();
                            break;
                        default:
                            System.out.println("Opcion no valida");
                            break;
                    }
                }while(opcion!=1 && opcion!=2);
                break;  
            case 2:
                //Menu para imprimir datos de un equipo
                //preguntar que equipo
                //imprimir datos del equipo
                do{
                    System.out.println("----------------------------------------------------------------");
                    System.out.println("|                 Imprimir datos de un equipo                  |");
                    System.out.println("----------------------------------------------------------------");
                    System.out.println("De que equipo desea imprimir los datos?");
                    System.out.println("1. Garmin");
                    System.out.println("2. Movistar");
                    System.out.println("----------------------------------------------------------------");
                    System.out.print("Ingrese una opcion: ");
                    opcion= scan.nextInt();
                    switch(opcion){
                        case 1:
                            equipo1.imprimirDatos();
                            break;
                        case 2:
                            equipo2.imprimirDatos();
                            break;
                        default:
                            System.out.println("Opcion no valida");
                            break;
                    }
                }while(opcion!=1 && opcion!=2);
                break;
            case 3:
                //Menu para listar nombres de los ciclistas de un equipo por tipo
                //preguntar que equipo
                //listar ciclistas del equipo
                do{
                    System.out.println("----------------------------------------------------------------");
                    System.out.println("|    Listar nombres de los ciclistas de un equipo por tipo     |");
                    System.out.println("----------------------------------------------------------------");
                    System.out.println("De que equipo desea listar los ciclistas?");
                    System.out.println("1. Garmin");
                    System.out.println("2. Movistar");
                    System.out.println("----------------------------------------------------------------");
                    System.out.print("Ingrese una opcion: ");
                    opcion= scan.nextInt();
                    switch(opcion){
                        case 1:
                            equipo1.listarCiclistas();
                            break;
                        case 2:
                            equipo2.listarCiclistas();
                            break;
                        default:
                            System.out.println("Opcion no valida");
                            break;
                    }
                }while(opcion!=1 && opcion!=2);
                break;
            case 4:
                //Menu para buscar ciclista en un equipo
                //preguntar que equipo
                //buscar ciclista en el equipo

                do{
                    System.out.println("----------------------------------------------------------------");
                    System.out.println("|                 Buscar ciclista en un equipo                 |");
                    System.out.println("----------------------------------------------------------------");
                    System.out.println("En que equipo desea buscar el ciclista?");
                    System.out.println("1. Garmin");
                    System.out.println("2. Movistar");
                    System.out.println("----------------------------------------------------------------");
                    System.out.print("Ingrese una opcion: ");
                    opcion= scan.nextInt();
                    switch(opcion){
                        case 1:
                            equipo1.buscarCiclista();
                            break;
                        case 2:
                            equipo2.buscarCiclista();
                            break;
                        default:
                            System.out.println("Opcion no valida");
                            break;
                    }
                }while(opcion!=1 && opcion!=2);
                break;
            case 5:
                //salir
                System.out.println("Gracias por usar el programa");
                break;
            default:
                System.out.println("Opcion no valida");
                break;
            }
        }while(opcion!=5);
        //cerrar scanner
        scan.close();
    }
}
