# 27. Escribir una función que reciba un string y lo devuelva invertido. 
# Por ejemplo: invertirCadena("Hola"),retorna "aloH". 
# Reutilice la función implementada para decir si una palabra es o no, un palíndromo. esPalindromo("neuquen") devuelve true


def invertirCadena(s):
    t = ""

    for i in range(s.__len__()):
        t = s[i] + t

    return t

print(invertirCadena("Spiderman"))