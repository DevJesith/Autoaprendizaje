```markdown
# Creación de una Tabla en HTML

## Estructura Básica
- Utilizamos la etiqueta `<table>` para iniciar la tabla.
- Dentro de la tabla, usamos `<tr>` para definir cada fila.
- Usamos `<td>` para las celdas de datos.

## Agregar Encabezados
- Para hacer que la tabla sea más clara, podemos usar `<th>` para los encabezados de las columnas.

## Ejemplo Práctico

Supongamos que queremos crear una tabla para mostrar el menú de un restaurante con los precios.

```html
<table>
    <tr>
        <th>Plato</th>
        <th>Precio</th>
    </tr>
    <tr>
        <td>Falafel</td>
        <td>$10</td>
    </tr>
    <tr>
        <td>Pasta Salad</td>
        <td>$12</td>
    </tr>
</table>
```

Explicación del Ejemplo

* Encabezados: La primera fila contiene los encabezados "Plato" y "Precio" usando <th>.

* Datos: Las siguientes filas contienen los nombres de los platos y sus precios usando <td>.