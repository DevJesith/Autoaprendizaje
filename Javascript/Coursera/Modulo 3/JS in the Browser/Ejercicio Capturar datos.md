## Descripción
El objetivo de este ejercicio es acceder al contenido de un elemento, específicamente utilizar un clic de botón para reemplazar texto.

## Tarea 1: El sitio web example.com
Abrir el ejemplo.com Sitio web en su navegador. Abra las herramientas para desarrolladores y concéntrese en la pestaña Consola.

Example.com es un dominio que puede utilizarse como ejemplo en documentos, artículos y sitios web.

Si navega en su navegador hacia 
http://www.ejemplo.com
  Verás una página web con un mensaje simple:

### Ejemplo de dominio

Este dominio se creó para usarse con fines ilustrativos en documentos. Puede usar este dominio en ejemplos sin necesidad de coordinación previa o solicitud de permiso.

## Tarea 2: Introducir h1 en una variable
Utilice el método document.querySelector() para consultar el elemento h1 en la página y asignarlo a la variable denominada h1 .

```js
var h1 = document.querySelector('h1')
```

## Tarea 3: Codificar una matriz
Declare una nueva variable, llámela arr y guarde la siguiente matriz en ella:

```js
[
    'Example Domain',
    'First Click',
    'Second Click',
    'Third Click'
]
```

```js
var arr = [
    'Example Domain',
    'First Click',
    'Second Click',
    'Third Click'
]
```


## Tarea 4: Escribe una función de manejo de clics
Escriba una nueva declaración de función, denominada handleClicks . No debe aceptar ningún parámetro.

Dentro de él, codifique una declaración de cambio y pásele un único parámetro, h1.innerText .

El cuerpo de la declaración switch debe tener un total de 4 casos (el cuarto es el caso predeterminado).

El primer caso debe comenzar con case arr[0]: . Debe establecer h1.innerText en arr[1] . En otras palabras, debe asignar el valor de arr[1] a la propiedad h1.innerText . La siguiente línea debe tener solo la palabra clave break .

El segundo caso debe comenzar con case arr[1] :. Debe establecer h1.innerText en arr[2] . En otras palabras, debe asignar el valor de arr[2] a la propiedad h1.innerText . La siguiente línea debe tener solo la palabra clave break .

El tercer caso debe comenzar con case arr[2] :. Debe establecer h1.innerText en arr[3] . En otras palabras, debe asignar el valor de arr[3] a la propiedad h1.innerText . La siguiente línea debe tener solo la palabra clave break .

El caso predeterminado debe establecer el valor de la propiedad h1.innerText en arr[0] .

```js
function handleClicks() {
    switch(h1.innerText) {
        case arr[0]:
            h1.innerText = arr[1]
            break
        case arr[1]:
            h1.innerText = arr[2]
            break
        case arr[2]:
            h1.innerText = arr[3]
            break
        default:
            h1.innerText = arr[0]
    }
}
```


## Tarea 5: Agregar un detector de eventos
Ha creado una variable h1 en la tarea 2. Ahora, utilice esa variable para ejecutar el método addEventListener() en ella. Pase dos argumentos al método addEventListener() : 'click' y handleClicks .

```js
h1.addEventListener('click', handleClicks);
```