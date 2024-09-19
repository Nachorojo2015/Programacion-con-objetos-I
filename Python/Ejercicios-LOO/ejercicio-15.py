# 15. Dado un conjunto de valores numéricos indicar cuál es el mayor. El ingreso de datos finaliza con la llegada de un cero.

num = int(input("Ingrese un número: "));
max_num = 0;
while num != 0:
    if num > max_num:
        max_num = num;
    num = int(input("Ingrese otro número: "));
        
print(f"El mayor número inresado fue: {max_num}");