# Los conjuntos son colecciones que almacenan valores únicos, lo que significa que no permiten duplicados.

# Los conjuntos no están ordenados, lo que significa que no se puede acceder a los elementos por índice.

set_a = {1, 2, 3, 4, 5, 5}
set_b = {4, 5, 6, 7, 8, 9}

# Los métodos clave incluyen:

# add() : agrega un elemento al conjunto.

# set_a.add(6)

# print(set_a)

# remove() : elimina un elemento especificado.

# set_a.remove(2)

# print(set_a)


# discard() : similar a remove pero no genera un error si no se encuentra el elemento.
# set_a.discard(2)

# print(set_a)


# Los conjuntos admiten operaciones matemáticas:

# Unión : combina dos conjuntos, eliminando los duplicados (por ejemplo, set_a.union(set_b)).

print(set_a.union(set_b))
print(set_a | set_b)


# Intersección : Devuelve elementos comunes (por ejemplo, set_a.intersection(set_b)).

print(set_a.intersection(set_b))
print(set_a & set_b)

# Diferencia : Elementos en un conjunto pero no en el otro (por ejemplo, set_a.difference(set_b)).

print(set_a.difference(set_b))
print(set_a - set_b)

# Diferencia simétrica : elementos en cualquiera de los conjuntos pero no en ambos (por ejemplo, set_a.symmetric_difference(set_b)).

print(set_a.symmetric_difference(set_b))
print(set_a ^ set_b)


