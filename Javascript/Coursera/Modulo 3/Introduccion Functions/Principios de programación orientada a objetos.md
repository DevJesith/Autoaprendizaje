La programación orientada a objetos (POO) en JavaScript se basa en conceptos como clases, objetos, herencia, encapsulamiento, y polimorfismo. Vamos a ver cada uno con ejemplos:

## Clases y Objetos
En JavaScript, disponemos de la palabra clave class para definir una clase. A partir de una clase, podemos crear múltiples objetos.


- Definición de una clase
class Animal {
    constructor(name, type) {
        this.name = name;
        this.type = type;
    }

    // Método de la clase
    describe() {
        console.log(`${this.name} es un ${this.type}`);
    }
}

- Creación de objetos
const animal1 = new Animal('Rex', 'perro');
const animal2 = new Animal('Whiskers', 'gato');

- Llamada a métodos de los objetos
animal1.describe(); // Rex es un perro
animal2.describe(); // Whiskers es un gato


## Herencia
La herencia permite que una clase (subclase) herede propiedades y métodos de otra clase (superclase), promoviendo la reutilización del código.


- Clase base
class Animal {
    constructor(name) {
        this.name = name;
    }

    speak() {
        console.log(`${this.name} hace un sonido.`);
    }
}

- Clase derivada
class Dog extends Animal {
    constructor(name) {
        super(name); // Llama al constructor de la clase base
    }

    speak() {
        console.log(`${this.name} ladra.`);
    }
}

const dog = new Dog('Rex');
dog.speak(); // Rex ladra.

## Encapsulamiento
El encapsulamiento es la práctica de mantener juntos los datos (propiedades) y los métodos que trabajan con esos datos, exponiendo solo lo necesario.


class Person {
    constructor(name, age) {
        this.name = name;
        this.#age = age;
    }

    #age; // Propiedad privada

    sayHello() {
        console.log(`Hola, me llamo ${this.name} y tengo ${this.#age} años.`);
    }
}

const person = new Person('Juan', 25);
person.sayHello(); // Hola, me llamo Juan y tengo 25 años.

## Polimorfismo
El polimorfismo permite que un método en una clase derivada tenga el mismo nombre que un método en la clase base, pero con comportamientos diferentes.


class Animal {
    makeSound() {
        console.log('El animal hace un sonido.');
    }
}

class Cat extends Animal {
    makeSound() {
        console.log('El gato maúlla.');
    }
}

class Dog extends Animal {
    makeSound() {
        console.log('El perro ladra.');
    }
}

const animals = [new Cat(), new Dog()];
animals.forEach(animal => animal.makeSound()); // El gato maúlla. / El perro ladra.
Resumen
Entonces, tenemos:

Clases para definir plantillas de objetos.

Objetos como instancias de clases.

Herencia para crear clases derivadas.

Encapsulamiento para ocultar detalles de implementación.

Polimorfismo para sobrescribir métodos.

¡Claro! La abstracción es una de las piedras angulares de la programación orientada a objetos (POO). Consiste en simplificar un sistema complejo al enfocarse solo en los aspectos más relevantes para el usuario, ocultando los detalles internos innecesarios y mostrando solo la funcionalidad esencial.

En términos simples, la abstracción nos permite representar conceptos y relaciones del mundo real en nuestro código de manera simplificada y lógica. Vamos a ver cómo funciona esto con un ejemplo práctico en JavaScript.

## Ejemplo de Abstracción
Supongamos que queremos representar un simple sistema de transacciones bancarias. Nos enfocaremos solo en las acciones esenciales, como depositar y retirar dinero, y mantendremos ocultos los detalles internos de la cuenta bancaria.


// Clase BankAccount que abstrae los detalles de una cuenta bancaria
class BankAccount {
    constructor(accountNumber, accountHolder, initialBalance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this._balance = initialBalance; // Propiedad privada por convención
    }

    // Método público para depositar dinero
    deposit(amount) {
        if (amount <= 0) {
            console.log("El monto a depositar debe ser mayor a cero.");
            return;
        }
        this._balance += amount;
        console.log(`Depósito exitoso. Nuevo saldo: ${this._balance}`);
    }

    // Método público para retirar dinero
    withdraw(amount) {
        if (amount > this._balance) {
            console.log("Fondos insuficientes.");
            return;
        }
        this._balance -= amount;
        console.log(`Retiro exitoso. Nuevo saldo: ${this._balance}`);
    }

    // Método público para verificar el saldo
    checkBalance() {
        console.log(`Saldo actual: ${this._balance}`);
    }
}

// Creación de objetos BankAccount
const myAccount = new BankAccount("12345678", "Juan Pérez", 1000);
myAccount.checkBalance(); // Saldo actual: 1000

myAccount.deposit(500); // Depósito exitoso. Nuevo saldo: 1500
myAccount.withdraw(200); // Retiro exitoso. Nuevo saldo: 1300
myAccount.withdraw(1500); // Fondos insuficientes.
myAccount.checkBalance(); // Saldo actual: 1300
En este ejemplo, la clase BankAccount abstrae los detalles de una cuenta bancaria. Los métodos deposit, withdraw, y checkBalance permiten interactuar con la cuenta sin exponer los detalles internos del balance directo.

Beneficios de la Abstracción
Simplicidad: Hace que tu código sea más limpio y fácil de entender.

Mantenibilidad: Los cambios en la implementación interna no afectan a las partes del código que utilizan la abstracción.

Reutilización: Provees una interfaz común para diferentes sistemas, lo que facilita la reutilización del código.