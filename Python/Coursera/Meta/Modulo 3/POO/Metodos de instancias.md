## Variables de Instancia: 
Son variables que pertenecen a una instancia específica de una clase. Cada objeto creado a partir de la clase puede tener valores diferentes para estas variables.

## Métodos de Instancia: 
Son funciones definidas dentro de una clase que operan sobre las variables de instancia. Pueden modificar el estado del objeto o devolver información sobre él.

- Ejemplo Detallado

Imaginemos que estamos creando un sistema de pago para empleados en un restaurante. Vamos a definir una clase llamada PaySlips que tendrá las siguientes variables de instancia:

* `name`: el nombre del empleado.
* `payment`: el estado del pago (por ejemplo, "sí" o "no").
* `amount`: la cantidad a pagar.

```python
class PaySlips:
    def __init__(self, name, payment, amount):
        self.name = name
        self.payment = payment
        self.amount = amount

    def pay(self):
        self.payment = "sí"  # Cambia el estado de pago a "sí"

    def status(self):
        if self.payment == "sí":
            return f"{self.name} ha sido pagado {self.amount}"
        else:
            return f"{self.name} aún no ha sido pagado"
```

- Creación de Instancias

Ahora, creamos dos instancias de la clase `PaySlips` para dos empleados, Nathan y Roger:

```python
nathan = PaySlips("Nathan", "no", 1000)
roger = PaySlips("Roger", "no", 3000)
```

- Uso de Métodos

1. Verificar el estado del pago:

```python
print(nathan.status())  # Salida: Nathan aún no ha sido pagado
print(roger.status())    # Salida: Roger aún no ha sido pagado
```

2. Actualizar el estado del pago:

Si un gerente decide pagar a Nathan, llamamos al método `pay`:

```python
nathan.pay()
print(nathan.status())  # Salida: Nathan ha sido pagado 1000
print(roger.status())    # Salida: Roger aún no ha sido pagado
```

- Resumen

* Cada instancia (Nathan y Roger) tiene su propio estado de pago. Cuando se llama al método pay en Nathan, solo su estado cambia, mientras que Roger permanece sin cambios.

* Esto demuestra cómo las variables de instancia permiten que cada objeto mantenga su propio estado, y cómo los métodos de instancia pueden modificar ese estado.