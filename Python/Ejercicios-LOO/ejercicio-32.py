# 32. Implementar una función que reciba como parámetro un arreglo de enteros y muestre por pantalla 
# cuántas veces se repite cada uno. El arreglo no está ordenado. Se garantiza que a los sumo habrá 100 números diferentes

def contarNumerosRepetidos(nums):
    quantity = {}
    for i in range(nums.__len__()):
        if nums[i] in quantity:
            quantity[nums[i]] += 1
        else:
            quantity[nums[i]] = 1

    print(quantity)

def generarNumerosRandom():
    import random
    return [random.randint(1, 100) for i in range(100)]
            
numerosRandom = generarNumerosRandom()

contarNumerosRepetidos(numerosRandom)

