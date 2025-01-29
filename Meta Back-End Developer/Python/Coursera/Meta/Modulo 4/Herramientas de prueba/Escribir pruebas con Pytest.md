# ¿Qué son las pruebas unitarias?

Las pruebas unitarias son una técnica de programación que permite verificar que cada parte de tu código (o "unidad") funcione correctamente. Esto se hace escribiendo pruebas que comprueban si las funciones devuelven los resultados esperados.

* Uso de pytest

pytest es un marco de pruebas en Python que facilita la escritura y ejecución de pruebas unitarias. Aquí te explico cómo usarlo con un ejemplo.

* Ejemplo Detallado

1. Crear un archivo de funciones: Primero, creamos un archivo llamado addition.py que contiene las funciones que queremos probar.

```python
# addition.py
def add(a, b):
    return a + b

def sub(a, b):
    return a - b
```

2. Crear un archivo de pruebas: Luego, creamos otro archivo llamado test_addition.py donde escribimos nuestras pruebas.

```python
# test_addition.py
import pytest
from addition import add, sub

def test_add():
    assert add(4, 5) == 9  # Prueba que 4 + 5 es igual a 9

def test_sub():
    assert sub(4, 5) == -1  # Prueba que 4 - 5 es igual a -1
```

3. Ejecutar las pruebas: Para ejecutar las pruebas, abre una terminal y navega a la carpeta donde están tus archivos. Luego, ejecuta el siguiente comando:

```bash
python -m pytest test_addition.py
```

4. Interpretar los resultados: Si ambas pruebas pasan, verás un mensaje que indica que las pruebas fueron exitosas. Si alguna prueba falla, pytest te mostrará un mensaje que indica qué prueba falló y por qué.

* ¿Qué hace el código?

* Funciones: add y sub realizan operaciones matemáticas simples.

* Pruebas: Las funciones test_add y test_sub utilizan assert para verificar que los resultados de las funciones sean los esperados.

* Ejecución: Al ejecutar pytest, se ejecutan todas las pruebas definidas en el archivo de pruebas.

## Conclusión

Las pruebas unitarias son esenciales para asegurar que tu código funcione correctamente y para facilitar el mantenimiento a largo plazo. Usar pytest simplifica este proceso.