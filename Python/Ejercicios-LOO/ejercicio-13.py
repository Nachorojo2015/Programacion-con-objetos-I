# 13. Se ingresa un valor numérico por consola, determinar e informar si se trata de un número primo o no.

num = int(input("Ingrese un número: "));

for i in range(num):
    if num % i == 0 and i != 1 and i != num:
        print(f"El número {num} no es primo");
        break;
    else:
        print(f"El número {num} es primo");
        break;