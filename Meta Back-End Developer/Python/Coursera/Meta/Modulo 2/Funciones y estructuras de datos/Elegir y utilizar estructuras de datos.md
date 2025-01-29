Elegir y utilizar estructuras de datos
Esta lectura ilustra la importancia de seleccionar la estructura de datos correcta para la tarea en cuestión.

¿Qué estructura de datos elegir?
La parte complicada para los nuevos desarrolladores es entender qué estructura de datos es la adecuada para la solución requerida. Cada estructura de datos ofrece un enfoque diferente para almacenar, actualizar y tener acceso a la información almacenada dentro de ella. Puede haber muchos factores que se pueden seleccionar, como el tamaño, la velocidad y el rendimiento. La mejor manera de probar y entender cuál es más adecuada es a través de un ejemplo.

Ejemplo: lista de empleados
En este ejemplo, hay una lista de empleados que trabajan en un restaurante. Necesita poder encontrar a un empleado por su ID de empleado, un ID numérico basado en números. La función get_employee contiene un bucle for para iterar sobre la lista de empleados y devuelve un objeto empleado si el ID coincide.


employee_list = [{"id": 12345, "name": "John", "department": "Kitchen"}, {"id": 12458, "name": "Paul", "department": "House Floor"}]

def get_employee(id): 
    for employee in employee_list:
        if employee['id'] == id:
            return employee

print(get_employee(12458));
## OUTPUT
{'id': 12458, 'name': 'Paul', 'department': 'House Floor'}

<!-- --------------------------- -->


El código se ejecuta bien y devolverá al usuario Paul, ya que su ID, 12458, coincide. El desafío aparece cuando la lista se hace más grande. 

En lugar de dos empleados, puede tener 2,000 o incluso 20,000. El código tendrá que iterar sobre la lista secuencialmente hasta que el número coincida. 

Se podría optimizar el código para dividir la búsqueda, pero incluso con esto, seguiría teniendo un rendimiento inferior al de otras estructuras de datos, como el diccionario.


employee_dict = {
    12345: {
        "id": "12345",
        "name": "John", 
        "department": "Kitchen"    
    },
    12458: {
        "id": "12458",
        "name": "Paul", 
        "department": "House Floor"    

Reset
Observe cómo, en este bloque de código, si cambia la estructura de datos para utilizar un diccionario, le permitirá encontrar al empleado. La diferencia principal es que ya no necesita iterar sobre la lista para localizarlos. Si la lista se amplía a un tamaño mucho mayor, el tiempo de búsqueda para encontrar al empleado sigue siendo el mismo. 

Este es un buen ejemplo de cómo elegir la estructura de datos adecuada para la solución. 

Ambas funcionan bien, pero el equilibrio a considerar es el tiempo y la escala. La primera solución funcionará bien para cantidades pequeñas de datos, pero pierde rendimiento a medida que los datos aumentan. 

La segunda solución es más adecuada para grandes cantidades de datos, ya que su estructura permite un tiempo de búsqueda constante y de ese modo acceder a grandes cantidades de datos a una velocidad constante.

En este ejemplo se muestra que no hay ningún tamaño que se ajuste a todas las soluciones y que se debe considerar cuidadosamente la elección de la estructura de datos que se va a utilizar en función de las restricciones de la solución.