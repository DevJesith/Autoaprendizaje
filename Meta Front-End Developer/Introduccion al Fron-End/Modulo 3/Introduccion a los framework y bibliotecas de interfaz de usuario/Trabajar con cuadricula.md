## Introducción

En este ejercicio, practicará la creación de una página web utilizando Bootstrap Grid.

## Meta
* Crea un menú de comida de dos columnas para Little Lemon.

## Objetivos
* Configurar el contenedor Bootstrap.
* Muestra el logotipo de Little Lemon en la parte superior central de la página web usando Bootstrap.
* Muestra el menú de comida en dos columnas usando Bootstrap Grid.

## Instrucciones

1. Paso 1: Abra index.html

2. Paso 2: Agrega un elemento div dentro del elemento body. Este div será el contenedor de Bootstrap.

3. Paso 3: Agrega el atributo de clase a este elemento con el valor contenedor.

```html
<body>
    <div class="container">
    </div>
</body>
```
4. Paso 4: Agrega tres elementos div al elemento contenedor de Bootstrap. Cada uno de estos elementos div será una fila de Bootstrap. Agrega el atributo de clase a este elemento con la fila de valor.


```html
<body>
    <div class="container">
        <div class="row">
        </div>
        <div class="row">
        </div>
        <div class="row">
        </div>
    </div>
</body>
```

5. Paso 5: La primera fila contendrá el logotipo de Little Lemon. Agregue un elemento div a la primera fila.

6. Paso 6: Agrega el atributo de clase a este elemento con el valor col-12. Esto ocupará 12 espacios de columna.

```html
<body>
    <div class="container">
        <div class="row">
            <div class="col-12">
            </div>
        </div>
        <div class="row">
        </div>
        <div class="row">
        </div>
    </div>
</body>
```

7. Paso 7: Agrega otro elemento div al elemento col-12.

8. Paso 8: Agrega el atributo de clase a este elemento con el valor text-center. Esto te permitirá centrar el logotipo.

```html
<body>
    <div class="container">
        <div class="row">
            <div class="col-12">
                <div class="text-center">
                </div>
            </div>
        </div>
        <div class="row">
        </div>
    </div>
</body>
```

9. Paso 9: agregue un elemento de imagen en el elemento text-center con la clase img-fluid aplicada a él.

```html
<body>
    <div class="container">
        <div class="row">
            <div class="col-12">
                <div class="text-center">
                    <img src="logo.png" class="img-fluid">
                </div>
            </div>
        </div>
        <div class="row">
    </div>
</body>
```

10. Paso 10: En la segunda fila, agregue otro elemento div con la clase col-12.

```html
<body>
    <div class="container">
        <div class="row">
            <div class="col-12">
                <div class="text-center">
                    <img src="logo.png" class="img-fluid">
                </div>
            </div>
        </div>
        <div class="row">
    </div>
</body>
```

11. Paso 11: Agregue un elemento div a la columna y aplique la clase text-center.

```html
<body>
    <div class="container">
        <div class="row">
            <div class="col-12">
                <div class="text-center">
                    <img src="logo.png" class="img-fluid">
                </div>
            </div>
        </div>
        <div class="row">
    </div>
</body>
```

12. Paso 9: Dentro del elemento, agrega un elemento h1 con el texto Nuestro Menú.

```html
<body>
    <div class="container">
        <div class="row">
            <div class="col-12">
                <div class="text-center">
                    <img src="logo.png" class="img-fluid">
                </div>
            </div>
        </div>
        <div class="row">
    </div>
</body>
```

13. Paso 13: Agrega dos elementos div en la fila final.

14. Paso 14: Agregue un atributo de clase a cada elemento con el valor col-12 col-lg-6.

```html
<body>
    <div class="container">
        <div class="row">
            <div class="col-12">
                <div class="text-center">
                    <img src="logo.png" class="img-fluid">
                </div>
            </div>
        </div>
        <div class="row">
    </div>
</body>
```

15. Paso 15: Agregue los siguientes elementos en el primer elemento col-12 col-lg-6:


* Un elemento h2 que contiene el texto Falafel.

* Un elemento de párrafo que contiene el texto Garbanzo, hierbas, especias.

* Un elemento h2 que contiene el texto Calamares fritos.

* Un elemento de párrafo que contiene el texto Calamar, suero de leche.

16. Paso 16: Agrega los siguientes elementos en el segundo elemento col-12 col-lg-6:

* Un elemento h2 que contiene el texto Ensalada de pasta.

* Un elemento de párrafo que contiene el texto Lechuga, verduras, mozzarella.

* Un elemento h2 que contiene el texto Ensalada Griega.

* Un elemento de párrafo que contiene el texto Pepinos, cebolla, queso feta.

```html
<body>
    <div class="container">
        <div class="row">
            <div class="col-12">
                <div class="text-center">
                    <img src="logo.png" class="img-fluid">
                </div>
            </div>
        </div>
        <div class="row">
    </div>
</body>
```

17. Paso 17: Guarde el archivo.