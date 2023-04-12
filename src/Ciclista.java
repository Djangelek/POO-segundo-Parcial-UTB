public class Ciclista {
    //atributos
    private int identificador;
    private String nombre;
    private int tiempoAcumulado;
    //constructor
    public Ciclista(int identificador, String nombre, int tiempoAcumulado) {
        this.identificador = identificador;
        this.nombre = nombre;
        this.tiempoAcumulado=tiempoAcumulado;
    }
    //metodos
    public String imprimirTipo() {
        return "Es un ";
    }

    public String toString() {
        return "identificador=" + identificador + ", nombre=" + nombre + ", tiempoAcumulado="
                + tiempoAcumulado+("(minutos)") + ", tipo=" + imprimirTipo();
    }

    //getters y setters
    public int getIdentificador() {
        return identificador;
    }
    public void setIdentificador(int identificador) {
        this.identificador = identificador;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int getTiempoAcumulado() {
        return tiempoAcumulado;
    }
    public void setTiempoAcumulado(int tiempoAcumulado) {
        this.tiempoAcumulado = tiempoAcumulado;
    }
}
