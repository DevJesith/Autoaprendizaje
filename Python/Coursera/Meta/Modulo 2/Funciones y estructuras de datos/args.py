# Permite pasar un número variable de argumentos no nombrados a una función.
# Se define utilizando un asterisco () antes del nombre (por ejemplo, `args`).
# Dentro de la función, se puede iterar sobre los argumentos pasados y realizar operaciones, como sumar.

def suma_total(*args):
    total = 0
    for numero in args:
        total += numero
    return total


resultado = suma_total(4, 5, 6)
print(resultado)  # Salida: 15

# Explicación:
# La función suma_total acepta cualquier número de argumentos.
# Se inicializa total en 0.
# Se itera sobre cada número en args y se suma al total.
# Finalmente, se devuelve el total.