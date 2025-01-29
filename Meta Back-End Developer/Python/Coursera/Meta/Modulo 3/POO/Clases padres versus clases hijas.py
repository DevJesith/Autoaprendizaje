# Definición: La herencia permite crear una nueva clase (clase hija) que extiende o modifica las propiedades y comportamientos de una clase existente (clase padre). Esto ayuda a reutilizar código y a organizarlo de manera más eficiente.

# Clases:

# Clase Padre (o Base): La clase de la que se heredan las propiedades.

# Clase Hija (o Derivada): La clase que hereda de la clase padre y puede agregar o modificar propiedades.

# Ejemplo:
# Se define una clase padre llamada Employees que tiene dos atributos: name y last.
# Luego, se crean dos clases hijas: Supervisors y Chefs.
# Supervisors: Esta clase hereda de Employees y añade un nuevo atributo password.
# Chefs: Esta clase también hereda de Employees y añade un método llamado leave_request que devuelve una cadena con la cantidad de días solicitados para un permiso.


class Employees:
    def __init__(self, name, last):
        self.name = name
        self.last = last

class Supervisors(Employees):
    def __init__(self, name, last, password):
        super().__init__(name, last)
        self.password = password

class Chefs(Employees):
    def leave_request(self, days):
        return f"May I take a leave for {days} days?"

# Creando instancias
adrian = Supervisors("Adrian", "A", "apple")
emily = Chefs("Emily", "E")
juno = Chefs("Juno", "J")

# Usando el método leave_request
print(emily.leave_request(3))  # Salida: May I take a leave for 3 days.
print(adrian.password)           # Salida: apple

# Conclusión

# La herencia en Python permite que las clases hijas hereden atributos y métodos de las clases padres, lo que facilita la reutilización del código y la organización de la lógica de programación. Si tienes más preguntas sobre este tema o necesitas más ejemplos, ¡no dudes en preguntar!
