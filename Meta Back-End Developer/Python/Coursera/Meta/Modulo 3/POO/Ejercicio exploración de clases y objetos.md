En esta lectura, explorará el comportamiento de funciones, objetos y clases en Python y cómo funciona el flujo de ejecución de diferentes sentencias de programa para permitir una mejor comprensión.

Realizará modificaciones menores en el código dado para observar cómo cambia la salida.

Primero, configure un archivo denominado class_explore.py que contenga la siguiente pieza de código. Alternativamente, puede utilizar el entorno interactivo aquí.  

```py
class A:
   def __init__(self, c):
       print("---------Inside class A----------")
       self.c = c
   print("Print inside A.")

   def alpha(self):
       c = self.c + 1
       return c

print(dir(A))
print("Instantiating A..")
a = A(1)
print(a.alpha())

class B:
   def __init__(self, a):
       print("---------Inside class B----------")
       self.a = a

   print(a.alpha())
   d = 5
   print(d)
   print(a)

print("Instantiating B..")
b = B(a)
print(a)
```

Ahora, modifique el código según las instrucciones a continuación y observe los cambios.

Paso 1: ejecute el código y observe su salida. Tome nota de cada línea en el resultado y de cómo es diferente del resultado que esperaba.

Desde el punto de vista algorítmico, podemos ver el programa que consta de lo siguiente:

1. Definición de clase A     

    1-1 Constructor para A     

    1.2 Definición del método local alpha() 

2. Creación de una instancia objeto "a" sobre la clase A 

3. Llamada al método "alpha()" sobre el objeto de la clase A 

4. Definición de clase de B 

5. Constructor para B     

    5.1 Llamada al método "alpha()" sobre objeto de clase A     

    5.2 Crear instancia del objeto "a" sobre la clase B *. 

Sentencias "print" adicionales distribuidas a través del código.  


## Paso 2: comente líneas #13, 14, 21, 24, 27 y 28. Vuelva a ejecutar el código. 

La salida es:

Hello World!
Print inside A.
['__class__', '__delattr__', '__dict__', '__dir__', '__doc__', '__eq__', '__format__', '__ge__', '__getattribute__', '__gt__', '__hash__', '__init__', '__init_subclass__', '__le__', '__lt__', '__module__', '__ne__', '__new__', '__reduce__', '__reduce_ex__', '__repr__', '__setattr__', '__sizeof__', '__str__', '__subclasshook__', '__weakref__', 'alpha']
Instantiating A..
5
Instantiating B..


Aunque haya comentado la creación de instancias para ambas clases A y B, la salida sigue mostrando “Print inside A” y “Print inside B” y también el valor de la variable "d", que es 5. ¿Cómo es eso posible?

Es porque las sentencias dentro de un cuerpo de clase se ejecutan independientemente de la creación de la instancia. También verá cómo la sentencia "print" “Inside class A”, que está dentro del constructor, no se ejecuta porque está dentro de una función. 

El valor de d=5 que se imprime demuestra que el espacio de nombres y el alcance de la variable se determinan por el intérprete antes de crear cualquier instancia de la clase o llamar a cualquier función dentro de ella. Si observa la lista que obtiene llamando a la función "dir()", notará que la última entrada es la función "alpha()" agregada al espacio de nombres de A.

## Paso 3: ahora quite el comentario de las líneas 21 y 24. 

Si ejecuta el código en este punto, arrojará un error, "NameError: name 'a' is not defined" (Nombre de error: el nombre "a" no está definido). Tome nota de cómo pasó el objeto a un constructor de clase B y el código aún funcionó bien antes. Solo cuando intentó 'utilizar' el objeto "a", obtuvo un error porque no se ha creado una instancia. En otras palabras, Python aún no sabe lo que significa 'a'. Lo mismo sucederá si se quita el comentario junto a la línea 28. 

Para que el código funcione, elimine el # delante de la línea 14 y vuelva a ejecutarlo.

La salida es:

Hello World! 
Print inside A.
['__class__', '__delattr__', '__dict__', '__dir__', '__doc__', '__eq__', '__format__', '__ge__', '__getattribute__', '__gt__', '__hash__', '__init__', '__init_subclass__', '__le__', '__lt__', '__module__', '__ne__', '__new__', '__reduce__', '__reduce_ex__', '__repr__', '__setattr__', '__sizeof__', '__str__', '__subclasshook__', '__weakref__', 'alpha']
Instantiating A..
---------Inside class A----------
2
5
<submission.A object at 0x7fcab3ef6940>
Instantiating B..

## Paso 4: eliminar el comentario para las líneas 27 y 28. 

La variable "c" de la clase A se modifica sobre el objeto "a" dentro de la clase B. Aunque la instancia de clase B aún no se crea, el valor de "a.c" se actualiza, incluso fuera de la clase, como lo demuestra la línea final en la salida que muestra que el resultado es 2.

## Paso 5: por último, elimine todos los comentarios restantes y ejecute el código una vez más. 

A continuación, algunas observaciones:

Cuando intente imprimir el 'objeto' de la clase A como en las líneas 21 y 28, obtendrá la dirección del objeto en lugar de los contenidos.

Observe cómo la dirección del objeto es la misma tanto dentro de la clase B como en el ámbito global del programa. Sigue siendo la misma independientemente de donde se la llame.

La función "alpha()" se llama dos veces en el programa, pero usted sigue obteniendo el resultado como 2 cada vez y no 3. Eso se debe a que el valor se actualiza temporalmente y no se asigna a nada.

Revise los elementos sobre clases, llamadas a funciones y alcance en caso de confusión.