```markdown
# Introducción a HTTP

**HTTP (Hypertext Transfer Protocol)** es un protocolo fundamental que permite la comunicación entre un cliente (como un navegador web) y un servidor web. Aquí tienes un resumen de sus componentes clave:

## Componentes de HTTP:
- **Método**: Indica la acción que el cliente desea realizar. Los métodos más comunes son:
  - **GET**: Recupera información del servidor.
  - **POST**: Envía datos al servidor.
  - **PUT**: Actualiza recursos existentes en el servidor.
  - **DELETE**: Elimina recursos del servidor.

- **Ruta**: Especifica la ubicación del recurso en el servidor. Por ejemplo, en la URL `example.com/images/image.jpg`, la ruta es `/images/image.jpg`.

- **Versiones**: Las versiones más utilizadas son HTTP/1.1 y HTTP/2.0.

- **Encabezados**: Proporcionan información adicional sobre la solicitud, como el tipo de contenido o la información del cliente.

## Ejemplo de HTTP:
Imagina que quieres ver una imagen en un sitio web. Tu navegador envía una solicitud HTTP al servidor usando el método **GET**. La solicitud podría verse así:

```null
GET /images/image.jpg HTTP/1.1
Host: example.com
```
El servidor responde con un código de estado HTTP, como **200 OK**, indicando que la solicitud fue exitosa, y envía la imagen solicitada.

## Resumen:
- **HTTP** es el protocolo que permite la transferencia de datos en la web.
- Utiliza métodos como GET y POST para interactuar con recursos en un servidor.
- Las respuestas del servidor incluyen códigos de estado que indican el resultado de la solicitud.

```