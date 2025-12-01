
public class AgentesSecretos {
    public static void main(String[] args) {

        String str = "OSELNKTEPT-ANUEEREE";
        int filas = (int) Math.ceil(str.length() / 4.0);
        int col = 4;
        int index = 0;
        String mensaje = "";

      

        char matriz[][] = new char[filas][col];

        // Llenar la matriz por columnas (col -> filas)
        for (int j = 0; j < col; j++) {
            for (int i = 0; i < filas; i++) {
                matriz[i][j] = (index < str.length()) ? str.charAt(index++) : 'X';
            }
        }

        // Construir mensaje leyendo por filas
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < col; j++) {
                mensaje += matriz[i][j];
            }
        }
        System.out.println("*************** Mensaje desencriptado *********************");
        System.out.println("*                                                         *");
        System.out.println("*                                                         *");
        System.out.println("*          " + mensaje.replace("X", "") + "                            *");
        System.out.println("*                                                         *");
        System.out.println("***********************************************************");
      
    }
}
