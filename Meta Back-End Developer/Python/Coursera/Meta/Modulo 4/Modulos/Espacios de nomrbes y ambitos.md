# Espacios de Nombres y Ámbitos

1. Espacio de Nombres: Es un mapeo de nombres a objetos. En Python, cada variable tiene un nombre que se asocia a un objeto en memoria.

2. Ámbito: Es la región del código donde un espacio de nombres es accesible. Hay cuatro tipos de ámbitos en Python:

* Local: Se refiere a las variables definidas dentro de una función.
* Enclosed (o cerrado): Se refiere a las variables definidas en funciones anidadas.
* Global: Se refiere a las variables definidas en el nivel más alto de un módulo.
* Built-in: Se refiere a los nombres que están disponibles en el espacio de nombres incorporado de Python.

## Ejemplo de Ámbitos

Imagina el siguiente código:

```python
# Variable global
x = "global"

def funcion_a():
    # Variable local
    x = "local"
    print("Dentro de funcion_a:", x)  # Imprime "local"

    def funcion_b():
        # Variable no local
        nonlocal x
        x = "no local"
        print("Dentro de funcion_b:", x)  # Imprime "no local"

    funcion_b()
    print("Después de funcion_b en funcion_a:", x)  # Imprime "no local"

funcion_a()
print("Fuera de todas las funciones:", x)  # Imprime "global"
```

Explicación del Ejemplo

* Variable Global: x se define fuera de cualquier función, por lo que es global.
* Variable Local: Dentro de funcion_a, se define x como "local", que oculta la variable global.
* Variable No Local: En funcion_b, se usa nonlocal para referirse a la x de funcion_a, permitiendo modificarla.

## Observaciones

* Cuando se llama a funcion_a, imprime "local" porque está usando la variable local.
* Al llamar a funcion_b, se cambia la x de funcion_a a "no local".
* Finalmente, la variable global x permanece sin cambios y sigue siendo "global".