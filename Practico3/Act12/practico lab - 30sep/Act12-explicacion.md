Actividad 12 -

pow :: Int -> (Int -> Int)
pow x y = x ^ y
pow 5


pow2 :: Int -> Int
pow2 = pow 5 
po2 3 
= 
 5^3

-- Análisis del Perfil:
-- Num a =>: La base, x, debe ser de un tipo que pertenezca a la clase Num -- (ej. Int, Float, Double).
-- a ->: El primer argumento (x, la base) es de tipo a.
-- Int ->: El segundo argumento (y, el exponente) debe ser un entero Int.
-- a: El resultado de la función es del mismo tipo que la base.

-- 2. Currificación
-- Una función es currificada cuando, al ser llamada con un solo 
-- argumento, retorna una nueva función que espera el argumento restante.
-- En Haskell, la sintaxis estándar de múltiples argumentos (a -> b -> c) -- es inherentemente currificada.