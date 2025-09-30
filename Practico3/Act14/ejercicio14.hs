-- La función es inherentemente currificada
sumarTres :: Num a => a -> a -> a -> a
sumarTres x y z = x + y + z

-- Análisis del Perfil:
-- Num a =>: Indica que la función trabaja con cualquier tipo de dato a 
-- que sea miembro de la clase Num (ej. Int, Float, Double).
-- a -> a -> a -> a: Muestra que la función espera tres argumentos del 
-- tipo a y retorna un resultado del tipo a.