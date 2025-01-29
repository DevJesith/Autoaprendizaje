# Uso de Spread y Rest

En esta lectura, aprenderá a unir matrices y objetos mediante el operador rest. También descubrirá cómo usar el operador spread para:

* Agregue nuevos miembros a las matrices sin utilizar el método push() ,
* Convierte una cadena en una matriz y
* Copiar un objeto o una matriz en un objeto separado

`Recuerde que los métodos push() y pop() se utilizan para agregar y eliminar elementos del final de una matriz.`

## Unir matrices y objetos mediante el operador rest

Usando el operador de propagación, es fácil concatenar matrices:

```js
const fruits = ['apple', 'pear', 'plum']
const berries = ['blueberry', 'strawberry']
const fruitsAndBerries = [...fruits, ...berries] // concatenate
console.log(fruitsAndBerries); // outputs a single array

```

Aquí está el resultado:  

```js
['apple', 'pear', 'plum', 'blueberry', 'strawberry']
```

También es fácil unir objetos:  

```js
const flying = { wings: 2 }
const car = { wheels: 4 }
const flyingCar = {...flying, ...car}
console.log(flyingCar) // {wings: 2, wheels: 4}
```

## Agregar nuevos miembros a matrices sin utilizar el   método push()
A continuación se explica cómo utilizar el operador de propagación para agregar fácilmente uno o más miembros a una matriz existente:

```js
let veggies = ['onion', 'parsley'];
veggies = [...veggies, 'carrot', 'beetroot'];
console.log(veggies);
```
Aquí está el resultado:

```js
['onion', 'parsley', 'carrot', 'beetroot']
```

## Convierte una cadena en una matriz utilizando el operador de propagación

Dada una cadena, es fácil distribuirla en elementos de matriz separados:

```js
const greeting = "Hello";
const arrayOfChars = [...greeting];
console.log(arrayOfChars); //  ['H', 'e', 'l', 'l', 'o']
```

## Copiar un objeto o una matriz en uno separado
A continuación se explica cómo copiar un objeto en un objeto completamente separado, utilizando el operador de propagación.

```js
const car1 = {
    speed: 200,
    color: 'yellow'
}
const car 2 = {...car1}

car1.speed = 201

console.log(car1.speed, car2.speed)
```

La salida es  201, 200 .

También puedes copiar una matriz en una matriz completamente separada, utilizando el operador de propagación, de la siguiente manera:

```js
const fruits1 = ['apples', 'pears']
const fruits2 = [...fruits1]
fruits1.pop()
console.log(fruits1, "not", fruits2)
```
Esta vez, el resultado es:

['apples'] 'not' ['apples','pears']

Tenga en cuenta que el operador de propagación solo realiza una copia superficial de la matriz o el objeto de origen. Para obtener más información sobre esto, consulte la lectura adicional.

Hay muchos más trucos que puedes realizar con el operador spread. Algunos de ellos son realmente útiles cuando empiezas a trabajar con una biblioteca como React.