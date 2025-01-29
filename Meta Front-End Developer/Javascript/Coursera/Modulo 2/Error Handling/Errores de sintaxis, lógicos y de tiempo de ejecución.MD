Al finalizar esta lectura, usted podrá:

Reconocer tipos comunes de errores en JavaScript

Estos son algunos de los errores más comunes en JavaScript:

Error de referencia

Error de sintaxis

Error de tipo

Error de rango

Existen otros errores en JavaScript, entre ellos:

Error de agregado

Error

Error interno

Error URIE

Sin embargo, en esta lectura me centraré en los errores de Referencia, Sintaxis, Tipo y Rango.

Error de referencia
Se lanza un ReferenceError cuando, por ejemplo, uno intenta utilizar variables que no han sido declaradas en ningún lugar.

Un ejemplo podría ser, por ejemplo, intentar registrar por consola una variable que no existe:

console.log(username);

Si no se ha declarado la variable denominada  nombre de usuario  , la línea de código anterior dará como resultado el siguiente resultado:

Uncaught ReferenceError: username is not defined

Error de sintaxis
Cualquier tipo de código JavaScript no válido provocará un SyntaxError.

Por ejemplo:

var a "there's no assignment operator here";

La línea de código anterior arrojará el siguiente error:

Uncaught SyntaxError: Unexpected string

Hay una advertencia interesante con respecto a SyntaxError en JavaScript: no se puede detectar usando el  bloque try-catch  .  

Error de tipo
Se lanza un TypeError cuando, por ejemplo, se intenta ejecutar un método en un tipo de datos no admitido.

Un ejemplo simple es intentar ejecutar el  método pop()  en una cadena:

"hello".pop() // Uncaught TypeError: "hello".pop is not a function

El comportamiento similar a una matriz de las cadenas ya se trató en una lección anterior de este curso.

Sin embargo, como se puede confirmar al ejecutar la línea de código anterior, las cadenas no tienen todos los métodos de matriz disponibles y, al intentar usar algunos de esos métodos, se generará un TypeError.  

Error de rango
Se lanza un RangeError cuando le damos un valor a una función, pero ese valor está fuera del rango permitido de valores de entrada aceptables.

A continuación se muestra un ejemplo sencillo de conversión de un  número cotidiano de base 10  (un número del sistema decimal común) a un  número de base 2  (es decir, un número binario).

Por ejemplo:

(10).toString(2); // '1010'

El valor de  2  cuando se pasa al  método toString()  , es como decirle a JavaScript: "convierte el valor de  10  del sistema numérico Base 10, a su contraparte en el sistema numérico Base 2".

JavaScript obliga y “traduce” el número “regular” 10 a su contraparte binaria.

Además de utilizar el sistema numérico de base 2, también puedo utilizar el de base 8, de esta manera:

(10).toString(8); // 12

Recupero el valor  12 , que es el número simple 10, escrito en el sistema numérico Base 8.

Sin embargo, si intento utilizar un sistema numérico inexistente, como un  Base 100 imaginario , dado que este sistema numérico efectivamente no existe en JavaScript, obtendré el RangeError, porque un  sistema Base 100 inexistente  está  fuera del rango  de los sistemas numéricos que están disponibles para el  método toString()  :

(10).toString(100); // Uncaught RangeError: toString() radix argument must be between 2 and 36