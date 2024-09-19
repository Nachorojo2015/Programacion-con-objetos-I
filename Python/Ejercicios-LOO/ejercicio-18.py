# 18. Implementar una función que recibe dos enteros de 8 dígitos con el formato aaaammdd, informar cuál de las dos es la anterior y cuál la posterior. Usar lo aplicado en ejercicio anterior

fechaUno = int(input("Ingrese fecha uno: "))
fechaDos = int(input("Ingrese fecha dos: "))

# Comparar años
if round(fechaUno // 10000) > round(fechaDos // 10000):
    print(fechaUno, "es mayor que", fechaDos)
else:
    if round(fechaUno // 10000) == round(fechaDos // 10000):
        # Comparar meses
        if round((fechaUno / 100) % 100) > round((fechaDos / 100) % 100):
            print(fechaUno, "es mayor que", fechaDos)
        else:
            if round((fechaUno / 100) % 100) == round((fechaDos / 100) % 100):
                # Comparar días
                if round(fechaUno % 100) > round(fechaDos % 100):
                    print(fechaUno, "es mayor que", fechaDos)
                else:
                    print(fechaDos, "es mayor que", fechaUno)
        print(fechaDos, "es mayor que", fechaUno)
    else:
        print(fechaDos, "es mayor que", fechaUno)   