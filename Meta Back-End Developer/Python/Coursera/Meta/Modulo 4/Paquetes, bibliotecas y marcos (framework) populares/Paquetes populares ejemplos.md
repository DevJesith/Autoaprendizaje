Cuando hablo de paquetes populares en Python, incluyo tanto las bibliotecas integradas como las de terceros. Una vez importados dentro del programa, el uso de estos paquetes sigue la misma estructura y las mismas reglas que el código normal que se encontraría sin la importación. Ya ha explorado algunos de los nombres de paquetes más populares en los dominios de la ciencia de los datos, el aprendizaje automático y la Web en los primeros días del curso. A continuación, le presentamos algunos ejemplos de uso de estos paquetes que lo ayudarán a sentirse cómodo con la idea.

Antes de utilizar cualquier paquete, el primer código que siempre debe utilizar es la sentencia import. Esto es así incluso en el caso de los paquetes integrados. Por ejemplo, si desea utilizar el paquete json, primero agregará una línea como:

```py
import json
```

# Numpy

Si se piensa que ya existe una instalación para el paquete numpy, el código para ello puede ser el siguiente:

```py
import numpy as np

a = np.zeros(10)
print(a)

b = np.full((2,10), 0,7)
print(b)

c = np.linspace(0,25,7)
print(c)

print(type(c))
```

La salida del código anterior es:

```py
[0. 0. 0. 0. 0. 0. 0. 0. 0. 0.]
[[0.7 0.7 0.7 0.7 0.7 0.7 0.7 0.7 0.7 0.7]
 [0.7 0.7 0.7 0.7 0.7 0.7 0.7 0.7 0.7 0.7]] 
[ 0.          4.16666667  8.33333333 12.5        16.66666667 20.83333333  25.        ]
<class 'numpy.ndarray'>
```

* La función zeros() dentro de numpy crea un array con n número de ceros en su interior.

* La función full() crea una matriz bidimensional de dimensiones 2 x 10 que consta solo de los valores 0.7.

* En el ejemplo, la función linspace() divide los valores entre 0 y 25 en 7 partes iguales. La matriz resultante está en la salida.

* Finalmente, cuando vea el tipo de datos de c, verá es un tipo de datos especial creado y utilizado en numpy denominado ndarray. Si prueba la salida para a y b, también será ndarray. ya que numpy trata exclusivamente con ndarray, que sustituye a las listas y es mucho más eficiente. 

* Estas son algunas de las funciones proporcionadas por numpy.

# Pandas

Ahora explorará el uso de otra biblioteca que trabaja estrechamente con numpy y otras bibliotecas de ciencia de los datos denominadas pandas.

```py
import pandas as pd

a = pd.DataFrame({'Animals': ['Dog','Cat','Lion','Cow','Elephant'],
                    'Sounds':['Barks','Meow','Roars','Moo','Trumpet']})

print(a)
print(a.describe())

b = pd.DataFrame({
    "Letters" : ['a', 'b', 'c', 'd', 'e', 'f'],
    "Numbers" : [12, 7, 9, 3, 5, 1]  })

print(b.sort_values(by="Numbers"))

b = b.assign(new_values = b['Numbers']*3)
print(b)

```

La salida sera:

```py
     Animals   Sounds
0       Dog    Barks
1       Cat     Meow
2      Lion    Roars
3       Cow      Moo
4  Elephant  Trumpet


       Animals Sounds
count        5      5
unique       5      5
top        Dog  Barks
freq         1      1


  Letters  Numbers
5       f        1
3       d        3
4       e        5
1       b        7
2       c        9
0       a       12


  Letters  Numbers  new_values
0       a       12          36
1       b        7          21
2       c        9          27
3       d        3           9
4       e        5          15
5       f        1           3

```

* En las cuatro salidas de este código, creé un DataFrame de pandas en el código anterior denominado a.

* La primera salida es para el DataFrame denominado a que muestra la salida en un formato muy sistemático.

* La segunda salida utiliza la función describe() en pandas que dará el conteo, la frecuencia, los valores superiores y la frecuencia entre otros valores.

* En el segundo DataFrame, b consta de letras y números en orden aleatorio.

* La tercera salida es una función de ordenación que proporcionará una tabla ordenada que llevará a barajar las entradas de datos en la tabla.

* Por último, la función assign() toma los valores presentes en tabla, realiza una operación sobre ellos y crea una nueva variable denominada new_values que luego se agrega a la tabla.

* Pandas, al igual que Numpy, es muy utilizado y tiene una gran variedad de funcionalidades presentes además de las mencionadas.

# NLKT

NLTK, como se ha mencionado anteriormente, es una biblioteca en Python utilizada para el procesamiento del lenguaje natural. A continuación, presentamos algunas cosas que se pueden realizar con esta biblioteca.

```py
import nltk

text = "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book."
from nltk.tokenize import word_tokenize
from nltk.corpus import stopwords

# Print statement 1
print(word_tokenize(text))
# Print statement 2
print(nltk.tokenize.sent_tokenize(text))


stopwords = stopwords.words("english")
new_text = []
for i in text.split():
    if i not in stopwords:
        new_text.append(i)

# Print statement 3
print(new_text)
```

La salida sera:

```py
['Lorem', 'Ipsum', 'is', 'simply', 'dummy', 'text', 'of', 'the', 'printing', 'and', 'typesetting', 'industry', '.', 'Lorem', 'Ipsum', 'has', 'been', 'the', 'industry', "'s", 'standard', 'dummy', 'text', 'ever', 'since', 'the', '1500s', ',', 'when', 'an', 'unknown', 'printer', 'took', 'a', 'galley', 'of', 'type', 'and', 'scrambled', 'it', 'to', 'make', 'a', 'type', 'specimen', 'book', '.']

['Lorem Ipsum is simply dummy text of the printing and typesetting industry.', "Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book."]

['Lorem', 'Ipsum', 'simply', 'dummy', 'text', 'printing', 'typesetting', 'industry.', 'Lorem', 'Ipsum', "industry's", 'standard', 'dummy', 'text', 'ever', 'since', '1500s,', 'unknown', 'printer', 'took', 'galley', 'type', 'scrambled', 'make', 'type', 'specimen', 'book.']
```

NLTK es una enorme biblioteca y es aconsejable importar todos sus paquetes y subpaquetes. Si examina el código, se dará cuenta de que sólo se importan las funcionalidades necesarias de los subpaquetes como corpus y tokenize dentro del código.

* Primero se copia un bloque de texto dentro del bloque de código y se asigna a una variable denominada texto.

* La primera función utilizada es word_tokenize(). Toma este texto y produce la primera parte de la salida en la que las palabras están "tokenizadas" o simplemente separadas por un espacio en blanco. Lo mismo se puede hacer con la función Split() en la cadena, pero el uso del paquete es mucho más eficiente cuando se trata de bloques de código más grandes.

* La segunda función sent_tokenize() toma este bloque de texto y lo tokeniza por "oraciones".

* Para la tercera salida, primero divido el código y elimino lo que se denomina "palabras vacías". Las palabras vacías son palabras que pueden considerarse redundantes y que aportan poco valor al realizar el procesamiento del lenguaje natural. Se trata de palabras como "un", "el", "él". Primero voy a crear una lista de estas palabras vacías y luego las eliminaré mediante un for loop para formar una nueva lista denominada new_text. Observará la diferencia al comparar la primera salida y la salida final del código.

Hemos cubierto aquí sólo un par de ejemplos de un par de bibliotecas, aunque existe un sinnúmero de opciones disponibles con diferentes paquetes en Python. La mejor manera de aprender es mediante la práctica y la exploración. 