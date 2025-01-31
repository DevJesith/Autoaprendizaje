# Concepto Clave:

* Jerarquía de Componentes: En React, una aplicación se construye utilizando componentes que se organizan en una estructura de árbol. Cada aplicación tiene al menos un componente raíz, que es el componente principal.

## Ejemplo:

Imagina que estás creando una lista de compras. La estructura de componentes podría ser la siguiente:

1. Componente Raíz (App Component): Este es el componente principal de la aplicación.

2. Componente Hijo (New Item Bar): Permite agregar nuevos elementos a la lista.

3. Componente Hijo (Shopping List): Contiene todos los elementos de la lista de compras.

4. Componente Nieto (Shopping Item): Representa cada elemento individual, como "pollo" o "fideos".

### Beneficio:

Reutilización de Componentes: Puedes usar el componente "Shopping Item" varias veces para mostrar diferentes elementos en la lista, lo que ahorra tiempo y esfuerzo en la codificación.