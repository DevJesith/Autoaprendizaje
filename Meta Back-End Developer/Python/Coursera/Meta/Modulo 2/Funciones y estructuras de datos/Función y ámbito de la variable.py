# Funciones y variables
# Es esencial comprender los niveles de ámbito en Python y cómo se puede acceder a las cosas desde los cuatro niveles de ámbito diferentes. A continuación se presentan los cuatro niveles de ámbito y una breve explicación de dónde y cómo se utilizan.

# 1. Ámbito local
# Ámbito local se refiere a una variable declarada dentro de una función. Por ejemplo, en el siguiente código, la variable total solo está disponible para el código dentro de la función get_total. Cualquier cosa fuera de esta función no tendrá acceso a ella.

# def get_total(a, b):
#     #local variable declared inside a function
#     total = a + b;
#     return total

# print(get_total(5, 2))
# 7

# # Accessing variable outside of the function:
# print(total)
# # NameError: name 'total' is not defined


# 2. Ámbito cerrado
# El ámbito cerrado se refiere a una función dentro de otra función o lo que se denomina función anidada. 

# En el siguiente código, agregé una función anidada denominada double_it a la función get_total. 

# Como double_it está dentro del ámbito de la función get_total, se puede acceder a la variable. Sin embargo, no se puede acceder a la variable cerrada dentro de la función double_it desde dentro de la función get_total.

# def get_total(a, b):
#     #enclosed variable declared inside a function
#     total = a + b

#     def double_it():
#         #local variable
#         double = total * 2
#         print(double)

#     double_it()
#     #double variable will not be accessible
#     print(double)

#     return total

# 3. Ámbito global
# El ámbito global es cuando se declara una variable fuera de una función. Esto significa que se puede acceder desde cualquier lugar. 

# En el siguiente código, agregué una variable global denominada special. A continuación se puede acceder desde ambas funciones get_total y double_it:


# special = 5

# def get_total(a, b):
#     #enclosed scope variable declared inside a function
#     total = a + b
#     print(special)

#     def double_it():
#         #local variable
#         double = total * 2
#         print(special)

#     double_it()

#     return total

# 4. Ámbito integrado
# El ámbito integrado se refiere a las palabras clave reservadas que Python usa para sus funciones integradas, como print, def, for, in y así sucesivamente.  Se puede acceder a las funciones con ámbito integrado en cualquier nivel.