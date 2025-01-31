# Estudio de caso: ¿Por qué los ingenieros de Facebook crearon React?

Existen muchos frameworks de modelo-vista-controlador (MVC) de JavaScript. ¿Por qué creamos React y por qué querrías usarlo?

## React no es un marco MVC.

React es una biblioteca para crear interfaces de usuario componibles. Fomenta la creación de componentes de interfaz de usuario reutilizables que presentan datos que cambian con el tiempo.

## React no utiliza plantillas.

Tradicionalmente, las interfaces de usuario de las aplicaciones web se crean utilizando plantillas o directivas HTML. Estas plantillas dictan el conjunto completo de abstracciones que se pueden utilizar para crear la interfaz de usuario.

React aborda la creación de interfaces de usuario de forma diferente, dividiéndolas en  componentes . Esto significa que React utiliza un lenguaje de programación real y completo para representar vistas, lo que consideramos una ventaja sobre las plantillas por algunas razones:

* JavaScript es un lenguaje de programación flexible y potente con la capacidad de crear abstracciones, algo que resulta sumamente importante en aplicaciones de gran tamaño.

* Al unificar su marcado con su lógica de vista correspondiente, React puede hacer que las vistas sean más fáciles de ampliar y mantener .

* Al integrar la comprensión del marcado y el contenido en JavaScript, no hay concatenación manual de cadenas y, por lo tanto, hay menos superficie para vulnerabilidades XSS.

También hemos creado JSX, una extensión de sintaxis opcional, en caso de que prefiera la legibilidad de HTML al JavaScript puro.

## Las actualizaciones de React son muy simples.

React realmente brilla cuando sus datos cambian con el tiempo.

En una aplicación JavaScript tradicional, es necesario observar qué datos cambiaron y realizar cambios imperativos en el DOM para mantenerlo actualizado. Incluso AngularJS, que proporciona una interfaz declarativa a través de directivas y enlaces de datos 
requiere una función de enlace para actualizar manualmente los nodos DOM
.

React adopta un enfoque diferente.

Cuando se inicializa por primera vez el componente, se llama al  método render  , que genera una representación liviana de la vista. A partir de esa representación, se produce una cadena de marcado y se inyecta en el documento. Cuando los datos cambian, se vuelve a llamar al  método render  . Para realizar las actualizaciones de la manera más eficiente posible, comparamos el valor de retorno de la llamada anterior a  render  con el nuevo y generamos un conjunto mínimo de cambios que se aplicarán al DOM.

Los datos devueltos de  render  no son una cadena ni un nodo DOM: es una descripción ligera de cómo debería verse el DOM.

A este proceso lo llamamos  reconciliación . Este jsFiddle para ver un ejemplo de reconciliación en acción.

Debido a que esta nueva representación es tan rápida (alrededor de 1 ms para TodoMVC), el desarrollador no necesita especificar explícitamente los enlaces de datos. Hemos descubierto que este enfoque facilita la creación de aplicaciones.

## HTML es sólo el comienzo.

Debido a que React tiene su propia representación liviana del documento, podemos hacer algunas cosas bastante interesantes con él:

* Facebook tiene gráficos dinámicos que se muestran en <canvas> en lugar de HTML.

* Instagram es una aplicación web de “una sola página” creada íntegramente con React y Backbone.Router . Los diseñadores contribuyen regularmente con código React con JSX.

* Hemos creado prototipos internos que ejecutan aplicaciones React en un trabajador web y usan React para impulsar vistas nativas de iOS a través de un puente Objective-C.

* Puede ejecutar React en el servidor para mejorar el SEO, el rendimiento, compartir código y tener flexibilidad general.

* Los eventos se comportan de manera consistente y compatible con los estándares en todos los navegadores (incluido IE8) y utilizan automáticamente la delegación de eventos.