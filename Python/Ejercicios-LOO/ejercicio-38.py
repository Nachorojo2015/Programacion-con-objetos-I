# 38. Desarrollar un programa que le permita al usuario ingresar un conjunto de 10 valores enteros. 
# Luego se debe imprimir el conjunto que el usuario ingresó, primero en el orden original y luego en el inverso. 
# Por ejemplo, si el usuario ingresa: 12, 43, 5, 26, 7, 98, 1, 32, 18, 9 la salida del programa debe ser la siguiente:

# - Orden original: 12 43 5 26 7 98 1 32 18 9

# - Orden inverso: 9 18 32 1 98 7 26 5 43 12

nums = []

for i in range(10):
    num = int(input(f"ingrese el valor {i+1}: "))
    nums.append(num)


print(f"Orden original: {nums}")

nums.reverse()

print(f"Orden inverso: {nums}")
