/*
La programación defensiva consiste en asumir que todos los argumentos que recibirá una función son del tipo incorrecto, del valor incorrecto o ambos.

En otras palabras, estás asumiendo que las cosas saldrán mal y eres proactivo al pensar en esos escenarios antes de que sucedan, de modo de hacer que tu función tenga menos probabilidades de causar errores debido a entradas defectuosas.

¿Cómo refactorizarías entonces la función que se muestra a continuación teniendo en cuenta la programación defensiva?

Para este ejercicio, asegurémonos de que ambos argumentos que se pasan satisfacen los siguientes criterios:

La longitud del parámetro de palabra no puede ser menor que 2 .

La longitud del parámetro de coincidencia debe ser 1 .

El tipo tanto de la palabra como de los parámetros de coincidencia deben ser cadena .

Utilizarás el código siguiente para completar tu tarea:
*/

function letterFinder(word, match) {
    for(var i = 0; i < word.length; i++) {
        if(word[i] == match) {
            //if the current character at position i in the word is equal to the match
            console.log('Found the', match, 'at', i)
        } else {
            console.log('---No match found at', i)
        }
    }
}

/*
Aquí están las tareas a completar:

Justo encima del bucle for en la definición de la función letterFinder , declare una variable llamada condition1 y asígnele el siguiente código: typeof(word) == 'string' && word.length >= 2 .

Declare una variable llamada condición2 en la siguiente línea y asígnele una verificación que garantice que el tipo de coincidencia es una cadena Y que la longitud de la variable de coincidencia es igual a 1 .

Escriba una declaración if en la siguiente línea que verifique que la condición1 es verdadera y la condición2 es verdadera

Mueva el resto del cuerpo de la función a la declaración if que escribió en el paso anterior.

Codifique un bloque "else" después de la condición "if" y console.log lo siguiente: "Pase los argumentos correctos a la función" .

Como prueba fallida, ejecute la función letterFinder y pásela con dos números cualesquiera como argumentos.

Como prueba de aprobación, ejecute la función letterFinder y pásela con los argumentos correctos, como: letterFinder("cat", "c") .
*/

function letterFinder(word, match) {
    var condition1 = typeof(word) == 'string' && word.length >= 2; //if the word is a string and the length is greater than or equal to 2
    var condition2 = typeof(match) == 'string' && match.length == 1; //if the match is a string and the length is equal to 1
    if(condition1 && condition2) { //if both condition matches
        for(var i = 0; i < word.length; i++) {
            if(word[i] == match) {
                //check if the character at this i position in the word is equal to the match
                console.log('Found the', match, 'at', i)
            } else {
                console.log('---No match found at', i)
            }
        }
    } else {
        //if the requirements don't match
        console.log("Please pass correct arguments to the function")
    }
}
letterFinder([],[])
letterFinder("cat","a")