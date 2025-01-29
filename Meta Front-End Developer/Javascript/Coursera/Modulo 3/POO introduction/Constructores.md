
# Constructores en JavaScript

Un constructor es una función especial utilizada para crear e inicializar objetos. Cuando creas un objeto utilizando un constructor, estás creando una instancia de ese objeto. Los constructores para objetos nativos en JavaScript se escriben con mayúscula inicial y se usan con el operador new.

## Ejemplo 1: Usando el constructor Date
El objeto Date es un objeto nativo en JavaScript que tiene un constructor para crear instancias de fechas.

let fechaActual = new Date();
console.log(fechaActual); // Muestra la fecha y hora actual


## Ejemplo 2: Usando el constructor Array
El objeto Array también tiene un constructor para crear nuevas matrices.

let numeros = new Array(1, 2, 3, 4, 5);
console.log(numeros); // [1, 2, 3, 4, 5]


## Ejemplo 3: Creando un constructor personalizado
Además de los constructores nativos, también puedes crear tus propios constructores personalizados para tus objetos. Aquí tienes un ejemplo:

function Persona(nombre, edad) {
  this.nombre = nombre;
  this.edad = edad;
  this.saludar = function() {
    console.log(`Hola, mi nombre es ${this.nombre} y tengo ${this.edad} años.`);
  };
}

let juan = new Persona("Juan", 30);
juan.saludar(); // Hola, mi nombre es Juan y tengo 30 años.

## Ejemplo 4: Constructor Math
El objeto Math es un objeto nativo que no tiene un constructor. En lugar de crear instancias de Math, se accede a sus métodos y propiedades de manera estática.

let resultado = Math.pow(2, 5);
console.log(resultado); // 32


# Constructores de objetos primitivos

Es mejor no usar constructores para tipos primitivos (como String, Number y Boolean) ya que crea objetos en lugar de valores primitivos. Los valores primitivos son más eficientes y fáciles de comparar.


let cadena1 = new String("Hola"); // Crea un objeto String
let cadena2 = "Hola"; // Crea una cadena literal

console.log(cadena1 === cadena2); // false
console.log(cadena1 == cadena2); // true, pero la comparación puede ser confusa

## Ejemplo 5: Otros constructores nativos
Otros constructores nativos incluyen Map, Set, Promise, etc.

let mapa = new Map();
mapa.set('clave', 'valor');
console.log(mapa.get('clave')); // "valor"

let conjunto = new Set([1, 2, 3, 4, 5]);
console.log(conjunto.has(3)); // true

let promesa = new Promise((resolve, reject) => {
  setTimeout(() => resolve('Promesa resuelta'), 1000);
});
promesa.then(console.log); // "Promesa resuelta" después de 1 segundo