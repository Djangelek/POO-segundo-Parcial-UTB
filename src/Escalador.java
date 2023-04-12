public class Escalador extends Ciclista{
    //atributos
    private double aceleracionPromedioSubida;
    private double gradoRampaSoportada;

    //constructor
    public Escalador(int identificador, String nombre,int tiempoAcumulado, double aceleracionPromedioSubida, double gradoRampaSoportada) {
        super(identificador, nombre, tiempoAcumulado);
        this.aceleracionPromedioSubida = aceleracionPromedioSubida;
        this.gradoRampaSoportada = gradoRampaSoportada;
    }

    //Metodos
    //imprimir tipo
    @Override
    public String imprimirTipo() {
        return super.imprimirTipo()+"Escalador";
    }
    //toString
    @Override
    public String toString() {
        return super.toString()+", aceleracionPromedioSubida=" + aceleracionPromedioSubida+"(m/s2)" + ", gradoRampaSoportada="
                + gradoRampaSoportada+"(grados)";
    }

    //getters y setters
    public double getAceleracionPromedioSubida() {
        return this.aceleracionPromedioSubida;
    }
    public void setAceleracionPromedioSubida(double aceleracionPromedioSubida) {
        this.aceleracionPromedioSubida = aceleracionPromedioSubida;
    }
    public double getGradoRampaSoportada() {
        return this.gradoRampaSoportada;
    }
    public void setGradoRampaSoportada(double gradoRampaSoportada) {
        this.gradoRampaSoportada = gradoRampaSoportada;
    }
}
