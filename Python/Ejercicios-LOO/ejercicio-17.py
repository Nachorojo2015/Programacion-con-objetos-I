# 17. Se ingresa por consola un número entero que representa un sueldo que se debe pagar. 
# Considerando que existen billetes de las denominaciones que se indican más abajo; informar, 
# que cantidad de billetes de cada denominación se deberá utilizar, dando prioridad a los de valor nominal más alto. 
# Denominaciones ($) = {100, 50, 20, 10, 5, 2, 1}

sueldo = int(input("Ingrese sueldo: "))
billetes = [1000, 500, 200, 100, 50, 20, 10, 5, 2, 1]
cantidad_billetes = [0,0,0,0,0,0,0,0,0,0]
suma = 0;
i = 0;
while(suma != sueldo): 
    if suma + billetes[i] > sueldo:
        i += 1
    else:
        suma += billetes[i]
        cantidad_billetes[i] += 1

for i in range(len(cantidad_billetes)):
    print(f"Cantidad de billetes de ${billetes[i]}: {cantidad_billetes[i]}")



