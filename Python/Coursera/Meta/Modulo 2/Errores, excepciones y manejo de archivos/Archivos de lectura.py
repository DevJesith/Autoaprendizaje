# read:

# Descripción: Devuelve todo el contenido del archivo como una cadena.

# with open('newfile.txt', 'r') as file:
#     content = file.read()
#     print(content)  # Imprime todo el contenido del archivo

# readline:

# Descripción: Devuelve una sola línea del archivo.

with open('newfile.txt', 'r') as file:
    first_line = file.readline()
    print(first_line)  # Imprime solo la primera línea del archivo

# readlines:
# Descripción: Lee todo el contenido del archivo y lo devuelve como una lista de líneas.

with open('newfile.txt', 'r') as file:
    lines = file.readlines()
    for line in lines:
        print(line.strip())  # Imprime cada línea del archivo, eliminando espacios en blanco