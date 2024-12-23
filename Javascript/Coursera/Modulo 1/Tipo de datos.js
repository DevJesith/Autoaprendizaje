//Hay 7 tipos de datos primitivos: String, numbers, boolean, null, underfined, BigInt, Symbol.

// BigInt = Es como admitir un rango mucho mayor de numeros que el tipo de datos numericos. (Caja grande de numeros)
//Symbol = Se puede utilizar como un identificador unico.

// 1. String
let nombre = "Juan";
console.log(nombre); // Output: Juan

// 2. Number
let edad = 30;
console.log(edad); // Output: 30

// 3. Boolean
let esMayorDeEdad = true;
console.log(esMayorDeEdad); // Output: true

// 4. Null
let cuentaBancaria = null;
console.log(cuentaBancaria); // Output: null

// 5. Undefined
let telefono;
console.log(telefono); // Output: undefined

// 6. BigInt
let numeroGrande = 1234567890123456789012345678901234567890n;
console.log(numeroGrande); // Output: 1234567890123456789012345678901234567890

// 7. Symbol
let id = Symbol('id_unico');
console.log(id); // Output: Symbol(id_unico)


                        //Operadores

//Asignacion
/* +, suma, 2+3
    -, resta, 2-3
    *, Multiplica, 2*3
    /, division, 2/- 
*/

//Comparador
/* >, mayor que, 2>3
    <, menor que, 2<3
    ==, igual a, 2==3
    !=, no igual a, 2!=3 
*/


//Logicos
/* &&, Revisa si ambos son true, a>5 && a<10
    ||, Revisa si una condicion es false, a>5 || a>10
    !, Devuelve falso si el resutado es false */

    // console.log(2 + 2)
    // console.log( 1 + 2 +3 +4 + 5)
    // console.log( 20 - 18)
    // console.log( 2 * 3)
    // console.log( 8 / 1)
    // console.log(3 > 2)
    // console.log(2 < 3)
    // console.log(10 == 10)
    // console.log(10 **2)
    // console.log(9%8)
    // console.log(2*4+8)
    // console.log(2*(4+8))

/*El operador de asignación de suma,  (+=)
 El operador de asignación de suma se utiliza cuando se desean acumular los valores almacenados en una variable.
 */

//  var mon = 1;
// var tue = 2;
// var wed = 1;
// var thu = 2;
// var fri = 3;
// console.log(mon + tue + wed + thu + fri); // 9

//Usando +=
// var overtime = 1;
// overtime += 2;
// overtime += 1;
// overtime += 2;
// overtime += 3;
// console.log(overtime); // 9

/*El operador de asignación de concatenación,  (+=)
La sintaxis de este operador es exactamente la misma que la del operador de asignación de suma. La diferencia está en el tipo de datos utilizado: */

// var longString = "";
// longString += "Once";
// longString += " upon";
// longString += " a";
// longString += " time";
// longString += "...";
// console.log(longString); // "Once upon a time..."