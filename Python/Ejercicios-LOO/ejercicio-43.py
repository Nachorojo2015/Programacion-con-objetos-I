# 43. Se ingresa un conjunto de ternas de valores que representan el año, el grado y la cantidad de alumnos 
# que se inscribieron en un colegio durante ese año y para ese grado en particular. 
# Solo se ingresará la información comprendida entre los años 2000 y 2009. 
# En el colegio, los alumnos cursan desde el primer grado hasta el séptimo. 
# Los datos se ingresan sin ningún tipo de orden. Se pide:

# - Emitir un listado ordenado por año detallando para cada año la cantidad de inscriptos por grado.

# - Emitir un listado ordenado por grado detallando para cada grado la cantidad de inscriptos por año.

año = int(input("Ingrese año: "))

while año < 2000 or año > 2009:
    año = int(input("Ingrese año entre 2000 y 2009: "))

grado = int(input("Ingrese grado: "))

while grado < 1 or grado > 7:
    grado = input("Ingrese grado entre 1 y 7: ")

cantidad_alumnos = input("Ingrese cantidad de alumnos: ")

inscriptos = []

while año >= 2000 and año <= 2009:
    inscriptos.append({"año": año, "grado": grado, "cantidad": cantidad_alumnos})
    año = int(input("Ingrese otro año entre 2000 y 2009: "))
    grado = int(input("Ingrese otro grado entre 1 y 7: "))
    cantidad_alumnos = input("Ingrese otra cantidad de alumnos: ")

print(sorted(inscriptos, key=lambda x: x["año"]))
print(sorted(inscriptos, key=lambda x: x["grado"]))    

