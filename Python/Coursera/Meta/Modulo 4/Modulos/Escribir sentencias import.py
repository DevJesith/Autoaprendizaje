# 1. Importar un módulo

# Ejemplo: import math
# Descripción: Esto importa el módulo math, que contiene funciones matemáticas. Después de importarlo, puedes usar funciones como math.sqrt() para calcular la raíz cuadrada.

# 2. Usar una función del módulo

import math
root = math.sqrt(9)
print(root)

# Descripción: Aquí, se utiliza la función sqrt del módulo math para calcular la raíz cuadrada de 9, que es 3.

# 3. Importar una función específica

# Ejemplo: from math import sqrt
# Descripción: Esto permite importar solo la función sqrt del módulo math, evitando la necesidad de usar el prefijo math..

# 4. Usar un alias para un módulo

# import math as m
# cosine = m.cos(0)
# print(cosine)

# Descripción: Aquí, se asigna un alias m al módulo math. Luego, se usa m.cos(0) para calcular el coseno de 0, que es 1.

# 5. Usar un alias para una función

# Ejemplo: from math import factorial as f
# Descripción: Esto permite usar la función factorial con el alias f, facilitando su uso en el código.

# 6. Importar múltiples funciones

from math import log, sqrt
x = log(50, 10)
print(x)

# Descripción: Aquí, se importan las funciones log y sqrt del módulo math y se utiliza log para calcular el logaritmo base 10 de 50.

# 7. Importar todas las funciones de un módulo

# Ejemplo: from math import *
# Descripción: Esto importa todas las funciones del módulo math. Sin embargo, no es recomendable en proyectos grandes, ya que puede causar confusión sobre de dónde provienen las funciones.

# 8. Importar variables y clases

from math import some_variable

# Descripción: Si intentas importar una variable que no existe en el módulo, como some_variable, obtendrás un error.