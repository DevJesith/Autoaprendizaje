Las matrices son objetos
En JavaScript, las matrices son objetos, lo que significa que también tienen algunas propiedades y métodos integrados.

Uno de los métodos integrados más utilizados en matrices son los  métodos push()  y  pop()  .

Para agregar nuevos elementos a una matriz, puedo usar el   método push() :

var fruits = [];
fruits.push("apple"); // ['apple']
fruits.push('pear'); // ['apple', 'pear']

Para eliminar el último elemento de una matriz, puedo usar el   método   pop() :

fruits.pop();
console.log(fruits); // ['apple']

Siguiendo con algunas lecciones anteriores de este curso, ahora puedo crear una función que toma todos sus argumentos y los coloca en una matriz, como esta:

function arrayBuilder(one, two, three) {
    var arr = [];
    arr.push(one);
    arr.push(two);
    arr.push(three);
    console.log(arr);
}

Ahora puedo llamar a la  función arrayBuilder()  , por ejemplo, de esta manera:  

arrayBuilder('apple', 'pear', 'plum'); // ['apple', 'pear', 'plum']

Mejor aún, no tengo que registrar en la consola la matriz recién creada.

En cambio, puedo devolverlo:

function arrayBuilder(one, two, three) {
    var arr = [];
    arr.push(one);
    arr.push(two);
    arr.push(three);
    return arr;
}

Además, puedo guardar esta llamada de función en una variable.

Puedo nombrarlo como quiera, pero esta vez usaré el nombre:  simpleArr .

var simpleArr = arrayBuilder('apple', 'pear', 'plum');

Y ahora puedo registrar por consola los valores almacenados en  simpleArr :  

console.log(simpleArr); // ['apple','pear','plum']