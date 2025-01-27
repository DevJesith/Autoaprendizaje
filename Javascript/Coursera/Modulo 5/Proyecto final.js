// Funcionalidad del código
// El ejercicio consiste en dos funciones principales, getPrices() y getDiscount(), que trabajan juntas para calcular y mostrar los precios de una lista de platos, con o sin impuesto, y aplicar descuentos basados en la cantidad de invitados.

// Variables proporcionadas
const dishData = [
    {
      name: "Italian pasta",
      price: 9.55
    },
    {
      name: "Rice with veggies",
      price: 8.65
    },
    {
      name: "Chicken with potatoes",
      price: 15.55
    },
    {
      name: "Vegetarian Pizza",
      price: 6.45
    },
];
const tax = 1.20;

// dishData es una lista de objetos, cada uno representando un plato con su nombre y precio.

// tax representa el multiplicador de impuesto (en este caso, 20%).
  
  // Implementación de getPrices()
function getPrices(taxBoolean) {
    for (let i = 0; i < dishData.length; i++) { 
      let finalPrice;
      if (taxBoolean === true) { // Usa tres signos de igualdad para comparación estricta
        finalPrice = dishData[i].price * tax;
      }
      else if (taxBoolean === false) {
        finalPrice = dishData[i].price;
      }
      else {
        console.log("You need to pass a boolean to the getPrices call!");
        return; // "jump out" reemplazado por return
      }
      console.log(`Dish: ${dishData[i].name} Price: $${finalPrice.toFixed(2)}`); // Asegúrate de incluir el espacio antes de "Price"
    }
}

// Recorre cada objeto en dishData usando un bucle for.

// Declara la variable finalPrice sin asignarle un valor inicial.

// Aplica el impuesto si taxBoolean es true y asigna el precio con impuesto a finalPrice.

// Usa el precio base si taxBoolean es false y asigna ese precio a finalPrice.

// Imprime un mensaje de error y retorna si taxBoolean no es true ni false.

// Muestra en consola cada plato con su precio final, asegurando que los precios se muestren con dos decimales.
  
  // Implementación de getDiscount()
function getDiscount(taxBoolean, guests) {
    getPrices(taxBoolean);
    if (typeof guests === "number" && guests > 0 && guests < 30) { // Comprobación ajustada según salida del método typeof
      let discount = 0;
      if (guests < 5) {
        discount = 5;
        console.log(`Discount is: $${discount}`);
      }
      else if (guests >= 5) {
        discount = 10;
        console.log(`Discount is: $${discount}`);
      }
    }
    else {
      console.log("The second argument must be a number between 0 and 30");
    }
}
  
  // Llamadas a la función getDiscount()
getDiscount(true, 2);
getDiscount(false, 10);

// Invoca la función getPrices() con taxBoolean como argumento para mostrar todos los platos con sus precios.

// Verifica defensivamente que guests sea un número y esté entre 1 y 29 (inclusive).

// Declara la variable discount y asigna 0 inicialmente.

// Asigna un descuento de $5 si guests es menor que 5.

// Asigna un descuento de $10 si guests es 5 o mayor.

// Muestra un mensaje de error si guests no cumple con las condiciones de rango.

// Llama a la función getDiscount() con diferentes valores para probar su comportamiento.

// Resumen de la funcionalidad
// getPrices() calcula y muestra los precios de los platos, aplicando o no el impuesto según el valor booleano proporcionado.

// getDiscount() aplica descuentos basados en el número de invitados y asegura que el parámetro de invitados esté dentro de un rango válido, mientras gestiona correctamente la visualización de los precios con o sin impuestos.