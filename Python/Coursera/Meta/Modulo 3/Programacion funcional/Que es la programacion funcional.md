## Definición: 
La programación funcional es un paradigma que utiliza funciones para crear código limpio, consistente y mantenible.

# Funciones

## Se dividen en dos tipos:

- Funciones tradicionales: Pueden modificar el estado global y sus resultados pueden depender de variables externas.

- Funciones puras: No modifican el estado global y siempre devuelven el mismo resultado para los mismos argumentos.

# Características:
Las funciones son independientes y no alteran los datos fuera de su ámbito.
En Python, las funciones son "ciudadanos de primera clase", lo que significa que pueden ser asignadas a variables, pasadas como argumentos y devueltas.


* Ejemplo

Imagina que quieres invertir una lista de nombres de cafés. Puedes usar la función map junto con una función que invierte cadenas.

```python
# Definimos la función que invierte una cadena
def reverse(string):
    return string[::-1]

# Lista de cafés
coffees = ["Espresso", "Latte", "Cappuccino"]

# Usamos map para aplicar la función reverse a cada elemento de la lista
reversed_coffees = list(map(reverse, coffees))

print(reversed_coffees)  # Salida: ['osserpE', 'ettaL', 'oniccupaC']
```
- La expresión list(map(reverse, coffees)) combina dos conceptos: map y list. Aquí te explico por qué se utiliza de esta manera:

Desglose de list(map(reverse, coffees))

map(reverse, coffees):

* map: Es una función que aplica la función reverse a cada elemento de la lista coffees.
reverse: Es la función que definimos para invertir cadenas.

* coffees: Es la lista de cadenas que queremos procesar.

* El resultado de map es un objeto iterable que contiene los resultados de aplicar reverse a cada elemento de coffees, pero no es una lista en sí misma.

### list(...): 
* La función list() convierte el objeto iterable devuelto por map en una lista.

* Esto es necesario porque, si solo usas map, no obtienes una lista directamente, sino un objeto que se puede recorrer.

Ejemplo
Si solo usas map sin convertirlo a una lista:

```
resultado = map(reverse, coffees)
print(resultado)  # Salida: <map object at 0x...>
```

No verás los resultados directamente. Al envolverlo en list(), obtienes:
```

resultado_lista = list(map(reverse, coffees))
print(resultado_lista)  # Salida: ['osserpE', 'ettaL', 'oniccupaC']
```
Esto te permite trabajar con los resultados como una lista normal.

--------------------------------------------------------------------------------

La expresión string[::-1] se utiliza en Python para invertir una cadena. Aquí te explico cómo funciona:

Desglose de string[::-1]

string: Es la cadena que deseas invertir.
[:]: Es una forma de hacer un "slicing" (corte) de la cadena.
[::-1]:
El primer : indica que queremos tomar toda la cadena.
El segundo : seguido de -1 indica que queremos recorrer la cadena en pasos de -1, es decir, de atrás hacia adelante.
Ejemplo

Si tienes la cadena "Hola" y aplicas [::-1]: