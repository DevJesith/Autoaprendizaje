/*
Instrucciones
Tarea 1: Codificar una declaración de función
Debes codificar una declaración de función llamada  addTwoNums , que acepta los números  a  y  b  y la consola registra  a + b .

Tarea 2: Invocar la  función addTwoNums  con un número y una cadena
Debe invocar  addTwoNums  utilizando los siguientes argumentos:  5  y  "5" .

Tarea 3: Actualizar la  función addTwoNums  con un bloque try...catch
Agregue los bloques try y catch dentro del cuerpo de la definición de la función. Por ahora, solo asegúrese de que el registro de consola de  a + b  esté dentro del bloque try. Además, el  bloque catch  debe capturar un error llamado  err y, dentro del cuerpo del  bloque catch  , debe registrar en la consola el   valor err .

Tarea 4: Si los argumentos pasados ​​no son números, arroja un error
Si alguno de los argumentos pasados ​​a  addTwoNums  no son números, se generará un error.

En concreto, codifique un condicional con la siguiente lógica:

Si el  tipo  del  parámetro a  no es igual a  'número' , se genera un nuevo  ReferenceError . Dentro de  ReferenceError , se pasa un mensaje de error personalizado que diga  'el primer argumento no es un número' .

De lo contrario, si el  tipo  del  parámetro b  no es igual a  'número' , se genera un nuevo  ReferenceError . Dentro de  ReferenceError , se pasa un mensaje de error personalizado que diga  'el segundo argumento no es un número' .

De lo contrario, la consola registra  a + b  

Una vez que haya completado esta tarea, todo el código dentro del  bloque try  estará dentro de estas declaraciones condicionales.

Tarea 5: Actualizar el bloque catch
Dentro del bloque catch, actualice el código de  console.log(err)  a  console.log("Error!", err) .

Tarea 6: Invocar la   función addTwoNums
Invoque la   función  addTwoNums utilizando 5  y  "5"  como argumentos.

Tarea 7: Agregar otro registro de consola bajo la   invocación de la función addTwoNums
Agregue otra línea de código que registre en la consola la cadena  "Todavía funciona" .

 */

function addTwoNums(a,b) {
    try {
        if(typeof(a) != 'number') {
            throw new ReferenceError('the first argument is not a number')
        } else if (typeof(b) != 'number') {
            throw new ReferenceError('the second argument is not a number')
        } else {
            console.log(a + b)
        }
    } catch(err) {
        console.log("Error!", err)
    }
}
addTwoNums(5, 5)
console.log("It still works")