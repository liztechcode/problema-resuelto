import random

total = int(input("Ingrese el total deseado para cada suma (por ejemplo 28): "))
terminar = False

while not terminar:
    a = random.randint(1, total-2)
    d = random.randint(1, total-2)
    f = random.randint(1, total-2)

    # Derivamos e a partir de ecuación 3: e = total - f - a
    e = total - f - a
    # De ecuación 2: c = total - d - e
    c = total - d - e
    # De ecuación 1: b = total - a - c
    b = total - a - c

    if min(b, c, e) > 0:
        if (
            a + b + c == total and
            c + d + e == total and
            e + f + a == total
        ):
            print(f"\n✅ ¡Solución encontrada para total = {total}!")
            print(f"a: {a}, b: {b}, c: {c}, d: {d}, e: {e}, f: {f}")
            print(f"a+b+c = {a + b + c}")
            print(f"c+d+e = {c + d + e}")
            print(f"e+f+a = {e + f + a}")
            terminar = True

    

