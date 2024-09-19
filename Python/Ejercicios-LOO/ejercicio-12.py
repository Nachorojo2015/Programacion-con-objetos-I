# 12. Dado un conjunto de valores numéricos que se ingresan por teclado determinar el valor promedio. El fin de datos se indicará ingresando un valor igual a cero.

num = int(input("Ingrese un número: "));
sumatory = 0;
quantity = 0;

while num != 0:
    sumatory += num;
    quantity += 1;
    num = int(input("Ingrese otro número: "));
    
print(f"El promedio es {sumatory / quantity}");