import java.util.ArrayList;

public class Main3 {
    public static void main(String[] args) {
        ArrayList<Figura> figuras = new ArrayList<>();

        figuras.add(new Circulo(5));
        figuras.add(new Rectangulo(4, 6));
        figuras.add(new Triangulo(3, 4, 5));

        double areaTotal = 0;

        for (Figura f : figuras) {
            areaTotal += f.area();
        }

        System.out.println("Área total: " + areaTotal);
    }
}
