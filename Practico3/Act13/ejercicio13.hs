potencia :: Num a => a -> Int -> a
potencia x y = x ^ y

-- Perfil de la función: toma un entero (el exponente)
-- y retorna un número.
potenciaDeDos :: Num a => Int -> a

-- Definición: Aplicamos parcialmente la función 'potencia' 
-- fijando la base a 2.
potenciaDeDos = potencia 2

-- Prelude> :load funciones.hs
-- [1 of 1] Compiling Main ( funciones.hs, interpreted )
-- Ok, one module loaded.
-- *Main> potenciaDeDos 4
-- 16