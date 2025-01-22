# Trabajar con matrices en JavaScript

Anteriormente, has cubierto muchos conceptos relacionados con cómo trabajar con matrices de JavaScript.

Sin embargo, todavía hay algunos temas importantes que se pueden cubrir, y uno de ellos es, por ejemplo, trabajar con algunos métodos integrados.

En esta lectura, el enfoque se centra en tres métodos específicos que existen en las matrices:

1. forEach 
2. filter
3. map

## El  método forEach()
Las matrices en JavaScript vienen con un método útil que le permite recorrer cada uno de sus miembros.

Aquí está la sintaxis básica:

```js
const fruits = ['kiwi','mango','apple','pear'];
function appendIndex(fruit, index) {
    console.log(`${index}. ${fruit}`)
}
fruits.forEach(appendIndex);
```

El resultado de ejecutar el código anterior es este:  

```js
0. kiwi
1. mango
2. apple
3. pear
```

Para explicar la sintaxis, el   método  forEach() acepta una función que funcionará en cada elemento de la matriz . El primer parámetro de esa función es el elemento de la matriz actual y el segundo parámetro (opcional) es el índice.

Muy a menudo, la función que el  método forEach()  necesita utilizar se pasa directamente a la llamada al método, de esta manera:

```js
const veggies = ['onion', 'garlic', 'potato'];
veggies.forEach( function(veggie, index) {
    console.log(`${index}. ${veggie}`);
});
```

Esto hace que el código sea más compacto, pero quizás un poco más difícil de leer. Para aumentar la legibilidad, a veces se utilizan funciones de flecha. Puede obtener más información sobre las funciones de flecha en la lectura adicional.

## El   método filter()
Otro método muy útil para las matrices es el  método filter()  . Filtra las matrices  en función de una prueba específica . Se devuelven los elementos de la matriz que pasan la prueba.

He aquí un ejemplo:

```js
const nums = [0,10,20,30,40,50];
nums.filter( function(num) {
    return num > 20;
})
```

Aquí está el valor de la matriz devuelta:  

```js
[30,40,50]
```

Similar al  método forEach() , el  método filter()  también acepta una función y esa función realiza algún trabajo en cada uno de los elementos de la matriz.

## El  método de map
Por último, hay un   método de mapas muy útil.

Este método se utiliza para mapear cada elemento de la matriz a otro elemento de la matriz, en función del trabajo realizado dentro de la función que se pasa al mapa como parámetro.

Por ejemplo:

```js
[0,10,20,30,40,50].map( function(num) {
    return num / 10
})
```

El valor de retorno del código anterior es:  

```js
[0,1,2,3,4,5]
```

Como ya se ha comentado, la elección de una estructura de datos adecuada afecta al código que se puede escribir. Esto se debe a que la estructura de datos en sí misma viene con una funcionalidad integrada que facilita la realización de determinadas tareas o las hace más difíciles o incluso imposibles sin convertir el código a una estructura de datos adecuada.

Ahora que ha cubierto los métodos, exploremos cómo trabajar con diferentes estructuras de datos integradas en JavaScript.

# Trabajar con objetos en JavaScript

Gran parte de la información sobre cómo trabajar con objetos en JavaScript ya se ha cubierto en este curso.

El siguiente ejemplo demuestra cómo utilizar la estructura de datos de objeto para completar una tarea específica. Esta tarea consiste en convertir un objeto en una matriz:

```js
const result = [];
const drone = {
    speed: 100,
    color: 'yellow'
}
const droneKeys = Object.keys(drone);
droneKeys.forEach( function(key) {
    result.push(key, drone[key])
})
console.log(result)
```

Este es el resultado de ejecutar el código anterior: 
```js
['speed',100,'color','yellow']
```

Si bien esto es posible y funciona, tener que hacer algo como esto podría significar que no has elegido la estructura de datos correcta para trabajar en tu código.

Por otro lado, a veces no puedes elegir la estructura de datos con la que estás trabajando. Quizás esos datos provienen de un proveedor de datos externo y todo lo que puedes hacer es codificar tu programa para que los consuma. Aprenderás más sobre el intercambio de datos en la web cuando aprendas sobre JSON (notación de objetos JavaScript).

## Trabajar con mapas en JavaScript
Para crear un nuevo mapa, puedes utilizar el  constructor de mapas  :

```js
new Map();
```

Un mapa puede parecer muy similar a un objeto en JS.

Sin embargo, no tiene herencia ni prototipos, lo que lo hace útil como almacenamiento de datos.

Por ejemplo:

```js
let bestBoxers = new Map();
bestBoxers.set(1, "The Champion");
bestBoxers.set(2, "The Runner-up");
bestBoxers.set(3, "The third place");

console.log(bestBoxers);
```

Aquí está la salida de la consola:  

```js
Map(3) {1 => 'The Champion', 2 => 'The Runner-up', 3 => 'The third place'}
```

Para obtener un valor específico, debe utilizar el  método get()  . Por ejemplo:  

```js
bestBoxers.get(1); // 'The Champion'
```

## Trabajar con conjuntos en JavaScript

Un conjunto es una colección de valores únicos.

Para construir un nuevo conjunto, puedes utilizar el  constructor de conjuntos  :

```js
new Set();
```

El  constructor Set  puede, por ejemplo, aceptar una matriz.

Esto significa que podemos usarlo para filtrar rápidamente una matriz en busca de miembros únicos.

```js
const repetitiveFruits = ['apple','pear','apple','pear','plum', 'apple'];
const uniqueFruits = new Set(repetitiveFruits);
console.log(uniqueFruits);
```
El código anterior genera lo siguiente en la consola:  

```js
{'apple', 'pear', 'plum'}
```

Otras estructuras de datos en JavaScript
Además de las estructuras de datos integradas en JavaScript, es posible crear estructuras de datos personalizadas y no nativas.

Estas estructuras de datos vienen incorporadas de forma nativa en algunos otros lenguajes de programación o incluso en aquellos otros lenguajes de programación que no las admiten de forma nativa.

Algunas estructuras de datos más avanzadas que no se han cubierto incluyen:

* Colas

* Listas enlazadas (simplemente enlazadas y doblemente enlazadas)

* Árboles

* Gráficos

Para obtener recursos sobre la construcción de estas estructuras de datos, consulte la lectura adicional.
