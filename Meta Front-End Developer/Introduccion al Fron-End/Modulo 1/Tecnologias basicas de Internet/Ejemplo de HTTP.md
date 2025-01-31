## Línea de solicitud

Cada solicitud HTTP comienza con la línea de solicitud.

Esto consiste en el método HTTP, el recurso solicitado y la versión del protocolo HTTP.

OBTENER /home.html HTTP/1.1

En este ejemplo,  GET  es el método HTTP,  /home.html  es el recurso solicitado y HTTP 1.1 es el protocolo utilizado.

## Métodos HTTP
Los métodos HTTP indican la acción que el cliente desea realizar en el recurso del servidor web.

Los métodos HTTP comunes son:

Metodos HTTP.img

## Encabezados de solicitud HTTP
Después de la línea de solicitud, los encabezados HTTP son seguidos por un salto de línea.

Existen varias posibilidades a la hora de incluir un encabezado HTTP en la solicitud HTTP. Un encabezado es un nombre que no distingue entre mayúsculas y minúsculas seguido de un :  y luego de un valor.

Los encabezados comunes son:

```null
Host: example.com
User-Agent: Mozilla/5.0 (Macintosh; Intel Mac OS X 10.9; rv:50.0) Gecko/20100101 Firefox/50.0
Accept: */*
Accept-Language: en
Content-type: text/json
```

* El  encabezado de Host  especifica el host del servidor e indica desde dónde se solicita el recurso.

* El  encabezado User-Agent  informa al servidor web sobre la aplicación que realiza la solicitud. Suele incluir el sistema operativo (Windows, Mac, Linux), la versión y el proveedor de la aplicación.

* El  encabezado Accept  informa al servidor web qué tipo de contenido aceptará el cliente como respuesta.

* El  encabezado Accept-Language  indica el idioma y, opcionalmente, la configuración regional que prefiere el cliente.

* El  encabezado Content-type  indica el tipo de contenido que se transmite en el cuerpo de la solicitud.

## Cuerpo de la solicitud HTTP

Las solicitudes HTTP pueden incluir opcionalmente un cuerpo de solicitud. El cuerpo de solicitud suele incluirse cuando se utilizan los métodos HTTP POST y PUT para transmitir datos.

```null
POST /users HTTP/1.1
Host: example.com

{
 "key1":"value1",
 "key2":"value2",
 "array1":["value3","value4"]
}
```

```null
PUT /users/1 HTTP/1.1
Host: example.com
Content-type: text/json

{"key1":"value1"}
```

## Respuestas HTTP
Cuando el servidor web termine de procesar la solicitud HTTP, enviará una respuesta HTTP.

La primera línea de la respuesta es la línea de estado. Esta línea muestra al cliente si la solicitud se realizó correctamente o si se produjo un error.

HTTP/1.1 200 OK

La línea comienza con la versión del protocolo HTTP, seguida del código de estado y una frase de motivo. La frase de motivo es una representación textual del código de estado.

## Códigos de estado HTTP

El primer dígito de un código de estado HTTP indica la categoría de la respuesta: Información, Exitosa, Redirección, Error del cliente o Error del servidor.

Los códigos de estado comunes que encontrarás para cada categoría son:

Codigos.img

## Encabezados de respuesta HTTP

Después de la línea de estado, hay encabezados de respuesta HTTP opcionales seguidos de un salto de línea.

De manera similar a los encabezados de solicitud, hay muchos encabezados HTTP posibles que se pueden incluir en la respuesta HTTP.

Los encabezados de respuesta comunes son:

```null
Date: Fri, 11 Feb 2022 15:00:00 GMT+2
Server: Apache/2.2.14 (Linux)
Content-Length: 84
Content-Type: text/html
```

El  encabezado de fecha  especifica la fecha y la hora en que se generó la respuesta HTTP.

El  encabezado del servidor  describe el software del servidor web utilizado para generar la respuesta.

El  encabezado Content-Length  describe la longitud de la respuesta.

El  encabezado Content-Type  describe el tipo de medio del recurso devuelto (por ejemplo, documento HTML, imagen, vídeo).

## Cuerpo de respuesta HTTP

A continuación de los encabezados de respuesta HTTP se encuentra el cuerpo de la respuesta HTTP, que es el contenido principal de la respuesta HTTP.

Puede contener imágenes, vídeos, documentos HTML y otros tipos de medios.

```null
HTTP/1.1 200 OK
Date: Fri, 11 Feb 2022 15:00:00 GMT+2
Server: Apache/2.2.14 (Linux)
Content-Length: 84
Content-Type: text/html

<html>
  <head><title>Test</title></head>
  <body>Test HTML page.</body>
</html>
```