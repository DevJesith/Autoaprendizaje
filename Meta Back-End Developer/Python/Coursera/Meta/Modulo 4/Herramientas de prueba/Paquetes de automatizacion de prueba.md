# Paquetes de Automatización de Prueba

La automatización de pruebas es un proceso que utiliza herramientas y scripts para ejecutar pruebas de software de manera automática, en lugar de hacerlo manualmente. Aquí hay algunos paquetes populares de automatización de pruebas en Python:

1. Pytest

* Descripción: Es un marco de pruebas simple y escalable que permite realizar pruebas funcionales y unitarias.

* Características:

    * Soporta pruebas parametrizadas, lo que permite ejecutar la misma prueba con diferentes entradas.

    * Genera informes en varios formatos (HTML, XML).

    *Permite la ejecución de pruebas en paralelo.

```python
import pytest

@pytest.mark.parametrize("a, b, resultado", [(1, 2, 3), (2, 3, 5), (5, 5, 10)])
def test_suma(a, b, resultado):
    assert a + b == resultado
```


2. Robot Framework

* Descripción: Un marco de pruebas de código abierto que utiliza un enfoque basado en palabras clave.

* Características:
    * Permite la creación de pruebas legibles y fáciles de entender.
    * Soporta pruebas de aceptación y automatización de procesos robóticos (RPA).

```robot
*** Test Cases ***
Sumar Dos Números
    ${resultado}=    Sumar    1    2
    Should Be Equal    ${resultado}    3

*** Keywords ***
Sumar
    [Arguments]    ${a}    ${b}
    ${suma}=    Evaluate    ${a} + ${b}
    [Return]    ${suma}
```

3. Selenium

* Descripción: Un marco de pruebas para aplicaciones web que permite la automatización de navegadores.

* Características:

    * Soporta múltiples navegadores y sistemas operativos.

    * Permite la simulación de interacciones del usuario, como clics y llenado de formularios.

```python
from selenium import webdriver

driver = webdriver.Chrome()
driver.get("http://example.com")
assert "Example Domain" in driver.title
driver.quit()
```

## Resumen

Estos paquetes son esenciales para la automatización de pruebas en Python, cada uno con sus propias características y ventajas. La elección del paquete depende del tipo de pruebas que necesites realizar.