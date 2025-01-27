# Casos de uso del módulo

Hasta ahora ha aprendido sobre módulos, paquetes y bibliotecas en el contexto del uso de módulos en Python. Los paquetes de terceros en Python son, en la mayoría de los casos, de código abierto, gratuitos y disponibles para una gran variedad de dominios. Estos recursos amplían la funcionalidad de los programas de Python más allá de los módulos integrados y son una de las principales razones por las que Python es popular en la actualidad.

Antes de aprender a instalar y utilizar estos paquetes, veamos brevemente la diferencia entre un módulo, un paquete y una biblioteca.

## Módulos, bibliotecas y paquetes

Los módulos y paquetes se pueden confundir fácilmente debido a sus similitudes, pero existen algunas diferencias. Los módulos son similares a los archivos, mientras que los paquetes son como directorios que contienen diferentes archivos. Los módulos generalmente se escriben en un solo archivo, pero es más una práctica que una definición. 

Los paquetes son esencialmente un tipo de módulo. Cualquier módulo que contenga la definición __path__ es un paquete. Los paquetes, cuando se ven como un directorio, pueden contener subpaquetes y otros módulos. Por otro lado, los módulos pueden contener clases, funciones y miembros de datos como cualquier otro archivo Python. 

Biblioteca es un término que se utiliza indistintamente con los paquetes importados. Pero en la práctica general, se refiere a una colección de paquetes.

A pesar de las diferencias entre módulos, paquetes y bibliotecas, puede importar cualquiera de ellos mediante sentencias "import".  

Los complementos de paquetes de terceros de Python se pueden encontrar en el índice de paquetes de Python. Para instalar paquetes que no forman parte de las bibliotecas estándar, los programadores utilizan 'pip' (instalador de paquetes para Python). Se instala con Python por defecto. Para utilizar pip, debe estar familiarizado con la terminal si utiliza una Mac o con la interfaz de línea de comandos si utiliza Windows. 

Como alternativa, también puede utilizar la ventana de terminal presente en su IDE. Cuando utilice la línea de comandos o la terminal, se debe asegurar de instalar los paquetes en el mismo intérprete de Python con el que trabaja dentro de su IDE. 

Aunque pip suele venir instalado con Python por defecto, puede ser necesario comprobar el estado de la instalación de pip. Si utiliza una Mac, ejecute el siguiente comando en la terminal:

python3 -m pip install requests


* pip es el instalador de paquetes para Python. Es la herramienta que te permite instalar y gestionar bibliotecas desarrolladas por otros programadores (conocidos como paquetes) que extienden la funcionalidad de Python.

* requests:

requests es una biblioteca de Python muy popular que se usa para hacer solicitudes HTTP de manera sencilla. Con requests, puedes hacer cosas como descargar contenido de una página web, enviar datos a un servidor y mucho más.

* Para qué sirve instalar requests:
Imagina que deseas interactuar con una API (interfaz de programación de aplicaciones) para obtener datos, como el pronóstico del clima, los últimos artículos de un blog o cualquier otra información disponible en la web. Usar requests te permite enviar solicitudes HTTP a estos servidores y recibir las respuestas necesarias.

## 
Subpaquetes

Si decimos que los paquetes son similares a una carpeta o directorio en nuestro sistema operativo, entonces el paquete también puede contener otros directorios. Los paquetes, tanto los incorporados como los definidos por el usuario, pueden contener otras carpetas dentro de ellos a las que es necesario acceder. Se denominan subpaquetes. La notación de puntos se utiliza para acceder a los subpaquetes de un paquete que ha importado. Por ejemplo, en un paquete como "matplotlib", los contenidos más utilizados están presentes dentro del subpaquete "pyplot". Pyplot puede eventualmente consistir en varias funciones y atributos.

El código para importar un subpaquete es:
import matplotlib.pyplot

Para que sea aún más conveniente, a menudo se importa utilizando un alias. Así que lo más común es que se encuentre con códigos como:

import matplotlib.pyplot as plt


odría utilizar cualquier otra palabra como alias en lugar de plt, pero es una convención común.

Puede explorar la estructura de directorios de dichos paquetes normalmente buscando en el índice de módulos de ese paquete.


# Resumen

1. Módulos

* Definición: Un módulo es un archivo que contiene código Python, como funciones, clases y variables.

* Uso: Se utiliza para organizar y reutilizar código.

* Ejemplo: Un archivo llamado matematicas.py que contiene funciones para realizar operaciones matemáticas.

2. Paquetes

* Definición: Un paquete es un directorio que contiene múltiples módulos y un archivo especial llamado __init__.py. Este archivo indica que el directorio debe ser tratado como un paquete.

* Uso: Se utiliza para agrupar módulos relacionados.

* Ejemplo: Un paquete llamado geometria que contiene varios módulos como circulo.py, cuadrado.py, y triangulo.py.

3. Bibliotecas

* Definición: Una biblioteca es una colección de paquetes y módulos que proporcionan funcionalidades específicas. A menudo, se refiere a un conjunto de herramientas que puedes usar en tus programas.

* Uso: Se utiliza para acceder a funcionalidades avanzadas sin tener que escribir todo el código desde cero.

* Ejemplo: La biblioteca NumPy que incluye paquetes y módulos para realizar cálculos numéricos y manipulación de matrices.

### Resumen de las diferencias:

* Módulo: Un solo archivo de Python.

* Paquete: Un directorio que contiene múltiples módulos.

* Biblioteca: Una colección de paquetes y módulos que ofrecen funcionalidades específicas.

Ejemplo práctico:

Supongamos que tienes un paquete llamado matematica que contiene dos módulos: suma.py y resta.py.

- Estructura del paquete:

```null
matematica/
    __init__.py
    suma.py
    resta.py
```

- Contenido de suma.py:
```python
def suma(a, b):
    return a + b
```
- Contenido de resta.py:
```python
def resta(a, b):
    return a - b
```
- Uso del paquete en otro archivo:

```python
# main.py
from matematica import suma, resta

resultado_suma = suma.suma(5, 3)
resultado_resta = resta.resta(5, 3)

print("Suma:", resultado_suma)  # Salida: Suma: 8
print("Resta:", resultado_resta)  # Salida: Resta: 2
```


#### Ejemplo de bibloteca: NumPy


NumPy es una biblioteca popular en Python para realizar cálculos numéricos y manipulación de matrices. A continuación, te muestro cómo puedes usarla.

- Instalación de NumPy

Primero, necesitas instalar la biblioteca usando pip. En la terminal, puedes ejecutar:

```bash
pip install numpy
```

- Uso de NumPy

Una vez instalada, puedes usarla en tu código. Aquí hay un ejemplo simple:

```python
import numpy as np

# Crear un array (matriz) de NumPy
array = np.array([1, 2, 3, 4, 5])

# Realizar operaciones
suma = np.sum(array)  # Suma de todos los elementos
promedio = np.mean(array)  # Promedio de los elementos

print("Array:", array)  # Salida: Array: [1 2 3 4 5]
print("Suma:", suma)  # Salida: Suma: 15
print("Promedio:", promedio)  # Salida: Promedio: 3.0
```

- Resumen

* Módulo: Un archivo de Python (ej. suma.py).

* Paquete: Un directorio que contiene múltiples módulos (ej. matematica).

* Biblioteca: Una colección de paquetes y módulos que ofrecen funcionalidades específicas (ej. NumPy).