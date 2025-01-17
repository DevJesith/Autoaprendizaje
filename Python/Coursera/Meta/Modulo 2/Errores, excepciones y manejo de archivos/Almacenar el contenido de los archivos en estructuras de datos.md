Imagine que intenta encontrar un nombre para su perro nuevo. No está seguro de cómo le gustaría llamarlo, así que opta por utilizar sus conocimientos de Python para poder decidir.

Primero, accede a un archivo con una lista de nombres que le gustarían para su nueva mascota.

El archivo se denomina petnames.txt, y tiene el siguiente contenido:

Ahora que tiene el archivo petnames.txt, le gustaría utilizarlo dentro de su programa de Python para elegir al azar un solo nombre de mascota.

Para ello, necesitará tener un archivo Python en el que importará el petnames.txt como se indica a continuación:

f = open("petnames.txt", "r")

La función open() lee un archivo fuera del propio programa.

La función open() acepta dos parámetros:

La ruta y el nombre del archivo en forma de cadena.

El modo de importación (por defecto "r", que significa "leer")

En la línea anterior, importo el archivo en la raíz del proyecto. Solo especifico el nombre del archivo, sin la ruta. También utilizo el modo por defecto "r" para leer en el archivo. Guardo el archivo importado en una variable denominada f.

A continuación, voy a agregar otra variable, f_content, y le asigno el resultado de la lectura del archivo f.

En la tercera línea, imprimo la variable f_content.

La línea print(f_content) devuelve el contenido exacto del archivo, tal cual:

Ahora que he confirmado que leo correctamente el archivo, no sería útil continuar con la impresión del contenido del archivo, por lo que puedo convertir la línea en un comentario print(f_content).

Además, puedo obtener la variable f_content en una lista. La cadena "\n" se utiliza para dividir el texto donde se encuentra una nueva línea.

f_content_list = f_content.split("\n")

Ahora estoy listo para imprimir la variable f_content_list, de la siguiente manera:

print(f_content_list)

Esta vez, el resultado es el siguiente:
['Ace', 'Atlas', 'Bailey', 'Bear', 'Blaze', 'Boomer', 'Buddy', 'Coco', 'Cooper', 'Duke', 'Dozer', 'Echo', 'Gizmo', 'Harley', 'Mac', 'Max', 'Milo', 'Oscar', 'Rex', 'Rocky', 'Rocket', 'Wolfie']

Aquí está mi código completo hasta este punto, con las llamadas print() redundantes eliminadas.

f = open("petnames.txt", "r")
f_content = f.read()
f_content_list = f_content.split("\n")

Ahora que tengo todos mis posibles nombres de mascotas en una lista, puedo elegir al azar un nombre de la f_content_list de nombres.

Para ello, tendré que importar el módulo aleatorio en la parte superior de mi código: import random.

Ahora puedo utilizar la función choice() del módulo aleatorio: random.choice().

La función choice() acepta un parámetro de secuencia. Una lista es uno de sus valores aceptados. Lo que significa que ahora puedo añadir otra línea de código al final de mi programa:

print(aleatori.choice(f_content_list))

Al ejecutar el código ahora, se generará un nombre de mascota aleatorio. La primera vez que lo ejecuté, obtuve el nombre "Milo", y la segunda vez, "Dozer". Siempre es bueno volver a comprobar los programas de este tipo ejecutándolos varias veces como una forma rápida de confirmar que se comportan según lo previsto.

Aquí está el código completo de mi programa ahora (incluidas las líneas de código convertidas en comentarios):

import random
f = open("petnames.txt", "r")
f_content = f.read()
f_content_list = f_content.split("\n")
print(random.choice(f_content_list))

Por último, si tuviera varios archivos en mi carpeta, podría permitirme elegir un archivo del que leer en una lista de nombres.

A continuación explicare cómo funcionaría:

import random
f_name = input('Type the file name: ')
f = open(f_name) # "r" omitted as it's the default
f_content = f.read()
f_content_list = f_content.split("\n")
print(random.choice(f_content_list))

La única diferencia entre esta mejora y el programa anterior es que ahora guardo la variable f_name como resultado de la entrada proporcionada por el usuario. Una vez que tengo la variable f_name, ejecuto la función open() y luego continúo con otros pasos como ya se ha explicado.