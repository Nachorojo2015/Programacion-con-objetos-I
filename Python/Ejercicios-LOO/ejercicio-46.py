# 46. Implementar la función: busquedaBinaria(int [] arreglo, int valorBuscado) que recibe un arreglo de enteros y 
# un valor a buscar, y devuelve la posición del valor buscado, o -1 si el valor no se encuentra

def busqueda_binaria(arreglo, valor_buscado):
    # Primero, debemos asegurarnos de que el arreglo esté ordenado
    arreglo.sort()
    # Inicializamos dos variables para indicar el rango de búsqueda
    izquierda = 0
    derecha = len(arreglo) - 1
    # Mientras el rango de búsqueda no sea vacío
    while izquierda <= derecha:
        # Calculamos el índice del medio del rango
        medio = (izquierda + derecha) // 2
        # Si el valor del medio es igual al valor buscado, devolvemos el índ
        if arreglo[medio] == valor_buscado:
            return medio
        # Si el valor del medio es menor que el valor buscado, debemos buscar en el
        elif arreglo[medio] < valor_buscado:
            # Ampliamos el rango a la derecha
            izquierda = medio + 1
            # Si el valor del medio es mayor que el valor buscado, debemos buscar en el
        else:
            # Ampliamos el rango a la izquierda
            derecha = medio - 1
            # Si el valor buscado no se encuentra en el arreglo, devolvemos -1
            return -1

# Ejemplo de uso
arreglo = [1, 2, 3, 4, 5, 6]
print(busqueda_binaria(arreglo, 5))  # Salida: 4