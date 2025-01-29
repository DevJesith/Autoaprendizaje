import random

f = open("./Python/Coursera/Meta/Modulo 2/Errores, excepciones y manejo de archivos/petnames.txt", "r")
f_content = f.read()  # Lee el contenido del archivo
# f.close()  # Cierra el archivo después de leerlo

f_content_list = f_content.split("\n")
# print(f_content_list)
print(random.choice(f_content_list))

# Por último, si tuviera varios archivos en mi carpeta, podría permitirme elegir un archivo del que leer en una lista de nombres.

# A continuación explicare cómo funcionaría:

import random
f_name = input('Type the file name: ')
f = open(f_name) # "r" omitted as it's the default
f_content = f.read()
f_content_list = f_content.split("\n")
print(random.choice(f_content_list))
