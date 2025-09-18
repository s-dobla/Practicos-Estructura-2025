package Practico2.tads.Ejercicio4;

public class BubbleSortBasico {
    public static void main(String[] args) {
        int[] arreglo = {7, 9, 3, 1};
        int n = arreglo.length;

        System.out.print("Arreglo original: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arreglo[i] + " ");
        }
        System.out.println();

        // Ordenamiento burbuja
        for (int i = 0; i < n - 1; i++) {
            boolean huboCambio = false;

            for (int j = 0; j < n - 1 - i; j++) {
                if (arreglo[j] > arreglo[j + 1]) {
                    // Intercambio
                    int temp = arreglo[j];
                    arreglo[j] = arreglo[j + 1];
                    arreglo[j + 1] = temp;
                    huboCambio = true;
                }
            }

            // Mostrar el arreglo después de cada pasada
            System.out.print("Pasada " + (i + 1) + ": ");
            for (int k = 0; k < n; k++) {
                System.out.print(arreglo[k] + " ");
            }
            System.out.println();
        }

        System.out.print("Arreglo ordenado: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arreglo[i] + " ");
        }
        System.out.println();
    }
}
