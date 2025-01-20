## Creando clases

Todos los objetos que se construyen a partir del prototipo comparten la misma funcionalidad.

Cuando necesite codificar relaciones OOP más complejas, puede utilizar la  palabra clave "class"  y su sintaxis fácil de entender y razonar.
Imagina que necesitas codificar una  clase Train  .
Una vez que haya codificado esta clase, podrá utilizar la palabra clave  new  para crear instancias de objetos de la  clase Train  .

Por ahora, sin embargo, primero debes definir la  clase Train  , utilizando la siguiente sintaxis:

class Train {}

Entonces, utiliza la  palabra clave class  , luego especifica el nombre de tu clase, con la primera letra en mayúscula, y luego agrega una llave de apertura y otra de cierre.

- Entre las llaves, el primer fragmento de código que debes definir es el  constructor :

class Train {
    constructor() {

    }
}

El  constructor  se utilizará para construir propiedades en la futura instancia del objeto de la  clase Train  .

Por ahora, digamos que solo hay dos propiedades que cada instancia de objeto de la  clase Train  debe tener en el momento en que se instancia:  color y  lightsOn .

class Train {
    constructor(color, lightsOn) {
        this.color = color;
        this.lightsOn = lightsOn;
    }
}

Observe la sintaxis del constructor. El constructor es una función especial en mi   clase Train .

- En primer lugar, observe que no hay ninguna  palabra clave function  . Observe también que   se utiliza  la palabra clave constructor para definir esta función. Debe proporcionar los parámetros de la función constructora  dentro de un paréntesis de apertura y cierre, al igual que en las funciones normales. Los nombres de los parámetros son  color  y  lightsOn .  

A continuación, dentro del cuerpo de la  función constructora  , asignó el   valor del parámetro  color pasado a this.color y el  valor del parámetro  lightsOn pasado  a this.lightsOn .

¿Qué representa esta  palabra  clave aquí?

Es la futura instancia del objeto de la   clase Train .

Básicamente, este es todo el código que necesitas escribir para lograr dos cosas:

Este código me permite  construir nuevas instancias de la   clase Train .

Cada instancia de objeto de la  clase Train  que construya tendrá sus propias propiedades personalizadas de  color  y  lightsOn .

Ahora, para construir una nueva instancia de la  clase Train  , necesito usar la siguiente sintaxis:

new Train()

Dentro de los paréntesis, debe pasar valores como  "rojo" y  falso , por ejemplo, lo que significa que la  propiedad color  se establece en  "rojo" y la   propiedad  lightsOn se establece en falso .

Y, para poder interactuar con el nuevo objeto construido de esta manera, es necesario asignarlo a una variable.

Juntándolo todo, aquí está tu primer tren:

var myFirstTrain = new Train('red', false);

Al igual que cualquier otra variable, ahora puedes, por ejemplo, registrar en la consola el   objeto myFirstTrain :

console.log(myFirstTrain); // Train {color: 'red', lightsOn: false}

Puedes seguir creando instancias de la  clase Train  . Incluso si les asignas exactamente las mismas propiedades, seguirán siendo objetos separados.

var mySecondTrain = new Train('blue', false);
var myThirdTrain = new Train('blue', false);

Sin embargo, esto no es todo lo que las clases pueden ofrecer.

- También puedes agregar métodos a las clases, y estos métodos serán compartidos por todos los futuros objetos de instancia de mi  clase Train  .

Por ejemplo:

class Train {
    constructor(color, lightsOn) {
        this.color = color;
        this.lightsOn = lightsOn;
    }
    toggleLights() {
        this.lightsOn = !this.lightsOn;
    }
    lightsStatus() {
        console.log('Lights on?', this.lightsOn);
    }
    getSelf() {
        console.log(this);
    }
    getPrototype() {
        var proto = Object.getPrototypeOf(this);
        console.log(proto);
    }
}

Ahora, hay cuatro métodos en tu   clase 
Train : toggleLights() ,  lightsStatus() ,   getSelf()  y  getPrototype() .

* El  método toggleLights  utiliza el operador lógico not,  ! . Este operador cambiará el valor almacenado en la  propiedad lightsOn  del futuro objeto de instancia de la   clase  Train ; de ahí el !this.lightsOn . Y el  operador =  a su izquierda significa que se asignará a  this.lightsOn , lo que significa que se convertirá en el nuevo valor de la  propiedad lightsOn  en ese objeto de instancia determinado.

* El   método  lightsStatus() de la clase Train  solo informa el estado actual de la  variable lightsOn  de una instancia de objeto determinada.

