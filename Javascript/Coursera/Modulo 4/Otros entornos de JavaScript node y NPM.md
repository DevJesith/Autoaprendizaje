# Node.js

* Definición: Node.js es un entorno de ejecución para JavaScript que permite ejecutar código JavaScript en el servidor, no solo en el navegador. Esto significa que puedes usar JavaScript para crear aplicaciones del lado del servidor, lo que antes requería otros lenguajes como PHP o Python.

* Ventajas: Permite a los desarrolladores usar un solo lenguaje (JavaScript) tanto en el cliente como en el servidor, facilitando el desarrollo de aplicaciones completas.

# npm (Node Package Manager)

* Definición: npm es un gestor de paquetes para Node.js que permite a los desarrolladores instalar y gestionar bibliotecas y módulos de código que pueden ser reutilizados en sus proyectos.

* Funcionalidad: Con npm, puedes instalar módulos que otros desarrolladores han creado y compartido, lo que ahorra tiempo y esfuerzo.

## Ejemplo

Imagina que quieres transformar cadenas de texto a minúsculas en tu aplicación. Puedes usar un módulo llamado lowercase disponible en npm.

- Instalación:
Abre tu terminal y navega a la carpeta de tu proyecto. Luego, ejecuta el siguiente comando para instalar el módulo:

```bash
npm install lowercase
```

- Uso en tu código:
Después de instalarlo, puedes usarlo en tu archivo JavaScript de la siguiente manera:

```javascript
const lowercase = require('lowercase');

const texto = "Hola Mundo";
const textoEnMinusculas = lowercase(texto);

console.log(textoEnMinusculas); // Salida: "hola mundo"
```

Este ejemplo muestra cómo puedes utilizar npm para instalar un módulo y luego usarlo en tu código para realizar una tarea específica. 

- La función require se utiliza en Node.js para importar módulos en tu código. Aquí te explico su propósito y cómo funciona:

## Propósito de require

* Importar Módulos: Permite que tu archivo JavaScript acceda a funcionalidades de otros módulos, ya sean módulos nativos de Node.js, módulos de terceros (como los que instalas con npm) o módulos que tú mismo hayas creado.

* Reutilización de Código: Facilita la reutilización de código, ya que puedes dividir tu aplicación en diferentes archivos y módulos, manteniendo tu código organizado y manejable.

- Ejemplo de Uso

Supongamos que tienes un módulo llamado math.js que contiene funciones matemáticas:

```javascript
// math.js
function sumar(a, b) {
    return a + b;
}

module.exports = { sumar };
```
Ahora, en otro archivo, puedes usar require para importar y utilizar la función sumar:

```javascript
// app.js
const math = require('./math'); // Importa el módulo math.js

const resultado = math.sumar(5, 3);
console.log(resultado); // Salida: 8
```
Resumen

* require es esencial para importar módulos en Node.js.
* Permite la reutilización de código y la organización de tu aplicación en diferentes archivos.
