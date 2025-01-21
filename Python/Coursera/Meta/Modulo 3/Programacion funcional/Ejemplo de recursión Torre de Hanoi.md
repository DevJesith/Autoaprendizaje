# Explicación de la Torre de Hanoi y su implementación en Python

La Torre de Hanoi es un problema matemático y de programación que ilustra perfectamente el concepto de recursión. Se basa en mover una serie de discos de una torre a otra, siguiendo ciertas reglas.

## 🔷 Reglas del problema 🔷

1. Solo se puede mover un disco a la vez.
2. Un disco solo se puede mover desde la parte superior de una torre.
3. Un disco más grande no puede colocarse sobre uno más pequeño.

El objetivo es mover todos los discos desde la torre de origen a la torre de destino, utilizando una torre auxiliar cuando sea necesario.

La solución óptima requiere 2ⁿ - 1 movimientos, donde n es el número de discos.

## 🖥 Código en Python
El problema se resuelve de manera recursiva. Aquí está el código:

# Función recursiva para resolver la Torre de Hanoi
```py
def hanoi(disks, source, helper, destination):
    # Caso base: Si solo hay un disco, lo movemos directamente
    if disks == 1:
        print(f'Disco {disks} mueve de torre {source} a torre {destination}.')
        return

    # Mueve n-1 discos desde la torre de origen a la torre auxiliar
    hanoi(disks - 1, source, destination, helper)

    # Mueve el disco más grande a la torre de destino
    print(f'Disco {disks} mueve de torre {source} a torre {destination}.')

    # Mueve los n-1 discos desde la torre auxiliar a la torre de destino
    hanoi(disks - 1, helper, source, destination)

# Llamada al código con 3 discos y torres A, B y C
hanoi(3, 'A', 'B', 'C')
```


## 🔎 Paso a paso con 3 discos

Supongamos que tenemos tres discos en la torre A, y queremos moverlos a la torre C usando la torre B como auxiliar.

1. Mover los 2 discos superiores de A → B (usando C como auxiliar)

* Mueve Disco 1 de A → C
* Mueve Disco 2 de A → B
* Mueve Disco 1 de C → B

2. Mover el Disco 3 de A → C

3. Mover los 2 discos de B → C (usando A como auxiliar)

* Mueve Disco 1 de B → A
* Mueve Disco 2 de B → C
* Mueve Disco 1 de A → C


Salida esperada en consola:

Disco 1 mueve de torre A a torre C.
Disco 2 mueve de torre A a torre B.
Disco 1 mueve de torre C a torre B.
Disco 3 mueve de torre A a torre C.
Disco 1 mueve de torre B a torre A.
Disco 2 mueve de torre B a torre C.
Disco 1 mueve de torre A a torre C.

Este proceso sigue las reglas del juego y la estrategia recursiva. Se repite el mismo patrón para n discos.

## 📌 Explicación del código

1. Condición base: Si hay un solo disco, se mueve directamente a la torre de destino.

2. Llamadas recursivas:
* Se mueven n-1 discos de la torre de origen a la auxiliar.
* Se mueve el disco más grande a la torre de destino.
* Se mueven los n-1 discos restantes de la auxiliar a la torre de destino.

Este enfoque divide el problema en subproblemas más pequeños, hasta que cada disco se mueve individualmente.

## 🏆 Conclusión
La Torre de Hanoi es un clásico problema de recursión, donde cada movimiento depende de los movimientos anteriores. La recursión permite resolver problemas dividiéndolos en versiones más pequeñas de sí mismos.