* El  método getSelf()  imprime las propiedades en la instancia del objeto en el que se llama.

* La  consola getPrototype()  registra el prototipo de la instancia de objeto de la  clase Train  . El prototipo contiene todas las propiedades compartidas por todas las instancias de objeto de la  clase Train  . Para obtener el prototipo, deberá utilizar  el método Object.getPrototypeOf() integrado de JavaScript  y pasarle  este  objeto, es decir, la instancia de objeto dentro de la cual se invoca este método.

Ahora puedes construir un tren completamente nuevo usando esta  clase de Tren actualizada  :

var train4 = new Train('red', false);

Y ahora, puedes ejecutar cada uno de sus métodos, uno tras otro, para confirmar su comportamiento:

train4.toggleLights(); // undefined
train4.lightsStatus(); // Lights on? true
train4.getSelf(); // Train {color: 'red', lightsOn: true}
train4.getPrototype(); // {constructor: f, toggleLights: f, ligthsStatus: f, getSelf: f, getPrototype: f}

* El resultado de llamar  a toggleLights()  es el cambio de verdadero a falso y viceversa, para la   propiedad lightsOn .

* El resultado de llamar  a lightsStatus()  es el registro de la consola del valor de la  propiedad lightsOn  .

* El resultado de llamar  a getSelf()  es que la consola registra toda la instancia del objeto en la que   se llama al método  getSelf() . En este caso, el objeto devuelto es el objeto train4  . Observe que este objeto se devuelve solo con las propiedades ("datos") que se crearon utilizando la   función  constructor() de la clase Train  . Esto se debe a que todos los métodos de la  clase Train  no "viven" en ninguno de los objetos de instancia de la  clase Train  ; en cambio, viven en el prototipo, como se confirmará en el siguiente párrafo.

* Finalmente, el resultado de llamar al  método getPrototype()  es el registro en la consola de todas las propiedades del  prototipo . Cuando   se utiliza la sintaxis  de clase en JavaScript, esto da como resultado que solo se almacenen los métodos compartidos en el prototipo , mientras que la  función constructor()  configura el mecanismo para guardar valores específicos de la instancia ("datos") en el momento de la instanciación del objeto.

- Por lo tanto, en conclusión, la sintaxis de clases en JavaScript nos permite separar claramente los datos de los objetos individuales (que existen en la instancia del objeto en sí) de la funcionalidad compartida del objeto (métodos), que existen en el prototipo y son compartidos por todas las instancias del objeto.

Sin embargo, esta no es toda la historia.

- Es posible implementar polimorfismo mediante clases en JavaScript, heredando de la clase base y luego anulando el comportamiento heredado. Para entender cómo funciona esto, es mejor usar un ejemplo.

# Con herencia 

En el código que sigue, observará que se está codificando otra clase, que se llama  HighSpeedTrain y hereda de la   clase Train .

Esto convierte a la  clase Train  en una clase base o la superclase de la  clase HighSpeedTrain  . En otras palabras, la  clase HighSpeedTrain  se convierte en la subclase de la  clase Train  , porque hereda de ella.

Para heredar de una clase a una nueva subclase, JavaScript proporciona la  palabra clave extends  , que funciona de la siguiente manera:

class HighSpeedTrain extends Train {
}

Como en el ejemplo anterior, la sintaxis de la subclase es coherente con la definición de la clase base en JavaScript. La única adición aquí es la  palabra clave extends  y el nombre de la clase de la que hereda la subclase.

Ahora puedes describir cómo  funciona HighSpeedTrain  . Nuevamente, puedes comenzar definiendo su función constructora:

class HighSpeedTrain extends Train {
    constructor(passengers, highSpeedOn, color, lightsOn) {
        super(color, lightsOn);
        this.passengers = passengers;
        this.highSpeedOn = highSpeedOn;
    }
}

Observe la ligera diferencia en la sintaxis del constructor de la  clase HighSpeedTrain  , es decir, el uso de la  palabra clave super  .

- En las clases de JavaScript,  super  se utiliza para especificar qué propiedad se hereda de la superclase en la subclase.

- En este caso, elijo heredar ambas propiedades de la   superclase  Train en la  subclase HighSpeedTrain .

Estas propiedades son  color  y  lightsOn .

A continuación, agrega las propiedades adicionales de la clase HighSpeedTrain dentro de su constructor, es decir, las propiedades passenger y highSpeedOn.

- A continuación, dentro del cuerpo del constructor, se utiliza la  palabra clave super  y se pasan las propiedades heredadas  color  y  lightsOn  que provienen de la  clase Train  . En las líneas siguientes, se asigna  passenger  a  this.passengers y  highSpeedOn  a  this.highSpeedOn .

