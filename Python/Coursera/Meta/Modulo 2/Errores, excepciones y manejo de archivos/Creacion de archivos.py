# with open('newfile.txt', 'w') as file:
#     file.writelines(['Este es un nuevo archivo creado con open en python', '\n Segunda linea echa python.'])


try:

    with open('sample/newfile.txt', 'a') as file:
        file.writelines(['\nEste es un nuevo archivo creado con open en python', '\nSegunda linea echa python.'])
except FileNotFoundError as e:
    print('Error:', e)