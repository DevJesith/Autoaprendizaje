# Tarea: Calculadora de Propinas
    # Crea un programa que ayude a calcular la propina de una cuenta en un restaurante.

# Requisitos:
    # El programa debe pedir al usuario:
    # El costo total de la cuenta (como un número decimal).
    # El porcentaje de propina que desea dejar (como un número entero).
    # Calcula la propina y el total a pagar (cuenta + propina).
    # Muestra en la consola:
    # El costo de la cuenta.
    # La propina calculada.
    # El total a pagar.

#Solucion

    # cuenta_total = float(input("Ingrese el costo total de la cuenta: "))
    # porcetaje_propina = int(input("Ingrese el porcentaje que desea dejar de propina: "))
    # propina_dar = cuenta_total * ( porcetaje_propina / 100) 
    # total = cuenta_total + propina_dar

    # print(f"El costo de la cuenta es de: {cuenta_total} \n La popina que deseas dejar es {porcetaje_propina} \n El total a pagar es de: {propina_dar} \n El total a pagar es de: {total} " )

#Asi lo hizo chatgpt

    # cuenta_total = float(input("Ingrese el costo total de la cuenta: "))
    # porcentaje_propina = int(input("Ingrese el porcentaje que desea dejar de propina: "))

    # # Calcular la propina y el total
    # propina_dar = cuenta_total * (porcentaje_propina / 100)
    # total = cuenta_total + propina_dar

    # # Mostrar los resultados
    # print(f"El costo de la cuenta es de: ${cuenta_total:.2f}")
    # print(f"La propina que deseas dejar es de: ${propina_dar:.2f}")
    # print(f"El total a pagar es de: ${total:.2f}")

#Dudas
    # La f al principio de un print indica que estás utilizando un string formateado, también conocido como f-string. Es una forma especial de crear cadenas en Python introducida en la versión 3.6, que permite insertar valores de variables o expresiones directamente dentro de la cadena, usando llaves {}.
    # .2, especifica que se mostraran 2 decimales
    # f, significa que el numero sera representado como numero de punto flotante (float)