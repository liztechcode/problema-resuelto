import math

str = "OSELNKTEPT-ANUEEREE"
filas = math.ceil(len(str)/4)
col =4
matriz = [['' for _ in range(col)] for _ in range(filas)]
index =0
print(str[index])

for j in range(col):
    for i in range(filas):
            matriz[i][j] = str[index] if index < len(str) else  'X'
            index += 1
        
print(matriz)

    
mensaje = ''
for i in range(filas):
    for j in range(col):
            mensaje += matriz[i][j]
            
print(mensaje)
        