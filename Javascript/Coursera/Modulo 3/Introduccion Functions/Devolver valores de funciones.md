Muchas funciones, por defecto, devuelven el valor  undefined .

Un ejemplo es la   función console.log() .

Si corro:


console.log('Hello');
...aquí está la salida en la consola:


Hello
undefined
Debido a que la  función console.log()  está construida para no tener el valor de retorno establecido explícitamente, obtiene el valor de retorno predeterminado de  undefined .

Ahora codificaré mi propia implementación de  console.log() , que no devuelve el valor de  undefined :


function consoleLog(val) {
    console.log(val)
    return val
}
Estoy usando la   función  console.log() dentro de mi declaración de función consoleLog personalizada  y la estoy especificando para que devuelva el valor de su argumento.

Ahora, cuando ejecuto mi   función consoleLog() personalizada:


consoleLog('Hello')
Obtengo el siguiente resultado:


Hello
'Hello'
Entonces, el valor se muestra en la consola, pero también se devuelve.

¿Por qué es esto útil?

Es útil porque puedo usar valores de retorno de una función dentro de otra función.

He aquí un ejemplo.

Primero codificaré una función que devuelva el doble de un número que recibió:


function doubleIt(num) {
    return num * 2
}
Ahora codificaré otra función que construye un objeto con un valor específico:


function objectMaker(val) {
    return {
        prop: val
    }
}
Puedo llamar a la  función objectMaker()  con cualquier valor que desee, como por ejemplo:


objectMaker(20);
El valor devuelto será un objeto con una única  clave de propiedad  establecida en  20 :


{prop:20}
Ahora considere este código:


doubleIt(10).toString()
El código anterior devuelve el número  20  como una cadena, es decir:  "20" .

Incluso puedo combinar mis llamadas de funciones personalizadas de la siguiente manera:


objectMaker( doubleIt(100) );
Esto ahora devolverá el siguiente valor:


{prop: 200}
¿Qué significa todo esto?

Esto significa que si JavaScript me permite usar la  palabra clave return  como se describe arriba, puedo tener múltiples llamadas de función, devolver datos y manipular valores, en función de cualquier desafío de codificación que tenga frente a mí.

Poder devolver valores personalizados es una de las bases que hacen posible la programación funcional.