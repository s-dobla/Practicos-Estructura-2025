-- Tipo de la función: toma una lista de números 
-- (donde 'a' pertenece a la clase Num)
-- y retorna un único número del mismo tipo.
-- //sumaLista :: Num a => [a] -> a
-- Caso base: La suma de una lista vacía ( [] ) es cero.
-- //sumaLista [] = 0
-- Caso recursivo: La suma de una lista que no está vacía ( x:xs ) es
-- el primer elemento ( x ) más la suma de la lista restante ( xs ).
-- //sumaLista (x:xs) = x + sumaLista xs
-- /*Explicación del Código
-- *sumaLista :: Num a => [a] -> a: Esta es la firma de tipo (o type signature).
-- *Num a => indica que la función trabaja con cualquier tipo de dato a que pertenezca a la clase de tipos Num (es decir, cualquier tipo que soporte operaciones numéricas como la suma, como Int, Float, etc.).
-- *[a] -> a significa que la función toma una lista de elementos de tipo a ([a]) y devuelve un solo elemento de tipo a (a).
-- *sumaLista [] = 0: Este es el caso base (o primer pattern matching).
-- *Si la función recibe una lista vacía, representada por [], el resultado de la suma es 0. La recursión siempre terminará en este caso.
-- *sumaLista (x:xs) = x + sumaLista xs: Este es el caso recursivo (o segundo pattern matching).
-- *El patrón (x:xs) descompone la lista en su cabeza (x, el primer elemento) y su cola (xs, el resto de la lista).
-- *El resultado es la suma del primer elemento (x) con el resultado de llamar a sumaLista recursivamente con la cola de la lista (xs).
-- */



sumaLista :: Num a => [a] -> a
sumaLista [] = 0
sumaLista (x:xs) = x + sumaLista xs

--sumaLista [1,2]
--sumaLista (1:[2]) --x es 1 y xs es [2]


-- Usando Guardas
-- Es para usar con booleanos
-- sumList2 :: [Int] -> Int
-- sumList2 xs
--  | length xs == 0 = 0
--  | otherwise = head xs + sumList2 (tail xs) --//tail xs: saca el primer elemento. Sin esto sumaria toda la lista que es [1,2].



