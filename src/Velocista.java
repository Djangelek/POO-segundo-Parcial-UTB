public class Velocista extends Ciclista {
    //atributos
    private double potenciaPromedio;
    private double velocidadPromedioSprint;

    //constructor
    public Velocista(int identificador, String nombre,int tiempoAcumulado, double potenciaPromedio, double velocidadPromedioSprint) {
        super(identificador, nombre, tiempoAcumulado);
        this.potenciaPromedio = potenciaPromedio;
        this.velocidadPromedioSprint = velocidadPromedioSprint;
    }
    //metodos
    
    //imprimir tipo
    @Override
    public String imprimirTipo() {
        return super.toString()+"Velocista";
    }
    //toString
    @Override
    public String toString() {
        return super.toString()+", potenciaPromedio=" + potenciaPromedio+"(Vatios)" + ", velocidadPromedioSprint="
                + velocidadPromedioSprint+"(Km/h)" ;
    }

    //getters y setters
    public double getPotenciaPromedio() {
        return this.potenciaPromedio;
    }
    public void setPotenciaPromedio(double potenciaPromedio) {
        this.potenciaPromedio = potenciaPromedio;
    }
    public double getVelocidadPromedioSprint() {
        return this.velocidadPromedioSprint;
    }
    public void setVelocidadPromedioSprint(double velocidadPromedioSprint) {
        this.velocidadPromedioSprint = velocidadPromedioSprint;
    }
}