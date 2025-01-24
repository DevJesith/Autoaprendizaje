# Ejemplo 1: Herencia Simple

# class Padre:
#     def saludo(self):
#         return "Hola desde el padre"

# class Hijo(Padre):
#     pass

# hijo = Hijo()
# print(hijo.saludo())  # Salida: Hola desde el padre

# Explicación: En este caso, Hijo hereda de Padre. Cuando llamamos al método saludo() en una instancia de Hijo, Python busca primero en Hijo y luego en Padre, encontrando el método en Padre.

# Ejemplo 2: Herencia Múltiple

class Padre1:
    def saludo(self):
        return "Hola desde el padre 1"

class Padre2:
    def saludo(self):
        return "Hola desde el padre 2"

class Hijo(Padre1, Padre2):
    pass

hijo = Hijo()
print(hijo.saludo())  # Salida: Hola desde el padre 1

# Explicación: Aquí, Hijo hereda de Padre1 y Padre2. Cuando se llama a saludo(), Python sigue el MRO y encuentra el método en Padre1 primero, ya que se define primero en la lista de herencia.


# Ejemplo 3: MRO en Acción

class A:
    pass

class B(A):
    pass

class C(A):
    pass

class D(B, C):
    pass

print(D.mro())  # Salida: [<class '__main__.D'>, <class '__main__.B'>, <class '__main__.C'>, <class '__main__.A'>, <class 'object'>]

#  Explicación: En este ejemplo, D hereda de B y C, que a su vez heredan de A. Al llamar a D.mro(), obtenemos el orden de resolución de métodos, que muestra cómo Python buscará métodos en la jerarquía de clases.

# Ejemplo 4: Uso de help()

# class A:
#     def metodo(self):
#         return "Método de A"

# class B(A):
#     def metodo(self):
#         return "Método de B"

# class C(A):
#     pass

# class D(B, C):
#     pass

help(D)  # Muestra información sobre D, incluyendo el MRO

# Explicación: Al usar help(D), obtendrás información detallada sobre la clase D, incluyendo su MRO, que te ayudará a entender cómo se resuelven los métodos en esta jerarquía.