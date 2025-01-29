# Cheat sheet de PyTest

* Instalación

Ejecute lo siguiente en la terminal:

pip3 install pytest (Mac)

O

pip install pytest (Windows)

## Nomenclatura

* Agregue el sufijo 'test_' al archivo que se debe probar.

* Agregue el sufijo 'test_' a las funciones que se van a probar.


* Ejecutar pytest

Este es el comando que se debe ejecutar en el indicador de la Terminal:

Python3 -m pytest test_file.py

* Método alternativo

py.test buscará la palabra clave "test" y ejecutará las pruebas sobre esos archivos y funciones automáticamente.

py.test test_file.py

Cuando ejecute pytest para una función específica, agregue :: para ejecutar una función específica en un archivo determinado.

* Banderas utilizadas

Por ejemplo, -v es el marcador:

python3 -m pytest abc.py -v

Otras opciones de indicadores son:

-v para verbose
-q quiet mode
-s permite que la sentencia print dentro de las funciones se ejecute
-x marca las pruebas para detener la ejecución después de la primera falla
-m se utiliza para marcar una función específica
-k es un indicador de búsqueda y ejecución de pruebas con una palabra clave específica
--tb es para desactivar el código de rastreo de errores
--maxfail n especifica el número máximo de fallas de prueba permitidas

* Consejos

La regla general es que la sentencia "assert" busca un resultado booleano. Puede utilizar "in, not in, is, <, >, other than ==" para comprobar valores booleanos. 

Puede añadir varias sentencias "assert" dentro de una única función de prueba.

* Lectura adicional

"Fixtures"

Los "fixtures" son un tipo de función que se aplica a las funciones que se va a probar. Estas funciones se deben ejecutar antes de que se ejecute la prueba. El propósito de los "fixtures" es suministrar datos de varias fuentes, incluidas URL y bases de datos, a la prueba antes de ejecutarla. Los "fixtures" se utilizan en casos en los que el código repite la inicialización.

Formato:

@pytest.fixture 

* Marcadores

Los marcadores se utilizan para "marcar" funciones específicas que se van a ejecutar y permitir a los usuarios crear nombres especiales. Hay muchos marcadores incorporados como xfail, xpass, skip, etc.

Seguirán un formato como:

@pytest.mark.<markername> 

Por ejemplo:

@pytest.mark.alpha 

La ejecución de la prueba específica marcada en la línea de comandos se puede realizar con el siguiente comando:

pytest -m <markername> -v 

que será como se muestra a continuación para un marcador denominado alfa:

pytest -m alfa -v 