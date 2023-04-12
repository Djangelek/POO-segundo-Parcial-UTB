 import java.util.Vector;
 import java.util.Scanner;
public class Equipo {
    //ATRIBUTOS
    private String nombreEquipo;
    private String paisEquipo;
    private int sumaTiempoCarrera;
    private Vector<Object> Ciclistas;

    //CONSTRUCTORES
    
    public Equipo(String nombreEquipo, String paisEquipo) {
        this.nombreEquipo = nombreEquipo;
        this.paisEquipo = paisEquipo;
        this.sumaTiempoCarrera = 0;
        this.Ciclistas = new Vector<Object>();
    }

    //METODOS
    Scanner sc = new Scanner(System.in);
    public void imprimirDatos(){
        // metodo calcularTiempoCarrera
        calcularTiempoCarrera();
        System.out.println("----------------------------------------------------------------");
        System.out.println("|                Imprimir datos de un equipo                   |");
        System.out.println("----------------------------------------------------------------");
        System.out.println("Nombre del equipo: "+this.nombreEquipo);
        System.out.println("País del equipo: "+this.paisEquipo);
        System.out.println("Suma de los tiempos de carrera de sus ciclistas: "+this.sumaTiempoCarrera);
        System.out.print("Ciclistas del equipo: ");
        //imprimir todos los datos de los ciclistas
        for(int i=0; i<Ciclistas.size(); i++){
            System.out.print(((Ciclista) Ciclistas.elementAt(i)).getNombre()+", ");
        }
        System.out.println("");
        System.out.println("----------------------------------------------------------------");
    }
    
