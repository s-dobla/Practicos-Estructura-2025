package Practico2.tads.Ejercicio6;

public class ListaEnlazada<T> implements Lista<T> {
    private Nodo<T> head;
    private int cantElem;

    public ListaEnlazada()
    {
        this.head = null;
        this.cantElem = 0;
    }

    public void insertarInicio(T elem)
    {
        Nodo<T> nuevo = new Nodo<>(elem);
        nuevo.next = head;
        head = nuevo;
        cantElem++;
    }

    //insertarFin utilizar while(tmp.next != null) que el ultimo nodo no puntee a null.
    //

    public void insertarFin(T item)
    {
        Nodo<T> nuevo = new Nodo<>(item);
        if(head == null)
        {
            head = nuevo;
        }else{
            Nodo<T> tmp = head;
            while(tmp.next != null){
                tmp = tmp.next;
            }
            tmp.next = nuevo;
        }
        cantElem++;
    }

    public void insertarPos(T elem, int pos)
    {
        if(pos < 0 || pos > cantElem) throw new IndexOutOfBoundsException("Posicion invalida.");

        if(pos == 0)
        {
            insertarInicio(elem);
            return;
        }

        Nodo<T> nuevo = new Nodo<>(elem);
        Nodo<T> actual = head;
        for(int i= 0; i < pos - 1;i++)
        {
            actual = actual.next;
        }
        nuevo.next = actual.next;
        actual.next = nuevo;
        cantElem++;
    }

    public T eliminarPrimero()
    {
        if (head == null)  throw new IllegalStateException("Lista vacía.");
        T dato = head.dato;
        head = head.next;
        cantElem--;
        return dato;
    }

    public T eliminarUltimo()
    {
        if (head == null) throw new IllegalStateException("Lista vacía.");

        if(head.next == null)
        {
            T dato = head.dato;
            head = null;
            cantElem--;
            return dato;
        }

        Nodo<T> actual = head;
        while(actual.next.next != null)
        {
            actual = actual.next;
        }

        T dato = actual.next.dato;
        actual.next = null;
        cantElem--;
        return dato;
    }

    public T eliminarPos(int pos)
    {
        if(pos < 0 || pos >= cantElem) throw new IndexOutOfBoundsException("Posicion invalida.");

        if(pos == 0) return eliminarPrimero();

        Nodo<T> actual = head;
        for(int i = 0; i < pos - 1; i++)
        {
            actual = actual.next;
        }

        T dato = actual.next.dato;
        actual.next = actual.next.next;
        cantElem--;
        return dato;
    }

    public T obtenerPrimero()
    {
        if(head == null) throw new IllegalStateException("Lista vacia.");
        return head.dato;
    }

    public T obtenerUltimo()
    {
        if(head == null) throw new IllegalStateException("Lista vacía.");

        Nodo<T> actual = head;
        while(actual.next != null)
        {
            actual = actual.next;
        }
        return actual.dato;
    }

    public T obtenerElemPos(int pos)
    {
        if(pos < 0 || pos >= cantElem) throw new IndexOutOfBoundsException("Posicion invalida.");

        Nodo<T> actual = head;
        for(int i = 0; i < pos; i++)
        {
            actual = actual.next;
        }
        return actual.dato;
    }

    public int buscar(T item)
    {
        Nodo<T> actual = head;
        int pos = 0;
        while(actual != null)
        {
            if(actual.dato.equals(item)) return pos;
            actual = actual.next;
            pos++;
        } 
        return -1;
    }

    public int longitud()
    {
        return cantElem;
    }

    public boolean esVacia()
    {
        return cantElem == 0;
    }

    public void imprimir()
    {
        Nodo<T> actual = head;
        while(actual != null)
        {
            System.out.print(actual.dato + " ");
            actual = actual.next;
        }
        System.out.println();
    }
}

