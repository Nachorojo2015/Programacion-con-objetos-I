# 16. Determinar el menor valor de un conjunto de números e indicar también su posición relativa dentro del mismo. 
# El ingreso de datos finaliza con la llegada de un cero.

num = int(input("Ingrese un número"));

pos = 0
menor = num

while num != 0:
    if num < menor:
        menor = num
    num = int(input("Ingrese otro número"))
    pos += 1

print(f"El menor número ingresado fue: {menor}")
print(f"Y se encuentra en la posición: {pos}")


    
