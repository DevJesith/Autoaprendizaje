# Objetivos de aprendizaje
Usted ha visto los principios básicos de la programación orientada a objetos y, de alguna manera, ha demostrado cómo los diferentes principios se pueden poner en práctica con la ayuda de las clases, los bloques de construcción de la programación orientada a objetos. Veamos ahora la estructura de estas clases.

Aquí aprenderá a crear clases y objetos con la ayuda de ejemplos. Veamos primero los miembros básicos de una clase. Estos pueden ser los atributos o los miembros de datos, los métodos y, además, los comentarios que pueden incluir. Estos miembros se pueden mostrar con la ayuda de un ejemplo a continuación. Imaginemos que quiere hacer una clase de una casa, y comienza por crear una clase para ella.

- Ejemplo 1

```py
class House:
    '''
    This is a stub for a class representing a house that can be used to create objects and evaluate different metrics that we may require in constructing it.
    '''
    num_rooms = 5
    bathrooms = 2
    def cost_evaluation(self):
        print(self.num_rooms)
        pass
        # Functionality to calculate the costs from the area of the house
```
En el código anterior, comienza con un comentario multilínea, que también se puede denominar docstring ("comentarios adjuntos"). En la línea siguiente aparece la definición de la clase, seguida de un par de miembros de datos o atributos: num_rooms y baños. . Esto va seguido de una definición de función, que está vacía, excepto por la palabra clave  pass  que básicamente indica a Python que continúa la ejecución sin arrojar un error.  # .

El código define completamente la clase y las funciones presentes en su interior, pero en realidad no es útil a menos que se llame o se genere una instancia. Puede hacerlo de una de las dos maneras siguientes: Llamando directamente a la clase Generando una instancia de un objeto de esa clase

Puede agregar unas líneas de código debajo de su código que llamarán a la variable num_rooms en el objeto "casa" y en la clase "Casa" luego de que generemos un objeto "casa" a partir de la clase "Casa":

```py
house = House()
print(house.num_rooms)
print(House.num_rooms)
```
La salida efectiva será:
5
5

Para hacer un seguimiento de este ejemplo, agregue unas pocas líneas más a este código y vea la salida, esta vez después de actualizar la variable num_room llamada "on house object" a 7:

```py
house.num_rooms = 7 
print(house.num_rooms)
print(House.num_rooms)
```

La nueva salida esta vez sera: 
5
5
7
5

Lo que ha ocurrido en el código anterior es que ha creado una instancia de una clase denominada  house  y luego ha modificado el atributo de esa instancia con un valor de 7. Esto actualiza el valor del atributo de la instancia, pero no el atributo de la clase. Por lo tanto, el atributo num_rooms de la clase permanece sin cambios como 5, pero el atributo de instancia asociado con el objeto "casa" cambia a 7. Ahora insertaremos un fragmento de código alternativo.

Esta vez, en lugar de un atributo de instancia, modificará el atributo de clase llamándolo directamente sobre la clase de la siguiente forma:

```py
House.num_rooms = 7
print(house.num_rooms)
print(House.num_rooms)
```

La salida será:
5
5
7
7

Verá que los cambios en un atributo de clase afectarán incluso a las instancias que creará sobre él. Tenga en cuenta también el uso de la clave self en este ejemplo.  self es una convención en Python y puede utilizar cualquier otra palabra en su lugar, pero como práctica, es fácil de reconocer.  self  aquí se pasa dentro del método  cost_evaluación()  ,ya que es un método de instancia y facilita que el método apunte a cualquier instancia de la Casa cuando se llama a ese método. Observe cómo se puede pasar cualquier número de parámetros a estos métodos de instancia, pero el primero es siempre la referencia a la instancia de esa clase.

Puede interactuar y ejecutar todo el programa que acaba de ver en el siguiente bloque de código:

Solucion:

```py
class House:
    '''
    This is a stub for a class representing a house that can be used to create objects and evaluate different metrics that we may require in constructing it.
    '''
    num_rooms = 5
    bathrooms = 2

    def cost_evaluation(self, rate):
        # Functionality to calculate the costs from the area of the house
        cost = rate * self.num_rooms
        return cost



house = House()
print(house.num_rooms)
print(House.num_rooms)
house.num_rooms = 7
# House.num_rooms = 7
print(house.num_rooms)
print(House.num_rooms)

```