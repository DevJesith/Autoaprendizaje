                        //Ejercicio 1

/*En este ejercicio, creará el código para un bucle for , utilizando la variable de contador denominada i a partir de 1 .

Para hacer que el contador incremente en 1 en cada bucle, utilizará i++ .

La condición de salida del bucle for debe coincidir con la salida que se muestra a continuación.

Dentro del bucle, escriba una declaración if-else, que verificará las siguientes condiciones:

En primer lugar, comprobará si el valor de i es 1. Si es así, el código registrará en la consola la cadena "Medalla de oro".

A continuación, comprobaré si el valor de i es 2. Si es así, el código registrará en la consola la cadena "Medalla de plata".

Luego, el código verificará si el valor de i es 3. Si es así, registrará en la consola la cadena "Medalla de bronce".

Para todos los valores restantes de i , su código registrará en la consola solo el valor de i .

Nota: El registro de consola esperado de todo el código debería ser el siguiente.
Medalla de oro Medalla de plata Medalla de bronce 4 5 6 7 8 9 10*/

//Solution

for (let i = 1; i < 11; i++) {
    
    if (i == 1) {
        console.log("Medalla de oro")
    } else if (i == 2) {
        console.log("Medalla de plata")
    } else if (i == 3){
        console.log("Medalla de bronce")
    }  else if (i == 4){
        console.log("Puesto: " + i)
    }  else if (i == 5){
        console.log("Puesto: " + i)
    }  else if (i == 6){
        console.log("Puesto: " + i)
    }  else if (i == 7){
        console.log("Puesto: " + i)
    }  else if (i == 8){
        console.log("Puesto: " + i)
    }  else if (i == 9){
        console.log("Puesto: " + i)
    }  else if (i == 10){
        console.log("Puesto: " + i)
    } else{
        console.log("Ninguno")
    }
    
}



//Ejercicio 2. 

/*Utilice el código completo de la tarea anterior, pero convierta los condicionales en una declaración switch.
Al codificar la solución, la salida en la consola debe seguir siendo exactamente la misma que en la pregunta anterior.

Nota : Necesitará tres casos separados para las tres medallas y un caso predeterminado para todos los demás valores de la variable i .*/

for (let i = 1; i < 11; i++) {
    
    switch (i) {
        case 1:
            console.log("Medalla de oro")
            break;

        case 2:
            console.log("Medalla de plata")
            break;

        case 3:
            console.log("Medalla de bronce")
            break;
    
        default:
            console.log("Puesto: " + i)
            break;
    }
    
}