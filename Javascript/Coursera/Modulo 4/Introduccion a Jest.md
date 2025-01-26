1. Jest

Jest es un marco de pruebas para JavaScript que permite a los desarrolladores escribir pruebas de manera sencilla. Es especialmente popular para aplicaciones que utilizan React, pero también se puede usar con otros frameworks.

Ejemplo:

```javascript
// Función a probar
function suma(a, b) {
    return a + b;
}

// Prueba usando Jest
test('suma 1 + 2 es igual a 3', () => {
    expect(suma(1, 2)).toBe(3);
});
```

2. Cobertura de Código

La cobertura de código mide qué porcentaje de tu código está cubierto por pruebas. Por ejemplo, si tienes 100 líneas de código y 80 de ellas están cubiertas por pruebas, tu cobertura de código es del 80%.

* Importancia: Una mayor cobertura de código generalmente significa menos errores no detectados.

3. Mocking

El mocking permite simular el comportamiento de dependencias externas en tus pruebas. Esto es útil para evitar que las pruebas dependan de servicios externos, como bases de datos o APIs.

```javascript
// Función que obtiene datos de un servidor
function obtenerDatos() {
    return fetch('https://api.example.com/datos')
        .then(response => response.json());
}

// Mocking en Jest
jest.mock('node-fetch'); // Simula la función fetch

const fetch = require('node-fetch');

test('obtenerDatos devuelve datos simulados', async () => {
    fetch.mockResolvedValueOnce({
        json: jest.fn().mockResolvedValueOnce({ nombre: 'Juan' }),
    });

    const datos = await obtenerDatos();
    expect(datos.nombre).toBe('Juan');
});
```

4. Pruebas de Instantáneas

Las pruebas de instantáneas se utilizan para verificar que la salida de tu componente no cambie inesperadamente. Jest toma una "instantánea" de la salida y la compara en futuras ejecuciones.

```javascript
import { render } from '@testing-library/react';
import MiComponente from './MiComponente';

test('componente coincide con la instantánea', () => {
    const { asFragment } = render(<MiComponente />);
    expect(asFragment()).toMatchSnapshot();
});
```

## Resumen

* Jest es un marco de pruebas fácil de usar para JavaScript.

* La cobertura de código ayuda a identificar qué partes de tu código no están siendo probadas.

* El mocking permite simular dependencias externas para hacer pruebas más efectivas.

* Las pruebas de instantáneas aseguran que los cambios en el código no afecten la salida esperada.
