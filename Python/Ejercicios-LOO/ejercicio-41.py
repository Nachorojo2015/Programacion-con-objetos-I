# 41. Se tiene una tabla que detalla la facturación emitida por un comercio durante el período de un mes, 
# con el siguiente formato: nroFactura (número entero de 8 dígitos), día (número entero entre 1 y 31, importe (número real), 
# codCliente (alfanumérico, 5 caracteres). 
# Los datos no necesariamente están ordenados y puede haber más de una factura emitida en un mismo día. 
# Finaliza cuando se ingrese un nroFactura igual a cero. Se pide:

# - Total facturado por día, sólo para aquellos días en los que hubo facturación. 
# - Día de mayor facturación (será único) y monto total facturado ese día. 

numero_de_factura = int(input("Ingrese número de factura: "))
dia = int(input("Ingrese número de día: "))

if (dia < 1 or dia > 31):
    while(dia < 1 or dia > 31):
        dia = int(input("Dia inválido. Ingrese nuevamente el número de día: "))

codigo_cliente = input("Ingrese código de cliente: ")

mayor_factura = 0
dia_mayor_factura = 0

while numero_de_factura != 0:
    monto_factura = int(input("Ingrese monto de la factura: "))
    if monto_factura > mayor_factura:
        mayor_factura = monto_factura
        dia_mayor_factura = dia

    print(f"Total facturado el dia {dia}, ${monto_factura}")
    
    numero_de_factura = int(input("Ingrese otro número de factura: "))
    dia = int(input("Ingrese otro día: "))
    while(dia < 1 or dia > 31):
        dia = int(input("Dia inválido. Ingrese nuevamente el número de día: "))
    codigo_cliente = input("Igrese otro código de cliente: ")

print(f"Dia de mayor facturación: {dia_mayor_factura}. Monto total: ${mayor_factura}")
    








