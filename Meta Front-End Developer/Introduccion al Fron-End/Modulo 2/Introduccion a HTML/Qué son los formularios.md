```markdown
# Formularios HTML

Los **formularios HTML** son esenciales para la interacción del usuario en la web. Permiten a los usuarios enviar datos a un servidor. Aquí están los componentes clave:

- **Etiqueta `<form>`**: Define el inicio de un formulario.
- **Atributo `action`**: Especifica la URL a la que se enviarán los datos del formulario.
- **Método `GET` o `POST`**: Indica cómo se enviarán los datos. `GET` se usa para recuperar datos, mientras que `POST` se usa para enviar datos.

## Ejemplo 1: Formulario de inicio de sesión

```html
<form action="/login" method="POST">
    <label for="username">Nombre de usuario:</label>
    <input type="text" id="username" name="username" required>
    
    <label for="password">Contraseña:</label>
    <input type="password" id="password" name="password" required>
    
    <input type="submit" value="Iniciar sesión">
</form>
```

Descripcion

* Este formulario permite a los usuarios ingresar su nombre de usuario y contraseña.
* Al hacer clic en "Iniciar sesión", los datos se envían a la URL /login usando el método POST.

Ejemplo 2:
```html
<form action="/register" method="POST">
    <label for="email">Correo electrónico:</label>
    <input type="email" id="email" name="email" required>
    
    <label for="username">Nombre de usuario:</label>
    <input type="text" id="username" name="username" required>
    
    <label for="password">Contraseña:</label>
    <input type="password" id="password" name="password" required>
    
    <input type="submit" value="Registrarse">
</form>
```

Descripción:

Este formulario permite a los usuarios registrarse proporcionando su correo electrónico, nombre de usuario y contraseña.
Los datos se envían a la URL /register usando el método POST.
Resumen

Los formularios HTML son fundamentales para la interacción en la web, permitiendo a los usuarios enviar información. Puedes personalizar los formularios con diferentes tipos de entrada según la necesidad.

