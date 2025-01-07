Literales de objeto y notación entre corchetes
Hay una sintaxis alternativa a la notación de puntos que he utilizado hasta este momento.

Esta sintaxis alternativa se conoce como  notación entre corchetes .

Para entender cómo funciona, es mejor usar un ejemplo, así que repasaré nuevamente el proceso de codificación del  objeto house2  , de la misma manera que lo hice con la notación de puntos, solo que esta vez usaré la notación de corchetes.

var house2 = {};
house2["rooms"] = 4;
house2['color']= "pink";
house2["priceUSD"] = 12345;
console.log(house2); // {rooms: 4, color: 'pink', priceUSD: 12345}

Tenga en cuenta que al utilizar la notación de corchetes, básicamente solo envuelvo la clave de cada propiedad  como una cadena , dentro de comillas simples o dobles, tal como con las cadenas normales.

Luego envuelvo toda la clave de propiedad en un corchete de apertura y otro de cierre.

Eso es esencialmente todo lo que hay que hacer.

Puedo acceder y actualizar propiedades de objetos usando la notación de puntos, la notación de corchetes o una combinación de ambas, como en el siguiente ejemplo:

var car = {};
car.color = "red";
car["color"] = "green";
car["speed"] = 200;
car.speed = 100;
console.log(car); // {color: "green", speed: 100}

Por el momento, probablemente esta sea suficiente información sobre la creación de objetos.

Antes de analizar el tema de las matrices y los objetos, permítanme brindarles otra información importante sobre la notación de corchetes.

Con la notación de corchetes, puedo agregar caracteres de espacio dentro de los nombres de propiedades, de esta manera:  

car["number of doors"] = 4;
console.log(car); // {color: 'green', speed: 100, number of doors: 4}

Además, puedo agregar números (como tipo de datos de cadena) como claves de propiedad:  

car["2022"] = 1901;
console.log(car); // {2022: 1901, color: 'green', speed: 100, number of doors: 4}

Sin embargo, no se recomienda hacer esto debido a razones obvias: tener una clave de propiedad como una cadena numérica realmente no transmite mucha información útil.

Finalmente, hay una cosa realmente útil que tiene la notación de corchetes pero que no está disponible en la notación de puntos: puede evaluar expresiones.

Para entender lo que esto significa, considere el siguiente ejemplo:

var arrOfKeys = ['speed', 'altitude', 'color'];
var drone = {
    speed: 100,
    altitude: 200,
    color: "red"
}
for (var i = 0; i < arrOfKeys.length; i++) {
    console.log(drone[arrOfKeys[i]])
}

El código anterior dará como resultado el siguiente resultado:  

100
200
red

Utilizando el hecho de que la notación de corchetes puede evaluar expresiones, accedí a la  propiedad arrOfKeys[i]  en el   objeto dron .

Este valor cambiaba en cada bucle mientras se ejecutaba el bucle for.

En concreto, la primera vez que se ejecutó se evaluó así:

El valor de  i  era  0 

El valor de  arrOfKeys[i]  era  arrOfKeys[0] , que era  "velocidad". 

Por lo tanto,  drone[arrOfKeys[i]]  se evaluó como  drone["speed"]  que es igual a  100

Esto me permitió recorrer cada uno de los valores almacenados dentro del  objeto dron  , en función de las claves de cada una de sus propiedades.