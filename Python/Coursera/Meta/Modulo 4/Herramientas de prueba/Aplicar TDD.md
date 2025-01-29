# Conceptos Clave de TDD:

1. Escribir pruebas primero: Antes de implementar cualquier funcionalidad, se crean pruebas que definan cómo debería comportarse el código.

2. Escribir el código: Luego, se escribe el código necesario para pasar esas pruebas.

3. Refactorizar: Si las pruebas pasan, se puede mejorar el código sin cambiar su funcionalidad.

## Ejemplo:

Imaginemos que queremos verificar si un nombre está en una lista de estudiantes.

1. Escribir la prueba:

Creamos un archivo llamado test_findstring.py y escribimos una prueba que verifique si un nombre está presente en la lista.

```python
import pytest
from findstring import ispresent

def test_ispresent():
    assert ispresent("Al") == True
```

2. Escribir el código:

Creamos otro archivo llamado findstring.py y escribimos la función que pasará la prueba.

```python
def ispresent(person):
    names = ["Al", "Bob", "Charlie"]
    return person in names
```

3. Ejecutar la prueba:

Al ejecutar pytest, la prueba debería pasar, indicando que "Al" está en la lista.

4. Refactorizar:

Si queremos asegurarnos de que no se ingresen números en los nombres, podemos agregar otra prueba y modificar el código en consecuencia.

Este ciclo se repite hasta que todas las pruebas pasan, asegurando que el código cumple con los requisitos establecidos.