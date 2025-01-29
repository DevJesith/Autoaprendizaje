# ¿Qué es la función reload?

La función reload se utiliza para volver a cargar un módulo que ya ha sido importado. Esto es útil cuando has realizado cambios en el código del módulo y deseas ver esos cambios sin tener que reiniciar tu programa.

# ¿Cómo se usa?

1. Importar el módulo: Primero, necesitas importar el módulo que deseas recargar.

2. Usar importlib: Debes importar el módulo importlib para acceder a la función reload.

3. Llamar a reload: Llama a importlib.reload(nombre_del_modulo) para recargar el módulo.

## Ejemplo práctico

Supongamos que tienes dos archivos:

1. sample.py:

```python
# sample.py
print("Hello world")
```

2. reloads.py:

```python
# reloads.py
import importlib
import sample  # Importa el módulo

# Aquí se ejecuta el print de sample.py
```

Pasos:

1. Ejecuta reloads.py: Al ejecutar este archivo, verás "Hello world" en la salida.

2. Modifica sample.py: Cambia el contenido de sample.py a:

```python
# sample.py
print("Hello again")
```

3. Actualiza reloads.py para usar reload:

```python
# reloads.py
import importlib
import sample

importlib.reload(sample)  # Recarga el módulo
```

4. Ejecuta reloads.py nuevamente: Ahora, al ejecutar reloads.py, verás "Hello again" en la salida.

## Resumen

reload permite ver cambios en un módulo sin reiniciar el programa.
Es útil para el desarrollo y pruebas rápidas.
