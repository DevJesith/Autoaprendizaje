# Definición : Un diccionario es una colección de pares clave-valor, similar a un diccionario real donde se busca una palabra (clave) para encontrar su definición (valor).

# Acceso a valores : puede acceder a valores utilizando sus claves, lo que hace que los diccionarios sean más rápidos que las listas.

# Mutabilidad : los valores de un diccionario se pueden cambiar o actualizar, pero las claves deben ser únicas.

# Operaciones : puede agregar, actualizar y eliminar elementos, así como iterar a través del diccionario utilizando diferentes métodos.

sample_dictionary = {1: "coffee", 2: "tea", 3: "juice"}

print(sample_dictionary[1])  # Esto devuelve "coffee"

sample_dictionary[2] = "mint tea"  # Cambia "tea" a "mint tea"

del sample_dictionary[3]  # Esto elimina "juice"

for key in sample_dictionary:
    print(key)  # Imprime las claves

for key, value in sample_dictionary.items():
    print(f"{key}: {value}")  # Imprime clave y valor