* La desestructuración le permite extraer propiedades de objetos y matrices en nuevas variables.
* Es similar a copiar texto formateado de una parte de un documento a otra.
* Al desestructurar, el objeto o matriz original permanece sin cambios y la nueva variable es independiente.

## Ejemplo 1: Destructuring de un objeto

Supongamos que tienes un objeto Math y quieres extraer el valor de pi:

```js
// Objeto Math
const Math = {
    pi: 3.14159,
    e: 2.71828
};

// Destructuring
const { pi } = Math;

console.log(pi); // Salida: 3.14159

```

* Aquí, pi se extrae del objeto Math y se guarda en una nueva variable llamada pi.
* Si cambias el valor de pi después, no afectará al objeto original:

```javascript
pi = 3; // Cambiando el valor de la variable
console.log(pi); // Salida: 3
console.log(Math.pi); // Salida: 3.14159 (el objeto original permanece igual)
```

## Ejemplo 2: Destructuring de un array

```javascript
// Array de colores
const colores = ['rojo', 'verde', 'azul'];

// Destructuring
const [primerColor, segundoColor] = colores;

console.log(primerColor); // Salida: rojo
console.log(segundoColor); // Salida: verde
```

* En este caso, primerColor y segundoColor se extraen del array colores.
* Al igual que con el objeto, si cambias el valor de primerColor, no afectará al array original:

```javascript
primerColor = 'amarillo'; // Cambiando el valor de la variable
console.log(primerColor); // Salida: amarillo
console.log(colores[0]); // Salida: rojo (el array original permanece igual)
```