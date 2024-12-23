/* Tarea 1: Uso del operador lógico &&
Estás codificando un juego de rol, donde cada personaje tiene ciertos niveles de habilidad basados ​​en el valor guardado en su puntuación.

Crea una variable llamada   puntuación y configúrala en   8

Utilice console.log() que incluye la cadena "Habilidades de nivel medio:" y compara la variable de puntuación con más de 0 y menos de 10 utilizando el operador &&

La salida esperada en la consola debería ser: "Habilidades de nivel medio: verdadero" . */

var puntuacion = 8;
console.log("Habilidades de nivel medio: ", puntuacion > 0 && puntuacion < 10);

//2
/*Tarea 2: Uso del operador lógico ||
Imagina que estás codificando un videojuego. En este momento, estás a punto de codificar algunos fragmentos relacionados con la condición de fin del juego.

Debes codificar una nueva variable llamada timeRemaining y establecerla en 0. También debes codificar una nueva variable llamada energy y establecerla en 10 .

A continuación, debes escribir un fragmento de código que pueda usarse para determinar si el juego terminó, en función de si el valor de la variable timeRemaining es 0 o el valor de la variable energy es 0 .

Complete la tarea siguiendo los siguientes pasos:

Declare la variable timeRemaining y asígnele el valor 0 .

Declara la variable energía y asígnale el valor de 10 .

La consola registra los siguientes parámetros: "Game over: " y timeRemaining == 0 || energy == 0

Tenga en cuenta que la salida esperada en la consola debe ser: "Game over: true" . */

var timeRemaining = 0;
var energy = 10;
console.log("Game over: ", timeRemaining == 0 || energy == 0)

// 3
/*Tarea 3: Usar el operador de módulo, % , para probar si un número dado es impar
Necesitas codificar un pequeño programa que tome un número y determine si es un número par (como 2, 4, 6, 8, 10).

Para lograr esta tarea, es necesario declarar seis variables, de la siguiente manera:

A la primera variable, denominada num1, se le debe asignar un valor numérico de 2 .

A la segunda variable, denominada num2 , se le debe asignar un valor numérico de 5 .

A la tercera variable, denominada test1 , se le debe asignar el cálculo de num1 % 2. Nota : al ejecutar este código, se devolverá un número.

A la cuarta variable, denominada test2 , se le debe asignar el cálculo de num2 % 2. Nota : al ejecutar este código también se devolverá un número.

A la quinta variable, denominada result1 , se le debe asignar el resultado de la comparación si el número almacenado en la variable test1 no es igual a 0 , en otras palabras, esto: test1 == 0 .

A la sexta variable, denominada result2 , se le debe asignar el resultado de la comparación si el número almacenado en la variable test2 no es igual a 0 , en otras palabras, test2 == 0 .

Ejecute el registro de consola dos veces después de haber configurado las variables:

El primer registro de la consola debe tener el siguiente código entre paréntesis: "Es", num1, "un número par?", result1

El segundo registro de la consola debe tener el siguiente código entre paréntesis: "Es", num2, "un número par?", result2

Nota : La salida a la consola debe ser la siguiente:

¿Es 2 un número par? Es cierto

¿Es 5 un número par? Falso */

var num1 = 2;
var num2 = 5;
var test1 = num1 % 2; 
var test2 = num2 % 2;
var result1 = test1 == 0; 
var result2 = test2 == 0; 

console.log("Es", num1, "un numero par?", result1)
console.log("Es", num2, "un numero par?", result2)

// 4
/*Tarea 4: Sumar números usando el operador +
La consola registra el resultado de sumar dos números, 5 y 10 , utilizando el operador + .

Nota : Esta tarea debe completarse en una sola línea de código. El resultado en la consola debe ser 15 . */

console.log(5 + 10)

//5
/*Tarea 5: Concatenar números y cadenas utilizando el operador +
Codifique tres variables:

La primera variable debe ser una cadena con el siguiente valor: "Ahora en" . Nombre la variable ahora .

La segunda variable debe ser un número con el valor: 3. Nombra la variable tres .

La tercera variable debe ser una cadena con el siguiente valor: "D!" . Nombre la variable d .

La consola registra el siguiente código: now + three + d .

Nota : El resultado esperado debería ser: "¡Ahora en 3D!" . */

var now = "It's now"
var three = 3
var d = "D!"
console.log(now+three+d)

// 6 
/*Tarea 6: Utilice el operador += para acumular valores en una variable
Codifique una nueva variable y nómbrela contador , asignándole el valor 0 .

En la siguiente línea, utilice el operador += para aumentar el valor del contador en 5 .

En la siguiente línea, utilice el operador += para aumentar el valor del contador en 3 .

En la cuarta línea, la consola registra el valor de la variable del contador .

Nota : El valor de salida debe ser 8 . */

var counter = 0;
counter += 5;
counter += 3;
console.log(counter)