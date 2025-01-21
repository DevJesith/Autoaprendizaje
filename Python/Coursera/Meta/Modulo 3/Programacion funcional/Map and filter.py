# Mapa :
# Propósito : aplica una función a cada elemento de un iterable (como una lista) y devuelve un objeto de mapa que contiene los resultados.
# Salida : incluye todos los elementos, incluso si la función retorna Nonealgunos.

# Ejemplo : Si utilizas mappara procesar una lista de cafés, devolverá una lista con todos los elementos originales, pero es posible que falten algunos Nonesi no cumplen la condición.


# Lista de cafés
menu = ["cappuccino", "latte", "cortado", "espresso"]

# Función para encontrar cafés que comienzan con 'C'
def find_coffee(coffee):
    if coffee[0] == 'c':
        return coffee

# Usando map
# map_coffee = map(find_coffee, menu)

# # Imprimir resultados
# for x in map_coffee:
#     print(x)


# filtro :
# Propósito : aplica una función a cada elemento en un iterable y devuelve un objeto de filtro que contiene solo los elementos para los cuales la función retorna True.
# Salida : Solo incluye elementos que cumplen la condición, filtrando efectivamente el resto.

# Ejemplo : Al usar filter la misma lista de cafés, se devolverán solo aquellos que coincidan con la condición, excluyendo cualquier Nonevalor.


# Usando filter
filter_coffee = filter(find_coffee, menu)

# Imprimir resultados
for x in filter_coffee:
    print(x)


# En este ejemplo, map devuelve todos los elementos, incluyendo None para aquellos que no cumplen la condición, mientras que filter solo devuelve los cafés que comienzan con la letra 'C'.