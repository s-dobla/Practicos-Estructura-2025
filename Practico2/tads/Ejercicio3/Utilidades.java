package Practico2.tads.Ejercicio3;

import java.util.List;

public class Utilidades {
    
    public static boolean pertenece(List<Integer> lista, int numero) {
        for (int elemento : lista) {
            if (elemento == numero) {
                return true;
            }
        }
        return false;
    }

    // Método main para probar la función
    public static void main(String[] args) {
        List<Integer> numeros = List.of(10, 20, 30, 40, 50);

        int valorBuscado = 30;
        boolean resultado = pertenece(numeros, valorBuscado);
        System.out.println("¿El número " + valorBuscado + " pertenece a la lista? " + resultado);

        valorBuscado = 99;
        resultado = pertenece(numeros, valorBuscado);
        System.out.println("¿El número " + valorBuscado + " pertenece a la lista? " + resultado);
    }
}

