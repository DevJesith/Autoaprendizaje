# ¿Qué es un paquete en Python?

* Definición: Un paquete es una colección de módulos que agrupan funcionalidades relacionadas. Puedes pensar en un paquete como una carpeta que contiene varios archivos (módulos) que puedes usar en tu código.

* Importación: Para usar un paquete, necesitas importarlo en tu script. Esto se hace con la sentencia import. Por ejemplo, si tienes un paquete llamado math, puedes importarlo así:

```python
import math
```
## Ejemplo de uso de un paquete

Supongamos que queremos usar el paquete math para realizar algunas operaciones matemáticas. Aquí hay un ejemplo:

```python
import math

# Usar la función sqrt() para calcular la raíz cuadrada
numero = 16
raiz_cuadrada = math.sqrt(numero)
print(f"La raíz cuadrada de {numero} es {raiz_cuadrada}")

# Usar la constante pi
print(f"El valor de pi es {math.pi}")
```

Explicación del ejemplo

* Importación: Importamos el paquete math para acceder a sus funciones y constantes.

* Función sqrt(): Usamos math.sqrt() para calcular la raíz cuadrada de 16.

* Constante pi: También accedemos a la constante pi que está definida en el paquete math.