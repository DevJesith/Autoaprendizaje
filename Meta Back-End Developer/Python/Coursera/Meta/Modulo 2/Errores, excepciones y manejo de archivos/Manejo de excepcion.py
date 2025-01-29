with open("test.txt", "r") as file:  # Abre el archivo en modo lectura
    data = file.readline()  # Lee la primera línea del archivo
    print(data)  # Imprime el contenido leído