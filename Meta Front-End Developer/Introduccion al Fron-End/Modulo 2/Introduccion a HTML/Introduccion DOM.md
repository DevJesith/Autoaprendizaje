```markdown
# Document Object Model (DOM) y JavaScript

## ¿Qué es el DOM?
El DOM es una representación estructural de un documento HTML. Piensa en él como un árbol donde cada nodo representa un elemento HTML. Esto permite que los desarrolladores accedan y modifiquen el contenido y la estructura de una página web de manera dinámica.

## Ejemplo de uso del DOM con JavaScript

### 1. Actualizar contenido
Supongamos que tienes un elemento `<h1>` en tu HTML que muestra un saludo. Puedes usar JavaScript para cambiar ese saludo.

**HTML:**
```html
<h1 id="greeting">¡Hola, mundo!</h1>
```

```javascript
document.getElementById("greeting").innerText = "¡Bienvenido a mi sitio web!";
```

En este ejemplo, el texto del encabezado se actualiza a "¡Bienvenido a mi sitio web!" cuando se ejecuta el código JavaScript.

2. Agregar un nuevo elemento

Imagina que quieres añadir un nuevo párrafo a tu página cuando un usuario hace clic en un botón.

```html
<button id="addParagraph">Agregar Párrafo</button>
<div id="content"></div>
```
```javascript
document.getElementById("addParagraph").onclick = function() {
    var newParagraph = document.createElement("p");
    newParagraph.innerText = "Este es un nuevo párrafo.";
    document.getElementById("content").appendChild(newParagraph);
};
```