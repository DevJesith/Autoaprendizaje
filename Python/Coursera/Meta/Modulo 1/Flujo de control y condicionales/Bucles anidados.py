# list1 = [1, 2, 3, 4, 5, 6, 7, 8, 9]
# list2 = [1, 2, 3, 4, 5, 6, 7, 8, 9]

# # Outer loop
# for x in list1:
#     # Inner loop
#     for y in list2:
#         print(y, end=" ")
#     print()

import time 
start_time = time.time()

for i in range(10):

    for j in range(1000):
        print(0, end = " ")
    print() # Para hacer al siguiente salto de linea cuando se complete el segundo bucle

print(round((time.time() - start_time), 2))

#EL import time es para poner una marca de tiempo de lo que se imprime el codigo
