# Ejercicio: instanciar un objeto personalizado
# Esta es su primera experiencia al crear clases y objetos en Python. Seguirá un proceso secuencial donde creará una clase, definirá su estado mediante variables y funciones para definir sus atributos y comportamiento, y luego creará instancias mediante alguna variable. Finalmente, utilizará los miembros de la clase para obtener el resultado deseado.

# Siga los pasos para construir y ejecutar su programa en el entorno proporcionado al final de la lectura.


# Paso 1
# 1.1 Defina una clase denominada MyFirstClass (Mi primera clase) .

# 1.2 Agregue una sentencia "print" dentro de ella como ¿Quién escribió esto? (¿Quién escribió esto?) .

# Paso 2
# Cree una variable de cadena denominada index e inicialícela con una cadena “Author-Book" (Autor-Libro) .

# Paso 3
# 3.1 Defina una función denominada hand_list () con la ayuda de la palabra clave def .

# 3.2 Pase el parámetro  self . Y luego pásele dos parámetros, filósofo (filósofo ) y libro (libro) .

# Paso 4
# 4.1 Escriba una sentencia "print" mediante la función print() y pase la variable "class" accediendo a ella.

# Sugerencia: se accede directamente a las variables de clase llamándola sobre el nombre de la clase mediante notación de puntos.

# 4.2 Escriba una sentencia "print" que dé resultados como: "Plato write the book: Republic" (Plato escribió el libro: República) donde "Plato" es el filósofo y "Republic" es el libro.

# Sugerencia: puede utilizar el operador de concatenación integrado ( + ) para unir estas cadenas.

# Paso 5
# 5.1 Cree e instancia un objeto de esa clase, denominado  whodunnit

# 5.2 Método de llamada hand_list() sobre este objeto "Whodunnit" y pásele dos valores "Sun Tzu" y "The Art of War".


class MyFirstClass :
    print("Who wrote this")
    index = "Author-Book"

    def hand_list (self, filosofo, book):
        print(MyFirstClass.index)
        print(f"{filosofo} write the book: {book}")

whodunnit = MyFirstClass()
whodunnit.hand_list("Sun Tzu", "The Art of War")

# Para añadir año de publicacion

# class MyFirstClass :
#     print("Who wrote this")
#     index = "Author-Book"

#     def hand_list (self, filosofo, book):
#         print(MyFirstClass.index)
#         print(f"{filosofo} write the book: {book}")

# whodunnit = MyFirstClass()
# whodunnit.hand_list("Sun Tzu", "The Art of War")