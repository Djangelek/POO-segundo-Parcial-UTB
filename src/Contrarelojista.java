public class Contrarelojista extends Ciclista {
    //atributos
    private double velocidadMaxima;

    //constructor
    public Contrarelojista(int identificador, String nombre, int tiempoAcumulado, double velocidadMaxima) {
        super(identificador, nombre, tiempoAcumulado);
        this.velocidadMaxima = velocidadMaxima;
    }
    
    //Metodos
    //imprimir tipo

    @Override
    public String imprimirTipo() {
        return super.imprimirTipo()+"Contrarelojista";
    }
    //toString
    @Override
    public String toString() {
        return super.toString()+", velocidadMaxima=" + velocidadMaxima+"(Km/h)" ;
    }

    //getters y setters
    public double getVelocidadMaxima() {
        return this.velocidadMaxima;
    }
    public void setVelocidadMaxima(double velocidadMaxima) {
        this.velocidadMaxima = velocidadMaxima;
    }
}