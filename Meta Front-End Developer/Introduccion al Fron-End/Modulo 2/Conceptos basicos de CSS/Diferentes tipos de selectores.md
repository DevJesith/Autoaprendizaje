```markdown
# Diferentes Tipos de Selectores en CSS

## 1. Selectores de Elemento
- **Descripción**: Selecciona todos los elementos de un tipo específico.
- **Ejemplo**:
  ```html
  <p>Hola mundo</p>
  <p>Bienvenido a CSS</p>
```

```css
p {
    color: blue; /* Aplica color azul a todos los elementos <p> */
}
```

2. Selectores de ID

Descripción: Selecciona un elemento único basado en su atributo id.

```html
<span id="destacado">Texto destacado</span>
```

```html
<span id="destacado">Texto destacado</span>
```
```css
#destacado {
    background-color: yellow; /* Aplica fondo amarillo al elemento con id "destacado" */
}
```


3. Selectores de Clase

Descripción: Selecciona todos los elementos que tienen una clase específica.

Ejemplo:

```html
<a class="navegacion">Inicio</a>
<p class="navegacion">Siguiente</p>
```

```css
.navegacion {
    margin: 10px; /* Aplica un margen a todos los elementos con la clase "navegacion" */
}
```

4. Selectores de Elemento con Clase

Descripción: Selecciona elementos de un tipo específico que también tienen una clase.

Ejemplo:

```html
<p class="introduccion">Introducción al tema</p>
```

```css
p.introduccion {
    font-weight: bold; /* Aplica negrita solo a los <p> con la clase "introduccion" */
}
```

5. Selectores Descendientes

Descripción: Selecciona elementos que están contenidos dentro de otro elemento.

Ejemplo:

```html
<div id="blog">
    <h1>Título del Blog</h1>
    <p>Contenido del blog</p>
</div>
```

```css
#blog h1 {
    color: green; /* Aplica color verde a los <h1> dentro del div con id "blog" */
}
```

6. Selectores de Hijo

Descripción: Selecciona elementos que son hijos directos de otro elemento.

Ejemplo:

```html
<div id="blog">
    <h1>Título del Blog</h1>
    <div>
        <h1>Título Secundario</h1>
    </div>
</div>
```

```css
#blog > h1 {
    color: red; /* Aplica color rojo solo al <h1> que es hijo directo del div con id "blog" */
}
```

7. Pseudo-clase :hover

Descripción: Selecciona un elemento cuando el mouse está sobre él.
Ejemplo:

```html
<a href="#">Enlace</a>
```
```css
a:hover {
    color: orange; /* Cambia el color del enlace a naranja cuando se pasa el mouse sobre él */
}
```






