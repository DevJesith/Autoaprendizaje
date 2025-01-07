Quizás ya esté familiarizado con los objetos en JavaScript.

En este vídeo, aprenderá a diseñar objetos como combinaciones de datos y funcionalidad.

Como ya sabrás, un objeto consta de pares clave-valor, conocidos como propiedades.

Podemos agregar nuevos pares clave-valor a objetos existentes utilizando la notación de puntos y el operador de asignación.

var car = {};
car.color = "red"; //update the value of a property of the car objject

Estas se conocen como propiedades y pueden tomar muchos tipos de datos, incluidas funciones.

var car = {};

car.color = "red";

//add a method to the car object so that it can be called as car.turnkey()
car.turnKey = function() { 
  console.log('engine running'); 
}

Si la función es una propiedad de un objeto, entonces se denomina método.

Esta es una función a la que solo se puede acceder a través del objeto JavaScript del que es miembro. Por ejemplo, al método log, que pertenece al objeto console, solo se puede acceder a través del objeto console.

console.log('Hola mundo');  

Exploremos esto más a fondo. Crearé un objeto usando algo conocido como función constructora.

var car = {};
car.mileage = 98765;
car.color = "red";
console.log(car);

Primero, crearé un nuevo objeto llamado literalmente  auto . Escribo  var , espacio,  auto , espacio, signo igual, espacio, seguido de un par de llaves y, por último, un punto y coma.

Ahora, ampliaré el  objeto del automóvil  asignándole una propiedad llamada  mileage .

Cuando inspecciono el objeto, puedo confirmar que contiene una  propiedad de kilometraje  establecida en  98765 .

Quiero agregar otra propiedad al  objeto del automóvil  . Esta vez, agregaré una propiedad llamada  color  y le asignaré el valor  "rojo" .

Puedo inspeccionar el objeto nuevamente escribiendo su nombre en la consola del navegador. Ahora, cuando escribo  console.log(car) , obtengo un objeto con dos propiedades: la  propiedad mileage  , que está configurada en  98765 , y la  propiedad color  , configurada en  "red" .

Genial, ahora he añadido dos propiedades a mi objeto.

A continuación, quiero agregar un método a mi  objeto de automóvil  . Cuando se lo llame, este método mostrará un texto en la consola.

Entonces, una vez más, agrego otra propiedad a mi  objeto de automóvil  . Después de todo, un método es simplemente otra propiedad del  objeto de automóvil  . Es simplemente otro parámetro clave-valor que contiene el objeto de automóvil.

Lo único es que el valor que le estoy asignando es una función.

var car = {};
car.mileage = 98765;
car.color = "red";
console.log(car);
car.turnTheKey = function() {
    console.log("The engine is running")
}
console.log(car);

Entonces, comienzo escribiendo  car  dot  turnTheKey , equals, y luego escribo el código para mi función. Entonces  function , paréntesis de apertura y cierre. Luego las dos llaves donde colocaré mi código. Finalmente, dentro de las llaves, escribo console dot log seguido del mensaje  "El motor está funcionando" .

Ahora puedo inspeccionar nuevamente el objeto de mi  automóvil  ingresando su nombre en el método de registro de la consola. Esta vez, muestra que el  objeto de automóvil  contiene tres propiedades: la  propiedad de color  , la  propiedad de kilometraje  y la   propiedad turnTheKey .

Recuerde que todos los pares clave-valor de un objeto se denominan simplemente propiedades. Sin embargo, si quiero diferenciar entre las propiedades que se pueden ejecutar, entonces me refiero a dichas propiedades como métodos.

Ahora quiero agregar otro método al  objeto del automóvil  . Lo llamaré  lightsOn .

Una vez más, escribo  car.lightsOn y luego agrego un signo igual. Nuevamente, como es un método, lo estoy asignando a una función. Esta función también tendrá un registro de consola en su cuerpo y simplemente estoy registrando la cadena con el texto  "Las luces están encendidas" .

//example of adding properties and methods to an object
var car = {};
car.mileage = 98765;
car.color = "red";
console.log(car);
car.turnTheKey = function() {
    console.log("The engine is running")
}
car.lightsOn = function() {
    console.log("The lights are on.")
}
console.log(car);
car.turnTheKey();
car.lightsOn()

Bien, ahora he añadido cuatro propiedades a mi objeto. Dos de ellas son métodos.

Ya me aseguré de que obtengo el  kilometraje  y  el color correctos  de mi  objeto de automóvil  . Ahora, intentaré ejecutar los  métodos turnTheKey  y  lightsOn  .

Primero, invocaré el   método turnTheKey .

Recuerde que a este método solo se puede acceder a través del  objeto car  , por lo que primero debo escribir el nombre del objeto que contiene el  método turnTheKey  . En otras palabras, debo escribir la palabra  car , seguida de un punto y luego el nombre de mi método, que es  turnTheKey .

Recuerde que esta propiedad es un método, por lo que para ejecutarla, necesito agregar un paréntesis de apertura y otro de cierre para que el motor de JavaScript pueda procesar mi código JavaScript.

Tenga en cuenta que esto da como resultado la  cadena "El motor está funcionando"  registrada en la consola.

Ahora probaré el otro método. Una vez más, necesito acceder a él a través del  objeto car  , por lo que escribo  car.lightsOn y, nuevamente, necesito agregar esos paréntesis para invocar el  método lightsOn  . Presiono la tecla ENTER y observo que el texto se muestra en la consola.

¡Éxito! Es importante recordar que cuando el motor de JavaScript ejecuta esta línea de código, ubica el  objeto de automóvil  en su memoria. Luego, encuentra el   método  lightsOn en el objeto de automóvil  . Lee la declaración de función que está guardada en esta propiedad y la ejecuta, línea por línea.

Como solo hay una línea de código, el motor de JavaScript registra la cadena  "Las luces están encendidas"  en la consola.