    public void agregarCiclista(){
        //pedir datos del ciclista
        //preguntar de que tipo es
        //añadirlo al array de ciclistas
        int identificador;
        String nombre;
        //preguntar de que tipo es con scanner

        System.out.println("----------------------------------------------------------------");
        System.out.println("|                 Añadir ciclista a un equipo                  |");
        System.out.println("----------------------------------------------------------------");
        //Verificar que el identiicador no este repetido 

        do{System.out.print("Ingrese el identificador del ciclista: ");
        identificador = sc.nextInt();
        for(int i=0; i<Ciclistas.size(); i++){
            if(identificador == ((Ciclista) Ciclistas.elementAt(i)).getIdentificador()){
                System.out.println("El identificador ya existe, ingrese otro");
                identificador = -1;
            }
        }}while(identificador<0);

        System.out.print("Ingrese el nombre del ciclista: ");
        nombre = sc.next();

        int tiempoAcumulado;
        do{System.out.print("Ingrese el tiempo del ciclista (minutos): ");
        tiempoAcumulado = sc.nextInt();
        }while(tiempoAcumulado<0);

        //pedir el tipo de ciclista con un do while
        int tipo;
        
        do{
            System.out.println("----------------------------------------------------------------");
            System.out.println("|                Ingrese el tipo de ciclista                   |");
            System.out.println("----------------------------------------------------------------");
        System.out.println("1. Contrarelojista");
        System.out.println("2. Escalador");
        System.out.println("3. Velocista");
        System.out.println("----------------------------------------------------------------");
        System.out.print("Ingrese opcion: ");
        tipo = sc.nextInt();}while(tipo<1 || tipo>3);
        

        //switch con do while para pedir datos de cada tipo de ciclista
        switch(tipo){
            case 1:
                double velocidadMaxima;
                do{
                    System.out.print("Ingrese la velocidad máxima del ciclista (Km/h): ");
                    velocidadMaxima = sc.nextDouble();
                }while(velocidadMaxima<0);
                Contrarelojista contrarelojista1 = new Contrarelojista(identificador, nombre,tiempoAcumulado, velocidadMaxima);
                this.Ciclistas.add(contrarelojista1);
                break;
            case 2:
                double aceleracionPromedioSubida;
                double gradoRampaSoportada;
                do{
                    System.out.print("Ingrese la aceleracion Promedio de Subida del ciclista  (m/s2) : ");
                    aceleracionPromedioSubida = sc.nextDouble();
                }while(aceleracionPromedioSubida<0);
                do{
                    System.out.print("Ingrese el grado de rampa soportada del ciclista (grados): ");
                    gradoRampaSoportada = sc.nextDouble();
                }while(gradoRampaSoportada<0);

                Escalador Escalador1 = new Escalador(identificador, nombre,tiempoAcumulado, aceleracionPromedioSubida,  gradoRampaSoportada);
                this.Ciclistas.add(Escalador1);
                break;
            case 3:
                double potenciaPromedio;
                double velocidadPromedioSprint;
                do{
                    System.out.print("Ingrese la potencia promedio del ciclista (en vatios): ");
                    potenciaPromedio = sc.nextDouble();
                }while(potenciaPromedio<0);
                do{
                    System.out.print("Ingrese la velocidad promedio del ciclista (Km/h): ");
                    velocidadPromedioSprint = sc.nextDouble();
                }while(velocidadPromedioSprint<0);

                Velocista Velocista1 = new Velocista(identificador, nombre,tiempoAcumulado, potenciaPromedio, velocidadPromedioSprint );
                this.Ciclistas.add(Velocista1);
                break;
            default:
                System.out.println("Opción no válida");
                break;
        }
        System.out.println("----------------------------------------------------------------");
    }
    public void calcularTiempoCarrera(){
        //sumar tiempos de carrera de los ciclistas
        int sumatoria=0;
        for(int i=0; i<Ciclistas.size(); i++){
            sumatoria += ((Ciclista) Ciclistas.elementAt(i)).getTiempoAcumulado();
            this.sumaTiempoCarrera=sumatoria;
        }
    }
    public void listarCiclistas(){
        System.out.println("----------------------------------------------------------------");
        System.out.println("|                 Lista de ciclistas por tipo                  |");
        System.out.println("----------------------------------------------------------------");

        //listar ciclistas por tipo
        System.out.print("Escaladores:");
        for(int i=0; i<Ciclistas.size(); i++){
            //if ciclista pertenece a escalador
            if(Ciclistas.elementAt(i) instanceof Escalador){
                System.out.print(((Ciclista) Ciclistas.elementAt(i)).getNombre()+",");
            }
        }
        System.out.println();
        System.out.println("----------------------------------------------------------------");
        System.out.print("Contrarelojistas:");
        for(int i=0; i<Ciclistas.size(); i++){
            //if ciclista pertenece a contrarelojista
            if(Ciclistas.elementAt(i) instanceof Contrarelojista){
                System.out.print(((Ciclista) Ciclistas.elementAt(i)).getNombre()+",");
            }
        }
        System.out.println();
        System.out.println("----------------------------------------------------------------");
        System.out.print("Velocistas:");
        for(int i=0; i<Ciclistas.size(); i++){
            //if ciclista pertenece a velocista
            if(Ciclistas.elementAt(i) instanceof Velocista){
                System.out.print(((Ciclista) Ciclistas.elementAt(i)).getNombre()+",");
            }
        }
        System.out.println();
        System.out.println("----------------------------------------------------------------");
    }
    public void buscarCiclista(){
        //buscar ciclista por identificador
        int identificador;
        do{System.out.print("Ingrese el identificador del ciclista: ");
        identificador = sc.nextInt();}while(identificador<0);
        System.out.println("----------------------------------------------------------------");

        int intentos=0;
        for(int i=0; i<Ciclistas.size(); i++){
            if(((Ciclista) Ciclistas.elementAt(i)).getIdentificador() == identificador){
                System.out.println("Ciclista encontrado");
                //Metodo toString pero verificando que subclase es
                if(Ciclistas.elementAt(i) instanceof Escalador){
                    System.out.println(((Escalador) Ciclistas.elementAt(i)).toString());
                }
                else if(Ciclistas.elementAt(i) instanceof Contrarelojista){
                    System.out.println(((Contrarelojista) Ciclistas.elementAt(i)).toString());
                }
                else if(Ciclistas.elementAt(i) instanceof Velocista){
                    System.out.println(((Velocista) Ciclistas.elementAt(i)).toString());
                }                
            }else {
                intentos++;
                if(intentos==Ciclistas.size()){
                    System.out.println("Ciclista no encontrado");
            }
            }
        }
    }
}
