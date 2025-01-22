// El operador de propagación de JavaScript, introducido en ES6, es una forma concisa de copiar propiedades de un objeto a otro y expandir elementos de una matriz. Se representa con tres puntos ( ...).

// Uso : Simplifica las llamadas de función al permitirle pasar una matriz completa como argumentos sin enumerar cada elemento.

// Ejemplo : en lugar de llamar a una función con múltiples argumentos desde una matriz, puede utilizar el operador de propagación para pasar la matriz directamente.

// Este operador mejora la legibilidad y la eficiencia del código, lo que facilita el trabajo con matrices y objetos.

// Supongamos que tienes una variedad de lugares que quieres visitar:


let top3 = ['Colosseum', 'Trevi Fountain', 'Vatican City'];

// Y una función que muestra el itinerario:

function showItinerary(lugar1, lugar2, lugar3) {
    console.log('Visita ' + lugar1);
    console.log('Luego visita ' + lugar2);
    console.log('Termina con una visita a ' + lugar3);
}

// Sin el operador de propagación:

// Llamarías a la función así:

showItinerary(top3[0], top3[1], top3[2]);

// Con el operador de propagación:

// Puedes simplificarlo usando el operador de distribución:

showItinerary(...top3);