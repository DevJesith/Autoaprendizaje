# Mover datos en la web

La web moderna está formada por millones y millones de páginas web, servicios conectados y bases de datos.

Hay sitios web que se comunican con otros sitios web y obtienen datos de fuentes de datos y proveedores de datos, tanto pagos como gratuitos.

Todos estos flujos de datos deben facilitarse con algún tipo de formato de datos.

En 2001, Douglas Crockford ideó un formato de intercambio de datos basado en objetos JavaScript. El nombre que recibió este formato fue JSON (JavaScript Object Notation).

Antes de JSON, el formato de archivo de intercambio de datos más común era  XML  (lenguaje de marcado extensible). Sin embargo, debido a la sintaxis de XML, se necesitaban más caracteres para describir los datos que se enviaban. Además, dado que era un lenguaje específico e independiente, no era tan fácil interoperar con JavaScript.

Por lo tanto, las dos razones principales para que el formato JSON se haya convertido en el formato de intercambio de datos dominante que es hoy son dos:

En primer lugar, es muy ligero, con una sintaxis muy similar a la de un "objeto JavaScript convertido en cadena". Aprenderá más sobre los detalles de esto más adelante.

En segundo lugar, es más fácil de manejar en código JavaScript, ya que, después de todo, JSON es  solo JavaScript.

A menudo se dice que JSON es un  subconjunto  de JavaScript, lo que significa que se adhiere a las reglas de sintaxis del lenguaje JavaScript, pero es aún más estricto en cuanto a cómo se debe formatear el código JSON correctamente. En otras palabras, todo el código JSON es JavaScript, pero no todo el código JavaScript es JSON.

Además de ser un formato de intercambio de datos, JSON también es un formato de archivo. No es raro acceder a datos de terceros desde un sitio web de terceros en nuestro propio código en forma de  archivo JSON  .

Por ejemplo, si tuviera un sitio web con datos sobre los movimientos de los precios de las acciones, podría querer obtener los datos de los precios actuales de las acciones de un proveedor de datos. Es posible que le ofrezcan su servicio de datos dándole acceso al archivo llamado, por ejemplo,  stockPrices.json , al que podría acceder desde sus servidores.

Una vez que hayas descargado esos datos JSON convertidos en cadena en tu propio código, podrás convertirlos en un objeto JavaScript simple.

Eso significaría que usted podría usar el código de su aplicación web para "examinar" los datos de terceros convertidos en un objeto JavaScript, a fin de obtener información específica basada en un conjunto dado de criterios.

Por ejemplo, si los datos JSON convertidos en cadena se convirtieran en un objeto que tuviera la siguiente estructura:

```js
const currencyInfo = {
    [
        USD: {
            // ...
        },
        GBP: {
            // ...
        },
        EUR: {
            // ...
        }
    ]
}
```

Luego, podría acceder solo a los datos de la  propiedad USD  , si eso era lo que su aplicación necesitaba en un momento determinado.

Con suerte, con esta explicación, comprenderás, en un alto nivel, cómo y por qué podrías querer usar JSON en tu propio código.

Se trata de obtener datos JSON convertidos en cadenas de un servidor, convertir ("analizar") esos datos en objetos JS en su propio código, trabajar con los datos convertidos en su propio código y quizás incluso convertir el resultado en cadenas de caracteres JSON, de modo que estos datos estén listos para, por ejemplo, ser enviados de vuelta a un servidor después de que su código los haya procesado localmente.

## JSON es solo una cadena, pero hay reglas que debe seguir
JSON es una cadena, pero debe tener el formato correcto. En otras palabras, debe cumplir ciertas reglas.

Si una cadena JSON no tiene el formato correcto, JavaScript no podrá analizarla en un objeto JavaScript.

JSON puede funcionar con algunos tipos de datos primitivos y complejos, como se describe a continuación.

Solo un subconjunto de valores en JavaScript se puede convertir correctamente en JSON y analizar desde un objeto JavaScript en una cadena JSON.

Estos valores incluyen:

* Valores primitivos: cadenas, números, boleanas, nulos.

* valores complejos: objetos y matrices (¡sin funciones!)

* Los objetos tienen cadenas entre comillas dobles para todas las claves

* Las propiedades están delimitadas por comas tanto en objetos JSON como en matrices JSON, al igual que en el código JavaScript normal.

* Las propiedades de cadena deben estar entre comillas dobles. Por ejemplo:

```json

"frutas" ,

 

"verduras"
```

* Las propiedades numéricas se representan utilizando la sintaxis numérica regular de JavaScript; por ejemplo

```json

5 ,

 

10 ,

 

1.2
```

* Las propiedades booleanas se representan utilizando la sintaxis booleana normal de JavaScript, es decir:

 
```json
verdadero

 

y

 

FALSO
```

* Null como propiedad es lo mismo que en JavaScript normal; es solo un

 

nulo

Puede utilizar literales de objeto y literales de matriz, siempre que siga las reglas anteriores.

¿Qué sucede si intenta convertir en cadena un tipo de datos que no se acepta en la sintaxis JSON?

Por ejemplo, ¿qué sucede si intenta convertir una función en una cadena?  La operación fallará silenciosamente .

Si intenta convertir en cadena otros tipos de datos, como un número BigInt, digamos  123n , obtendrá el siguiente error:  Uncaught TypeError: Do not know how to serialize a BigInt .

## Algunos ejemplos de cadenas JSON
Finalmente, aquí hay un ejemplo de un objeto JSON convertido en cadena, con un único par clave-valor:

* ' { "color" : "rojo" } '

Aquí hay un objeto JSON un poco más complejo:

* ' { "color" : "rojo" , "objetoanidado" : { "color" : "azul" } } '      

El objeto JSON anterior codifica dos propiedades:

* "color": "rojo"

* "objetoanidado": { "color": "azul" }

También es posible tener una cadena JSON que codifique solo una matriz:

* '["Uno, dos, tres"]'

La cadena JSON anterior codifica una matriz que contiene tres elementos, tres valores del tipo de datos de cadena. Obviamente, al igual que los objetos, las matrices pueden anidar otras estructuras de datos simples o complejas.

Por ejemplo:

* '[{ "color": "azul" }, {"color: "rojo"}]'

En el ejemplo anterior, la cadena JSON codifica una matriz que contiene dos objetos, donde cada objeto consta de un único par clave-valor, donde ambos valores son cadenas.