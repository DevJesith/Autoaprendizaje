Al finalizar esta lectura, usted podrá:

Identificar ejemplos de funciones de cadena y explicar cómo llamarlas.

En esta hoja de trucos, enumeraré algunas de las propiedades y métodos más comunes y útiles disponibles en cadenas.

Para todos los ejemplos, utilizaré una o ambas de las siguientes variables:

var greet = "Hello, ";
var place = "World"

Tenga en cuenta que cualesquiera que sean las propiedades y métodos de cadena que demuestre en los siguientes ejemplos, podría haberlos ejecutado en esas cadenas directamente, sin guardarlos en una variable como las que llamé  greeting  y  place .

En algunos de los ejemplos que siguen, para mayor claridad, en lugar de utilizar un nombre de variable, utilizaré la cadena misma.

Todas las cadenas tienen a su disposición varias propiedades integradas, pero hay una única propiedad que es realmente útil: la  propiedad de longitud  , que se utiliza así:

greet.length; // 7


Para leer cada carácter individual en un índice específico de una cadena, comenzando desde cero, puedo usar el   método   charAt() :

greet.charAt(0); // 'H'

El  método concat()  une dos cadenas:  

"Wo".concat("rl").concat("d"); // 'World'

indexOf   devuelve la ubicación de la primera posición que coincide con un carácter :

"ho-ho-ho".indexOf('h'); // 0
"ho-ho-ho".indexOf('o'); // 1
"ho-ho-ho".indexOf('-'); // 2

lastIndexOf  encuentra  la última coincidencia, de lo contrario funciona igual que  indexOf .
El  método split  divide la cadena en una matriz de subcadenas:
"ho-ho-ho".split("-"); // ['ho', 'ho', 'ho']

También existen algunos métodos para cambiar el uso de mayúsculas y minúsculas de las cadenas. Por ejemplo:  
greet.toUpperCase(); // "HELLO, "
greet.toLowerCase(); // "hello, "

A continuación se muestra una lista de todos los métodos cubiertos en esta hoja de trucos:

carácterAt() 

concatenación() 

índiceDe() 

últimoÍndiceDe() 

dividir() 

aMayúscula() 

a minúsculas()  