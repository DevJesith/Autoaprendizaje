# Ejercicio: Actualización del contenido de la página web

En esta lectura, aprenderá a capturar la información ingresada por el usuario y procesarla. Se le presentará un ejemplo simple que demuestra cómo manipular la información que se muestra en función de la información ingresada por el usuario.

Para capturar la entrada del usuario, puede utilizar el método `prompt()` incorporado , de la siguiente manera:

```js
let answer = prompt('What is your name?');
```
Una vez que tenga la entrada proporcionada por el usuario dentro de la  variable de answer  , puede manipularla de cualquier forma que necesite.

Por ejemplo, puede mostrar la información ingresada en la pantalla como un  elemento HTML <h1>  .

Aquí te explicamos cómo hacerlo:

```js
let answer = prompt('What is your name?');
if (typeof(answer) === 'string') {
    var h1 = document.createElement('h1')
    h1.innerText = answer;
    document.body.innerText = '';
    document.body.appendChild(h1);
}
```
Esta es probablemente la forma más rápida y sencilla de capturar la entrada del usuario en un sitio web, pero hacerlo de esta manera no es el enfoque más eficiente, especialmente en escenarios más complejos.

Aquí es donde entran en juego los formularios HTML.

Puede codificar un script que tomará una entrada de un formulario HTML y mostrará el texto que un usuario escribe en la pantalla.

Aquí te explicamos cómo se hace.

Comenzarás codificando una "solución de prueba" para la tarea en cuestión:

```js
var h1 = document.createElement('h1')
h1.innerText = "Type into the input to make this text change"

var input = document.createElement('input')
input.setAttribute('type', 'text')

document.body.innerText = '';
document.body.appendChild(h1);
document.body.appendChild(input);
```

Básicamente, estás haciendo lo mismo que antes, solo que esta vez también estás agregando dinámicamente el  elemento de entrada  y estás configurando su   atributo  de tipo HTML en text . De esa manera, cuando comiences a escribir en él, las letras se mostrarán en el  elemento h1  de arriba.

Sin embargo, todavía no ha llegado a ese punto. En este punto, el código anterior, cuando se ejecuta en un sitio web activo, agregará el  elemento h1  con el texto "Escriba en la entrada para que este texto cambie" y un campo de formulario de entrada vacío debajo.

Puede probar este código usted mismo, por ejemplo, apuntando su navegador al  sitio web example.com  y ejecutando el código anterior en la consola.

Recuerda que puedes acceder a la consola desde las herramientas para desarrolladores en tu navegador.

Otra cosa dogmática que hiciste en el código anterior es: configurar mis variables usando la  palabra clave var  .

Si bien es mejor usar  let  o  const , solo estás ejecutando un experimento rápido en un sitio web en vivo y deseas usar la palabra clave variable más indulgente, la que no se quejará de que ya hayas configurado  h1  o las  variables de entrada  .

Si tuvieras un proyecto completo con una configuración de herramientas JavaScript moderna, usarías  let  o  const , pero esta es solo una demostración rápida, por lo que usar  var  en este caso está bien.

Lo siguiente que debes hacer es configurar un detector de eventos. El evento que estás detectando es el  evento de cambio  . En este caso, el evento de cambio se activará después de que hayas escrito en la entrada y presionado la tecla ENTER.

Aquí está su código actualizado:

```js
var h1 = document.createElement('h1')
h1.innerText = "Type into the input to make this text change"

var input = document.createElement('input')
input.setAttribute('type', 'text')

document.body.innerText = '';
document.body.appendChild(h1);
document.body.appendChild(input);

input.addEventListener('change', function() {
    console.log(input.value)
})
```
Esta vez, cuando ejecuta el código anterior en el  sitio web example.com mencionado anteriormente  , luego escribe algún texto en el campo de entrada y presiona la tecla Enter, obtendrá el valor del texto ingresado registrado en la consola.

Ahora, lo único que aún necesitas hacer para completar mi código es actualizar el contenido de texto del  elemento h1  con el valor que obtuviste del  campo de entrada  .

Aquí está el código completo y actualizado:

```js
var h1 = document.createElement('h1')
h1.innerText = "Type into the input to make this text change"

var input = document.createElement('input')
input.setAttribute('type', 'text')

document.body.innerText = '';
/*¿Cómo funciona?

document.body: Se refiere al elemento <body> del documento HTML.
.innerText: Es una propiedad que representa el contenido de texto dentro de un elemento.
= '';: Asigna una cadena vacía, lo que significa que se elimina todo el texto que estaba presente en el cuerpo.*/
document.body.appendChild(h1);
document.body.appendChild(input);

input.addEventListener('change', function() {
    h1.innerText = input.value
})
```

Después de esta actualización, todo lo que escriba en la entrada, después de presionar la tecla ENTER, se mostrará como texto dentro del  elemento h1  .

Aunque esto completa este elemento de la lección, es importante tener en cuenta que la combinación de la manipulación del DOM y el manejo de eventos permite crear algunos sitios web interactivos realmente notables.