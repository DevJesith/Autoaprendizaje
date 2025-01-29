1. Entender qué es un módulo:

Un módulo en Python es cualquier archivo con la extensión .py que contiene código Python. Por ejemplo, si tienes un archivo llamado mi_modulo.py, este es un módulo.

2. Importar un módulo:

Para importar un módulo que está en el mismo directorio que tu archivo principal, simplemente escribes:

```python
import mi_modulo
```
Esto te permite acceder a las funciones y variables definidas en mi_modulo.py.

3. Importar desde un directorio diferente:

Si necesitas importar un módulo que está en un directorio diferente, primero debes agregar la ruta de ese directorio a sys.path. Esto se hace de la siguiente manera:

```python
import sys
sys.path.insert(0, 'ruta/al/directorio')
```
Aquí, 'ruta/al/directorio' es la ruta donde se encuentra el módulo que deseas importar.

4. Ejemplo de importación:

Supongamos que tienes un archivo llamado nombres.py en un directorio llamado trabajo que contiene:

```python
nombres = ['Adrian', 'Maria']
```
Para importar este módulo en tu archivo principal, harías lo siguiente:

```python
import sys
sys.path.insert(0, 'ruta/al/directorio/trabajo')  # Cambia esto a la ruta real
import nombres

print(nombres.nombres)  # Esto imprimirá: ['Adrian', 'Maria']
```

Resumen:

* Módulo: Archivo .py que contiene código.

* Importación: Usa import nombre_modulo para acceder a su contenido.
 
* Importación desde otro directorio: Usa sys.path.insert para agregar la ruta del directorio.