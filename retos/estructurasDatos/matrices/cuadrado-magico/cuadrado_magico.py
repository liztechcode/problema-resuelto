"""
🧩 Reto #5 - cuadrado magico

✨ Holas a todos ✨
Siempre agradezco mucho su presencia en este canal 🙌.
Entre mil cosas que hacer (y necesitando al menos 40 horas al día 😅) seguimos firmes en el objetivo de fomentar el aprendizaje y la practica en comunidad.🚀

 Esta semana nos reactivamos con un nuevo Problema de Programación:🎭
 EL CLUB SECRETO DE LOS MAGOS 🎭

En el  "Club de la Ilusión Perfecta", Los magos más prestigiosos del mundo solo pueden ingresar si traen una tarjeta de membresía con un cuadrado mágico válido. Verificar cada tarjeta manualmente a los guardianes del club les toma mucho tiempo, y los magos se impacientan.
Puedes crear un algoritmo que compruebe la veracidad de las tarjetas para agilizar el proceso?💡 

Ejemplo:
 2 7 6
 9 5 1
 4 3 8
 
Cada fila, cada columna y cada diagonal suman 15, por lo tanto, es un cuadro mágico. ✨
"""

matriz = [
    [3, 3, 3], 
    [3, 3, 3], 
    [3, 3, 3]
]

filas = []
col = []
resultados = 0

for i in range(3):
    suma = 0
    for j in range(3):
        suma = suma + matriz[i][j]
    filas.append(suma)


for j in range(3):
    suma = 0
    for i in range(3):
        suma = suma + matriz[j][i]
    col.append(suma)


diag1 = 0
for i in range(3):
    for j in range(3):
        if i == j:
            diag1 = diag1 + matriz[i][j]


diag2 = 0
for i in range(3):
    for j in range(3):
        if (i == 1 and j == 1) or (i == 0 and j == 2) or (i == 2 and j == 0):
            diag2 = diag2 + matriz[i][j]




print(f"suma de filas: {filas}")
print(f"suma de cols: {col}")
print(f"suma de la primera diagonal: {diag1}")
print(f"suma de la segunda diagonal: {diag2}")



if all(x == filas[0] for x in filas) and all(y == col[0] for y in col):

    resultados = filas[0]


if resultados == diag1 and resultados == diag2 and diag2 == diag1:
    print("el cuadrado es magico")
