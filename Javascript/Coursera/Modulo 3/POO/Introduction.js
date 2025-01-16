// La programación orientada a objetos organiza programas utilizando objetos que agrupan datos y funcionalidades relacionadas, mientras que la programación funcional mantiene los datos separados de las funciones.
// Un ejemplo ilustra el cálculo del costo total del calzado utilizando ambos paradigmas:
// En programación funcional , se crea una función para calcular el precio total utilizando variables separadas para los zapatos y los impuestos.
// En OOP , se crea un objeto para encapsular los datos y los métodos, lo que permite una mejor organización y reutilización del código.
// La thispalabra clave en OOP permite que los métodos hagan referencia al objeto actual, lo que promueve la eficiencia del código.
// La lección concluye con la introducción de clases como una forma de crear plantillas para objetos, mejorando la reutilización del código.



// functional programming
var shoes = 100;
var stateTax = 1.2;

function totalPrice(shoes, tax) {
    return shoes * tax;
}

var toPay = totalPrice(shoes, stateTax);

console.log(toPay);


// OOP 2: this

var purchase1 = {
    shoes: 100,
    stateTax: 1.2,
    totalPrice: function () {
        var calculation = this.shoes * this.stateTax;
        console.log('Total price:', calculation);
    }
}

purchase1.totalPrice(); // 120

var purchase2 = {
    shoes: 50,
    stateTax: 1.2,
    totalPrice: function () {
        var calculation = purchase2.shoes * purchase2.stateTax;
        console.log('Total price:', calculation);
    }
}

purchase2.totalPrice(); // 60
