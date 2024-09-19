# 4. Se ingresa un valor numérico de 8 dígitos que representa una fecha con el siguiente formato aaaammdd. Se pide informar por separado el día, el mes y el año de la fecha ingresada.

date = int(input("Ingrese la fecha: "));

year = round(date / 10000);
month = round((date / 100) % 100);
day = date % 100;

print(f"La fecha es {year}/{month}/{day}");