# RESUMEN HASKELL (APRENDE A HASKELL POR EL BIEN DE TODOS).

Haskell es un lenguaje de programacion funcional. Esto quiere decir que ni decimos al computador lo que tiene que hacer, sino mas bien, decimos como son las cosas. 
Se expresa con funciones. No establecemos una variable a algo y luego cambiarla. Por ej, si decimos que a=5, no podemos decir que es otra cosa.
Por esto mismo los lenguajes funcionales, las funciones no tienen efectos secundarios. Lo unico que se puede hacer con una funcion, es calcular y luego devolver algo como resultado. 
Algunos pro: Si una funcion es llamada dos veces con los mismos parametros, obtendremos siempre el mismo resultado. A esto lo llamamos: TRANSPARENCIA REFERENCIAL. Que no solo permite al compilador razonar acerca de el comportamiento de un programa, sino que tambien nos permite deducir facilmente (e incluso demostrar) que una funcion es correcta y asi poder construir funciones mas complejas uniendo funciones simples. 

Haskell es PEREZOSO. A menos que le indiquemos lo contrario, haskell no ejecutara funciones ni calculara resultados hasta que se vea realmente forzado a hacerlo. Vemos a los programas como una serie de transformaciones de datos. Nos permite hacer estructuras de datos infinitas. 
Cuando queremos calcular algo a partir de unos datos iniciales en un lenguaje perezoso, solo tenemos que tomar estos datos e ir transformandolos y moldeandolos hasta que se parezcan al resultado que deseamos.

Haskell es un lenguaje TIPIFICADO ESTATICAMENTE. Cuando COMPILAMOS un programa, el compilador sabe que trozos de codigo son enteros, cuales cadenas de texto, etc. Por esto muchos errores son capturados en tiempo de compilacion. 
Haskell posee INDIFERENCIA DE TIPOS. Esto significa que no tenemos que etiquetar cada trozo de codigo, ya que el sistema de tipo lo puede deducir de forma inteligente. Esto tambien nos permine que el codigo sea mas general. 

## EMPEZANDO.
Una vez instalado todo lo que haya que instalar, y vemos algunos ejemplos de como se usa. por ejemplo: 
 :set prompt "ghci>" //Es el apuntador que sugiere que utilicemos.
 Hicimos un ejemplo de Aritmetica simple. Podemos escribir en una misma linea varias operaciones de forma que se sigan todas las reglas de precedencia. Podemos usar parentesis para utilizar una precedencia explicita.
Una dificultad es cuando negamos numeros, siempre sera mejor rodear los numeros negativos con parentesis. Ej: 5 * -3 *NO*; 
5 * (-3) *FUNCIONARA*.

La Algebra Booleana es bastante simple: 
&& representa el Y logico, || representa el O logico, not niega True (notTrue es false) o False (notFalse es true).
Ej: 
 5 == 5 --> es True
 5 == 4 --> es False
Ej 2:
 5 + "texto" --> mensaje de error.
Nos esta diciendo que "texto" no es un numero y por lo tanto no sabe como sumarlo a 5. El signo (+) espera que su parte izq y der sean numeros.
Mientras que el signo (+) funciona solo con cosas consideradas numeros, el == funciona con cualquier cosa que pueda ser comparada. El truco esta en que ambas deben ser comparables entre si.

Funciones Infijas:
 ejemplo: El signo (*) es una funcion que toma dos numeros y los multiplica (4 * 5). Lo llamamos haciendo un sandwich sobre él.

Funciones Prefijas:
 Las funciones son prefijas en Haskell. 
 Las funciones son llamadas escribiendo: su nombre, un espacio y sus parametros, separados por espacios.
  Ejemplo: succ 8 --> 9 (resultado).
 La funcion succ toma cualquier cosa que tenga definido un sucesor y devuelve ese sucesor. Hemos: separado el nombre de la funcion y su parametro por un espacio. Llamar a una funcion con varios parametross es igual de sencillo.
 Ejemplo 2: min 9 10 --> 9
            min 3.4 3.2 --> 3.2
            max 100 101101 --> 101101
La aplicacion de funciones (llamar a una func poniendo un espacio despues de ella y luego escribir sus parametros) tiene la maxima prioridad. 
 Ejemplo 3: 
 Estas expresiones son equivalentes.
  ghci> succ 9 + max 5 4 + 1
   16
  ghci> (succ 9) + (max 5 4) + 1
   16
 Si hubiésemos querido obtener el sucesor del producto de los números 9 y 10, no podríamos haber escrito succ 9 * 10 porque hubiésemos obtenido el sucesor de 9, el cual hubiese sido multiplicado por 10, obteniendo 100. Tenemos que escribir succ (9 * 10) para obtener 91.

Si una funcion toma dos parametros tambien podemos llamarla como una Funcion Infija, rodeandola con acentos abiertos. 
 92 `div` 10 --> 9 
Se utiliza asi por si hay alguna confuncion como que numero esta haciendo la division y cual esta siendo dividido. 

