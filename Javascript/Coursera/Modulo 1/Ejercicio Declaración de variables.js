/* En este ejercicio, practicará la declaración de variables.

    Para comprobar el resultado de su código, introdúzcalo en el cuadro de texto provisto y haga clic en el botón "Ejecutar". Esto ejecutará el código y mostrará el resultado.

    Tareas
    Declara una nueva variable llamada petDog y asígnale el nombre Rex .

    Declare una nueva variable llamada petCat y asígnele el nombre Pepper .

    Registra la variable petDog en la consola.

    Registra la   variable petCat en la consola.

    Registra lo siguiente en la consola: el texto "El nombre de mi mascota es: " y la variable petDog .

    Registra lo siguiente en la consola: el texto "El nombre de mi gato es: " y la variable petCat .

    Declara otra variable y nómbrala catSound . Asígnale la cadena "purr" .

    Declara otra variable y nómbrala dogSound . Asígnale la cadena "woof" .

    Registre lo siguiente en la consola: la variable petDog , luego la cadena "says" , luego la variable dogSound .

    Registre lo siguiente en la consola: la variable petCat , luego la cadena "says" , luego la variable catSound .

    Reasigne el valor almacenado en catSound a la cadena "miau" .

    Registre lo siguiente en la consola: la variable petCat , luego la cadena "ahora dice" , luego la variable catSound .*/

    var petDog = Rex;
    var petCat = Pepper;
    console.log("El nombre de mi mascota es: ", petDog);
    console.log("El nombre de mi mascota es: ", petCat);
    var catSound = "purr";
    var dogSound = "woof";
    console.log(petDog, "says", dogSound);
    console.log(petCat, "says", catSound);
    catSound = "miau";
    console.log(petCat, "ahora dice", catSound);