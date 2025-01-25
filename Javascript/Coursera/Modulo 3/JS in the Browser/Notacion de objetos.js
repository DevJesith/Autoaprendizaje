// JSON (JavaScript Object Notation):  es un formato de texto que representa datos estructurados. Es comúnmente utilizado para intercambiar datos entre un servidor y una aplicación web.

// Para trabajar con JSON en JavaScript, se utilizan dos métodos del objeto global JSON:
    // JSON.parse(): Convierte una cadena JSON en un objeto de JavaScript.
    // JSON.stringify(): Convierte un objeto de JavaScript en una cadena JSON.

// 1. Convertir JSON a un Objeto de JavaScript

// Paso 1: Declara una cadena JSON.


const jsonString = '{"greeting": "hello"}';

// Paso 2: Usa JSON.parse() para convertir la cadena JSON en un objeto.


const obj = JSON.parse(jsonString);

// Paso 3: Ahora puedes acceder y manipular las propiedades del objeto.


console.log(obj.greeting); // Salida: hello
obj.greeting = "hi"; // Cambiamos el valor
console.log(obj.greeting); // Salida: hi

// }2. Convertir un Objeto de JavaScript a JSON

// Paso 1: Declara un objeto de JavaScript.


const data = { 
    greeting: "hi", 
    number: 42 
};

// Paso 2: Usa JSON.stringify() para convertir el objeto en una cadena JSON.


// const jsonString = JSON.stringify(data);

// Paso 3: Ahora jsonString contiene la representación JSON del objeto.

console.log(jsonString); // Salida: {"greeting":"hi","number":42}


// Limitaciones

// JSON no puede contener funciones ni comentarios de JavaScript.

// Al convertir un objeto que contiene métodos, estos se excluyen en la operación de stringify.
