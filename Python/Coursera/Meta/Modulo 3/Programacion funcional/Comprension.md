# Comprensiones en Python

La comprensión de listas en Python es una forma de crear una nueva secuencia a partir de una secuencia ya existente. Existen cuatro tipos principales de comprensiones en Python:

1. Comprensión de la lista
2. Comprensión del diccionario
3. Comprensión del conjunto
4. Comprensión del generador

A continuación exploraremos cada uno de estos temas para aprender a usarlos.

## 1. Comprensión de la Lista

La sintaxis para la comprensión de listas es:

```python
[ <expresión> for x in <secuencia> if <condición>]
```

### Ejemplo 1: Filtrar múltiplos de cuatro

- Metodo Tradicional 

```py
new_data = [5, 6, 8, 10, 14, 16, 20, 22, 26, 32, 34]
fourx = []
for x in new_data:
    if x % 4 == 0:
        fourx.append(x)
print("Divisible por cuatro", fourx)

```

- Método de Comprensión:

```py
fourx = [x for x in new_data if x % 4 == 0]
print("Divisible por cuatro", fourx)

```
* Salida 
Divisible por cuatro: [8, 16, 20, 32]

### Ejemplo 2: Actualizar valores restando uno a los múltiplos de cuatro

* Método Tradicional:

```py
fourxsub = []
for x in new_data:
    if x % 4 == 0:
        fourxsub.append(x - 1)
print("Divisible por cuatro menos uno:", fourxsub)

```

* Metodo de comprension

```py
fourxsub = [x - 1 for x in new_data if x % 4 == 0]
print("Divisible por cuatro menos uno:", fourxsub)

```

* Salida
Divisible por cuatro menos uno: [7, 15, 19, 31]

### Ejemplo 3: Usando la función range para obtener múltiplos de 9

* Método Tradicional:

```py
nines = []
for x in range(100):
    if x % 9 == 0:
        nines.append(x)
print("Múltiplos de nueve:", nines)
```

* Metodo de comprension:

```py
nines = [x for x in range(100) if x % 9 == 0]
print("Múltiplos de nueve:", nines)
```

* Salida
Múltiplos de nueve: [0, 9, 18, 27, 36, 45, 54, 63, 72, 81, 90, 99]

## 2. Comprensión del Diccionario

La sintaxis para la comprensión de diccionarios es:

```py
dict = {key: value for key, value in <secuencia> if <condición>}
```

### Ejemplo 1: Crear un diccionario con range

* Metodo tradicional:

```py
usingrange = {}
for x in range(12):
    usingrange[x] = x * 2
print("Usando range():", usingrange)
```

* Metodo de comprension

```py
usingrange = {x: x * 2 for x in range(12)}
print("Usando range():", usingrange)

```

* Salida
Usando range(): {0: 0, 1: 2, 2: 4, 3: 6, 4: 8, 5: 10, 6: 12, 7: 14, 8: 16, 9: 18, 10: 20, 11: 22}

### Ejemplo 2: Crear un diccionario con una lista de números

* Metodo tradicional:

```py
number = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12]
numdict = {}
for x in number:
    numdict[x] = x ** 2
print("Diccionario con números:", numdict)
```

* Metodo de comprension

```py
numdict = {x: x ** 2 for x in number}
print("Diccionario con números:", numdict)
```

* Salida
Diccionario con números: {1: 1, 2: 4, 3: 9, 4: 16, 5: 25, 6: 36, 7: 49, 8: 64, 9: 81, 10: 100, 11: 121, 12: 144}

### Ejemplo 3: Crear un diccionario usando dos listas con la función zip

* Metodo tradicional

```py
months = ["Jan", "Feb", "Mar", "Apr", "May", "June", "July", "Aug", "Sept", "Oct", "Nov", "Dec"]
number = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12]
numdict = {}
for key, value in zip(number, months):
    numdict[key] = value
print("Diccionario usando dos listas:", numdict)

```

* Metodo de comprension

```py
numdict = {key: value for key, value in zip(number, months)}
print("Diccionario usando dos listas:", numdict)

```

* Salida
Diccionario usando dos listas: {1: 'Jan', 2: 'Feb', 3: 'Mar', 4: 'Apr', 5: 'May', 6: 'June', 7: 'July', 8: 'Aug', 9: 'Sept', 10: 'Oct', 11: 'Nov', 12: 'Dec'}

## 3. Comprensión del Conjunto

La comprensión de conjuntos es similar a la de las listas, con la diferencia de que utilizamos llaves en lugar de corchetes.

```py
dict = {key: value for key, value in <secuencia> if <condición>}
```

### Ejemplo 1: Filtrar elementos no presentes en una lista

* Método Tradicional:

```py
set_a = set()
for x in range(10, 20):
    if x not in [12, 14, 16]:
        set_a.add(x)
print(set_a)
```

* Metodo de comprension:

```py
set_a = {x for x in range(10, 20) if x not in [12, 14, 16]}
print(set_a)
```

* Salida:
{10, 11, 13, 15, 17, 18, 19}

## 4. Comprensión del Generador

Las comprensiones de generadores son similares a las de listas, pero utilizan corchetes curvos en lugar de cuadrados. Son más eficientes en términos de memoria.

### Ejemplo 1: Crear un generador con una lista de números

* Método Tradicional:

```py
data = [2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31]
gen_obj = (x for x in data)
print(gen_obj)
print(type(gen_obj))
for item in gen_obj:
    print(item, end=" ")
```

* Metodo de comprension:

```py
gen_obj = (x for x in data)
print(gen_obj)
print(type(gen_obj))
for item in gen_obj:
    print(item, end=" ")
```

* Salida:
<generator object <genexpr> at 0x102a87d60>
<class 'generator'>
2 3 5 7 11 13 17 19 23 29 31




