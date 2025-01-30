# Resumen del Sistema de Cuadrícula de Bootstrap

* Sistema de 12 columnas: Bootstrap utiliza un sistema de cuadrícula de 12 columnas que permite crear diseños responsivos. Esto significa que puedes dividir el espacio de la página en hasta 12 partes iguales.

* Contenedor: El contenedor es el elemento raíz de la cuadrícula. Contiene filas y columnas, y su ancho se ajusta según el punto de interrupción responsivo actual.

* Filas y columnas: Dentro de un contenedor, puedes agregar filas (.row) y dentro de cada fila, puedes agregar columnas (.col). Las columnas se pueden ajustar para ocupar diferentes cantidades de espacio.

## Ejemplo

Imagina que estás creando una página web para un restaurante. Quieres mostrar dos secciones: una para los precios y otra para el menú.

1. Estructura basica:
```html
<div class="container">
    <div class="row">
        <div class="col-4">Precios</div>
        <div class="col-8">Menú</div>
    </div>
</div>
```

2. Responsividad: Para dispositivos móviles, quieres que ambas columnas se apilen verticalmente. Para esto, puedes usar:

```html
<div class="container">
    <div class="row">
        <div class="col-12 col-lg-4">Precios</div>
        <div class="col-12 col-lg-8">Menú</div>
    </div>
</div>
```

En este ejemplo:

* En dispositivos móviles, cada columna ocupa 12 espacios (apiladas).

* En pantallas grandes, la columna de precios ocupa 4 espacios y la del menú 8.