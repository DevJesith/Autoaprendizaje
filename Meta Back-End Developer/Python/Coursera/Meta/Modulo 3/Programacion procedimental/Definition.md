Definición: La programación procedural es un paradigma que organiza el código en procedimientos o funciones, que son secciones lógicas que realizan tareas específicas.
Ventajas:
Fácil de aprender para principiantes.
Permite la reutilización de código.
El código es más fácil de entender al dividirlo en tareas específicas.
Desventajas:
Puede ser difícil de mantener y extender.
No se relaciona bien con objetos del mundo real.
Los datos pueden estar expuestos en todo el programa.
Ejemplo

Imagina que quieres sumar dos números. En programación procedural, puedes crear una función para hacerlo:

def sumar(a, b):
    return a + b

# Usando la función
resultado1 = sumar(5, 10)
resultado2 = sumar(8, 4)

print(resultado1)  # Salida: 15
print(resultado2)  # Salida: 12

En este ejemplo:

La función sumar toma dos parámetros (a y b) y devuelve su suma.
Puedes reutilizar la función con diferentes números sin tener que escribir el código de suma nuevamente.

---------------------------------------------------------------------

Características de la Programación Procedural

Estructura: El código se organiza en funciones que realizan tareas específicas.
Reutilización: Las funciones pueden ser llamadas múltiples veces con diferentes argumentos, lo que evita la duplicación de código.
Secuencial: Las instrucciones se ejecutan en un orden específico, paso a paso.
Ejemplo Adicional

Supongamos que deseas calcular el total de una factura y agregar impuestos. Aquí hay un ejemplo de cómo podrías estructurarlo:

def total_factura(items):
    total = 0
    for item in items:
        total += item
    return total

def calcular_impuesto(porcentaje, total):
    return total * (porcentaje / 100)

# Lista de precios de los artículos
factura = [100, 200, 50]

# Calcular total y impuesto
total = total_factura(factura)
impuesto = calcular_impuesto(15, total)

print("Total de la factura:", total)  # Salida: Total de la factura: 350
print("Impuesto:", impuesto)           # Salida: Impuesto: 52.5

En este ejemplo:

total_factura suma los precios de los artículos.
calcular_impuesto calcula el impuesto basado en el total.