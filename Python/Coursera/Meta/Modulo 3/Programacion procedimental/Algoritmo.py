# Definición de Algoritmo: Un algoritmo es una serie de pasos para completar una tarea o resolver un problema.

# Ejemplo Cotidiano: Seguir una receta para hacer una omelet, donde los ingredientes son las entradas y el omelet es la salida.

# Aplicación en Programación: Los algoritmos se utilizan para resolver problemas en programación, como verificar si una palabra es un palíndromo (se lee igual hacia adelante y hacia atrás).

# Proceso: Se descompone el problema en pasos más pequeños, se compara cada carácter desde el inicio y el final de la palabra.

# Código: Se muestra cómo implementar un algoritmo en Python para verificar palíndromos, utilizando funciones y bucles.

def is_palindrome(string):
    start_index = 0
    end_index = len(string) - 1
    
    for x in range(len(string) // 2):
        if string[start_index] != string[end_index]:
            return False
        start_index += 1
        end_index -= 1
        
    return True

# Prueba del algoritmo
print(is_palindrome("racecar"))  # Devuelve True
print(is_palindrome("racecars")) # Devuelve False

# Explicación del Código:

# Se define una función is_palindrome que toma una cadena como parámetro.
# Se inicializan los índices de inicio y fin.
# Se utiliza un bucle para comparar los caracteres desde ambos extremos.
# Si se encuentra una diferencia, se devuelve False. Si no, se devuelve True al final.