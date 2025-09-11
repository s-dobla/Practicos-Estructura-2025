public class Caja<T> {
    private T contenido;

    public void guardar(T item){
        this.contenido = item;
    }

    public T obtener(){
        return contenido;
    }

    public void mostrarInfo(){
        if(contenido != null){
            System.out.println("Contenido de la caja: " + contenido.toString());
        } else{
            System.out.println("La caja esta vacia.");
        }
    }
}
