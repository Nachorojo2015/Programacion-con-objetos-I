# 9. Sumados: Sumar los 1000 primeros números naturales (1 + 2 + 3 + 4 + … + 1000), imprimiendo por cada suma el resultado parcial obtenido.

sumatory = 0;

for i in range (1, 1001, 1):
    print(f"Suma: {sumatory}");
    sumatory += i;

print(f"La suma total es {sumatory}");