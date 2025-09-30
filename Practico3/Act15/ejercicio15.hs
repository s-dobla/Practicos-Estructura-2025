-- Perfil de la función: toma dos números y retorna su suma más 4..
addFour :: Num a => a -> a -> a

-- Definición de la función (currificada)
addFour y z = 4 + y + z


-- Análisis
-- Función Currificada de Dos Argumentos: El perfil a -> a -> a indica que 
-- addFourIndependent es una función currificada que espera dos argumentos.
-- Llamada Parcial (Implícita):
--Paso 1: Se llama a la función con el primer argumento: addFourIndependent 5.
--Esto devuelve una nueva función equivalente a λz. 4+5+z.
--Paso 2: La función resultante recibe el último argumento: 
-- (addFourIndependent 5) 8.
-- Cálculo Final: El resultado es la suma: 4+5+8=17.
-- Esta definición logra el mismo objetivo de sumar 4, 5 y 8, pero lo 
-- hace de forma independiente, sin depender de la función sumarTres 
-- definida previamente.