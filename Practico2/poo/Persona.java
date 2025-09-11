public class Persona {
    private int dni;
    private String nombre;
    private String apellido;

public Persona(int dni, String nombre, String apellido) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public void mostrarInformacion() {
        System.out.println("Persona: " + nombre + " " + apellido + ", DNI: " + dni);
    }
}