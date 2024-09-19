# 35. Encriptar un mensaje usando el método de "la cifra del césar", que consiste en correr cada letra 
# -considerando la posición de cada una en el alfabeto- una determinada cantidad de lugares. 
# Ejemplo: si el corrimiento es de 2 lugares, la palabra "HOLA" se transforma en "JQNC". 
# Si el alfabeto termina antes de poder correr la cantidad de lugares necesarios, se vuelve a comenzar desde la 
# letra "a"


abc = "abcdefghijklmnopqrstuvwxyz"

mensaje = input("Ingrese un mensaje: ").lower()

corrimiento = int(input("Ingrese el corrimiento: "))

mensaje_cifrado = ""

for letra in mensaje:
    if abc.index(letra) + corrimiento <= abc.__len__() - 1:
        mensaje_cifrado += abc[abc.index(letra) + corrimiento]
    else:
        mensaje_cifrado += abc[abc.index(letra) + corrimiento - abc.__len__()]

print(mensaje_cifrado)




