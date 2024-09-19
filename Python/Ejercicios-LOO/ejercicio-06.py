# 6. Leer tres valores numéricos enteros, indicar cual es el mayor, cuál es el del medio y cuál el menor. Considerar que los tres valores son diferentes.

a = int(input("Ingrese número 1: "));
b = int(input("Ingrese número 2: "));
c = int(input("Ingrese número 3: "));

nums = [a,b,c];
nums.sort();
print(f"El mayor número es {nums[2]}, el del medio es {nums[1]} y el menor es {nums[0]}");