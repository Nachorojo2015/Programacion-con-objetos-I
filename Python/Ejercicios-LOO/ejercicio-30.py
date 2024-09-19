# 30. Escribir una función que reciba un arreglo de enteros y devuelva true si el arreglo está ordenado de mayor a menor y false si está desordenado

def isSort(nums):
    return nums == sorted(nums)

print(isSort([1,2,3,4,5]))