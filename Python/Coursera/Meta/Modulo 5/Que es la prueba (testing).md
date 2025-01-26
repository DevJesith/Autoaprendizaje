# Pruebas de código

El testing es el proceso de evaluar un programa o sistema para identificar errores y asegurarse de que funcione como se espera. En el contexto de desarrollo de software, esto implica escribir pruebas que verifiquen que el código cumple con los requisitos y expectativas.

* Tipos de Testing

    * Pruebas Unitarias: Verifican el funcionamiento de una pequeña parte del código, como una función.

    * Pruebas de Integración: Aseguran que diferentes partes del sistema funcionen juntas correctamente.

    * Pruebas Funcionales: Evalúan si el software cumple con los requisitos funcionales.

Ejemplo Sencillo: Prueba Unitaria

Imaginemos que tienes una función simple que suma dos números:

```javascript
function sumar(a, b) {
    return a + b;
}
```
Ahora, vamos a escribir una prueba unitaria para esta función:

```javascript
function testSumar() {
    var resultado = sumar(2, 3);
    if (resultado === 5) {
        console.log('Prueba pasada: 2 + 3 es igual a 5.');
    } else {
        console.log('Prueba fallida: se esperaba 5, pero se obtuvo ' + resultado + '.');
    }
}

// Llamar a la función de prueba
testSumar();
```

Explicación del Ejemplo:

* Función sumar: Toma dos argumentos y devuelve su suma.

* Función testSumar: Verifica si la suma de 2 y 3 es igual a 5.

* Condicional: Imprime un mensaje indicando si la prueba pasó o falló.

Este es un ejemplo básico de cómo se puede realizar el testing en JavaScript.

# Ciclo Rojo-Verde-Refactorizar

1. Rojo: 

Escribir una prueba que falle. Esto significa que definimos una prueba para una función que aún no hemos implementado. La prueba debe fallar inicialmente, lo que indica que la funcionalidad no está presente.

2. Verde: 

Implementar la funcionalidad. Ahora, escribimos el código necesario para que la prueba pase. Esto significa que la función debe hacer lo que se espera.

3. Refactorizar:

Mejorar el código. Después de que la prueba pase, revisamos el código para hacerlo más limpio y eficiente, sin cambiar su comportamiento. Aseguramos que todas las pruebas sigan pasando.
Ejemplo: Función para Sumar Números

- Paso 1: Rojo

Primero, escribimos una prueba para una función sumar que aún no existe:

```javascript
function testSumar() {
    // Esta prueba fallará porque la función sumar no está definida
    if (sumar(2, 3) !== 5) {
        console.log('Prueba fallida: se esperaba 5.');
    } else {
        console.log('Prueba pasada.');
    }
}

// Llamar a la función de prueba
testSumar();
```
```javascript
function testSumar() {
    // Esta prueba fallará porque la función sumar no está definida
    expect(sumar(2, 3)).toBe(5); // Esto fallará
}

// Llamar a la función de prueba
testSumar();
```

Al ejecutar este código, obtendremos un error porque sumar no está definida.

- Paso 2: Verde

Ahora, implementamos la función sumar para que la prueba pase:

```javascript
function sumar(a, b) {
    return a + b;
}

function testSumar() {
    // Ahora la prueba debería pasar
    if (sumar(2, 3) !== 5) {
        console.log('Prueba fallida: se esperaba 5.');
    } else {
        console.log('Prueba pasada.');
    }
}

// Llamar a la función de prueba
testSumar();
```
```javascript
function sumar(a, b) {
    return a + b;
}

function testSumar() {
    // Ahora la prueba debería pasar
    expect(sumar(2, 3)).toBe(5); // Esto ahora pasará
}

// Llamar a la función de prueba
testSumar();
```


Al ejecutar la prueba nuevamente, ahora debería imprimir "Prueba pasada." porque la función sumar está correctamente implementada.

- Paso 3: Refactorizar

Finalmente, podemos agregar más pruebas para asegurarnos de que la función maneje diferentes casos:

```javascript
function sumar(a, b) {
    return a + b;
}

function testSumar() {
    // Prueba 1
    if (sumar(2, 3) !== 5) {
        console.log('Prueba fallida: se esperaba 5.');
    }
    // Prueba 2
    if (sumar(-1, 1) !== 0) {
        console.log('Prueba fallida: se esperaba 0.');
    }
    // Prueba 3
    if (sumar(0, 0) !== 0) {
        console.log('Prueba fallida: se esperaba 0.');
    }
    console.log('Todas las pruebas pasaron.');
}

// Llamar a la función de prueba
testSumar();
```
```javascript
function sumar(a, b) {
    return a + b;
}

function testSumar() {
    // Prueba 1
    expect(sumar(2, 3)).toBe(5); // Debería pasar
    // Prueba 2
    expect(sumar(-1, 1)).toBe(0); // Debería pasar
    // Prueba 3
    expect(sumar(0, 0)).toBe(0); // Debería pasar
    console.log('Todas las pruebas pasaron.');
}

// Llamar a la función de prueba
testSumar();
```

Resumen del Ciclo:

* Rojo: Escribimos una prueba que falla porque la función no está definida.

* Verde: Implementamos la función para que la prueba pase.

* Refactorizar: Agregamos más pruebas y mejoramos el código, asegurando que todas las pruebas sigan pasando.