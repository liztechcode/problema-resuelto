# 🧩 RETO #2: EVALUADOR DE EXPRESIONES POSTFIJAS (RPN)

¿Sabés qué son las expresiones postfijas? Es una forma de escribir operaciones matemáticas donde el operador va DESPUÉS de los números:

- Normal: 3 + 4 * 2 (confuso por precedencia) 
- Postfija: 3 4 + 2 * (sin confusión)

🎯 En este ejercicio: 
Evaluar: "3 4 + 2 x” 
Resultado esperado: 14

Evaluar: “5 3 2 + x”
Resultado: 25

💡 Pista clave: Procesas de izquierda a derecha:
  - Si es número → guardalo
  - Si es operador → usa los últimos dos números
  - Opera los dos últimos números cuando aparece un operador 

