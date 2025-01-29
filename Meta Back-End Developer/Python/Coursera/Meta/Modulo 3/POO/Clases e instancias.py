# Clases: Son plantillas para crear objetos. Definen atributos (variables) y métodos (funciones) que los objetos creados a partir de la clase pueden tener.

# Instancias: Son objetos creados a partir de una clase. Cada instancia puede tener valores diferentes para los atributos definidos en la clase.

# Objetos: Son instancias de clases. Todo en Python es un objeto.


# Definición de la clase
class MiClase:
    def __init__(self, valor):
        self.valor = valor  # Atributo

    def mostrar_valor(self):  # Método
        print(f"El valor es: {self.valor}")

# Creación de una instancia de la clase
mi_objeto = MiClase(10)

# Acceso al atributo y método
print(mi_objeto.valor)  # Salida: 10
mi_objeto.mostrar_valor()  # Salida: El valor es: 10

# En este ejemplo:

# MiClase es la clase.
# mi_objeto es una instancia de MiClase.
# valor es un atributo y mostrar_valor es un método.

# Funciones de self:

# Acceso a Atributos: Permite acceder a los atributos de la instancia.
# Llamar Métodos: Permite llamar a otros métodos de la misma instancia.
# Diferenciación: Ayuda a diferenciar entre atributos de la instancia y variables locales dentro de los métodos.


class Persona:
    def __init__(self, nombre):
        self.nombre = nombre  # Atributo de instancia

    def saludar(self):
        print(f"Hola, mi nombre es {self.nombre}")  # Acceso al atributo

# Crear una instancia de Persona
persona1 = Persona("Juan")
persona1.saludar()  # Salida: Hola, mi nombre es Juan

# self.nombre se refiere al atributo nombre de la instancia actual.
# Al llamar a saludar, se utiliza self para acceder al atributo nombre de esa instancia.