## Paso 1: ¿Qué es una clase abstracta?

- Definición: Una clase abstracta es una clase que no se puede instanciar directamente. Sirve como un modelo para otras clases.
Propósito: Asegura que las clases derivadas implementen ciertos métodos.

## Paso 2: Importar el módulo ABC

Para trabajar con clases abstractas en Python, necesitas importar el módulo `ABC` y el decorador `abstractmethod`:

```python
from abc import ABC, abstractmethod
```

## Paso 3: Definir la clase abstracta

Crea una clase abstracta llamada `Empleado` que herede de `ABC`. Dentro de esta clase, define un método abstracto llamado `donar`:

```python
class Empleado(ABC):
    @abstractmethod
    def donar(self):
        pass  # No hay implementación aquí
```

## Paso 4: Crear una clase derivada

Ahora, crea una clase llamada Donacion que herede de Empleado. Esta clase debe implementar el método donar:

```python
class Donacion(Empleado):
    def donar(self):
        cantidad = float(input("Ingrese la cantidad a donar: "))
        return cantidad
```

## Paso 5: Instanciar objetos de la clase derivada

Crea instancias de la clase `Donacion` para representar a los empleados:

```python
empleado1 = Donacion()
empleado2 = Donacion()
```

## Paso 6: Llamar al método donar

Llama al método `donar` en cada instancia y almacena los resultados en una lista:


```python
montos = []
montos.append(empleado1.donar())
montos.append(empleado2.donar())
```


Paso 7: Imprimir el total de donaciones

Finalmente, imprime la lista de montos donados:

```python
print("Total de donaciones:", montos)
```

## Resumen del código completo

Aquí tienes el código completo que implementa lo anterior:

```python
from abc import ABC, abstractmethod

class Empleado(ABC):
    @abstractmethod
    def donar(self):
        pass

class Donacion(Empleado):
    def donar(self):
        cantidad = float(input("Ingrese la cantidad a donar: "))
        return cantidad

empleado1 = Donacion()
empleado2 = Donacion()

montos = []
montos.append(empleado1.donar())
montos.append(empleado2.donar())

print("Total de donaciones:", montos)
```

* Clases abstractas: Proporcionan una estructura que las clases derivadas deben seguir.
* Métodos abstractos: Aseguran que las clases derivadas implementen ciertos métodos.

Exactamente, las clases derivadas están obligadas a implementar todos los métodos abstractos definidos en la clase padre (la clase abstracta). Aquí están los puntos clave:

- Implementación Obligatoria: Si una clase derivada no implementa todos los métodos abstractos de su clase padre, no podrá ser instanciada. Esto significa que no podrás crear objetos de esa clase derivada.

- Garantía de Funcionalidad: Al obligar a las clases derivadas a implementar los métodos abstractos, se asegura que todas las clases que heredan de la clase abstracta tengan una funcionalidad consistente.

Ejemplo

En el ejemplo que discutimos:

* La clase Empleado tiene un método abstracto donar.

* La clase Donacion, que es una clase derivada de Empleado, debe implementar el método donar. Si no lo hiciera, no podrías crear instancias de Donacion.

## Ejemplo 1: Clase derivada con implementación del método abstracto

```python
from abc import ABC, abstractmethod

class Empleado(ABC):
    @abstractmethod
    def donar(self):
        pass

class Donacion(Empleado):
    def donar(self):
        return 50.0  # Implementación del método

# Crear una instancia de Donacion
empleado = Donacion()
print("Total de donaciones:", empleado.donar())
```

Resultado:
```null
Total de donaciones: 50.0
```

## Ejemplo 2: Clase derivada sin implementación del método abstracto

```python
from abc import ABC, abstractmethod

class Empleado(ABC):
    @abstractmethod
    def donar(self):
        pass

class DonacionSinMetodo(Empleado):
    # No implementa el método donar
    pass

# Intentar crear una instancia de DonacionSinMetodo
try:
    empleado = DonacionSinMetodo()
except TypeError as e:
    print("Error:", e)
```

Resultado: 
```null
Error: Can't instantiate abstract class DonacionSinMetodo with abstract methods donar
```

## Resumen

* Ejemplo 1: La clase Donacion implementa el método donar, por lo que se puede crear una instancia y se imprime el total de donaciones.
* Ejemplo 2: La clase DonacionSinMetodo no implementa el método donar, lo que provoca un error al intentar crear una instancia de esa clase.
