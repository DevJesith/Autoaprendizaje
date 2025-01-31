Bootstrap incluye documentación detallada sobre cómo configurar y utilizar las funciones disponibles en su biblioteca. La documentación es clara y tiene muchos ejemplos de código para ayudarte a empezar.

En esta lectura, explorará las secciones de documentación utilizadas con frecuencia.

La documentación de Bootstrap está actualmente disponible en el siguiente enlace.

https://getbootstrap.com/docs

## Navegando por la documentación

La barra lateral de la página web permite navegar por las distintas secciones de la documentación. También hay un cuadro de búsqueda si necesitas buscar información específica.

## Disposición

La sección de diseño de la documentación describe cómo utilizar el sistema de cuadrícula de Bootstrap. Abarca lo que ha aprendido hasta ahora e incluye un uso más avanzado, como desplazamientos, alineación de columnas, diseño automático y columnas de ancho variable.

## Contenido
La sección de contenido de la documentación describe el estilo de texto predeterminado de Bootstrap y cómo usar imágenes y tablas adaptables. Ya aprendiste los conceptos básicos de estos temas anteriormente y esta sección los explica con más detalle.

## Formularios
La sección de formularios de la documentación describe cómo crear formularios utilizando los estilos de Bootstrap. La biblioteca tiene muchas reglas CSS para mejorar la interfaz y la experiencia de usuario de su formulario. A continuación, se muestran algunas funciones que utilizará con frecuencia como desarrollador:

## Estilo de formulario

Bootstrap incluye reglas CSS para mejorar el estilo visual de los elementos de entrada.

Por ejemplo:

Esta tabla describe los diferentes elementos de formulario HTML y qué clase CSS de Bootstrap se debe utilizar para ellos.

* Style forms img*

## Interruptores
Si ha utilizado una aplicación en su dispositivo móvil, probablemente esté familiarizado con el tipo de entrada del interruptor.

Bootstrap incluye reglas CSS para diseñar elementos de entrada de casillas de verificación como interruptores.

Para hacer esto:

1. Agrega la  entrada  a un   elemento div .

2. En el  elemento div  , aplique las   clases CSS form-check  y  form-switch .

3. En el  elemento de entrada  , agregue la   clase CSS form-check-input .

```html
<div class="form-check form-switch">
  <input class="form-check-input" type="checkbox">
</div>
```

## Grupos de entrada
Los grupos de entrada son útiles para proporcionar contenido adicional al campo de entrada. Por ejemplo, si desea solicitarle al usuario que ingrese una cantidad en dólares estadounidenses, puede usar un grupo de entrada para mostrar el símbolo del dólar y la cantidad en centavos.

Para hacer esto:

1. Agrega la  entrada  a un   elemento div .

2. Aplicar las   clases CSS  del grupo de entrada en el elemento div  .

3. Agregue un  elemento span  antes o después del  elemento de entrada  y aplíquele la  clase CSS input-group-text  . Luego, el contenido de texto se agrega dentro del   elemento span .

```html
<div class="input-group">
  <span class="input-group-text">$</span>
  <input type="text" class="form-control">
  <span class="input-group-text">.00</span>
</div>
```
## Etiquetas flotantes

Las etiquetas flotantes ayudan a proporcionar información del formulario al usuario como parte de la entrada misma. Son diferentes de los marcadores de posición de formularios normales. La información permanece visible si el usuario está interactuando con el elemento o si el elemento tiene contenido.

Para ello, añade la  entrada  a un  elemento div  . En el  elemento div  , aplica las   clases CSS de formulario flotante .

```html
<div class="form-floating">
  <input type="email" class="form-control" id="addressInput" placeholder="Address">
  <label for="addressInput">Address</label>
</div>
```

## Componentes
Como has aprendido, Bootstrap viene con muchos elementos y estilos de interfaz de usuario prediseñados para ayudar a acelerar tu desarrollo.

Algunos de estos componentes requieren Javascript para funcionar, mientras que otros solo requieren clases CSS aplicadas a elementos HTML. La sección Componentes de la documentación explica estos requisitos en cada página de componente y proporciona muchos ejemplos de código.

## Conclusión
Ahora que está familiarizado con cómo utilizar la documentación de Bootstrap, tal vez pueda probar algunos componentes y estilos nuevos en una página web que haya creado previamente.

