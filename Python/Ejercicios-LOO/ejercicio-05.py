# 5. Leer dos valores numéricos enteros e indicar cual es el mayor y cual es el menor. Considerar que ambos valores son diferentes.

numOne = int(input("Ingrese número 1: "));
numTwo = int(input("Ingrese número 2: "));

if numOne > numTwo: 
    print(f"El número mayor es {numOne} y el menor es {numTwo}");
else:
    print(f"El número mayor es {numTwo} y el menor es {numOne}");