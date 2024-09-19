# 33. Escribir una función que reciba dos matrices de NxN y devuelva la suma de las mismas. 
# Podemos considerar que las matrices se representan como un arreglo bidimensional

def sumaMatriz(matriz):
    suma = 0
    for i in range(matriz.__len__()):
        for j in range(matriz[i].__len__()):
            suma += matriz[i][j]

    return suma

print(sumaMatriz([[1,2,3],[1,2,3]]))
