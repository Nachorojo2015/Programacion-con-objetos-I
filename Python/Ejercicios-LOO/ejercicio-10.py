# 10. Desarrollar una función que muestre por pantalla los primeros n números naturales considerando al 0 (cero) como primer número natural, siendo n un valor que se pasa por parámetro.

def show_natural_numbers(n):
    for i in range(n):
        print(i)
    
show_natural_numbers(10)