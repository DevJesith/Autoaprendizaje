// Task 1: Code a Person class
class Person {
    constructor(name = "Tom", age = 20 , energy = 100) {
        this.name = name;
        this.age = age;
        this.energy = energy;
    }

    sleep() {
        this.energy += 10;
        console.log(`Cuando ${this.name} duerme su energia aumenta ${this.energy} puntos `)
    }

    doSomethingFun() {
        this.energy -= 10;
        console.log(`Cuando ${this.name} hace algo fun decrementa a ${this.energy} energy`)
    }

}

// Task 2: Code a Worker class

class Worker extends Person {
    constructor( name, age, energy, xp = 0, hourlyWage = 10) {
        super(name, age, energy);
        this.xp = xp;
        this.hourlyWage = hourlyWage;
    }

    gotoWork() {
        this.xp += 10;
        console.log(`Cuando ${this.name}, trabaja aumenta ${this.xp} y su hora de trabajo es ${this.hourlyWage} por hora`)
    }
}

// Task 3: Code an intern object, run methods
function intern() {
    let intern = new Worker("Bob", 21, 110, 0, 10);
    intern.gotoWork();
    return intern;
}

// Task 4: Code a manager object, methods
function manager() {
    const manager = new Worker("Alice", 30, 120, 100, 30)
    manager.doSomethingFun();
    return manager;
}

const newIntern = intern();
const newManager = manager();

console.log(newIntern);
console.log(newManager);
