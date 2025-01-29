# "If"
# De acuerdo con el ejemplo del interruptor de luz, el estado del interruptor se puede almacenar con un valor booleano de True (Verdadero) o False (Falso).

# On = Verdadero

# Off = Falso

#Light is currently off
# current = False

# if current:
#     current = False
#     print('Turning light off')

# if not current:
#     current = True
#     print('Turning light on')

#-------------------------------------------------------

# "If else"
# El código anterior funciona bien, pero se puede reescribir de manera más eficaz utilizando otra condición denominada else. El siguiente código es un ejemplo:

# current = False

# if current:
#     current = False
#     print('Turning light off')
# else: 
#     current = True
#     print('Turning light on')
#---------------------------------------------

# "elif"
# Python también tiene otra condición denominada elif que ayuda cuando tiene varias condiciones para satisfacer. El ejemplo del interruptor de luz es bastante sencillo en el que solo tiene que verificar el estado de encendido o apagado: True o False. En ciertas condiciones, puede que no sea tan simple Por suerte elif está aquí para ayudar.

# Supongamos que quiere ofrecer un determinado descuento a los clientes si gastan más de $100. También proporcionará un descuento adicional si ese cliente forma parte de un programa de fidelización. Si el cliente no forma parte del programa de fidelización y no gastó más de $100, se aplica un cargo por servicio del 5 %.

# loyalty_customer = True
# total_bill = 124

# if loyalty_customer and total_bill > 100:
#     #give 20% discount
#     total_bill = total_bill - (float(total_bill)/ 100) * 20
# elif total_bill > 100:
#     #give 10% discount
#     total_bill = total_bill - (float(total_bill)/ 100) * 10
# else:
#     #sorry no discount, 5% service charge applied.
#     print('Sorry, no discount ...')

# print('Total Bill: ', float(total_bill))

# El fragmento de código anterior primero verifica si el cliente forma parte del programa de fidelización y si está gastando más de $100. Si se cumplen ambas condiciones, se aplica un descuento del 20 % a la factura. La sentencia elif solo se ejecutará si no se cumple la primera condición if. El estado de cuenta elif solo verificará si la factura supera los $100 y si es así, aplicará un descuento del 10 % a la factura.

# La sentencia else final solo se ejecuta si no se cumple ninguna de las otras dos condiciones. En este caso, se aplica un cargo del 5 % a la factura.