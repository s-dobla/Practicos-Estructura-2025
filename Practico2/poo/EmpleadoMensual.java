// Subclase EmpleadoMensual
public class EmpleadoMensual extends Empleado {
    private double salarioMensual;

    public EmpleadoMensual(String nombre, double salarioMensual) {
        super(nombre);
        this.salarioMensual = salarioMensual;
    }

    @Override
    public void calcularPago() {
        salarioTotal = salarioMensual;
    }
}
