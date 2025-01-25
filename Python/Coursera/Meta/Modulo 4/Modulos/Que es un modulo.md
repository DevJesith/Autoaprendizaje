1. Definición de Módulo

Un módulo en Python es un archivo que contiene definiciones y declaraciones de Python. Puedes pensar en un módulo como un conjunto de funciones y variables que puedes reutilizar en diferentes programas.

2. Ventajas de Usar Módulos

* Reusabilidad: Puedes usar el mismo código en diferentes programas sin tener que reescribirlo.

* Escopos: Los módulos crean un espacio de nombres separado, lo que significa que puedes tener funciones con el mismo nombre en diferentes módulos.

* Simplicidad: Cada módulo tiene un propósito específico, lo que facilita la organización del código.

3. Tipos de Módulos

* Módulos incorporados: Vienen con la instalación de Python (por ejemplo, `math`).

* Módulos personalizados: Creas tus propios módulos.

4. Cómo Importar un Módulo

Para usar un módulo, primero debes importarlo en tu código. Esto se hace con la palabra clave `import`.

5. Ejemplo Práctico

Aquí tienes un ejemplo de cómo crear y usar un módulo personalizado:

Paso 1: Crear un Módulo

Crea un archivo llamado `mi_modulo.py` con el siguiente contenido:

```python
# mi_modulo.py
def saludar(nombre):
    return f"Hola, {nombre}!"

def sumar(a, b):
    return a + b
```

Paso 2: Importar y Usar el Módulo

Ahora, en otro archivo Python, puedes importar y usar este módulo:

```python
# main.py
import mi_modulo

# Usar la función saludar
mensaje = mi_modulo.saludar("Juan")
print(mensaje)  # Salida: Hola, Juan!

# Usar la función sumar
resultado = mi_modulo.sumar(5, 3)
print(resultado)  # Salida: 8
```
Resumen

Crea un módulo: Define funciones en un archivo .py.
Importa el módulo: Usa import para acceder a las funciones.
Usa las funciones: Llama a las funciones del módulo como lo harías con cualquier función.