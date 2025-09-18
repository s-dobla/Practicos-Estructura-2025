package Practico2.tads.Ejercicio6;

public interface Lista <T>{
    void insertarFin(T item);
    void insertarInicio(T elem);
    void insertarPos(T elem, int pos);

    T eliminarUltimo();
    T eliminarPrimero();
    T eliminarPos(int pos);

    T obtenerPrimero();
    T obtenerUltimo();
    T obtenerElemPos(int pos);

    int buscar(T item);
    int longitud();
    boolean esVacia();
    void imprimir();
}
