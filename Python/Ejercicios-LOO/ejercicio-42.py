# 42. Dado un conjunto de número enteros determinar cuántas veces se repite cada uno. 
# Los datos se ingresan sin ningún orden y finalizan al llegar el valor 0. 
# Se garantiza que a los sumo habrá 100 números diferentes.

nums = {}
num = int(input("Ingrese número: "))
while num != 0:
    if num in nums:
        nums[num] += 1
    else: 
        nums[num] = 1
    
    num = int(input("Ingrese otro número: "))
    

print(nums)