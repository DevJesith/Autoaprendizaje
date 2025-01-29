/*
Tareas a completar

Crea un nuevo literal de matriz vacío y asígnalo a la variable ropa.

Añade 5 de tus prendas favoritas como cadenas usando el método push() .

Retire la quinta prenda de ropa de la matriz utilizando el método pop() .

Añade una nueva prenda de ropa usando el método push() .

Utilice console.log para mostrar el tercer elemento de la matriz de ropa en la consola.

Crea un nuevo objeto literal vacío y asígnalo a la variable favCar .

Usando la notación de puntos, asigne una propiedad de color al objeto favCar y asígnele un valor de cadena con el color de su elección.

Usando la notación de puntos, asigne una propiedad convertible al objeto favCar y asígnele un valor booleano de su elección.

Utilice la consola para registrar todo el objeto favCar . */

var clothes = [];
clothes.push("Nike", "Puma", "Adidas", "Supreme", "Vintage");
clothes.pop();
clothes.push("Gucci");
console.log(clothes[2]);

var favCar = {};
favCar.color = "Red";
favCar.convertible = "Ferrari";
console.log(favCar);