/* 
🧩 Reto #1 – Números aleatorios sin repetir
📌 Nivel: Fácil

🎯 Fundamentos que practicarás:
-Declaración de variables
-Ciclos Para y Mientras
-Condicionales
-Vectores (arreglos)


🧠 Objetivo:
Genera 10 números aleatorios entre 1 y 20 sin que se repitan. */


import java.util.Arrays;

public class Aleatorios {
    public static void main(String[] args) {

        
     
        int[] vector = new int[10];// Creamos un vector de 10 elementos
        int size = 0;// Inicializamos el tamaño del vector a 0

        // Generamos números aleatorios entre 1 y 20 sin repetir
        while (size < 10) {
            boolean existe = false;// Variable para verificar si el número ya existe en el vector
            int aleatorio = (int) Math.floor(Math.random() * 20) + 1;// Generamos un número aleatorio entre 1 y 20

            // Verificamos si el número ya existe en el vector
            for (int cont = 0; cont < size; cont++) {
                // Si el número ya existe, cambiamos la variable existe a true y salimos del bucle
                if (vector[cont] == aleatorio) {
                    existe = true;
                    break;
                }

            }

            // Si el número no existe en el vector, lo añadimos al vector y aumentamos el tamaño
            if (!existe) {
                vector[size] = aleatorio;// Añadimos el número al vector
                size += 1;// Aumentamos el tamaño del vector
            }

        }

        System.out.println(Arrays.toString(vector));// Imprimimos el vector final con los números aleatorios generados

    }
}
