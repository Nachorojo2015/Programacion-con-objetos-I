# 37. Escribir una función que reciba una cadena de caracteres muestre por pantalla la frecuencia de aparición de cada letra. 
# Por ejemplo: frecuencias("hola como estas..."); // debe mostrar por pantalla:

#   a: 2
#   c: 1
#   e: 1
#   h: 1
#   l: 1
#   m: 1
#   o: 3
#   s: 2
#   t: 1

def frecuencia_letras(frase):
    letras = {}
    for letra in frase:
        if letra in letras:
            letras[letra] += 1
        else:
            letras[letra] = 1
    print(letras)

mensaje = input("Ingrese un mensaje: ")
frecuencia_letras(mensaje)