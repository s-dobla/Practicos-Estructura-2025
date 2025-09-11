// Subclase EmpleadoPorHora
public class EmpleadoPorHora extends Empleado {
    private int horasTrabajadas;
    private double tarifaPorHora;

    public EmpleadoPorHora(String nombre, int horasTrabajadas, double tarifaPorHora) {
        super(nombre);
        this.horasTrabajadas = horasTrabajadas;
        this.tarifaPorHora = tarifaPorHora;
    }

    @Override
    public void calcularPago() {
        salarioTotal = horasTrabajadas * tarifaPorHora;
    }
}