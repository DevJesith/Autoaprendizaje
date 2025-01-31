```markdown
# Conceptos Básicos de Alineación en CSS

## 1. Alineación de Texto
- **text-align**: Propiedad que controla la alineación del texto dentro de un elemento.
  - **Valores**:
    - **left**: Alinea el texto a la izquierda.
    - **right**: Alinea el texto a la derecha.
    - **center**: Centra el texto.
    - **justify**: Justifica el texto, distribuyendo el espacio uniformemente.

## 2. Alineación de Elementos HTML
- **Box Model**: Comprender cómo funciona el modelo de caja es crucial para alinear elementos. Cada elemento tiene márgenes, bordes, rellenos y contenido.
- **Margin**: Se utiliza para crear espacio alrededor de los elementos. `margin: auto` se usa para centrar elementos en su contenedor.
- **Width**: Para centrar un elemento, es necesario establecer un ancho específico.

## 3. Alineación de Elementos en Línea y de Bloque
- **Elementos de bloque**: Como `<div>`, ocupan todo el ancho disponible y comienzan en una nueva línea. Se pueden centrar usando `margin: auto`.
- **Elementos en línea**: Como `<img>`, no ocupan todo el ancho. Para centrar un elemento en línea, se puede cambiar su visualización a bloque (`display: block`).

## 4. Alineación Izquierda/Derecha
- **float**: Propiedad que permite que un elemento se desplace a la izquierda o derecha, permitiendo que el texto lo rodee.
  - **Ejemplo**: `float: right;` alinea un elemento a la derecha del contenedor.

## Resumen
- **text-align** para texto.
- **margin** y **width** para centrar elementos.
- **float** para alinear elementos a la izquierda o derecha.
```