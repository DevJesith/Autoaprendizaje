1. Dependencias

Las dependencias son bibliotecas o marcos de trabajo que tu aplicación necesita para funcionar. Por ejemplo, si estás utilizando Bootstrap para diseñar tu página web, Bootstrap se convierte en una dependencia.

## Ejemplo de Inclusión de Bootstrap

Para incluir Bootstrap en tu archivo HTML, puedes hacerlo de la siguiente manera:

```html
<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Mi Página Web</title>
    <!-- Incluir CSS de Bootstrap -->
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
</head>
<body>
    <h1>Hola, Mundo!</h1>
    <!-- Botón de Bootstrap -->
    <button type="button" class="btn btn-primary">Haz clic aquí</button>
    <!-- Incluir JavaScript de Bootstrap -->
    <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.9.2/dist/umd/popper.min.js"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
</body>
</html>
```

2. Gestores de Paquetes

Un gestor de paquetes es una herramienta que facilita la instalación y gestión de dependencias. npm (Node Package Manager) es uno de los más comunes.

## Ejemplo de Uso de npm

Si deseas instalar Bootstrap usando npm, primero debes tener Node.js y npm instalados. Luego, en tu terminal, puedes ejecutar:

```bash
npm install bootstrap
```

Esto descargará Bootstrap y lo añadirá a tu proyecto.

3. Herramientas de Agrupamiento

Las herramientas de agrupamiento combinan múltiples archivos en uno solo para optimizar la carga de la página. Webpack es una herramienta popular para esto.

## Ejemplo de Uso de Webpack

Después de instalar Webpack, puedes configurarlo para agrupar tus archivos JavaScript. Un archivo de configuración básico (webpack.config.js) podría verse así:

```javascript
const path = require('path');

module.exports = {
    entry: './src/index.js', // Archivo de entrada
    output: {
        filename: 'bundle.js', // Archivo de salida
        path: path.resolve(__dirname, 'dist'), // Carpeta de salida
    },
};
```

Luego, ejecutas Webpack en la terminal:

```bash
npx webpack
```

Esto generará un archivo bundle.js que puedes incluir en tu HTML.

## Resumen

* Dependencias: Bibliotecas que tu aplicación necesita.

* Gestores de Paquetes: Herramientas como npm que instalan y gestionan dependencias.

* Herramientas de Agrupamiento: Herramientas como Webpack que combinan archivos para optimizar la carga.