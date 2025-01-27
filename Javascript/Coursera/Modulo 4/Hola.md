# ¿Qué es TDD?

TDD es un enfoque de desarrollo de software donde se escriben pruebas antes de escribir el código que implementa la funcionalidad. Esto ayuda a asegurar que el código cumple con los requisitos desde el principio.

* Proceso de TDD

1. Recibir Requisitos: Comprender qué funcionalidad se necesita.
Escribir una Prueba Fallida: Crear una prueba para una función que aún no existe.
 
2. Implementar el Código: Escribir el código mínimo necesario para que la prueba pase.

3. Ejecutar la Prueba: Verificar si la prueba pasa.

4. Refactorizar: Mejorar el código sin cambiar su funcionalidad, asegurando que la prueba siga pasando.

Ejemplo Práctico

Imaginemos que queremos crear una función que verifique si una clave está presente.

1. Requisito: Necesitamos una función llamada statusOfKeys que verifique si tenemos una variable keys que debe ser true.

2. Escribir una prueba fallida:

```javascript
test('statusOfKeys should exist', () => {
    expect(typeof statusOfKeys).toBe('function');
});
```
Aquí estamos probando que la función statusOfKeys existe. Como aún no la hemos definido, esta prueba fallará.

3. Implementar el Código:

```javascript
function statusOfKeys() {
    // implementación vacía
}
```

Ahora hemos definido la función, pero no hace nada aún.

4. Ejecutar la Prueba: Al ejecutar la prueba, ahora debería pasar porque la función existe.

5. Agregar Funcionalidad:

Ahora, vamos a hacer que la función verifique si keys es true.

```javascript
let keys = true;

function statusOfKeys() {
    console.log(keys);
}
```

6. Escribir otra Prueba:

```javascript
test('statusOfKeys should log the value of keys', () => {
    console.log = jest.fn(); // Mock de console.log
    statusOfKeys();
    expect(console.log).toHaveBeenCalledWith(true);
});
```

Esta prueba verifica que la función statusOfKeys imprime el valor de keys. Al ejecutar esta prueba, debería fallar porque no hemos implementado la lógica para imprimir keys.

7. Ejecutar la Prueba: Ahora, al ejecutar la prueba, debería fallar.

8. Refactorizar: Asegúrate de que el código esté limpio y que todas las pruebas pasen.

## Beneficios de TDD

* Menos Errores: Al escribir pruebas primero, se reduce la posibilidad de errores en el código.

* Documentación: Las pruebas actúan como documentación sobre cómo se espera que funcione el código.

* Confianza en el Código: Puedes hacer cambios en el código y estar seguro de que no romperás funcionalidades existentes si todas las pruebas pasan.