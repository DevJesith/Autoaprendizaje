1. Paradigma de Programación:

    * Python sigue principalmente un paradigma orientado a objetos, pero también es procedural y funcional.
    * Un paradigma es un estilo de escribir programas que ayuda a reducir la complejidad del código.

    ---------------------------
    * Python es principalmente orientado a objetos, pero también admite otros paradigmas como el procedural y funcional.

2. Componentes Clave de OOP:

    * Clases: Bloques de código que contienen atributos (variables) y comportamientos (funciones). Se definen con la palabra clave class.
    * Objetos: Instancias de clases. Cada objeto tiene un estado definido por sus atributos y un identificador único. Son instancias de clases. Cada objeto tiene atributos y métodos.

    * Métodos: Funciones dentro de una clase que determinan el comportamiento de un objeto.

3. Ejemplo Práctico:

    * Crear una clase Empleado para registrar atributos como posición y estado laboral.

    ```python
    class Empleado:
        def __init__(self, nombre, posicion):
            self.nombre = nombre  # Atributo
            self.posicion = posicion  # Atributo

        def presentar(self):  # Método
            return f"Hola, soy {self.nombre} y trabajo como {self.  posicion}."
    ```

    * Instanciar un objeto emp1 de la clase Empleado y definir sus atributos.

    ```python
    emp1 = Empleado("Juan", "Desarrollador")
    print(emp1.presentar())  # Salida: Hola, soy Juan y trabajo como    Desarrollador.
    ```

4. Conceptos Fundamentales de OOP:

    * Herencia: Creación de una nueva clase a partir de una existente (clase padre y clase hija).

    ```python
    class Gerente(Empleado):  # Gerente hereda de Empleado
        def __init__(self, nombre, posicion, departamento):
            super().__init__(nombre, posicion)  # Llama al constructor  de Empleado
            self.departamento = departamento  # Atributo adicional

        def presentar(self):  # Sobrescritura de método
            return f"Hola, soy {self.nombre}, soy {self.posicion} del   departamento de {self.departamento}."
    ```

    * Polimorfismo: Una función puede actuar de diferentes maneras según el objeto. Por ejemplo, el operador + suma números o concatena cadenas.

    ```python
    emp2 = Gerente("Ana", "Gerente", "IT")
    print(emp2.presentar())  # Salida: Hola, soy Ana, soy Gerente del   departamento de IT.
    ```

    * Encapsulación: Agrupa métodos y variables para protegerlos de accesos directos, reduciendo errores.

    ```python
    class CuentaBancaria:
        def __init__(self, saldo):
            self.__saldo = saldo  # Atributo privado

        def depositar(self, cantidad):
            self.__saldo += cantidad  # Método para modificar el saldo

        def obtener_saldo(self):
            return self.__saldo  # Método para acceder al saldo
    ```

    * Abstracción: Oculta detalles de implementación para hacer los datos más seguros. Python utiliza la herencia para lograrlo.


5. Otros Conceptos Importantes:

    * Sobrecarga de Métodos: Permite definir múltiples métodos con el mismo nombre pero diferentes parámetros.
    * Sobrescritura de Métodos: Permite redefinir un método en una clase hija que ya existe en la clase padre. Gerente
    * Constructores: Métodos especiales que se llaman al crear un objeto. _init_

