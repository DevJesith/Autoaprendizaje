# Definición : Las tuplas son estructuras de datos que pueden almacenar diferentes tipos de datos.
# Inmutabilidad : las tuplas son inmutables, lo que significa que sus valores no se pueden cambiar después de su creación.

#Se puede declarar con () y sin ()
my_tuple = (1, "string", 4.5, True)

# Métodos :

# count(value):Devuelve el número de ocurrencias de un valor.
print(my_tuple.count("string"))

# index(value):Devuelve el índice de la primera aparición de un valor.
print(my_tuple.index(4.5))

for x in my_tuple:
    print(x)