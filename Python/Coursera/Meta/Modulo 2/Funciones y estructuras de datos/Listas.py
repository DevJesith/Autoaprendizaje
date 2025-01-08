# Definición: Una lista es una secuencia de uno o más tipos de datos diferentes o similares. Es un arreglo dinámico que puede contener cualquier tipo de dato.


list1 = [1, 2, 3, 4, 5]

# Se imprime sin los corchetes
print(*list1)

# Se imprime con los corchetes
print(list1)
print(list1, sep = " ")

# Agregar elementos:

    # insert(index, value): Inserta un valor en un índice específico.

list1.insert(0, 8)
print(list1)

    # append(value): Agrega un valor al final de la lista.

list1.append(9)
print(list1)

    # extend([value1, value2]): Agrega múltiples valores al final.
list1.extend([10, 11, "hola"])
print(list1)


# Eliminar elementos:

    # pop(index): Elimina y devuelve el elemento en el índice especificado.

list1.pop(7)
print(list1)

    # del list[index]: Elimina el elemento en el índice especificado.

del list1[4]
print(list1)

for x in list1:
    print(x)