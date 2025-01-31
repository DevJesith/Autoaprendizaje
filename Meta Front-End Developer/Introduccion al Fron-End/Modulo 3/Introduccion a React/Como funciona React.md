# ¿Qué es el DOM virtual?

* DOM (Document Object Model): Es una representación de la estructura de un documento HTML en la memoria del navegador. Cada vez que se actualiza el DOM, el navegador tiene que recalcular y renderizar la página, lo que puede ser lento.

* DOM virtual: Es una copia ligera del DOM real que React mantiene en memoria. React utiliza este DOM virtual para optimizar las actualizaciones de la interfaz de usuario.

# ¿Cómo funciona?

1. Actualización del componente: Cuando un componente de React se actualiza, primero se actualiza el DOM virtual.

2. Comparación: React compara el nuevo DOM virtual con la versión anterior para identificar qué elementos han cambiado.

3. Actualización del DOM real: Solo los elementos que han cambiado se actualizan en el DOM real, lo que mejora el rendimiento.

## Ejemplo:

Imagina que tienes una lista de tareas en una aplicación. Si agregas una nueva tarea:

* DOM virtual: Se actualiza para incluir la nueva tarea.

* Comparación: React compara la nueva lista con la anterior y ve que solo se ha agregado un elemento.
 
* DOM real: Solo se agrega la nueva tarea en el navegador, en lugar de volver a renderizar toda la lista.

Este proceso se llama reconciliación y es fundamental para que las aplicaciones de React sean rápidas y eficientes.