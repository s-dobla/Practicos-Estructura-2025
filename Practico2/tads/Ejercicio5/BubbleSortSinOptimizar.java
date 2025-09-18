package Practico2.tads.Ejercicio5;

import java.util.ArrayList;

public class BubbleSortSinOptimizar {

    // Método que implementa Bubble Sort sin optimizaciones
    public static void bubbleSort(ArrayList<Integer> list) {
        int n = list.size();

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (list.get(j) > list.get(j + 1)) {
                    // Intercambiar elementos
                    int temp = list.get(j);
                    list.set(j, list.get(j + 1));
                    list.set(j + 1, temp);
                }
            }
        }
    }

    // Método principal para probar
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<>();
        numeros.add(7);
        numeros.add(3);
        numeros.add(1);
        numeros.add(9);
        numeros.add(4);

        System.out.println("Antes de ordenar: " + numeros);
        bubbleSort(numeros);
        System.out.println("Después de ordenar: " + numeros);
    }
}
