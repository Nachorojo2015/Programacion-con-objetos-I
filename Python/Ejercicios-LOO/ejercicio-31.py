# 31. Escribir una función que reciba un arreglo de enteros y devuelva la suma de los elementos 
# que se encuentran en posiciones pares (incluido el elemento de la posición 0). 
# Por ejemplo: Dado el arreglo [1, 2, 13 ,4, 8, 6] => devuelve 22 (1+13+8)


def sumarNumerosEnPosicionPar(nums):
    suma = 0
    for i in range(0, nums.__len__(), 2):
        suma += nums[i]

    return suma

print(sumarNumerosEnPosicionPar([1, 2, 13 ,4, 8, 6]))