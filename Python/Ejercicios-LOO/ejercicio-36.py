# 36. Escribir una función consonantes que recibe una cadena de caracteres y devuelve la cadena que resulta de 
# eliminar todas las vocales de la cadena recibida. 
# Por ejemplo: consonantes("hola como estas"); // devuelve "hl cm sts"

mensaje = input("Ingrese mensaje: ")
mensaje_sin_vocales = ""
for letra in mensaje:
    if letra.lower() not in 'aeiou':
        mensaje_sin_vocales += letra

print(mensaje_sin_vocales)