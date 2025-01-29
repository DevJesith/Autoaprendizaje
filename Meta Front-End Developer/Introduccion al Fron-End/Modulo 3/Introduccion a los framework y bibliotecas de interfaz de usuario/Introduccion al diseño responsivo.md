# Diseño Responsivo

El diseño responsivo permite que una página web se ajuste automáticamente a diferentes tamaños de pantalla. Esto es crucial porque los usuarios acceden a sitios web desde una variedad de dispositivos, como teléfonos móviles, tabletas y computadoras de escritorio.

## Componentes Clave:

1. Grillas Flexibles:

* En lugar de usar tamaños fijos en píxeles, se utilizan porcentajes. Esto permite que los elementos de la página se redimensionen según el tamaño de la pantalla.

* Ejemplo: Si tienes una columna que ocupa el 50% del ancho de la pantalla, se ajustará automáticamente a la mitad del ancho, sin importar si la pantalla es grande o pequeña.

2. Imágenes Fluidas:

* Las imágenes se configuran para que no excedan el tamaño de su contenedor. Esto se logra usando CSS.

* Ejemplo: Si estableces max-width: 100% en una imagen, la imagen se reducirá para ajustarse al ancho de su columna, pero no crecerá más allá de su tamaño original, evitando que se pixelice.

3. Consultas de Medios (Media Queries):

* Permiten aplicar estilos CSS específicos según las características del dispositivo, como el tamaño de la pantalla.

* Ejemplo: Puedes usar una consulta de medios para cambiar el color de fondo de tu sitio a azul en pantallas de 700 píxeles o menos:

```css
@media (max-width: 700px) {
    body {
        background-color: blue;
    }
}
```

Ejemplo Práctico

Imagina que estás creando una página web para un restaurante. Quieres que el menú se vea bien en todos los dispositivos.

* Grilla Flexible: Usas una grilla que divide el menú en dos columnas en pantallas grandes, pero en pantallas pequeñas, las columnas se apilan una encima de la otra.

* Imágenes Fluidas: Las fotos de los platos se ajustan automáticamente al tamaño de su contenedor, asegurando que no se vean distorsionadas.

* Consultas de Medios: En pantallas pequeñas, decides que el texto del menú sea más grande para facilitar la lectura.

Este enfoque asegura que todos los visitantes, sin importar el dispositivo que usen, tengan una experiencia agradable al navegar por tu sitio web.