# 45. Implementar la función: busquedaSecuencial(int [] arreglo, int valorBuscado) que recibe un arreglo de enteros y 
# un valor a buscar, y devuelve la posición del valor buscado, o -1 si el valor no se encuentra. 

def busqueda_secuencial(arreglo, valor_buscado):
    if arreglo.__contains__(valor_buscado):
        return arreglo.index(valor_buscado)
    else:
        return -1

nums = [1,2,4,7,8,10]
print(busqueda_secuencial(nums, 1)) # 4
