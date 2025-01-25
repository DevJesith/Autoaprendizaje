# 1. Importar el módulo sys:

# Se utiliza para acceder a la ruta de búsqueda de módulos.


import sys

# Obtener las ubicaciones donde Python busca módulos
ubicaciones = sys.path

# 2. Imprimir las ubicaciones:

# Se imprime cada ubicación en una línea separada.


for ubicacion in ubicaciones:
    print(ubicacion)

# 3. Uso del módulo calendar:

# Se importa el módulo calendar para trabajar con fechas.


import calendar

# Usar la función leapdays para contar los días bisiestos entre dos años
dias_bisiestos = calendar.leapdays(2000, 2050)
print(dias_bisiestos)  # Salida: 13

# 4. Verificar si un año es bisiesto:
# Se utiliza la función isleap para verificar si un año específico es bisiesto.


es_bisiesto = calendar.isleap(2036)
print(es_bisiesto)  # Salida: True

# Explicación

# sys.path: Es una lista que contiene las rutas donde Python busca los módulos. Al imprimir estas ubicaciones, puedes ver dónde se encuentran los módulos incorporados y los módulos definidos por el usuario.

# Módulo calendar: Este módulo proporciona funciones relacionadas con el calendario. En el ejemplo, se utiliza para contar los días bisiestos entre dos años y para verificar si un año específico es bisiesto.