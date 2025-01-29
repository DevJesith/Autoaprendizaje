# Principios de la Programación Orientada a Objetos (OOP)
La Programación Orientada a Objetos (OOP) es un paradigma de programación basado en la organización del código en clases y objetos, lo que permite estructurar el software de manera modular y reutilizable. Sus cuatro pilares fundamentales son:

1. Encapsulación
La encapsulación consiste en agrupar datos (variables) y métodos dentro de una clase, limitando el acceso directo a ellos para proteger la integridad de los datos.

* En Python, los niveles de acceso se representan con guiones bajos:
    * _variable → Miembro protegido (accesible en la clase y sus subclases).
    * __variable → Miembro privado (solo accesible dentro de la clase).

```py
class Alpha:
    def __init__(self):
        self._a = 2  # Miembro protegido
        self.__b = 2  # Miembro privado
```

* La ocultación de datos impide modificar atributos críticos desde fuera de la clase.
* Se puede acceder a miembros privados usando "name mangling":

```py
obj = Alpha()
print(obj._Alpha__b)  # Accede al miembro privado
```

2. Polimorfismo
El polimorfismo permite que el mismo método u operador tenga diferentes comportamientos según el contexto.

Ejemplo con el operador * aplicado a diferentes tipos de datos:

```py
string = "poly"
num = 7
sequence = [1,2,3]

new_str = string * 3  # "polypolypoly"
new_num = num * 3  # 21
new_sequence = sequence * 3  # [1,2,3,1,2,3,1,2,3]
```
* Ejemplo con la función len(), que funciona con distintos tipos de datos:

```py
print(len("poly"))  # 4
print(len([1,2,3]))  # 3
```

3. Herencia
La herencia permite que una clase (hija) herede atributos y métodos de otra clase (padre), reutilizando código y extendiendo funcionalidades.

Ejemplo básico de herencia en Python:

```py
class Parent:
    def greet(self):
        return "Hola desde la clase padre"

class Child(Parent):
    def greet_child(self):
        return "Hola desde la clase hija"

obj = Child()
print(obj.greet())  # "Hola desde la clase padre"
print(obj.greet_child())  # "Hola desde la clase hija"
```

* Python usa el MRO (Method Resolution Order) para determinar el orden en que busca métodos en las clases heredadas.

4. Abstracción
La abstracción oculta detalles de implementación y muestra solo lo esencial.

* Se implementa usando clases y métodos abstractos mediante el módulo abc.
* Una clase abstracta no puede instanciarse y obliga a las subclases a definir ciertos métodos.
Ejemplo con la clase base abstracta (ABC):

```py
from abc import ABC, abstractmethod

class Animal(ABC):
    @abstractmethod
    def make_sound(self):
        pass  # Método obligatorio en las subclases

class Dog(Animal):
    def make_sound(self):
        return "Guau"

dog = Dog()
print(dog.make_sound())  # "Guau"
```

## Conclusión
Estos principios ayudan a desarrollar software más organizado, modular y fácil de mantener. Python implementa estos conceptos de manera flexible, aunque otros lenguajes como Java y C++ los refuerzan con mecanismos más estrictos.