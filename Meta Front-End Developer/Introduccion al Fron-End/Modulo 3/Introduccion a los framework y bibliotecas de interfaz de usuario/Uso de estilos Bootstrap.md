# Clases Infix

* Definición: Las clases infix se utilizan para definir puntos de ruptura (breakpoints) en el sistema de cuadrícula (grid) de Bootstrap. Esto permite que el diseño de la página se adapte a diferentes tamaños de pantalla.

* Breakpoints disponibles:
    * Extra pequeño (XS): Menos de 576 píxeles (predeterminado, no se necesita clase).

    * Pequeño (SM): 576 píxeles o más.

    * Mediano (MD): 768 píxeles o más.

    * Grande (LG): 992 píxeles o más.

    * Extra grande (XL): 1200 píxeles o más.

    * Extra extra grande (XXL): 1400 píxeles o más.

## Modificadores

* Definición: Los modificadores se utilizan para cambiar el estilo de un componente. Por ejemplo, puedes cambiar el color de un alerta.

* Ejemplo de clases de alerta:

    * alert-primary: Muestra un mensaje de alerta en azul.
    * alert-danger: Muestra un mensaje de alerta en rojo.
    Ejemplo Práctico

Supongamos que tienes un div que quieres que ocupe 6 columnas en pantallas grandes. En tu código HTML, lo harías así:

```html
<div class="col-lg-6">Contenido aquí</div>
```

Si deseas mostrar un mensaje de alerta de éxito, lo harías así:

```html
<div class="alert alert-success" role="alert">
  ¡Operación exitosa!
</div>
```

## Resumen

* Clases infix: Se utilizan para definir cómo se comporta el diseño en diferentes tamaños de pantalla.

* Modificadores: Se utilizan para cambiar el estilo de los componentes, como el color de las alertas.