* Tenga en cuenta que, además de las propiedades heredadas, también  hereda automáticamente  todos los métodos que existen en el   prototipo  Train , es decir, los métodos toggleLights() ,  lightsStatus() ,  getSelf() y  getPrototype()  .

Ahora agreguemos otro método que será específico de la  clase HighSpeedTrain  : el  método toggleHighSpeed()  .

class HighSpeedTrain extends Train {
    constructor(passengers, highSpeedOn, color, lightsOn) {
        super(color, lightsOn);
        this.passengers = passengers;
        this.highSpeedOn = highSpeedOn;
    }
    toggleHighSpeed() {
        this.highSpeedOn = !this.highSpeedOn;
        console.log('High speed status:', this.highSpeedOn);
    }
}

Además, imagina que te diste cuenta de que no te gusta cómo funciona el  método toggleLights()  de la superclase y quieres implementarlo de forma un poco diferente en la subclase. Puedes agregarlo dentro de la  clase HighSpeedTrain  .

class HighSpeedTrain extends Train {
    constructor(passengers, highSpeedOn, color, lightsOn) {
        super(color, lightsOn);
        this.passengers = passengers;
        this.highSpeedOn = highSpeedOn;
    }
    toggleHighSpeed() {
        this.highSpeedOn = !this.highSpeedOn;
        console.log('High speed status:', this.highSpeedOn);
    }
    toggleLights() {
        super.toggleLigths();
        super.lightsStatus();
        console.log('Lights are 100% operational.');
    }
}

Entonces, ¿cómo anulaste el comportamiento del  método toggleLights() original  ?

Bueno, en la superclase, el  método toggleLights()  se definió de la siguiente manera:

toggleLights() {
    this.lightsOn = !this.lightsOn;
}

Se dio cuenta de que el  método HighSpeedTrain  debería reutilizar el comportamiento existente del  método toggleLights() original  y, por lo tanto, utilizó la  sintaxis super.toggleLights()  para heredar todo el método de la superclase.

A continuación, también hereda el comportamiento del método lightsStatus() de la superclase   , porque se da cuenta de que desea tener el estado actualizado de la  propiedad lightsOn  registrado en la consola, siempre que invoque el  método toggleLights()  en la subclase.

Por último, también agrega la tercera línea en el método toggleLights() reimplementado   , es decir:

console.log('Lights are 100% operational.');

Agregó esta tercera línea para mostrar que puedo combinar el código del método "prestado" de la superclase con su propio código personalizado en la subclase.

Ahora estás listo para construir algunos objetos de tren.

var train5 = new Train('blue', false);
var highSpeed1 = new HighSpeedTrain(200, false, 'green', false);

Ha creado el   objeto  train5 de la clase Train  y ha establecido su  color  en  "azul"  y sus  luces  en  falso .

A continuación, ha creado el   objeto  highSpeed1 para la  clase  HighSpeedTrain , estableciendo passenger  en  200 ,  highSpeedOn  en  false ,  color  en  "green" y lightsOn en false.

Ahora puedes probar el comportamiento de  train5 , llamando, por ejemplo, al  método toggleLights()  y luego al  método lightsStatus()  :

train5.toggleLights(); // undefined
train5.lightsStatus(); // Lights on? true

Aquí está el código completo y completo para esta lección:


class Train {
    constructor(color, lightsOn) {
        this.color = color;
        this.lightsOn = lightsOn;
    }
    toggleLights() {
        this.lightsOn = !this.lightsOn;
    }
    lightsStatus() {
        console.log('Lights on?', this.lightsOn);
    }
    getSelf() {
        console.log(this);
    }
    getPrototype() {
        var proto = Object.getPrototypeOf(this);
        console.log(proto);
    }
}

class HighSpeedTrain extends Train {
    constructor(passengers, highSpeedOn, color, lightsOn) {
        super(color, lightsOn);
        this.passengers = passengers;
        this.highSpeedOn = highSpeedOn;
    }
    toggleHighSpeed() {
        this.highSpeedOn = !this.highSpeedOn;
        console.log('High speed status:', this.highSpeedOn);
    }
    toggleLights() {
        super.toggleLights();
        super.lightsStatus();
        console.log('Lights are 100% operational.');
    }
}

var myFirstTrain = new Train('red', false);
console.log(myFirstTrain); // Train {color: 'red', lightsOn: false}
var mySecondTrain = new Train('blue', false);
var myThirdTrain = new Train('blue', false);

