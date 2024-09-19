# 14. Desarrollar un algoritmo que muestre los primeros n números primos siendo n un valor que debe ingresar el usuario.

n = int(input("Ingrese un número: "));

primes = [];

for i in range(1, n):
    if n % i == 0 and i != 1 and i != n:
        continue
    else:
        primes.append(i);

print(primes);