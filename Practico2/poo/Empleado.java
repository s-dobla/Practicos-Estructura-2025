// Clase abstracta
public abstract class Empleado {
    protected String nombre;
    protected double salarioTotal;

    public Empleado(String nombre) {
        this.nombre = nombre;
    }

    public abstract void calcularPago();

    public String getNombre() {
        return nombre;
    }

    public double getSalarioTotal() {
        return salarioTotal;
    }
}