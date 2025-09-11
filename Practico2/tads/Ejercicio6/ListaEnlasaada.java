package Practico2.tads.Ejercicio6;

public class ListaEnlasaada<T> implements Lista<T> {
    private Nodo<T> head;
    private int cantElem;

    public ListaEnlazada()
    {
        this.head = null;
        this.cantElem = 0;
    }

    public void insertarInicio(T elem)
    {
        Nodo<T> nuevo = new Nodo<T>(elem);
        nuevo.next = head;
        head = nuevo;
        cantElem++;
    }

    //insertarFin utilizar while(tmp.next != null) que el ultimo nodo no puntee a null.
    //
}
