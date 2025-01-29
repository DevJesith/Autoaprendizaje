# 1. Definición de una Clase:

# Imagina que queremos crear una clase llamada Receta. Esta clase tendrá atributos como plato, ingredientes y tiempo.

class Receta:
    def __init__(self, plato, ingredientes, tiempo):
        self.plato = plato
        self.ingredientes = ingredientes
        self.tiempo = tiempo

    def mostrar_contenido(self):
        return f"La {self.plato} tiene {', '.join(self.ingredientes)} y toma {self.tiempo} minutos para preparar."

# 2. Creación de Instancias:

# Ahora, podemos crear instancias de la clase Receta para diferentes platos.

pizza = Receta("Pizza", ["queso", "pan", "tomate"], 45)
pasta = Receta("Pasta", ["penne", "salsa"], 55)

# 3. Acceso a Atributos:
# Podemos acceder a los atributos de cada instancia.

print(pizza.plato)  # Salida: Pizza
print(pasta.ingredientes)  # Salida: ['penne', 'salsa']

# 4. Método para Mostrar Contenido:

# También podemos agregar un método a la clase para mostrar la información de la receta.

# def mostrar_contenido(self):
#     return f"La {self.plato} tiene {', '.join(self.ingredientes)} y toma {self.tiempo} minutos para preparar."

# Al usar este método en una instancia:

print(pizza.mostrar_contenido())  # Salida: La Pizza tiene queso, pan, tomate y toma 45 minutos para preparar.

# Resumen

# Clase: Plantilla para crear objetos (ej. Receta).
# Instancia: Un objeto creado a partir de una clase (ej. pizza, pasta).
# Atributos: Características de la clase (ej. plato, ingredientes, tiempo).
# Métodos: Funciones definidas dentro de la clase que operan sobre los atributos.