import java.util.ArrayList;

public class Main2 {
  public static void main(String[] args) {
        // Crear cajas
        Caja<Integer> cajaEntero = new Caja<>();
        Caja<String> cajaTexto = new Caja<>();
        Caja<Persona> cajaPersona = new Caja<>();

        // Guardar valores
        cajaEntero.guardar(42);
        cajaTexto.guardar("Hola Mundo");
        cajaPersona.guardar(new Persona(12345678, "Juan", "Pérez"));

        // Mostrar información
        cajaEntero.mostrarInfo();
        cajaTexto.mostrarInfo();
        
        // Mostrar info específica de Persona
        Persona personaGuardada = cajaPersona.obtener();
        System.out.print("Contenido de la caja: ");
        personaGuardada.mostrarInformacion();

        // Crear lista de cajas genéricas
        ArrayList<Caja<?>> listaCajas = new ArrayList<>();
        listaCajas.add(cajaEntero);
        listaCajas.add(cajaTexto);
        listaCajas.add(cajaPersona);

        // Mostrar contenido de cada una
        System.out.println("\nMostrando contenido de lista de cajas:");
        for (Caja<?> caja : listaCajas) {
            Object contenido = caja.obtener();
            if (contenido instanceof Persona) {
                System.out.print("Contenido de la caja: ");
                ((Persona) contenido).mostrarInformacion();
            } else {
                System.out.println("Contenido de la caja: " + contenido);
            }
        }
    }
}
