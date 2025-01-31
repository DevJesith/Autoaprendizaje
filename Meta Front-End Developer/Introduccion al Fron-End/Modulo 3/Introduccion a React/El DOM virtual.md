# El DOM virtual

React crea una representación del modelo de objetos de documento (DOM) del navegador en la memoria, denominada DOM virtual. A medida que se actualizan los componentes, React comprueba si el código HTML del componente en el DOM virtual coincide con el DOM del navegador. Si se requiere un cambio, se actualiza el DOM del navegador. Si no se ha producido ningún cambio, no se realiza ninguna actualización.

Como sabéis, esto se llama  proceso de reconciliación  y se puede dividir en los siguientes pasos:

* Paso 1:  Se actualiza el DOM virtual.

* Paso 2:  El DOM virtual se compara con la versión anterior del DOM virtual y se verifica qué elementos han cambiado.

* Paso 3:  Los elementos modificados se actualizan en el DOM del navegador.

* Paso 4:  La página web mostrada se actualiza para coincidir con el DOM del navegador.

Como actualizar el DOM del navegador puede ser una operación lenta, este proceso ayuda a reducir la cantidad de actualizaciones del DOM del navegador al actualizarlo solo cuando es necesario.

Pero incluso con este proceso, si un evento actualiza muchos elementos, enviar la actualización al DOM del navegador aún puede ser costoso y provocar un rendimiento lento en la aplicación web.

El equipo de React invirtió muchos años de investigación para resolver este problema. El resultado de esa investigación es lo que se conoce como la arquitectura React Fiber.

La arquitectura Fiber permite a React renderizar la página web de forma incremental. Esto significa que, en lugar de actualizar inmediatamente el DOM del navegador con todos los cambios del DOM virtual, React puede distribuir la actualización a lo largo del tiempo. Pero, ¿qué significa "a lo largo del tiempo"?

Imagine una página web muy larga en el navegador. Si el usuario se desplaza hasta el final, la parte superior de la página web ya no es visible. A continuación, el usuario hace clic en un botón en la parte inferior de la página web que actualiza parte del texto de la parte superior de la página web.

Pero la parte superior de la página no está visible. ¿Por qué actualizarla inmediatamente?

Tal vez haya un texto que se muestra actualmente en la parte inferior de la página y que también se actualiza cuando se hace clic en el botón. ¿No sería esa una prioridad mayor para actualizar que el texto no visible?

Este es el principio de la arquitectura React Fiber. React puede optimizar cuándo y dónde se producen las actualizaciones en el DOM del navegador para mejorar significativamente el rendimiento de la aplicación y la capacidad de respuesta a la entrada del usuario. Piense en ello como un sistema de prioridades. Los cambios de mayor prioridad, los elementos visibles para el usuario, se actualizan primero. Mientras que los cambios de menor prioridad, los elementos que no se muestran actualmente, se actualizan más tarde.

Si bien es poco probable que interactúe usted mismo con el DOM virtual y la arquitectura de fibra, es bueno saber qué sucede si ocurren problemas durante el desarrollo de su aplicación web.

Hay muchas herramientas disponibles para ayudarte a investigar cómo React procesa tu página web. El complemento oficial para navegadores web React Developer Tools desarrollado por Meta será una de las herramientas clave en tu caja de herramientas para desarrolladores. Por lo tanto, si tienes que analizar más a fondo el código, tendrás la caja de herramientas adecuada disponible para ayudarte. Estas herramientas se explorarán más adelante.

## Resumen

* Definición: El DOM virtual es una representación en memoria del Document Object Model (DOM) real del navegador. Es utilizado por React para optimizar el rendimiento de las aplicaciones web.

### Funcionamiento:

1. Actualización: Cuando cambian los componentes en una aplicación React, se actualiza el DOM virtual.

2. Comparación: React compara el nuevo DOM virtual con la versión anterior para identificar qué elementos han cambiado.

3. Actualización del DOM real: Solo los elementos que han cambiado se actualizan en el DOM real del navegador, lo que reduce el número de operaciones costosas.

* Beneficio: Este proceso de reconciliación ayuda a mejorar la velocidad y la eficiencia de las aplicaciones web, ya que evita actualizaciones innecesarias del DOM real.