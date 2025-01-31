```markdown
# Modelo de Caja en CSS

El modelo de caja describe cómo se representan los elementos en una página web. Cada elemento se considera como una caja rectangular que tiene cuatro partes:

1. **Contenido**: Es el área donde se muestra el texto o las imágenes.
2. **Relleno (Padding)**: Espacio entre el contenido y el borde. Aumenta el tamaño de la caja.
3. **Borde (Border)**: Línea que rodea el relleno y el contenido.
4. **Margen (Margin)**: Espacio fuera del borde que separa el elemento de otros elementos.

## Ejemplo Práctico

Imagina que tienes un cuadro de texto en una página web. Aquí está cómo se vería en términos del modelo de caja:

- **Contenido**: El texto dentro del cuadro.
- **Relleno**: Espacio alrededor del texto, que hace que el texto no esté pegado al borde del cuadro.
- **Borde**: Una línea que rodea el cuadro, que puede ser de diferentes estilos (sólido, punteado, etc.).
- **Margen**: Espacio entre este cuadro y otros elementos en la página.

## Código de Ejemplo

Aquí tienes un ejemplo de cómo se puede aplicar el modelo de caja en CSS:

```css
.box {
    width: 300px; /* Ancho del contenido */
    padding: 20px; /* Relleno */
    border: 5px solid black; /* Borde */
    margin: 15px; /* Margen */
}
```

En este ejemplo:

* El contenido tiene un ancho de 300px.
* El relleno añade 20px alrededor del contenido.
* El borde tiene un grosor de 5px.
* El margen añade 15px de espacio alrededor del borde.