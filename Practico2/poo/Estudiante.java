public class Estudiante extends Persona{
    private boolean esRegu;
    private float prom;
    private int cantidadMateriasAprobadas;

    public Estudiante(int dni, String nombre, String apellido, boolean esRegu) {
        super(dni, nombre, apellido);
        this.esRegu = esRegu;
        this.prom = 0.0f;
        this.cantidadMateriasAprobadas = 0;
    }

    public void aproboMateria(int nota) {
        // Asumimos que la nota mínima para aprobar es 6
        if (nota >= 6) {
            // Actualizamos el promedio usando media acumulativa
            prom = (prom * cantidadMateriasAprobadas + nota) / (cantidadMateriasAprobadas + 1);
            cantidadMateriasAprobadas++;
        }
    }

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Estudiante - Regular: " + esRegu + ", Promedio: " + prom + ", Materias Aprobadas: " + cantidadMateriasAprobadas);
    }
    
    //EJEMPLO del metodo Main
    public static void main(String[] args) {
    Persona[] personas = new Persona[4];

    personas[0] = new Persona(11111111, "Nombre1", "Apellido1");
    personas[1] = new Estudiante(22222222, "Nombre2", "Apellido2", true);
    personas[2] = new Persona(33333333, "Nombre3", "Apellido3");
    personas[3] = new Estudiante(44444444, "Nombre4", "Apellido4", false);

    if (personas[1] instanceof Estudiante est1) {
        est1.aproboMateria(7);
        est1.aproboMateria(8);
    }

    if (personas[3] instanceof Estudiante est2) {
        est2.aproboMateria(9);
        est2.aproboMateria(6);
    }

    for (Persona persona : personas) {
        persona.mostrarInformacion();
        System.out.println("----------------------------");
    }
}

} 
