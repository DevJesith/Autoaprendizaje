1. Refactorización
Definición: Es el proceso de reescribir o reorganizar el código para hacerlo más fácil de gestionar y más eficiente.

2. Eficiencia de Algoritmos
Medición: Se mide usando notación Big O, que clasifica los algoritmos según su complejidad de tiempo y espacio.

3. Complejidades de Tiempo: 

- Tiempo Constante (O(1)):

Ejemplo: Acceder a un valor en un diccionario usando una clave. No importa cuántos elementos haya, el tiempo de acceso es el mismo.

def obtener_valor(diccionario, clave):
    return diccionario[clave]

# Ejemplo de uso
mi_diccionario = {'a': 1, 'b': 2, 'c': 3}
print(obtener_valor(mi_diccionario, 'b'))  # Salida: 2

- Tiempo Lineal (O(n)):

Ejemplo: Buscar un número en un arreglo. Si el arreglo tiene 100 elementos, tomará más tiempo que si tiene 10 elementos.

def buscar_numero(arreglo, objetivo):
    for numero in arreglo:
        if numero == objetivo:
            return True
    return False

# Ejemplo de uso
mi_arreglo = [1, 2, 3, 4, 5]
print(buscar_numero(mi_arreglo, 3))  # Salida: True

- Tiempo Logarítmico (O(log n)):

Ejemplo: Búsqueda binaria. Si buscas un número en una lista ordenada, puedes dividir la lista en dos en cada paso, reduciendo significativamente el número de iteraciones.

def busqueda_binaria(arreglo, objetivo):
    izquierda, derecha = 0, len(arreglo) - 1
    while izquierda <= derecha:
        medio = (izquierda + derecha) // 2
        if arreglo[medio] == objetivo:
            return medio
        elif arreglo[medio] < objetivo:
            izquierda = medio + 1
        else:
            derecha = medio - 1
    return -1

# Ejemplo de uso
mi_arreglo_ordenado = [1, 2, 3, 4, 5, 6, 7, 8, 9]
print(busqueda_binaria(mi_arreglo_ordenado, 6))  # Salida: 5

- Tiempo Cuadrático (O(n²)):

Ejemplo: Un bucle anidado. Si tienes un bucle que itera sobre una lista y dentro de ese bucle hay otro que también itera sobre la misma lista, el tiempo total de ejecución se cuadruplica.

def burbuja(arreglo):
    n = len(arreglo)
    for i in range(n):
        for j in range(0, n-i-1):
            if arreglo[j] > arreglo[j+1]:
                arreglo[j], arreglo[j+1] = arreglo[j+1], arreglo[j]

# Ejemplo de uso
mi_arreglo = [64, 34, 25, 12, 22]
burbuja(mi_arreglo)
print(mi_arreglo)  # Salida: [12, 22, 25, 34, 64]

- Tiempo Exponencial (O(2^n)):

Ejemplo: La secuencia de Fibonacci. Cada número es la suma de los dos anteriores, lo que resulta en un crecimiento exponencial en el número de cálculos necesarios a medida que n aumenta.

def fibonacci(n):
    if n <= 1:
        return n
    return fibonacci(n-1) + fibonacci(n-2)

# Ejemplo de uso
print(fibonacci(5))  # Salida: 5

Conclusión:
Comprender estas complejidades es esencial para optimizar el código y mejorar su rendimiento. 