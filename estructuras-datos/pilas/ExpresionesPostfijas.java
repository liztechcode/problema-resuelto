// 🧩 RETO #2: EVALUADOR DE EXPRESIONES POSTFIJAS (RPN)



import java.util.Stack;
import java.util.Arrays;

public class ExpresionesPostfijas {
    public static void main(String[] args) {
        // dato de entrada
        String dato = "532+*";
        // Convertimos el dato en un array de caracteres
        String[] vector = dato.split("");
        // Usamos una pila para almacenar los números
        Stack<Integer> pila = new Stack<>();
        // Variable para almacenar el resultado de las operaciones
        int resultado = 0;

        // Imprimimos el vector de entrada
        System.out.println(Arrays.toString(vector));

        // Iteramos sobre cada elemento del vector
        for (int i = 0; i < vector.length; i++) {
            // Intentamos convertir el elemento a un número entero o realizar una operación
            try {
                int num = Integer.parseInt(vector[i]);    // Intentamos convertir el elemento a un número entero
                pila.push(num);  // Si es un número, lo añadimos a la pila

            } catch (NumberFormatException e) {
                resultado = realizeOperacion(vector[i], pila);// Si no es un número, es un operador, llamamos a la función para realizar la operación, pasando el operador y la pila
                pila.push(resultado);// guardamos el resultado de la operación en la pila
            }
        }

        System.out.println("Resultado final: " + pila.pop());// Imprimimos el resultado final, que es el último elemento de la pila
    }

    // Esta función realiza la operación correspondiente según el operador recibido
    public static int realizeOperacion(String op, Stack<Integer> pila) {
        // Verificamos que haya al menos dos números en la pila para operar
        if (pila.size() >= 2) {
            int numA = pila.pop();// Sacamos el último número de la pila
            int numB = pila.pop();// una vez mas sacamos el ultimo número de la pila

            // Dependiendo del operador, realizamos la operación correspondiente y devolvemos el resultado
            switch (op) {
                case "*":
                    return numB * numA;
                case "+":
                    return numB + numA;
                case "-":
                    return numB - numA;
                case "/":
                    return numB / numA;
                default:
                    System.out.println("Operador no válido: " + op);
                    return 0;
            }
        } else {
            System.out.println("No hay suficientes elementos en la pila.");
            return 0;// Si no hay suficientes elementos, devolvemos 0
        }
    }
}
