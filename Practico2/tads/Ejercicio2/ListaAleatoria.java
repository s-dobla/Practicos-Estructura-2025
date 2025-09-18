package Practico2.tads.Ejercicio2;

import java.util.LinkedList;
import java.util.Random;


public class ListaAleatoria {
    public static LinkedList<Integer> generarListaAleatoria(int N)
    {
        LinkedList<Integer> lista = new LinkedList<>();
        Random random = new Random();

        for(int i = 0; i < N; i++)
        {
            int num = random.nextInt(100);
            lista.add(num);
        }
        return lista;
    }

    public static void main(String [] args)
    {
        int N = 10;
        LinkedList<Integer> listaGenerada = generarListaAleatoria(N);

        System.out.println("Lista de numeros aleatorios.");
        System.out.println(listaGenerada);

    }
}
