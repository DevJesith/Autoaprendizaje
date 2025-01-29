# ¿Qué es TDD?

El TDD es una práctica de programación en la que se escriben pruebas antes de escribir el código que implementa la funcionalidad. Esto ayuda a asegurar que el código cumpla con los requisitos desde el principio.

## Proceso de TDD

1. Escribir una prueba: Comienza escribiendo una prueba para una nueva funcionalidad. Esta prueba fallará inicialmente porque la funcionalidad aún no está implementada.

2. Escribir el código: Luego, escribes el código necesario para que la prueba pase.

3. Ejecutar la prueba: Ejecutas la prueba y esperas que falle (esto es normal en esta etapa).

4. Refactorizar: Si la prueba falla, evalúas el error y refactorizas el código si es necesario.

5. Repetir: Finalmente, vuelves a ejecutar la prueba hasta que todas pasen.

## Ejemplo

Imaginemos que estamos desarrollando una función que suma dos números.

1. Escribir una prueba:

```python
def test_sum():
    assert sum(2, 3) == 5
```

2. Escribir el codigo:

```python
def sum(a, b):
    return a + b
```

4. Ejecutar la prueba: Al ejecutar test_sum(), la prueba debería pasar.

5. Refactorizar: Si el código necesita mejoras, lo harías en esta etapa.

6. Repetir: Si agregas más funcionalidades, como sumar tres números, escribirías una nueva prueba y repetirías el proceso.

### Beneficios de TDD

* Cobertura de código: Asegura que el código esté cubierto por pruebas.

* Claridad: Proporciona claridad sobre lo que se espera de la funcionalidad.

* Facilidad de mantenimiento: Facilita la refactorización y la corrección de errores.