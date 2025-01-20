// Parámetros predeterminados en ES6:

// Los parámetros predeterminados permiten asignar un valor por defecto a un parámetro de función si no se proporciona ningún valor al invocarla. Esto ayuda a prevenir errores y a hacer que el código sea más robusto y legible.

function noDefaultParams(number) {
    console.log('Result:', number * number);
}

noDefaultParams(); // Result: NaN

// Ejemplo con parámetros predeterminados:

function withDefaultParams(number = 10) {
    console.log('Result:', number * number);
}

withDefaultParams(); // Result: 100

// Con un parámetro predeterminado, la función utiliza 10 si no se proporciona ningún argumento, devolviendo 100.


// Uso de parámetros predeterminados en clases:

// Clase sin parámetros predeterminados:

class NoDefaultParams {
    constructor(num1, num2, num3, string1, bool1) {
        this.num1 = num1;
        this.num2 = num2;
        this.num3 = num3;
        this.string1 = string1;
        this.bool1 = bool1;
    }
    calculate() {
        if (this.bool1) {
            console.log(this.string1, this.num1 + this.num2 + this.num3);
        } else {
            console.log('The value of bool1 is incorrect');
        }
    }
}

var fail = new NoDefaultParams(1, 2, 3, 'Result:', false);
fail.calculate(); // 'The value of bool1 is incorrect'

// Sin valores predeterminados, debemos proporcionar todos los argumentos para evitar errores.

// Clase con parámetros predeterminados:

class WithDefaultParams {
    constructor(num1 = 1, num2 = 2, num3 = 3, string1 = "Result:", bool1 = true) {
        this.num1 = num1;
        this.num2 = num2;
        this.num3 = num3;
        this.string1 = string1;
        this.bool1 = bool1;
    }
    calculate() {
        if (this.bool1) {
            console.log(this.string1, this.num1 + this.num2 + this.num3);
        } else {
            console.log('The value of bool1 is incorrect');
        }
    }
}

var success = new WithDefaultParams();
success.calculate(); // 'Result: 6'

// Con valores predeterminados, la clase funciona correctamente incluso si no se proporcionan argumentos, facilitando pruebas rápidas y mejorando la legibilidad del código.

// Conclusión:

// Diseño de programas orientados a objetos en JavaScript:

// * Utilizar clases y herencia (extends, super).

// Importancia de los parámetros predeterminados:

// * Facilitan el manejo de argumentos en funciones y clases, mejorando la robustez y flexibilidad del código.