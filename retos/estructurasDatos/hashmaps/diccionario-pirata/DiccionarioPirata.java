import java.util.HashMap;

public class DiccionarioPirata {
    public static void main(String[] args) {

        // Diccionario pirata (emoji -> letra)
        HashMap<String, String> diccionario = new HashMap<>();
        diccionario.put("⛵", "A");  
        diccionario.put("⚓", "B");  
        diccionario.put("🏴‍☠️", "C");
        diccionario.put("💎", "D");
        diccionario.put("🌊", "E");
        diccionario.put("🗝️", "R");
        diccionario.put("🍹", "O");
        diccionario.put("🗺️", "T");
        diccionario.put("🔑", "S");

        String mensajeCifrado = "🗝️ ⛵ 🗺️ ⚓ 🌊 🔑";

        System.out.println("Mensaje cifrado: " + mensajeCifrado);

        String[] partes = mensajeCifrado.split(" ");
        String resultado = "";

        for (String emoji : partes) {
            if (diccionario.containsKey(emoji)) {
                resultado += diccionario.get(emoji);
            }
        }

        System.out.println("Mensaje descifrado: " + resultado);
    }
}
