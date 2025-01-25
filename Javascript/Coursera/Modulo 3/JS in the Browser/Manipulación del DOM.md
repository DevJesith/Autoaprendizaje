1. ¿Qué es el DOM?

* El DOM es una representación estructurada de un documento HTML en forma de un objeto de JavaScript.
* Permite a los desarrolladores acceder y manipular el contenido, la estructura y el estilo de una página web.

2. Estructura del DOM

Imagina que el DOM es como un árbol. La raíz del árbol es el documento HTML, y cada elemento `(como <div>, <h1>, <p>, etc.)` es una rama o una hoja del árbol.

3. Cómo se crea el DOM

* Cuando abres una página web, el navegador descarga el HTML y construye el DOM automáticamente.

* Por ejemplo, si visitas example.com, el navegador crea el DOM basado en el HTML que recibe.

4. Interactuando con el DOM

* Puedes interactuar con el DOM usando las Herramientas de Desarrollo (DevTools) de tu navegador.

* Para abrir DevTools, haz clic derecho en la página y selecciona "Inspeccionar".

5. Ejemplo de manipulación del DOM

Vamos a crear un nuevo elemento `<h2>` en la página usando JavaScript:

* Paso 1: Crear un nuevo elemento

```javascript
const h2 = document.createElement('h2');
```

* Aquí estamos creando un nuevo elemento <h2> y guardándolo en la variable h2.


* Paso 2: Agregar texto al elemento
```javascript
h2.innerText = 'Este es un encabezado h2';
```

* Ahora le estamos asignando texto al nuevo encabezado.

* Paso 3: Agregar atributos
```javascript
h2.setAttribute('id', 'sub-heading');
h2.setAttribute('class', 'secondary');
```
* Aquí estamos añadiendo un id y una class al elemento.

* Paso 4: Agregar el elemento al DOM

```javascript
document.body.appendChild(h2);
```

Finalmente, estamos añadiendo el nuevo encabezado al cuerpo del documento, lo que lo hará visible en la página.

6. Resultado

Al ejecutar este código en la consola de DevTools, verás que se agrega un nuevo encabezado <h2> a la página con el texto "Este es un encabezado h2".