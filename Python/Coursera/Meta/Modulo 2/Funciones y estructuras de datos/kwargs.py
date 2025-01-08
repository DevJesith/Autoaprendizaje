# Permite pasar un número variable de argumentos nombrados (clave-valor) a una función.
# Se define utilizando dos asteriscos () antes del nombre (por ejemplo, `kwargs`).
# Dentro de la función, se puede acceder a los valores utilizando las claves y realizar operaciones con ellos.

def calcular_factura(**kwargs):
    total = 0
    for item, precio in kwargs.items():
        total += precio
        print(f"{item} : {precio}")
    return "El precio total es de: " , round(total,2)

resultado = calcular_factura(cafe=2.99, pastel=4.55, jugo=2.99)
print(resultado)  # Salida: 10.53

# Explicación:
# La función calcular_factura acepta cualquier número de argumentos nombrados.
# Se inicializa total en 0.
# Se itera sobre cada par clave-valor en kwargs y se suma el precio al total.
# Finalmente, se devuelve el total.