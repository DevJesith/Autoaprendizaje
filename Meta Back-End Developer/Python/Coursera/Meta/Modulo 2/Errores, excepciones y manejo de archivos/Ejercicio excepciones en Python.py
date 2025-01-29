# Ejercicio
# Su tarea en este ejercicio es agregar código para atrapar excepciones y gestionarlas de modo más sencillo para el usuario. 


# IndexError
# El siguiente código presenta un problema. Intenta localizar un elemento de la lista que no existe. Al ejecutar el código se generará IndexError. Agregue la gestión de excepciones para evitar que se produzca el error y se devuelva un mensaje más sencillo para el usuario, como "El elemento no existe en la lista".

# Starter code
items = [1,2,3,4,5]

try:
    item = items[6]
    print(item)
except :
    print("El elemento no existe en la lista ")

# ZeroDivisionError
# En matemáticas existen reglas sobre dividir por cero. El siguiente código intenta hacerlo y mostrará un ZeroDivisionError. Agregue la gestión de excepciones para devolver 0 en lugar de permitir que se produzca el error.

# Starter code
def divide_by(a, b):
    return a / b


try:
    ans = divide_by(40, 0)
    print(ans)
except ZeroDivisionError as e:
    print("Parece que esta diviendo por 0 ", e)


# FileNotFoundError
# El código siguiente busca un archivo que no existe. Agregue la gestión de excepciones para detectar este error y devolver el siguiente mensaje "No se pudo encontrar el archivo".

# Starter code
try:
    with open('file_does_not_exist.txt', 'r') as file:
        print(file.read())
except FileNotFoundError as e:
    print("No se pudo encontrar el archivo")

# ----------------------------------------
# Coursera

# Código de solución 
# Tarea 1 : IndexError

try:
    item = items[6]
    print(item)
except: 
    print("The index does not exist in the list.")

# Tarea 2 : ZeroDivisionError

# def divide_by(a, b):
#     try:
#         return a / b
#     except ZeroDivisionError:
#         return 0
#     except Exception as e:
#         print(e, 'Something went wrong!')

# ans = divide_by(10,0)
# print(ans)

# Tarea 3 : FileNotFoundError

try:
    with open('file_does_not_exist.txt', 'r') as file:
        print(file.read())
except:
    print("Unable to locate file")  