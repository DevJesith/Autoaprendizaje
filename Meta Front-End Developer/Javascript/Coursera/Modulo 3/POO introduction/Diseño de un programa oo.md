- Este código en JavaScript muestra cómo utilizar la Programación Orientada a Objetos (POO) con clases y herencia para modelar una jerarquía de animales. Vamos a explicarlo paso a paso.

* 📌 Conceptos Claves
- class: Define una clase, que es una plantilla para crear objetos.

- extends: Permite que una clase herede de otra (herencia).

- super: Llama al constructor o métodos de la clase padre en una subclase.

- Encapsulación: Cada clase tiene sus propias propiedades y métodos.

## 📚 Estructura de la Jerarquía

        Animal
       /      \
     Cat      Bird
     /   \       \
  HouseCat Tiger  Parrot



## 🔹 Clase Base: Animal
La clase Animal representa a cualquier animal y tiene:

* Propiedades:
    - color
    - energy
* Métodos:
    - isActive(): Reduce la energía hasta 0 y luego llama a sleep().
    - sleep(): Aumenta la energía.
    - getColor(): Muestra el color del animal.

class Animal {
    constructor(color = 'yellow', energy = 100) {
        this.color = color;
        this.energy = energy;
    }
    isActive() {
        if (this.energy > 0) {
            this.energy -= 20;
            console.log('Energy is decreasing, currently at:', this.energy);
        } else {
            this.sleep();
        }
    }
    sleep() {
        this.energy += 20;
        console.log('Energy is increasing, currently at:', this.energy);
    }
    getColor() {
        console.log(this.color);
    }
}



## 🔹 Clase Cat y Bird (Herencia de Animal)
Cada subclase hereda color y energy, y añade sus propias propiedades y métodos.

class Cat extends Animal {
    constructor(sound = 'purr', canJumpHigh = true, canClimbTrees = true, color, energy) {
        super(color, energy); // Llama al constructor de Animal
        this.sound = sound;
        this.canJumpHigh = canJumpHigh;
        this.canClimbTrees = canClimbTrees;
    }
    makeSound() {
        console.log(this.sound);
    }
}

class Bird extends Animal {
    constructor(sound = 'chirp', canFly = true, color, energy) {
        super(color, energy);
        this.sound = sound;
        this.canFly = canFly;
    }
    makeSound() {
        console.log(this.sound);
    }
}

* Cat puede hacer sonido (purr por defecto) y tiene habilidades (canJumpHigh, canClimbTrees).
* Bird puede hacer sonido (chirp por defecto) y puede o no volar (canFly)

## 🔹 Subclases más específicas
Las subclases heredan de Cat o Bird y agregan características únicas.

🏠 HouseCat (gato doméstico)

class HouseCat extends Cat {
    constructor(houseCatSound = "meow", sound, canJumpHigh, canClimbTrees, color, energy) {
        super(sound, canJumpHigh, canClimbTrees, color, energy);
        this.houseCatSound = houseCatSound;
    }
    makeSound(option) {
        if (option) {
            super.makeSound(); // Llama al makeSound() de `Cat`
        }
        console.log(this.houseCatSound);
    }
}

- Puede hacer dos sonidos (purr de Cat y meow propio).
- Si option es true, hace ambos sonidos.

## 🐅 Tiger

class Tiger extends Cat {
    constructor(tigerSound = "Roar!", sound, canJumpHigh, canClimbTrees, color, energy) {
        super(sound, canJumpHigh, canClimbTrees, color, energy);
        this.tigerSound = tigerSound;
    }
    makeSound(option) {
        if (option) {
            super.makeSound();
        }
        console.log(this.tigerSound);
    }
}


* Similar a HouseCat, pero su sonido especial es Roar!.

## 🦜 Parrot (loro)

class Parrot extends Bird {
    constructor(canTalk = false, sound, canFly, color, energy) {
        super(sound, canFly, color, energy);
        this.canTalk = canTalk;
    }
    makeSound(option) {
        if (option) {
            super.makeSound();
        }
        if (this.canTalk) {
            console.log("I'm a talking parrot!");
        }
    }
}


* Si canTalk es true, puede hablar además de hacer su sonido normal.

# 🚀 Ejemplo de Uso

var polly = new Parrot(true); // Loro que habla
var fiji = new Parrot(false); // Loro que NO habla

polly.makeSound(); // "I'm a talking parrot!"
polly.makeSound(true); // "chirp", "I'm a talking parrot!"

var leo = new HouseCat();
leo.makeSound(false); // "meow"
leo.makeSound(true); // "purr", "meow"

var cuddles = new Tiger();
cuddles.makeSound(false); // "Roar!"
cuddles.makeSound(true); // "purr", "Roar!"

## 🎯 Resumen
✅ Herencia: extends permite que una clase herede de otra.
✅ Uso de super: Permite acceder a métodos y propiedades de la clase padre.
✅ Jerarquía clara: Animal → Cat & Bird → HouseCat, Tiger, Parrot.
✅ Métodos personalizados: Cada clase tiene comportamientos distintos.

Este enfoque de POO permite modelar estructuras complejas de forma organizada y reutilizable. 🚀