```markdown
# Texto y Color en CSS

## Texto en CSS
CSS permite manipular cómo se muestra el texto en una página web. Aquí hay algunas propiedades clave:

- **color**: Cambia el color del texto.
- **font-family**: Define la fuente del texto.
- **font-size**: Establece el tamaño de la fuente.
- **text-transform**: Cambia la capitalización del texto (por ejemplo, a mayúsculas).
- **text-decoration**: Añade decoraciones como subrayado.

### Ejemplo de Texto
```css
p {
    color: blue; /* Cambia el color del texto a azul */
    font-family: "Arial", sans-serif; /* Establece la fuente */
    font-size: 16px; /* Establece el tamaño de la fuente */
    text-transform: uppercase; /* Convierte el texto a mayúsculas */
    text-decoration: underline; /* Subraya el texto */
}
```

Color en CSS

Los colores en CSS se pueden definir de varias maneras:

1. RGB: Usa valores de rojo, verde y azul.

```css
p {
    color: rgb(255, 0, 0); /* Rojo */
}
```

2. Hexadecimal: Usa un código hexadecimal.

```css
p {
    color: #FF0000; /* Rojo */
}
```

3. HSL: Usa matiz, saturación y luminosidad.

```css
p {
    color: hsl(0, 100%, 50%); /* Rojo */
}
```

4. Nombres de colores: Usa nombres predefinidos.

```css
p {
    color: red; /* Rojo */
}
```

Ejemplo:
```css
h1 {
    color: rgba(0, 128, 0, 0.5); /* Verde con 50% de opacidad */
}
```
