# 11. Escribir una función que calcule la suma de los múltiplos de 3 o 5, mayores o iguales que 0 y menores que un parámetro n. Por ejemplo la llamada:

def sum_multiples(n):
    sum = 0
    for i in range(n):
        if i % 3 == 0 or i % 5 == 0 and i < n:
            sum += i
    print(sum)

sum_multiples(16)