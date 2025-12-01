#include <iostream>
#include <string>
#include <vector>
#include <cmath>

int main() {
    std::string str = "OSELNKTEPT-ANUEEREE";
    int col = 4;
    int filas = static_cast<int>(std::ceil(str.length() / 4.0));
    int index = 0;
    std::string mensaje = "";

    // Matriz dinámica filas x col de strings
    std::vector<std::vector<std::string>> matriz(filas, std::vector<std::string>(col));

    // Llenar la matriz por columnas
    for (int j = 0; j < col; j++) {
        for (int i = 0; i < filas; i++) {
            matriz[i][j] = (index < (int)str.length()) ? str.substr(index++, 1) : "X";
        }
    }

    // Construir el mensaje leyendo fila por fila
    for (int i = 0; i < filas; i++) {
        for (int j = 0; j < col; j++) {
            mensaje += matriz[i][j];
        }
    }

    std::cout << mensaje << std::endl;

    return 0;
}
