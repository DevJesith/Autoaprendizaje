```markdown
# Resumen: Tecnologías Web (HTML, CSS y JavaScript)

Las **tecnologías web** son fundamentales para crear páginas y aplicaciones en línea. Las tres tecnologías principales son:

- **HTML (HyperText Markup Language)**: Se utiliza para estructurar el contenido de la página web.
- **CSS (Cascading Style Sheets)**: Se utiliza para aplicar estilos y diseño a la estructura HTML.
- **JavaScript**: Se utiliza para agregar interactividad y dinamismo a la página.

## Ejemplo

1. **Reloj Digital**:
   - **HTML**: Define la estructura del reloj.
   - **CSS**: Establece el estilo (color, tamaño, posición).
   - **JavaScript**: Actualiza el tiempo cada segundo.

```html
<!-- clock.html -->
<!DOCTYPE html>
<html lang="en">
<head>
    <link rel="stylesheet" href="styles.css">
    <title>Reloj Digital</title>
</head>
<body>
    <div id="clock">00:00:00</div>
    <script src="clock.js"></script>
</body>
</html>
```
```css
/* styles.css */
#clock {
    font-size: 48px;
    color: blue;
}
```

```javascript
// clock.js
setInterval(() => {
    const now = new Date();
    document.getElementById('clock').innerText = now.toLocaleTimeString();
}, 1000);
```