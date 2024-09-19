# 40. Dado un conjunto de número enteros mayores o iguales a 0 y menores que 100 determinar e informar cuántas veces 
# aparece cada uno. El conjunto finaliza con la llegada de un valor negativo

num = int(input("Ingrese un número: "))

nums = {}

while (num >= 0 and num < 100):
    if num in nums:
        nums[num] += 1
    else:
        nums[num] = 1

    num = int(input("Ingrese otro número: "))

print(nums)

