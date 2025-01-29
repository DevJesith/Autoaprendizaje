# Recursion

- Definición: La recursión es un método en programación donde una función se llama a sí misma para resolver un problema dividiéndolo en subproblemas más pequeños.

- Uso: Es útil para problemas que tienen múltiples ramas y son demasiado complejos para abordarlos de manera iterativa.

## Ejemplo de Cálculo del Factorial:

El video presenta dos enfoques para calcular el factorial de un número, usando un número como 5.

### Enfoque Iterativo (con bucle):

```py
def factorial_iterativo(n):
    if n < 0:
        return 0  # No se puede calcular el factorial de un número negativo
    factorial = 1
    for i in range(1, n + 1):
        factorial *= i
    return factorial

# Ejemplo de uso
resultado_iterativo = factorial_iterativo(5)
print(resultado_iterativo)  # Salida: 120
```

- Función: Acepta un número entero `n`.

- Condición: Si n es menor que 0, retorna 0 (no se puede calcular el factorial de un número negativo).

- Inicialización: Se establece factorial en 1.

- Bucle: Se itera desde 1 hasta n (en este caso, 5):

- Multiplica factorial por cada número en el rango.

- Resultado: Al final, retorna 120 (1 2 3 4 5).


### Enfoque Recursivo:

```python
def factorial_recursivo(n):
    if n == 1:
        return 1  # Condición base
    else:
        return n * factorial_recursivo(n - 1)

# Ejemplo de uso
resultado_recursivo = factorial_recursivo(5)
print(resultado_recursivo)  # Salida: 120
```

- Función: Acepta un número entero n.

- Condición Base: Si n es 1, retorna 1.

- Llamada Recursiva: Si n es mayor que 1, retorna n multiplicado por la llamada a la misma función con n - 1.

Por ejemplo, factorial(5) llama a factorial(4), que llama a factorial(3), y así sucesivamente hasta llegar a factorial(1).

- Resultado: Al final, se acumula el resultado y se retorna 120.


### Ventajas de la Recursión

- Código más limpio: La recursión puede hacer que el código sea más legible y menos voluminoso.

- Descomposición de problemas: Permite dividir problemas complejos en subproblemas más simples.

### Desventajas de la Recursión

- Dificultad de seguimiento: Puede ser más difícil de entender y seguir que el código iterativo.
- Uso de memoria: Las funciones recursivas pueden ser costosas en términos de memoria y pueden ser ineficientes.
- Dificultad para depurar: Puede ser complicado depurar y seguir el flujo de ejecución.

### Recomendaciones

- Usar recursión: Para problemas que se pueden dividir naturalmente en subproblemas.

- Considerar la eficiencia: Evaluar si la recursión es la mejor opción en términos de rendimiento y memoria.

- Pruebas: Asegúrate de probar y depurar el código recursivo para evitar bucles infinitos.