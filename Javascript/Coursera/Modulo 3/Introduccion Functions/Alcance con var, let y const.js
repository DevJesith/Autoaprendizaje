// Alcance Global y Local:

// Global Scope: Accesible en todo el programa.
// Local Scope: Accesible solo dentro de la función.

// var:

// Alcance de función o global.
// Se puede usar antes de ser declarada (hoisting).
// Se puede redeclarar.

var x = 10; // Global scope
function testVar() {
    var y = 20; // Local scope
    console.log(x); // Acceso a x (10)
    console.log(y); // Acceso a y (20)
}
testVar();
console.log(x); // Acceso a x (10)
// console.log(y); // Error: y is not defined

// let y const (ES6):
// Block Scope: Accesible solo dentro del bloque donde se declara.
// No se pueden usar antes de ser declaradas.
// let: Se puede redeclarar y su valor puede cambiar.
// const: No se puede redeclarar ni cambiar su valor.

function testLetConst() {
    let a = 30; // Block scope
    const b = 40; // Block scope
    if (true) {
        let a = 50; // Nueva variable a en este bloque
        console.log(a); // Acceso a a (50)
    }
    console.log(a); // Acceso a a (30)
    // b = 50; // Error: Assignment to constant variable
}
testLetConst();

