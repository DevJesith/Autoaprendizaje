* Objetos: Colecciones no iterables de pares clave-valor. Se utilizan para almacenar y acceder a valores mediante una clave. Son útiles en programación orientada a objetos.

```javascript
const estudiante = {
    nombre: "Juan",
    edad: 20,
    calificaciones: [85, 90, 78]
};

// Acceder a un valor
console.log(estudiante.nombre); // "Juan"
```

* Arreglos (Arrays): Colecciones ordenadas e iterables de valores. Permiten almacenar y acceder a valores mediante un índice, que JavaScript maneja automáticamente. Se suelen usar bucles para acceder y modificar datos.

```javascript
const calificaciones = [85, 90, 78];

// Calcular el promedio
let suma = 0;
for (let i = 0; i < calificaciones.length; i++) {
    suma += calificaciones[i];
}
const promedio = suma / calificaciones.length;
console.log(promedio); // 84.33
```

* Mapas (Maps): Similares a los arreglos, pero consisten en pares clave-valor. A diferencia de los objetos, cualquier valor puede ser utilizado como clave.

```javascript
const mapa = new Map();
mapa.set("nombre", "Juan");
mapa.set("edad", 20);

// Acceder a un valor
console.log(mapa.get("nombre")); // "Juan"
```


* Conjuntos (Sets): Colecciones donde cada elemento debe ser único. Si intentas agregar un elemento duplicado, no se producirá un error, simplemente no se añadirá.

```javascript
const conjunto = new Set();
conjunto.add(1);
conjunto.add(2);
conjunto.add(2); // No se añadirá, ya que es un duplicado

console.log(conjunto); // Set { 1, 2 }
```

La elección de la estructura de datos adecuada depende de la tarea que estés realizando.