var train4 = new Train('red', false);
train4.toggleLights(); // undefined
train4.lightsStatus(); // Lights on? true
train4.getSelf(); // Train {color: 'red', lightsOn: true}
train4.getPrototype(); // {constructor: f, toggleLights: f, ligthsStatus: f, getSelf: f, getPrototype: f}

var train5 = new Train('blue', false);
var highSpeed1 = new HighSpeedTrain(200, false, 'green', false);

train5.toggleLights(); // undefined
train5.lightsStatus(); // Lights on? true
highSpeed1.toggleLights(); // Lights on? true, Lights are 100% operational.

Observe cómo el   método  toggleLights() se comporta de manera diferente en la clase HighSpeedTrain  que en la  clase Train  .

Además, ayuda a visualizar lo que está sucediendo obtener el prototipo de los  trenes train5  y  highSpeed1 :

train5.getPrototype(); // {constructor: ƒ, toggleLights: ƒ, lightsStatus: ƒ, getSelf: ƒ, getPrototype: ƒ}
highSpeed1.getPrototype(); // Train {constructor: ƒ, toggleHighSpeed: ƒ, toggleLights: ƒ}

Los valores devueltos en este caso pueden parecer inicialmente un poco difíciles de comprender, pero en realidad son bastante simples:

El objeto prototipo del  objeto train5  se creó cuando definió la clase  Train . Puede acceder al prototipo mediante  la sintaxis Train.prototype  y recuperar el objeto prototipo.

El objeto prototipo del  objeto highSpeed1  es este objeto: {constructor: ƒ, toggleHighSpeed: ƒ, toggleLights: ƒ} . A su vez, este objeto tiene su propio prototipo, que se puede encontrar utilizando la siguiente sintaxis:  HighSpeedTrain.prototype.__proto__ . Al ejecutar este código, se devuelve:  {constructor: ƒ, toggleLights: ƒ, lightsStatus: ƒ, getSelf: ƒ, getPrototype: ƒ} .

Los prototipos parecen fáciles de comprender en un cierto nivel, pero es fácil perderse en la complejidad. Esta es una de las razones por las que la sintaxis de clases en JavaScript mejora tu experiencia como desarrollador, al hacer que sea más fácil razonar sobre las relaciones entre clases. Sin embargo, a medida que mejoras tus habilidades, siempre debes esforzarte por comprender mejor tus herramientas, y esto incluye los prototipos. Después de todo, JavaScript es solo una herramienta y ahora has "echado un vistazo detrás de la cortina".

En esta lectura, aprendiste la esencia misma de cómo funciona la programación orientada a objetos con clases en JavaScript. Sin embargo, eso no es todo.


# Usar una instancia de clase como propiedad del constructor de otra clase

En la lección sobre el diseño de un programa orientado a objetos, aprenderá algunos conceptos más útiles. Estos tienen que ver principalmente con la codificación de sus clases para que sea aún más fácil crear instancias de objetos de esas clases en JavaScript.

class StationaryBike {
    constructor(position, gears) {
        this.position = position
        this.gears = gears
    }
}

class Treadmill {
    constructor(position, modes) {
        this.position = position
        this.modes = modes
    }
}

class Gym {
    constructor(openHrs, stationaryBikePos, treadmillPos) {
        this.openHrs = openHrs
        this.stationaryBike = new StationaryBike(stationaryBikePos, 8)
        this.treadmill = new Treadmill(treadmillPos, 5)
    }
}

var boxingGym = new Gym("7-22", "right corner", "left corner")

console.log(boxingGym.openHrs) //
console.log(boxingGym.stationaryBike) //
console.log(boxingGym.treadmill) //

En este ejemplo, hay tres clases definidas: StationaryBike , Treadmill y Gym .

La clase StationaryBike está codificada de modo que su futura instancia de objeto tenga las propiedades position y gears . La propiedad position describe dónde se colocará la bicicleta fija dentro del gimnasio, y la propiedad gears indica la cantidad de marchas que debe tener esa bicicleta fija.

La clase Treadmill también tiene una posición y otra propiedad, denominada modos (como en "modos de ejercicio").

La clase Gym tiene tres parámetros en su función constructora: openHrs , stationaryBikePos , treadmillPos .

Este código me permite instanciar un nuevo objeto de instancia de la clase Gym , y luego cuando lo inspecciono, obtengo la siguiente información:

La propiedad openHrs es igual a "7-22" (es decir, de 7 a. m. a 10 p. m.)

La propiedad stationaryBike es un objeto del tipo StationaryBike , que contiene dos propiedades: posición y marchas

La propiedad de la cinta de correr es un objeto del tipo Cinta de correr , que contiene dos propiedades: posición y modos

