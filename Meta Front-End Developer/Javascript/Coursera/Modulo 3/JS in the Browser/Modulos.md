1. ¿Qué son los módulos?

Definición : Los módulos son unidades de código independientes que pueden ser reutilizadas en diferentes partes de una aplicación. Esto ayuda a organizar el código de manera más efectiva.

2. Problemas con el alcance global

Funciones globales : Antes de los módulos, todas las funciones se definían en el ámbito global (es decir, accesibles desde cualquier parte del código). Esto podía causar conflictos si diferentes scripts usaban el mismo nombre de función.

3. CommonJS

* Introducción : CommonJS fue un intento temprano de crear un sistema de módulos, principalmente para JavaScript del lado del servidor (como Node.js).
* Limitación : No es compatible con los navegadores, lo que significa que no se puede usar en aplicaciones web directamente.

4. Módulos ES6

* Introducción : Con la llegada de ES6 (ECMAScript 2015), se introdujo un sistema de módulos nativos en JavaScript.
* Ventajas : Permite una mejor organización del código y evita conflictos de nombres, ya que cada módulo tiene su propio ámbito.

5. Uso de módulos ES6 en el navegador

- Implementación : Para usar módulos en un navegador, debes:
* Establecer el tipo de script moduleen la etiqueta <script>de tu HTML.
* Importar el módulo necesario usando la sintaxis import.

6. Ejemplo practico

```html
<!-- index.html -->
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Ejemplo de Módulos</title>
    <script type="module">
        import { saludo } from './greeting.js';
        saludo();
    </script>
</head>
<body>
</body>
</html>
```

```javascript
// greeting.js
export function saludo() {
    console.log('Hola desde el módulo!');
}
```

7. Conclusión

Los módulos en JavaScript permiten una mejor organización y reutilización del código, facilitando el desarrollo de aplicaciones más complejas.