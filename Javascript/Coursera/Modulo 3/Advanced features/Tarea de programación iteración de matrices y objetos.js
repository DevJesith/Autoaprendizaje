// Task 1

var dairy = ['cheese', 'sour cream', 'milk', 'yogurt', 'ice cream', 'milkshake']

function logDairy() {
    for (const items of Object.keys(dairy)) {
        console.log(dairy[items])
    }
}

logDairy();

// Task 2

const animal = {

canJump: true

};

const bird = Object.create(animal);

bird.canFly = true;

bird.hasFeathers = true;

function birdCan() {
    for (const prop of Object.keys(bird)) {
        console.log(prop + ": " + bird[prop])
    }
}

birdCan();

// Task 3

function animalCan() {
    for (const prop of Object.keys(bird)) {
        console.log(prop + ": " + bird[prop])
    }

    for (const key in animal) {
        console.log(key + ": " + animal[key])
    }
}

animalCan();