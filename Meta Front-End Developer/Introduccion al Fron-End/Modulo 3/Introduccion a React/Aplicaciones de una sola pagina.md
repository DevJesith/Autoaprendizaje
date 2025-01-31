## ¿Qué es una SPA?

Una SPA es un tipo de aplicación web que carga una sola página HTML y actualiza dinámicamente el contenido a medida que el usuario interactúa con la aplicación. Esto significa que, en lugar de cargar una nueva página cada vez que el usuario hace clic en un enlace, la SPA solo actualiza la parte necesaria de la página.

* Ejemplo:

Imagina que estás usando una aplicación web para revisar películas. 

1. En un sitio web tradicional:

* Cuando haces clic en un botón que dice "Sugerir una película", el navegador envía una solicitud al servidor.

* El servidor genera una nueva página HTML con la sugerencia de la película y la envía de vuelta al navegador.

* El navegador carga y muestra la nueva página, lo que puede tardar un tiempo.

2. En una SPA:

* Cuando haces clic en el mismo botón, el navegador envía una solicitud al servidor, pero en lugar de recibir una nueva página, recibe un objeto JSON que contiene solo la información de la película sugerida.

* La aplicación lee este objeto y actualiza el contenido de la página actual para mostrar la sugerencia de la película, sin necesidad de recargar toda la página.

### Ventajas de las SPAs:

* Rendimiento: La experiencia es más rápida y fluida porque solo se actualiza el contenido necesario.

* Menor uso de recursos: Se reduce la cantidad de datos que se envían entre el servidor y el navegador.