# 39. Desarrollar un programa que le permita al usuario ingresar un conjunto de 5 cadenas de caracteres. 
# Luego se debe imprimir el conjunto que el usuario ingresó, pero en orden inverso. 

cadenas = []

for i in range(5):
    cadena = input("Ingrese cadena: ")
    cadenas.append(cadena)

cadenas.reverse()

print(f"Conjunto de cadenas en orden inverso: {cadenas}")