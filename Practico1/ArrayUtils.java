import java.util.Arrays;
import java.util.HashSet;

/**
 * Clase ArrayUtils: contiene implementaciones de rutinas fundamentales
 * sobre arreglos.
 * 
 * @author N. Aguirre
 * @version 0.1
 */
public class ArrayUtils
{
    
    /**
     * Comprueba si un elemento (entero) pertenece a un arreglo.
     */
    public boolean pertenece(int elem, int[] arreglo) {
        if (arreglo == null)
            throw new IllegalArgumentException("Arreglo nulo");
        //TODO: Completar la implementación, reemplazando la línea siguiente
        for(int val : arreglo){
            if (val == elem) return true;
        }
        return false;
    }
    
    /**
     * Calcula la suma de los elementos de un arreglo de enteros
     */
    public int suma(int[] arreglo) {
        //TODO: Completar la implementación, reemplazando la línea siguiente
        if(arreglo == null)
        throw new IllegalArgumentException("Arreglo nulo");
        int suma = 0;
        for(int val : arreglo){
            suma += val;
        }
        return suma;
    }
    
    /**
     * Calcula el valor mínimo de un arreglo de reales
     */
    public float minimo(float[] arreglo) {
        //TODO: Completar la implementación, reemplazando la línea siguiente
        if(arreglo == null || arreglo.length == 0)
        throw new IllegalArgumentException("Arreglo vacio o nulo");
        float min = arreglo [0];
        for(float val: arreglo){
            if(val < min)
            min = val;
        }        
        return min;
    }
    
    /**
     * Calcula el valor máximo de un arreglo de reales
     */
    public float maximo(float[] arreglo) {
        //TODO: Completar la implementación, reemplazando la línea siguiente
        if(arreglo == null || arreglo.length == 0)
        throw new IllegalArgumentException("Arreglo vacio o nulo");
        float max = arreglo[0];
        for(float val: arreglo){
            if(val > max)
            max = val;
        }
        return max;
    }
    
    
    /**
     * Calcula el valor promedio de un arreglo de reales
     */
    public float promedio(float[] arreglo) {
        //TODO: Completar la implementación, reemplazando la línea siguiente
        if(arreglo == null || arreglo.length == 0)
        throw new IllegalArgumentException("Arreglo vacio o nulo");
        float suma = 0;
        for(float val: arreglo){
            suma+= val;
        }
        return suma/arreglo.length;
    }
    
    /**
     * Retorna un arreglo con los primeros n números de Fibonacci
     */
    public int[] fibSequence(int n) {
        //TODO: Completar la implementación, reemplazando la línea siguiente
        if(n < 0)
        throw new IllegalArgumentException("n debe ser >= 0");
        if (n == 0) return new int[0];
        if (n == 1) return new int[]{0};
        
        int[] fib = new int[n];
        fib[0] = 0;
        fib[1] = 1;
        for (int i = 2; i < n; i++) {
            fib[i] = fib[i - 1] + fib[i - 2];
        }
        return fib;
    }
    
    /**
     * Calcula la mediana de un arreglo de reales
     */
    public float mediana(float[] arreglo) {
        //TODO: Completar la implementación, reemplazando la línea siguiente.
        if (arreglo == null || arreglo.length == 0)
            throw new IllegalArgumentException("Arreglo vacío o nulo");
        float[] copia = Arrays.copyOf(arreglo, arreglo.length);
        Arrays.sort(copia);
        int n = copia.length;
        if (n % 2 == 1) {
            return copia[n / 2];
        } else {
            return (copia[(n / 2) - 1] + copia[n / 2]) / 2.0f;
        }
    }
    
    /**
     * Comprueba si dos arreglos de enteros son iguales
     */
    public boolean iguales(int[] arr1, int[] arr2) {
        //TODO: Completar la implementación, reemplazando la línea siguiente
         if (arr1 == null || arr2 == null) 
            return arr1 == arr2; // Ambos nulos => true, uno nulo => false
        if (arr1.length != arr2.length) return false;
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) return false;
        }
        return true;
    }
    
    /**
     * Comprueba si un arreglo tiene valores repetidos
     */
    public boolean tieneRepetidos(int[] arreglo) {
        //TODO: Completar la implementación, reemplazando la línea siguiente
        if (arreglo == null)
            throw new IllegalArgumentException("Arreglo nulo");
        HashSet<Integer> vistos = new HashSet<>();
        for (int val : arreglo) {
            if (vistos.contains(val)) return true;
            vistos.add(val);
        }
        return false;
    }
    
    /**
     * Comprueba si un arreglo tiene dos valores cuya suma dé cero.
     */
    public boolean tieneOpuestos(float[] arreglo) {
        //TODO: Completar la implementación, reemplazando la línea siguiente
        if (arreglo == null)
            throw new IllegalArgumentException("Arreglo nulo");
        HashSet<Float> vistos = new HashSet<>();
        for (float val : arreglo) {
            if (vistos.contains(-val)) return true;
            vistos.add(val);
        }
        return false;
    }
    
}
