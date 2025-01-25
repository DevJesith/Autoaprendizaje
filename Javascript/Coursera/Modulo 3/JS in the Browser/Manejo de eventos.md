1. ¿Qué son los eventos?

Los eventos son acciones que ocurren en la página web, como hacer clic en un botón o presionar una tecla. JavaScript puede "escuchar" estos eventos y ejecutar código en respuesta.

2. Ejemplo de evento:

Imagina que tienes un botón "Agregar al carrito". Cuando un usuario hace clic en este botón, se genera un evento que puedes manejar con JavaScript.

## Manejadores de Eventos

* ¿Qué es un manejador de eventos?
Es una función que se ejecuta cuando ocurre un evento específico. Por ejemplo, si un usuario hace clic en el botón "Agregar al carrito", el manejador de eventos puede actualizar el número de artículos en el carrito.

## Usando addEventListener

* Método addEventListener:
Este método se utiliza para escuchar eventos en un elemento HTML. Aquí tienes un ejemplo:

```javascript
// Obtener el elemento del cuerpo de la página
const target = document.querySelector('body');

// Crear una función que se ejecutará al hacer clic
function handleClick() {
    console.log('Se hizo clic en el cuerpo');
}

// Agregar el manejador de eventos al cuerpo
target.addEventListener('click', handleClick);
```

* ¿Qué hace este código?
    * Primero, selecciona el elemento <body> de la página.
    * Luego, define una función handleClick que imprime un mensaje en la consola.
    *Finalmente, usa addEventListener para escuchar el evento de clic en el cuerpo. Cuando se hace clic en cualquier parte del cuerpo, se ejecuta la función y se muestra el mensaje.

## Usando Atributos de Evento en HTML

* Atributos de evento:
También puedes manejar eventos directamente en el HTML. Por ejemplo, si tienes un encabezado <h1>, puedes agregar un atributo onclick:

```html
<h1 onclick="handleClick2()">Haz clic aquí</h1>
```
* Función asociada:
```javascript
function handleClick2() {
    console.log('Se hizo clic en el encabezado');
}
```

* ¿Qué hace este código?
Cuando el usuario hace clic en el encabezado, se ejecuta la función handleClick2, que imprime un mensaje diferente en la consola.

* Resumen

    * Eventos: Acciones que ocurren en la página web.
    * Manejadores de eventos: Funciones que responden a eventos.
    * addEventListener: Método para escuchar eventos en elementos HTML.
    * Atributos de evento: Otra forma de manejar eventos directamente en el HTML.

## Uso de `click`

1. Cambiar 'click' por otro evento

Si cambias 'click' por otro tipo de evento, el manejador de eventos solo se activará cuando ocurra ese evento específico. Aquí hay algunos ejemplos:

* 'mouseover': Se activa cuando el mouse pasa sobre el elemento.
* 'keydown': Se activa cuando se presiona una tecla.
* 'focus': Se activa cuando un elemento (como un campo de entrada) recibe el foco.

Por ejemplo:

```javascript
target.addEventListener('mouseover', handleMouseOver);
```

En este caso, handleMouseOver se ejecutará cuando el mouse pase sobre el elemento target.

2. No poner nada

Si no pones nada en el primer argumento de addEventListener, el código no funcionará correctamente. El primer argumento es obligatorio y debe ser una cadena que representa el tipo de evento que deseas escuchar. Si lo omites, obtendrás un error en la consola, ya que JavaScript no sabrá qué evento estás tratando de manejar.

* Resumen

    * Cambiar 'click': El manejador se activará solo para el evento especificado.
    * No poner nada: Generará un error, ya que el tipo de evento es necesario.

* Ejemplo de keydown

El evento keydown se activa cuando se presiona una tecla en el teclado. Aquí tienes un ejemplo:

```html
<input type="text" id="inputField" placeholder="Escribe algo aquí...">
<script>
    const inputField = document.getElementById('inputField');

    function handleKeyDown(event) {
        console.log('Se presionó la tecla:', event.key);
    }

    inputField.addEventListener('keydown', handleKeyDown);
</script>
```
* ¿Qué hace este código?

    * Selecciona un campo de entrada (<input>).
    * Define una función handleKeyDown que imprime la tecla que se presionó en la consola.
    * Usa addEventListener para escuchar el evento keydown en el campo de entrada. Cada vez que se presiona una tecla, se ejecuta la función y se muestra la tecla en la consola.

Ejemplo de focus

El evento focus se activa cuando un elemento, como un campo de entrada, recibe el foco. Aquí tienes un ejemplo:

```html
<input type="text" id="inputField" placeholder="Haz clic aquí para enfocar">
<script>
    const inputField = document.getElementById('inputField');

    function handleFocus() {
        console.log('El campo de entrada ha recibido el foco');
    }

    inputField.addEventListener('focus', handleFocus);
</script>
```

* ¿Qué hace este código?

    * Selecciona un campo de entrada (<input>).
    * Define una función handleFocus que imprime un mensaje en la consola cuando el campo recibe el foco.
    * Usa addEventListener para escuchar el evento focus en el campo de entrada. Cuando el usuario hace clic en el campo o navega a él, se ejecuta la función y se muestra el mensaje en la consola.

* Resumen

    * keydown: Se activa al presionar una tecla y puede mostrar qué tecla se presionó.
    * focus: Se activa cuando un elemento recibe el foco, permitiendo realizar acciones específicas.