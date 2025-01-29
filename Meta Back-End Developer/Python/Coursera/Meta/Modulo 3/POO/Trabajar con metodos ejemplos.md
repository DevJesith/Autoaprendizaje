Ha aprendido a utilizar objetos, clases y métodos dentro de ellos.  Usted vio los casos en los que solo hay una clase, y también los que contienen varias clases. También ha explorado cómo funciona la herencia múltiple en Python y el papel que juega el MRO (Method Resolution Order, Orden de resolución de método) en la determinación de la llamada al método. 

Los siguientes ejemplos demuestran cómo se resuelve la llamada a la función en casos de herencia múltiple en diferentes escenarios. Tenga en cuenta que todas las funciones tienen los mismos nombres en todos los ejemplos.

## Ejemplo 1
```py
class A:
   def a(self):
       return "Function inside A"

class B:
    def a(self):
        return "Function inside B"

class C(B,A):
    pass

# Driver code
c = C()
print(c.a())
```

Salida: Function inside B

La clase "C" hereda de las clases "B" y "A". Cuando no encuentro ninguna función "a()" dentro de la clase "C", debo buscar en las clases "B" y "A", y es importante que lo haga en ese orden.

Ahora agregaré un nivel más y observaré el resultado.

## Ejemplo 2

```py
class A:
 def b(self):
 return "Function inside A"

class B:
 def b(self):
 return "Function inside B"

class C(A, B):
 def b(self):
 return "Function inside C"
 pass

class D(C):
 pass

d = D()
print(d.b())
```

Salida: Function inside C


La clase "D" hereda de la clase "C", que a su vez hereda de las clases "A" y "B". La clase "D" accede a la superclase inmediata de la clase "D", que es la clase "C" y resuelve el valor de la variable una vez que se encuentra en esa superclase.

Ahora digamos que comento la declaración dentro de la clase "C".

```py
  # def b(self):
    #     return "Function inside C" 
```
Y reemplazo por la palabra clave pass para mantener el código funcional.

Dado que tampoco había ningún valor presente dentro de la clase "C", la llamada a la función anterior iría a "A". Esto se debe a que la clase "C" señalará a la clase "A" como de mayor prioridad al heredar.

Ahora veamos otro ejemplo de un escenario similar.

## Ejemplo 3

```py
class A:
 def c(self):
 return "Function inside A"

class B:
 def c(self):
 return "Function inside B"

class C(A, B):
 def c(self):
 return "Function inside C"

class D(A, C):
 pass

d = D()
print(d.a)
```

La salida es: 
Traceback (most recent call last):
File "/Users/intropython/PycharmProjects/practicePython/inherit.py", line 10, in <module>
class D(A, C):
TypeError: Cannot create a consistent method resolution
order (MRO) for bases A, C

Tenga en cuenta que esto genera un error. En el código anterior, la clase "D" hereda tanto de la clase "A" como de la clase "C".

La clase "C" es su superclase inmediata, pero dado que se trata de una herencia múltiple, las reglas son más complicadas y también tiene que comprobar la prioridad de las clases que se le pasan.

En este caso concreto, la clase "D" es incapaz de resolver el orden que se debe seguir, al tiempo que resuelve el valor de la variable en los casos en que la variable no está presente en la clase del objeto dado.

El resultado es un "TypeError" porque es incapaz de crear una orden de resolución de método (MRO). La MRO es la forma de Python de resolver el orden de prioridad de las clases mientras se trata de herencia.

Veamos otro último ejemplo.

## Ejemplo 4

```py
class A:
 def d(self):
 return "Function inside A"

class B:
 def d(self):
 return "Function inside B"


class C:
 def d(self):
 return "Function inside C"


class D(A, B):
 def d(self):
 return "Function inside D"


class E(B, C):
 def d(self):
 return "Function inside E"


class F(E,D,C):
 pass

f = F()
print(f.d())
print(F.mro())
```

Salida:
Function inside E
[<class '__main__.F'>, <class '__main__.E'>, <class '__main__.D'>, <class '__main__.A'>, <class '__main__.B'>, <class '__main__.C'>, <class 'object'>]

El código aquí es sencillo. La clase "F" hereda directamente de su superclase inmediata y de la primera clase que se le pasa. A continuación, la segunda línea muestra lo que devuelve la función "mro()". 

Los ejemplos de esta lectura demuestran cómo el código en el que se utiliza la herencia múltiple se puede complicar y ser muy desordenado, muy rápido. La herencia múltiple, con todas las ventajas y flexibilidad que proporciona, solo se debe utilizar si se tiene un comando sólido de Python como lenguaje para evitar crear "código spaghetti" que sea difícil de entender y actualizar.