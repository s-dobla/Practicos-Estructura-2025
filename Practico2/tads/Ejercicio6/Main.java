package Practico2.tads.Ejercicio6;

public class Main {
    public static void main(String[] args) {
        Lista<Integer> lista1 = new ListaEnlazada<>();
        lista1.insertarFin(10);
        lista1.insertarInicio(5);
        lista1.insertarPos(7, 1);
        lista1.imprimir(); // 5 7 10

        Lista<String> lista2 = new ListaArreglo<>();
        lista2.insertarFin("Hola");
        lista2.insertarInicio("Inicio");
        lista2.imprimir(); // Inicio Hola
    }
}
