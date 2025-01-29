* Bucle for-in :

    * Itera sobre todas las propiedades enumerables de un objeto, incluidas aquellas heredadas del prototipo.
    * Ejemplo: cuando se utiliza en un objeto de automóvil deportivo, registra tanto sus propias propiedades como las de su prototipo (por ejemplo, motor y dirección).

* Bucle for-of :
    * Itera únicamente sobre las propiedades propias del objeto, excluyendo las propiedades heredadas.
    * Ejemplo: cuando se utiliza en el mismo objeto de automóvil deportivo, solo registra las propiedades definidas directamente en ese objeto (por ejemplo, velocidad).



1. Objetos en JavaScript

    * Un objeto es una colección de propiedades. Cada propiedad tiene un nombre (clave) y un valor.

    * Ejemplo de objeto:
    ```javascript
    const car = {
        engine: true,
        steering: true,
        speed: "slow"
    };
    ```

2. Creación de un Objeto Derivado

* Usamos Object.create() para crear un nuevo objeto que hereda de otro.

* Ejemplo:
```javascript
const sportsCar = Object.create(car);
sportsCar.speed = "fast"; // Cambiamos la propiedad speed
```

3. Uso de Bucles

* Vamos a usar dos tipos de bucles para ver cómo iterar sobre las propiedades de sportsCar: for-in y for-of.

4. for-in Loop

* Cómo funciona: Itera sobre todas las propiedades enumerables de un objeto, incluyendo las heredadas.

* Ejemplo: 
```javascript
for (let prop in sportsCar) {
    console.log(prop + ": " + sportsCar[prop]);
}
```
* Resultado: 
```javascript
for (let prop in sportsCar) {
    console.log(prop + ": " + sportsCar[prop]);
}
```

* Explicación: Muestra engine y steering porque son propiedades heredadas de car, además de speed, que es propia de sportsCar.

5. for-of Loop

* Cómo funciona: Este bucle itera solo sobre los valores de un objeto iterable, como un array. Para objetos, se usa Object.keys() para obtener las claves.

* Ejemplo: 
```javascript
const keys = Object.keys(sportsCar);
for (let key of keys) {
    console.log(key + ": " + sportsCar[key]);
}
```

* Resultado:

```null
speed: fast
```
* Explicación: Solo muestra speed porque for-of (usando Object.keys()) solo itera sobre las propiedades propias de sportsCar.

6. Resumen de Diferencias

* for-in:
    * Itera sobre todas las propiedades, incluyendo las heredadas.
    * Puede dar resultados inesperados si no se desea incluir propiedades del prototipo.

* for-of (con Object.keys()):
    * Solo itera sobre las propiedades propias del objeto.
    * Es más confiable para obtener solo lo que se ha definido en el objeto.