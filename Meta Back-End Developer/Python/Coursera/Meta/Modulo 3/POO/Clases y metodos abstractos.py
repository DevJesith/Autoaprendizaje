
from abc import ABC, abstractmethod

class Empleado(ABC):
    @abstractmethod
    def donar(self):
        pass

class Donacion(Empleado):
    def donar(self):
        cantidad = float(input("Ingrese la cantidad a donar: "))
        return cantidad

empleado1 = Donacion()
empleado2 = Donacion()

montos = []
montos.append(empleado1.donar())
montos.append(empleado2.donar())

print("Total de donaciones:", montos)
