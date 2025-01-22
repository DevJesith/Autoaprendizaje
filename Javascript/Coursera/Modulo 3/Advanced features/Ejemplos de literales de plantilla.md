# ¿Qué son los literales de plantilla?

Los literales de plantilla son una forma alternativa de trabajar con cadenas, que se introdujo con la incorporación de ES6 al lenguaje JavaScript.

Hasta ES6, la única forma de crear cadenas en JavaScript era delimitarlas entre comillas simples o dobles:

```js
'Hello, World!'
"Hello, World!"
```
Además de las formas anteriores de crear cadenas, ES6 introdujo el uso de caracteres de comillas invertidas como delimitadores:  

```js
`Hello, World!`
```

El fragmento de código anterior es un ejemplo de una cadena de plantilla, también conocida como literal de plantilla.

Nota: En la mayoría de los teclados, el carácter de acento grave se puede ubicar encima de la tecla TAB, a la izquierda de la tecla número 1.

Con los literales de plantilla, se puede incrustar una expresión en un  marcador de posición . Un marcador de posición se representa con ${}, y todo lo que se encuentre dentro de las llaves se considera JavaScript y todo lo que se encuentre fuera de las llaves se considera una cadena:  

## Diferencias entre una plantilla y una cadena normal

Hay varias formas en las que una cadena de plantilla es diferente de una cadena normal.

* En primer lugar, permite la  `interpolación` variable :

```js
let greet = "Hello";
let place = "World";
console.log(`${greet} ${place} !`) //display both variables using template literals
```

El registro de la consola anterior generará lo siguiente:  

```js
Hello World !
```

Básicamente, el uso de literales de plantilla permite a los programadores incrustar variables directamente entre las comillas invertidas, sin necesidad de utilizar el  operador +  y las comillas simples o dobles para delimitar los literales de cadena de las variables. En otras palabras, en ES5, el ejemplo anterior tendría que escribirse de la siguiente manera:  

```js
var greet = "Hello";
var place = "World";
console.log(greet + " " + place + "!"); //display both variables without using template literals
```

* Además de la interpolación variable, las cadenas de plantilla pueden abarcar varias líneas.

Por ejemplo, esta es una sintaxis perfectamente buena:

```js
`Hello,
World
!
`
```

Tenga en cuenta que esto no se puede hacer utilizando  literales de cadena  (es decir, cadenas delimitadas entre comillas simples o dobles):  

```js
"Hello,
World"
```

El código anterior, al ejecutarse, arrojará un error de sintaxis.

En pocas palabras, los literales de plantilla permiten cadenas de varias líneas, algo que simplemente no es posible con los literales de cadena.

* Además, la razón por la que es posible interpolar variables en literales de plantilla es porque esta sintaxis realmente permite la  evaluación de expresiones .

En otras palabras, esto:

```js
//it's possible to perform arithmetic operation inside a template literal expression
console.log(`${1 + 1 + 1 + 1 + 1} stars!`) 

```
El ejemplo anterior registrará en la consola la siguiente cadena:  ¡5 estrellas !.

Esto abre un abanico de posibilidades. Por ejemplo, es posible evaluar una expresión ternaria dentro de un literal de plantilla.


Algunos casos de uso adicionales de los literales de plantilla son  los literales de plantilla anidados  y  las plantillas etiquetadas . Sin embargo, son un poco más complejos y quedan fuera del alcance de esta lectura.

Si tiene curiosidad sobre cómo funcionan, consulte la lectura adicional proporcionada al final de esta lección.