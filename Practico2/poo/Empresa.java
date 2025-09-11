// Clase principal con el main
public class Empresa {
    public static void main(String[] args) {
        // Lista de empleados
        Empleado[] empleados = new Empleado[4];

        // Agregar empleados de diferentes tipos
        empleados[0] = new EmpleadoPorHora("Ana", 40, 15.5);
        empleados[1] = new EmpleadoMensual("Carlos", 2500);
        empleados[2] = new EmpleadoPorHora("Lucía", 30, 20);
        empleados[3] = new EmpleadoMensual("Miguel", 3000);

        // Calcular y mostrar pagos usando polimorfismo
        for (Empleado emp : empleados) {
            emp.calcularPago();
            System.out.println("Empleado: " + emp.getNombre() + " | Salario: $" + emp.getSalarioTotal());
        }
    }
}