# Definición: Una función es un bloque de código que realiza una tarea específica y puede ser reutilizado.

# Funciones Puras: Son funciones que no alteran el estado de las variables fuera de su propio ámbito. Esto significa que no modifican datos globales y siempre devuelven el mismo resultado para los mismos argumentos.

# Función No Pura:


my_list = [1, 2, 3]

# def add_to_list(item):
#     my_list.append(item)
#     return my_list

# add_to_list(4)  # Esto modifica my_list
# print(my_list)  # Salida: [1, 2, 3, 4]


# Transformación a Función Pura:
# Se crea una nueva lista en lugar de modificar la lista original.

def add_to_list(lst, item):
    nl = lst.copy()  # Copia la lista original
    nl.append(item)  # Agrega el nuevo elemento
    return nl  # Devuelve la nueva lista

new_list = add_to_list(my_list, 4)
print(my_list)  # Salida: [1, 2, 3]
print(new_list)  # Salida: [1, 2, 3, 4]

# En este ejemplo, la función add_to_list se convierte en una función pura porque no modifica my_list, sino que devuelve una nueva lista con el elemento agregado. Si tienes más preguntas o necesitas más ejemplos, ¡házmelo saber!
