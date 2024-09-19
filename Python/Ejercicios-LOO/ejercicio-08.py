# 8. Se ingresa por teclado un conjunto de valores numéricos enteros positivos, se pide informar, por cada uno, si el valor ingresado es par o impar. Para indicar el final se ingresará un valor cero o negativo.

num = int(input("Ingrese el número: "))

while num != 0:
    if num % 2 == 0:
        print(f"El número {num} es par");
    else:
        print(f"El número {num} es impar");
    
    num = int(input("Ingrese otro número: "))