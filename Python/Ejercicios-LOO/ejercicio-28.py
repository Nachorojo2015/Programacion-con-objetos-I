# 28. FizzBuzz: Imprimir por pantalla los números del 1 al 100 pero considerando lo siguiente: a) Si el número es divisible por 3 se debe imprimir "Fizz". b) Si el número es divisible por 5 se debe imprimir "Buzz". c) Si el número es divisible por 3 y por 5 se debe imprimir "FizzBuzz"

for i in range(101):
    if i % 3 == 0 and i % 5 == 0:
        print("FizzBuzz")
    elif i % 3 == 0:
        print("Fizz")
    elif i % 5 == 0:
        print("Buzz")
    

