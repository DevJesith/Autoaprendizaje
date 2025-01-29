Digamos que hay dos clases, a saber, la clase A y la clase B. Si tiene que realizar una herencia simple, se puede llevar a cabo de la siguiente manera:

```py
Class A:
    pass
Class B(A):
    pass
```
Si la clase A es la clase padre y la clase B hereda de ella, entonces la clase A se pasa dentro de la clase B como parámetro. Esto permitirá a la clase B acceder directamente a los atributos y métodos dentro de la clase A.

## Herencia múltiple
Hasta ahora ha aprendido sobre la herencia simple, pero Python también nos da la posibilidad de realizar herencia múltiple entre clases.

He aquí un ejemplo sencillo de cómo se puede hacer.

```py
# Example 1
class A:
   a = 1
   
class B:
   b = 2
   
class C(A, B):
   pass

c = C()
print(c.a, c.b)
```
La salida es : 1 2

En primer lugar, se crean dos clases denominadas A y B y, a continuación, se inicializan las variables ayb, respectivamente, con valores. A continuación, se define una nueva clase C y se le pasan las clases A y B. Así es como se hace la herencia múltiple en Python. El orden de las clases es importante, pero no en este ejemplo concreto. A continuación, instale un objeto 'c' de la clase C. Los valores de las variables ayb se imprimen sobre el objeto c de la clase C aunque ayb no estén presentes dentro de la clase C.

El código anterior es un ejemplo de herencia múltiple. También existen otros tipos de herencia que caen bajo la categoría de herencia múltiple. Veamos un ejemplo.

## Herencia de varios niveles

```py
class A:
   a = 1

class B(A):
   a = 2

class C(B):
   pass

c = C()
print(c.a)
```

La salida es 2 porque C deriva de la superclase inmediata de C, y esa es B.

El caso anterior es un ejemplo de herencia de varios niveles donde la clase derivada C hereda de la clase base B. La clase B es a su vez una clase derivada de la clase base C. La clase B es aquí una clase derivada intermedia. Existen tres niveles de herencia en este caso, pero podrían extenderse siempre y cuando lo desee, aunque puede ser poco práctico luego de un tiempo.

## Funciones habilitadas
Existen dos funciones integradas que pueden ser útiles cuando se trata de encontrar la relación entre diferentes clases y objetos: `issubclass()` y `isinstance()` .

A continuación se muestra la primera `issubclass()` .

`issubclass(class A, class B)`

Se pasan dos clases como argumentos a esta función y se devuelve un resultado booleano. El ejemplo anterior se puede ampliar como sigue.

```py
print(issubclass(A,B))
print(issubclass(B,A))
```

La salida es: 
False
True

Esto demuestra cómo se pasa la clase hija como el primer argumento. Para evitar confusiones, esto se puede leer como: "¿Es la subclase B de A?" Puede ver que el resultado es "Verdadero" en el segundo caso donde la hija B es la subclase.

Otra función integrada similar a esta es `isinstance()` , que determina si algún objeto es una instancia de alguna clase. Entonces, si escribe:

```py
Class A:
	pass
Class B(A):
	pass

b = B()
print(isinstance(b,B))
print(isinstance(b,B))
```

La salida que obtendré es "Verdadero".

Ahora que sabes cómo se pueden extender clases desde otras clases, veamos otra función útil integrada denominada función super() .

La función super() es una función integrada que se puede llamar dentro de la clase derivada y da acceso a los métodos y las variables de las clases padre o hermanas. Las clases hermanas son las clases que comparten la misma clase padre. Cuando llama a la función super(), obtiene un objeto que representa la clase padre en devolución.

La función super() juega un papel importante en la herencia múltiple y ayuda a impulsar el flujo de ejecución del código. Ayuda a gestionar o determinar el control de donde puedo sacar los valores de mis funciones y variables deseadas.

Si cambia algo dentro de la clase padre, hay una recuperación directa de los cambios dentro de la clase derivada. Esto se utiliza principalmente en lugares donde se necesita inicializar las funcionalidades presentes dentro de la clase padre en la clase hija también. Luego, puede agregar código adicional en la clase hija.

Aquí hay un ejemplo.

```py
class Fruit():
    def __init__(self, fruit):
        print('Fruit type: ', fruit)


class FruitFlavour(Fruit):
    def __init__(self):
        super().__init__('Apple')
        print('Apple is sweet')

apple = FruitFlavour()
```

La salida es:
Fruit type:  Apple
Apple is sweet

En el código anterior, si hubiera comentado la línea para la función super(), la salida sería: 
Apple is sweet

Esto ocurrió porque cuando se inicializa la clase hija, no se inicializa la clase base con ella. La función super() lo ayuda a lograr esto y a agregar la inicialización de la clase base con la clase derivada.