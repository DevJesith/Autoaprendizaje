# Definición de Módulos en Python

* Módulos: Son archivos que contienen código Python. Pueden incluir funciones, clases y variables que puedes reutilizar en otros programas.

* Módulos incorporados: Son módulos que vienen preinstalados con Python, como math y datetime.

* Módulos definidos por el usuario: Son módulos que tú creas, guardando tu código en un archivo .py.

## Ejemplos

1. Uso de un módulo incorporado:
```python
import math

# Usar la función sqrt del módulo math
raiz_cuadrada = math.sqrt(16)
print(raiz_cuadrada)  # Salida: 4.0
```
2. Creación de un módulo definido por el usuario:

Crea un archivo llamado mi_modulo.py con el siguiente contenido:

```python
def saludar(nombre):
    return f"Hola, {nombre}!"
```
Luego, en otro archivo, puedes usar este módulo:

```python
import mi_modulo

mensaje = mi_modulo.saludar("Juan")
print(mensaje)  # Salida: Hola, Juan!
```