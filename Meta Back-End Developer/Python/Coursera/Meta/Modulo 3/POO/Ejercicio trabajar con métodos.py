# 1. Averigüe la salida para el siguiente bloque de código e intente ejecutar el código una vez que tenga una solución en mente:

# class A:
#     def b(self):
#         return "Function inside A"

# class B:
#     pass

# class C:
#     def b(self):
#         return "Function inside C"

# class D(B, C, A):
#     pass

# class D(C):
#     pass

# d = D()
# print(d.b())

# 2. Averigüe la salida para el siguiente bloque de código e intente ejecutar el código una vez que tenga una solución en mente:

# class A:
#     def c(self):
#         return "Function inside A"

# class B(A):
#     def c(self):
#         return "Function inside B"

# class C(A,B):
#     pass

# class D(C):
#     pass

# d = D()
# print(d.a)

# 3. Averigüe el resultado del siguiente bloque de código e intente ejecutar el código una vez que tenga en cuenta una solución:

# class A:
#     pass

# class B(A):
#     pass

# class C(B):
#     pass


# c = C()
# print(c.a())



# Conceptos Clave:

# Herencia Múltiple: Cuando una clase hereda de más de una clase base.
# Orden de Resolución de Métodos (MRO): Es el orden en que Python busca métodos en las clases base.
# Causas del Error:

# Conflicto de Métodos: Si las clases base tienen métodos con el mismo nombre y no se puede determinar un orden claro para resolverlos.
# Herencia Cíclica: Si hay un ciclo en la jerarquía de clases.
# Ejemplo:

# En tu caso, la clase C está intentando heredar de A y B, pero si B también hereda de A, esto puede causar un conflicto. 

# Solución:

# Revisar la jerarquía de clases: Asegúrate de que no haya conflictos en los métodos de las clases base.
# Usar super(): Para llamar a métodos de las clases base de manera más controlada.
