package Practico2.tads.Ejercicio6;
//public class ListaArreglo <T> implements Lista<T>{
//private T[] 
//Desplazar el arreglo para poner un n en la posicion 0. 
//Desplazamos todo con un for.
//}

import java.util.Arrays;

public class ListaArreglo<T> implements Lista<T> {
    private T[] arreglo;
    private int cantElem;
    private static final int CAPACIDAD_INICIAL = 10;

    public ListaArreglo() {
        arreglo = (T[]) new Object[CAPACIDAD_INICIAL];
        cantElem = 0;
    }

    private void asegurarCapacidad() {
        if (cantElem == arreglo.length) {
            arreglo = Arrays.copyOf(arreglo, arreglo.length * 2);
        }
    }

    public void insertarInicio(T elem) {
        asegurarCapacidad();
        for (int i = cantElem; i > 0; i--) {
            arreglo[i] = arreglo[i - 1];
        }
        arreglo[0] = elem;
        cantElem++;
    }

    public void insertarFin(T item) {
        asegurarCapacidad();
        arreglo[cantElem++] = item;
    }

    public void insertarPos(T elem, int pos) {
        if (pos < 0 || pos > cantElem) throw new IndexOutOfBoundsException("Posición inválida");

        asegurarCapacidad();
        for (int i = cantElem; i > pos; i--) {
            arreglo[i] = arreglo[i - 1];
        }
        arreglo[pos] = elem;
        cantElem++;
    }

    public T eliminarPrimero() {
        if (cantElem == 0) throw new IllegalStateException("Lista vacía");

        T eliminado = arreglo[0];
        for (int i = 0; i < cantElem - 1; i++) {
            arreglo[i] = arreglo[i + 1];
        }
        cantElem--;
        return eliminado;
    }

    public T eliminarUltimo() {
        if (cantElem == 0) throw new IllegalStateException("Lista vacía");
        return arreglo[--cantElem];
    }

    public T eliminarPos(int pos) {
        if (pos < 0 || pos >= cantElem) throw new IndexOutOfBoundsException("Posición inválida");

        T eliminado = arreglo[pos];
        for (int i = pos; i < cantElem - 1; i++) {
            arreglo[i] = arreglo[i + 1];
        }
        cantElem--;
        return eliminado;
    }

    public T obtenerPrimero() {
        if (cantElem == 0) throw new IllegalStateException("Lista vacía");
        return arreglo[0];
    }

    public T obtenerUltimo() {
        if (cantElem == 0) throw new IllegalStateException("Lista vacía");
        return arreglo[cantElem - 1];
    }

    public T obtenerElemPos(int pos) {
        if (pos < 0 || pos >= cantElem) throw new IndexOutOfBoundsException("Posición inválida");
        return arreglo[pos];
    }

    public int buscar(T item) {
        for (int i = 0; i < cantElem; i++) {
            if (arreglo[i].equals(item)) return i;
        }
        return -1;
    }

    public int longitud() {
        return cantElem;
    }

    public boolean esVacia() {
        return cantElem == 0;
    }

    public void imprimir() {
        for (int i = 0; i < cantElem; i++) {
            System.out.print(arreglo[i] + " ");
        }
        System.out.println();
    }
}

