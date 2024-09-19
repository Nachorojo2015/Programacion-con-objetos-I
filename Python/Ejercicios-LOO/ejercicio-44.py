# 44. Los números expansivos se definen de la siguiente forma:

# - El primer número expansivo es el 1. 

# - Dado un número expansivo x, para calcular el siguiente se ha de sustituir cada grupo de n cifras consecutivas 
# iguales que aparezcan en x (por ejemplo, 3333) por número n seguido de la cifra que se repite (en el ejemplo 43). 

# - Así, los primeros números expansivos son:

  # - 1 -> "un uno": 11
  # - 11 -> "dos unos": 21
  # - 21 -> "un dos, un uno": 1211
  # - 1211 -> "un uno, un dos, dos uno": 111221
  # - Se pide programar: A) una función "expand" que, dado un arreglo con las cifras de un número expansivo 
  # genere el siguiente. B) una función "list2num" que, dado un arreglo con las cifras de un número expansivo, devuelva 
  # el número correspondiente

def expand(num):
    result = []
    i = 0
    while i < len(num):
        count = 1
        while i + 1 < len(num) and num[i] == num[i + 1]:
            i += 1
            count += 1
        result.append(count)
        result.append(num[i])
        i += 1
    return result

def list2num(num):
    return int(''.join(map(str, num)))

num = [1]
expansions = expand(num)  
print(expansions) 

num = [1, 1]
expansions = expand(num)  
print(expansions)  

num = [1,2,1,2,1,1]
expansions = expand(num)
print(expansions)

num_as_number = list2num(expansions)
print(num_as_number)
   

    



