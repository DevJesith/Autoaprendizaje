```markdown
# Creación de un Sitio Web

## Concepto

1. **Sitio Web**: Un sitio web está compuesto por múltiples páginas web que están interconectadas.
2. **Anchor Tag**: La etiqueta `<a>` se utiliza para crear enlaces (hipervínculos) entre diferentes páginas.

## Ejemplo Paso a Paso

Imaginemos que estás creando un sitio web para un restaurante llamado "Little Lemon". Aquí te muestro cómo crear una segunda página y vincularla desde la página principal.

### Paso 1: Crear la Segunda Página

1. **Crea un nuevo archivo** llamado `location.html` en tu carpeta de proyecto.
2. **Agrega contenido** a `location.html`:

    ```html
    <!DOCTYPE html>
    <html lang="es">
    <head>
        <meta charset="UTF-8">
        <title>Nuestra Ubicación</title>
    </head>
    <body>
        <h1>Nuestra Ubicación</h1>
        <p>123 Rome Road, Main District, Capital City</p>
    </body>
    </html>
    ```

### Paso 2: Vincular la Nueva Página desde `index.html`

1. **Abre tu archivo principal** `index.html`.
2. **Agrega un enlace** a `location.html` usando la etiqueta `<a>`:

    ```html
    <!DOCTYPE html>
    <html lang="es">
    <head>
        <meta charset="UTF-8">
        <title>Little Lemon</title>
    </head>
    <body>
        <h1>Bienvenido a Little Lemon</h1>
        <p>¡Visítanos para disfrutar de una deliciosa comida!</p>
        <a href="location.html">Nuestra Ubicación</a>
    </body>
    </html>
    ```

### Paso 3: Probar el Enlace

1. **Guarda ambos archivos**.
2. **Abre `index.html` en tu navegador**.
3. **Haz clic en el enlace** "Nuestra Ubicación". Esto debería abrir `location.html`, mostrando la dirección del restaurante.

## Resumen

- **Crear múltiples páginas**: Puedes crear tantas páginas como necesites para tu sitio web.
- **Vincular páginas**: Usa la etiqueta `<a>` con el atributo `href` para vincular a otras páginas.
```