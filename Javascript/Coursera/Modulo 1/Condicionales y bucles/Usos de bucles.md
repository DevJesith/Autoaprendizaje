Usos de los bucles
En esta lectura, discutiremos, a un nivel muy alto, las razones para usar bucles en JavaScript.

Tenga en cuenta que mantendremos esta discusión en un nivel alto porque hay varias "piezas del rompecabezas" que aún faltan en su comprensión en este momento.

Es por eso que no nos empantanaremos en los detalles de la sintaxis y la implementación, sino que simplemente discutiremos cómo y por qué se utilizan bucles en el trabajo diario de los desarrolladores de JavaScript.

Considere el siguiente ejemplo: usted trabaja como desarrollador de una tienda en línea.

La tienda vende cubos de letras para niños pequeños, y toda la sección "Comprar ahora" del sitio está organizada en un diseño donde cada cubo en venta se muestra en un componente de tarjeta simple, con una imagen del cubo, la letra que enseña, una breve descripción y el precio.

Las tarjetas están organizadas en filas, de modo que cada fila contiene tres tarjetas: tres letras diferentes.

Cada tarjeta es una vista previa de ese cubo de letras específico en venta, y también es un enlace a una página completa, dedicada a brindar más información sobre los cubos, su valor didáctico y brindarle al visitante una forma de completar su proceso de pago.

Ahora, aquí hay una pregunta rápida: ¿dónde encajarían los bucles en la visualización de esta cuadrícula de tarjetas que muestra los cubos de letras en venta?

Para entender cómo funciona esto, permítanme codificar un prototipo básico de cómo podría funcionar.

Como todavía no tienes conocimientos suficientes para mostrar diseños de sitios web en el navegador con la ayuda de JavaScript, por ahora tendré que conformarme con usar una simple cadena y la consola.

Aún así, este debería ser un ejercicio divertido.

123456
--------------------------------------------------------------------------------------------------
var cubes = 'ABCDEFG';
//styling console output using CSS with a %c format specifier
for (var i = 0; i < cubes.length; i++) {
    var styles = "font-size: 40px; border-radius: 10px; border: 1px solid blue; background: pink; color: purple";
    console.log("%c" + cubes[i], styles)
}
Reiniciar
A 
B 
C 
D 
E 
F 
G
----------------------------------------------------------------------------------------------------------------
Nota: Para que se apliquen los estilos, intente ejecutar este fragmento de código en la consola de su navegador.

Eso es todo, con este código simple, la salida en la consola muestra cada letra en una línea separada, con el estilo de un cubo de letras para niños pequeños.

El código en sí debería resultar familiar en su mayor parte, a excepción de  cubes.length  y la   sintaxis cubes[i] .

Sin entrar en demasiados detalles, aquí se explican ambos fragmentos de código lo más simple posible.

cubes.length   devuelve un número. Como  cubes  es una cadena de caracteres,  cubes.length me  da la longitud de la cadena guardada en la variable.

Esto me da el número 7, lo que hace que mi bucle for se vea así:

6

-------------------------------------------------------------------------------------------------------------------
var cubes = 'ABCDEFG';
//styling console output using CSS with a %c format specifier
for (var i = 0; i < 7; i++) {
    var styles = "font-size: 40px; border-radius: 10px; border: 1px solid blue; background: pink; color: purple";
    console.log("%c" + cubes[i], styles)
}

----------------------------------------------------------------------------------------------------------------------
Salida de consola de estilos
El segundo fragmento de código nuevo aquí es el  fragmento cubes[i]  .

Esto simplemente apunta a cada letra individual en el bucle, en función del valor actual de la  variable i  .

En otras palabras,  cubes[i] , cuando  i  es igual a  0 , es:  A .

Entonces,  cubes[i] , cuando  i  es igual a  1 , es:  B .

Esto continúa durante tantos bucles como se ejecuta mi bucle for, y esto está determinado por el  valor de cubes.length  .

También es muy versátil, ya que, si yo, por ejemplo, decidiera cambiar la longitud de la  cadena cubes  , no tendría que actualizar la condición de  i < cubes.length , porque se actualiza automáticamente cuando cambio la longitud de la  cadena cubes  .

Hay otras formas de almacenar datos en aplicaciones JavaScript de las que no has oído hablar.

Pero podemos utilizar el mismo enfoque con esos otros tipos de datos, para lograr resultados que funcionan esencialmente según el mismo principio que el que acabamos de describir.

El uso de bucles es la esencia del enfoque adoptado en el desarrollo de muchas piezas diferentes de funcionalidad en el software actual.

Algunos ejemplos adicionales
Si estoy codificando un cliente de correo electrónico, obtendré algunos datos estructurados sobre los correos electrónicos que se mostrarán en la bandeja de entrada y luego usaré un bucle para mostrarlos de una manera bien formateada.

Si estoy codificando un sitio de comercio electrónico que vende automóviles, obtendré una fuente de datos bien estructurados sobre cada uno de los automóviles y luego recorreré esos datos para mostrarlos en la pantalla.

Si estoy codificando un calendario en línea, recorreré los datos contenidos en cada uno de los días para mostrar un calendario bien formateado.

Hay muchos, muchos otros ejemplos de uso de bucles en el código.

El uso de bucles con datos formateados correctamente para una tarea determinada es un componente crucial en la creación de software.

En las lecciones que siguen, aprenderemos sobre diferentes formas de agrupar datos relacionados y mostrarlos en la pantalla usando JavaScript.

Cuando se combina con lo que ya aprendió sobre bucles, esto le brinda las habilidades para crear varios tipos de interfaces de usuario donde hay información repetitiva.

Algunos ejemplos más específicos incluyen:

Recorrer los títulos de las publicaciones del blog en algunos datos estructurados y mostrar el título de cada publicación del blog en la página de inicio del blog

Recorrer publicaciones en redes sociales en algunos datos estructurados y mostrar cada publicación en redes sociales en función de algunas condiciones

Recorrer algunos datos estructurados sobre ropa disponible para la venta en una tienda de ropa en línea y mostrar datos relevantes para cada prenda de vestir

Ahora comprendes la importancia de saber cómo trabajar con bucles en JavaScript. En las próximas lecciones, aprenderemos más información relevante que te permitirá hacerlo.