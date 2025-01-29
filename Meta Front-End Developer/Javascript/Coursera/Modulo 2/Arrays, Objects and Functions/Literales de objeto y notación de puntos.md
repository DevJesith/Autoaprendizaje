Literales de objeto y notación de puntos
Una de las formas más comunes de construir un objeto en JavaScript es utilizando la sintaxis literal de objeto:  {} .

Para poder acceder a este objeto literal, es muy común asignarlo a una variable, como por ejemplo:

var user = {}; //create an object

Ahora se asigna un objeto literal a la variable  usuario , lo que significa que el objeto al que está vinculado se puede extender y manipular de innumerables maneras.

A veces, se puede construir inmediatamente un objeto completo, utilizando la sintaxis literal de objeto, especificando las propiedades del objeto, delimitadas como pares clave-valor, utilizando una sintaxis que ya se trató en un elemento de la lección anterior de esta lección.

He aquí uno de esos objetos construidos previamente:

//creating an object with properties and their values
var assistantManager = {
    rangeTilesPerTurn: 3,
    socialSkills: 30,
    streetSmarts: 30,
    health: 40,
    specialAbility: "young and ambitious",
    greeting: "Let's make some money"
}

La belleza de esta sintaxis es que es muy fácil de leer.

Consiste esencialmente en dos pasos:

1. Declarar una nueva variable y asignarle un objeto literal, en otras palabras, esto:  var assistantManager = {} 

2. Asignar los valores a cada una de las claves del objeto, utilizando el operador de asignación,  =

Tenga en cuenta que es muy fácil construir cualquier tipo de objeto en JavaScript utilizando esta sintaxis de ejemplo.

Por ejemplo, aquí hay un   objeto de tabla :

var table = {
    legs: 3,
    color: "brown",
    priceUSD: 100,
}

Para acceder al  objeto de tabla  , simplemente puedo registrar en la consola todo el objeto:  

console.log(table);//display the object in the developer console

El valor devuelto es el  objeto de tabla completo  :  
{legs: 3, color: 'brown', priceUSD: 100}

Además, puedo registrar en la consola cualquier propiedad individual, de esta manera:

console.log(table.color); // 'brown'

Ahora que tengo esta "receta de sintaxis", puedo construir cualquier otro objeto de manera similar:

var house = {
    rooms: 3,
    color: "brown",
    priceUSD: 10000,
}

Un enfoque alternativo para construir objetos es primero guardar un objeto literal vacío en una variable, luego usar la notación de punto para declarar nuevas propiedades sobre la marcha y usar el operador de asignación para agregar valores a esas propiedades; por ejemplo:

var house2 = {};
house2.rooms = 4;
house2.color = "pink";
house2.priceUSD = 12345;

Además, nada me impide combinar ambos enfoques. Por ejemplo:  

console.log(house); // {rooms: 3, color: "brown", priceUSD: 10000}
house.windows = 10;
console.log(house); // {rooms: 3, color: "brown", priceUSD: 10000, windows: 10}

Esta flexibilidad también significa que puedo actualizar propiedades ya existentes, no solo agregar otras nuevas:  

house.windows = 11;
console.log(house); // {rooms: 3, color: "brown", priceUSD: 10000, windows: 11}