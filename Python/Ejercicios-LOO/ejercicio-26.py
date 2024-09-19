# 26. Invertir un string, sin usar la biblioteca que lo haga automáticamente

s = input("Ingrese cadena: ")

t = ""

for i in range(s.__len__()):
    t = s[i] + t

print(t)