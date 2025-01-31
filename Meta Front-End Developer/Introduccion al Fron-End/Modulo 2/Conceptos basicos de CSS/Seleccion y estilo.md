```markdown
# Resumen de CSS

## CSS (Cascading Style Sheets)
Es el lenguaje que se utiliza para describir la presentación de un documento HTML. Piensa en HTML como la estructura de un edificio y CSS como la pintura y la decoración.

## Elementos clave de CSS
- **Selector**: Indica qué elemento HTML se va a estilizar. Por ejemplo, `h1` es un selector que se refiere a todos los encabezados de nivel 1.
- **Declaración**: Se compone de una propiedad y un valor. Por ejemplo, `color: blue;` significa que el texto será azul.
- **Bloque de declaración**: Se encierra entre llaves `{}` y contiene una o más declaraciones.

## Ejemplo

Supongamos que tienes un archivo HTML con un encabezado:

```html
<h1>Bienvenido a mi página web</h1>
```
Y quieres que el texto de este encabezado sea de color verde. En tu archivo CSS, escribirías:

```css
h1 {
    color: green;
}
```

Esto significa que todos los elementos h1 en tu página se mostrarán en verde.

Uso de ID

Si solo quieres cambiar el color de un encabezado específico, puedes usar un ID. Por ejemplo:

```html
<h1 id="titulo-principal">Bienvenido a mi página web</h1>
```

Y en tu CSS:

```css
#titulo-principal {
    color: red;
}
```

Esto hará que solo el encabezado con el ID titulo-principal se muestre en rojo.

Recapitulación

* Selector: h1 o #titulo-principal
* Propiedad: color
* Valor: green o red