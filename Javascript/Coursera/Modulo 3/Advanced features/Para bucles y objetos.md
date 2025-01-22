# Para bucles y objetos

En esta lectura, aprenderá cómo funciona conceptualmente el bucle for.

Para comenzar, es importante saber que un bucle for of no puede funcionar directamente sobre un objeto, ya que  un objeto no es iterable . Por ejemplo:

```js
const car = {
    speed: 100,
    color: "blue"
}

for(prop of car) {
    console.log(prop)
}
```

Al ejecutar el fragmento de código anterior se producirá el siguiente error: 

```js
Uncaught TypeError: car is not iterable
```

A diferencia de los objetos, las matrices  son  iterables. Por ejemplo:  

```js
const colors = ['red','orange','yellow']
for (var color of colors) {
    console.log(color);
}
```
Esta vez, el resultado es el siguiente:  
```js
red
orange
yellow
```

Afortunadamente, puedes aprovechar el hecho de que un bucle for se puede ejecutar en matrices  para recorrer objetos .

¿Pero cómo?

Antes de poder responder correctamente a esta pregunta, primero debe revisar tres métodos integrados:  `Object.keys() ,  Object.values() y  Object.entries()` .

## Métodos integrados

* El   método Object.keys()

El  método Object.keys()  recibe un objeto como parámetro. Recuerda que este objeto es  el objeto sobre el que quieres realizar un bucle . Aún es demasiado pronto para explicar cómo realizarás un bucle sobre el objeto en sí; por ahora, céntrate en la matriz de propiedades que se devuelve cuando llamas al   método Object.keys() .

A continuación se muestra un ejemplo de ejecución del  método Object.keys() en un  objeto car2  completamente nuevo  :

```js
const car2 = {
    speed: 200,
    color: "red"
}
console.log(Object.keys(car2)); // ['speed','color']
```

Entonces, cuando ejecuto  Object.keys()  y le paso mi   objeto  car2 , el valor devuelto es una matriz de cadenas , donde cada cadena es una clave de propiedad de las propiedades contenidas en mi   objeto car2 .

* El método Object.values()

Otro método útil es  Object.values() :

```js
const car3 = {
    speed: 300,
    color: "yellow"
}
console.log(Object.values(car3)); // [300, 'yellow']
```

* El método Object.entries()

Por último, hay otro método útil,  Object.entries() , que devuelve una matriz que enumera tanto las claves como los valores.  

```js
const car4 = {
    speed: 400,
    color: 'magenta'
}
console.log(Object.entries(car4));
```
Lo que se devuelve de la invocación del  método Object.entries()  es lo siguiente:  

```js
[ ['speed', 400], ['color', 'magenta'] ]
```

La parte más complicada de entender en esta sintaxis es probablemente  clothingItem[key] .

Afortunadamente, esto no es demasiado difícil de comprender, especialmente porque ya has cubierto el concepto anteriormente cuando estabas aprendiendo  cómo acceder a los miembros de un objeto usando la notación de corchetes .

Recuerda que también aprendiste cómo acceder dinámicamente al nombre de una propiedad.

Para revisar este concepto y mostrar una demostración práctica de cómo funciona, codifiquemos una declaración de función que asigne aleatoriamente la  velocidad de la cadena  o el  color de la cadena  a un nombre de variable, y luego construyamos un objeto que tenga solo dos claves: una  clave de velocidad  y una  clave de color  .

Después de esta configuración, podrá acceder dinámicamente a cualquiera de esas propiedades en un nuevo  objeto dron  , utilizando la notación entre corchetes.

Aquí está el código del ejemplo:

```js
function testBracketsDynamicAccess() {
  var dynamicKey;
  if(Math.random() > 0.5) {
    dynamicKey = "speed";
   }else{
     dynamicKey = "color";
   }

    var drone = {
      speed: 15,
      color: "orange"
    }

    console.log(drone[dynamicKey]);
}
testBracketsDynamicAccess();
```

Este ejemplo puede parecer un poco complicado, pero su propósito es demostrar el hecho de que estás obteniendo uno u otro valor de la clave de un objeto, en función de la cadena que se asignó a la  variable dynamicKey  y a la que se accedió sin problemas, usando la notación de corchetes.

No dudes en ejecutar la  función testBracketsDynamicAccess()  unas cuantas veces y notarás que, a veces, el valor que se obtiene como resultado es  15 y, a veces, es  orange , aunque siempre estoy accediendo a la   clave drone[dynamicKey] . Dado que el valor de dynamicKey  se completa en la  invocación de Math.random()  , a veces esa expresión se evalúa como  drone["speed"] y, otras veces, esa expresión se evalúa como  drone["color"] .


Ahora ha aprendido acerca de los componentes básicos que hacen que el bucle for sea útil para iterar sobre objetos,  aunque los objetos no sean iterables.

A continuación, probarás un ejemplo práctico de cómo trabajar con los bucles for of y for in. Cada bucle tiene su lugar y puede considerarse útil en diferentes situaciones.