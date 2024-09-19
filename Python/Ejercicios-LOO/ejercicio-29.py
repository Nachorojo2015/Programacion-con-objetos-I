# 29. Se tiene una tabla o planilla con los resultados de la última llamada a examen de una materia, con la siguiente información:

# - Matricula (valor numérico entero de 8 dígitos)
# - Nota (valor numérico entero de 2 dígitos entre 1 y 10)
# - Nombre (valor alfanumérico de 10 caracteres)
# - Se pide informar:
   # A. Cantidad de alumnos que se presentaron a rendir examen
   # B. Nota promedio
   # C. Nombre y nota del alumno que obtuvo el mejor resultado (será único)
# Para indicar el fin del ingreso de datos el operador ingresará un registro nulo con matrícula =0, nota=0 y nombre=""

matricula = int(input("Ingrese matrícula: "))
nota = int(input("Ingrese nota: "))
nombre = input("Ingrese nombre: ")
cantidad_alumnos = 0
suma_notas = 0
mejor_nota = 0
nombre_mejor_nota = ""

while matricula != 0 and nota != 0 and nombre.__len__() != 0:
    cantidad_alumnos += 1
    suma_notas += nota
    if nota > mejor_nota:
        mejor_nota = nota
        nombre_mejor_nota = nombre

    matricula = int(input("Ingrese otra matrícula: "))
    nota = int(input("Ingrese otra nota: "))
    nombre = input("Ingrese otro nombre: ")


print(f"Cantidad de alumnos que se presentaron a rendir el examen: {cantidad_alumnos}")
print(f"Nota promedio: {suma_notas / cantidad_alumnos}")
print(f"{nombre_mejor_nota} con una nota de {mejor_nota} hizo el mejor examen")