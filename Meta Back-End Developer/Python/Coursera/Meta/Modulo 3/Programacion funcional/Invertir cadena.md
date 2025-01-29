# 🔄 Cómo invertir una cadena en Python 🔄
En Python, no hay una función incorporada para invertir una cadena, pero existen varias formas de hacerlo. Aquí te explico dos métodos comunes:

1. Usando slicing (corte de cadenas)
2. Usando recursión


## 📌 Método 1: Usando Slicing ([::-1])
Este es el método más simple y eficiente en Python. Utiliza la técnica de corte de cadenas (slicing) con un paso de -1.
cadena[inicio:final:paso]

🔹 Ejemplo:

```py
# Definir la cadena
cadena = "reversal"

# Invertir la cadena usando slicing
cadena_invertida = cadena[::-1]

# Imprimir la cadena invertida
print(cadena_invertida)  # Salida: "lasrever"
```
cadena[::-1]

* : → Indica que tomaremos toda la cadena.
* : → El segundo : se usa para definir el paso.
* -1 → Significa que recorreremos la cadena de derecha a izquierda, invirtiéndola.

Este método es rápido y eficiente, ya que se ejecuta en O(n) (donde n es la longitud de la cadena).

## 📌 Método 2: Usando Recursión
La recursión significa que una función se llama a sí misma hasta llegar a un caso base.

```py
def invertir_cadena(cadena):
    # Caso base: Si la cadena está vacía, retorna la cadena vacía
    if len(cadena) == 0:
        return cadena
    else:
        # Tomar el último carácter y concatenarlo con la inversión del resto de la cadena
        return cadena[-1] + invertir_cadena(cadena[:-1])

# Definir la cadena
cadena = "reversal"

# Invertir la cadena usando la función recursiva
cadena_invertida = invertir_cadena(cadena)

# Imprimir la cadena invertida
print(cadena_invertida)  # Salida: "lasrever"
```

## 🔍 Explicación:

* Caso base: Si la cadena está vacía (""), simplemente la devolvemos.
- Paso recursivo:
    * Tomamos el último carácter (cadena[-1]).
    * Llamamos a la función con la cadena sin el último carácter (cadena[:-1]).
    * Concatenamos el carácter tomado con el resultado de la función.

## ✅ ¿Cuál método es mejor?

Slicing ([::-1]), ✅ Rápido y eficiente (O(n)), ❌ Menos intuitivo para quienes no conocen slicing


# Explicacion de slicing
cadena[inicio:final:paso]
* inicio → Índice desde donde empieza el corte (incluido).
* final → Índice donde termina el corte (excluido).
* paso → Determina el salto entre caracteres (puede ser positivo o negativo)

## 🔹 Ejemplo 1: Tomar una parte de la cadena
```python
cadena = "Python"
print(cadena[0:4])  # Salida: "Pyth"
```

Explicación: Empieza en el índice 0 (P), termina en el índice 4 (excluye o).

## 🔹 Ejemplo 2: Usando paso

```py
cadena = "Python"
print(cadena[::2])  # Salida: "Pto"
```

Explicación: ::2 significa que tomamos toda la cadena pero saltando de 2 en 2 (P, t, o).

## 🔹 Ejemplo 3: Invertir una cadena

```py
cadena = "Python"
print(cadena[::-1])  # Salida: "nohtyP"
```
Explicación: [::-1] toma toda la cadena pero con un paso de -1, es decir, recorre de atrás hacia adelante, invirtiéndola.

- cadena[::-1]  # Invierte la cadena completamente
- cadena[2::-1]  # Invierte desde el índice 2 hasta el inicio
- cadena[:3:-1]  # Invierte desde el final hasta el índice 3 (sin incluirlo)

## 🔹 Ejemplo 1: cadena[::-1] (Invertir la cadena completamente)

```py
cadena = "Python"
print(cadena[::-1])  # Salida: "nohtyP"
```
 Se recorre de derecha a izquierda con -1.
  P   y   t   h   o   n   (Original)
  ↓   ↓   ↓   ↓   ↓   ↓   
  n   o   h   t   y   P   (Invertida)

🔹 Se recorre de derecha a izquierda con -1.


## 🔹 Ejemplo 2: cadena[2::-1] (Desde el índice 2 hasta el inicio, en orden inverso)

```py
cadena = "Python"
print(cadena[2::-1])  # Salida: "tyP"
```
📌 Cómo funciona (cadena[2::-1]):
Índices:   0    1    2    3    4    5
Cadena:    P    y    t    h    o    n
           ↑    ↑    ↑
           t    y    P   (Seleccionado e invertido)

🔹 Se inicia en el índice 2 (t) y se recorre hacia atrás hasta 0.

## 🔹 Ejemplo 3: cadena[:3:-1] (Desde el final hasta el índice 3, sin incluirlo)

```py
cadena = "Python"
print(cadena[:3:-1])  # Salida: "no"

```

Cómo funciona (cadena[:3:-1]):
Índices:   0    1    2    3    4    5
Cadena:    P    y    t    h    o    n
                               ↑    ↑  
                               n    o   (Seleccionado e invertido)

🔹 Se inicia desde el final (n en índice 5) hasta el índice 3 (h), sin incluirlo.

