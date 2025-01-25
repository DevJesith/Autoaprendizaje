1. Uso de querySelector

Este método se utiliza para seleccionar el primer elemento que coincide con un selector CSS.

```javascript
// Selecciona el primer párrafo en el documento
let primerParrafo = document.querySelector('p');
console.log(primerParrafo.textContent); // Muestra el texto del primer párrafo
```

2. Uso de querySelectorAll

Este método selecciona todos los elementos que coinciden con un selector CSS.

```javascript
// Selecciona todos los párrafos en el documento
let todosLosParrafos = document.querySelectorAll('p');
todosLosParrafos.forEach(parrafo => {
    console.log(parrafo.textContent); // Muestra el texto de cada párrafo
});
```

3. Uso de getElementById

Este método selecciona un elemento basado en su atributo ID.

```javascript
// Selecciona un elemento con el ID 'encabezado'
let encabezado = document.getElementById('encabezado');
console.log(encabezado.textContent); // Muestra el texto del encabezado
```

4. Uso de getElementsByClassName

Este método selecciona todos los elementos que tienen una clase específica.

```javascript
// Selecciona todos los elementos con la clase 'texto'
let elementosTexto = document.getElementsByClassName('texto');
for (let i = 0; i < elementosTexto.length; i++) {
    console.log(elementosTexto[i].textContent); // Muestra el texto de cada elemento con la clase 'texto'
}
```

Estos ejemplos ilustran cómo puedes interactuar con el DOM utilizando JavaScript para seleccionar y manipular elementos en una página web.
