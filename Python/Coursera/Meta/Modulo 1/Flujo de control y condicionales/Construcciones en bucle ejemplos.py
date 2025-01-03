# Bucle "For"
# Los bucles de datos son una tarea bastante común en cualquier lenguaje de programación. El bucle for facilita el trabajo con cualquier tipo de secuencia en Python.  Veamos algunos ejemplos de bucles for y las diferentes formas de utilizarlos.

# favorites = ['Creme Brulee', 'Apple Pie', 'Churros', 'Tiramisú', 'Chocolate Cake']

# for dessert in favorites:
#     print('One of my favorite desserts is', dessert)

# En el fragmento de código anterior, el bucle for itera sobre el contenido de la lista favorites e imprime una frase con el nombre del postre para cada elemento de la lista.

#El bucle for se basa en el tamaño o la longitud de los elementos a iterar.

#---------------------------------------------------------------

# Bucle "While"
# Por otro lado, un bucle while se basa en que una condición sea verdadera. Una vez que la condición ya no es verdadera, el bucle se detiene. La cantidad de veces que se ejecuta el bucle while no se conoce de antemano como ocurre con el bucle for. 

# Si toma el ejemplo de bucle anterior for y lo convierte en la alternativa de bucle while, terminará con algo así:

favorites = ['Creme Brulee', 'Apple Pie', 'Churros', 'Tiramisú', 'Chocolate Cake']

count = 0

while count < len(favorites):
    print('One of my favorite desserts is', favorites[count])
    count += 1


# Tome en cuenta que necesita declarar una variable counter. La variable counter se compara entonces con la longitud de la lista de favorites. A medida que se hace un bucle alrededor de los datos, se incrementa el counter. Una vez que la condición cont < len(favorites) ya no sea verdadera, el bucle se detendrá.
