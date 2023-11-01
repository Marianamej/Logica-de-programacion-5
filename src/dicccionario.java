import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Random;
import java.util.HashSet;

class diccionario {

    public static void main(String[] args) {
        Map<String, String> diccionario = new HashMap<>();
        diccionario.put("Amor", "Love");
        diccionario.put("Perro", "Dog");
        diccionario.put("Leon", "Lion");
        diccionario.put("Feliz", "Happy");
        diccionario.put("Cama", "Bed");

        String[] palabrasEspanol = diccionario.keySet().toArray(new String[0]);
        Random random = new Random();
        HashSet<String> palabrasSeleccionadas = new HashSet<>();

        while (palabrasSeleccionadas.size() < 5) {
            int indiceAleatorio = random.nextInt(palabrasEspanol.length);
            palabrasSeleccionadas.add(palabrasEspanol[indiceAleatorio]);
        }

        Scanner scanner = new Scanner(System.in);
        int respuestasCorrectas = 0;
        int respuestasIncorrectas = 0;

        System.out.println("Por favor, traduce las siguientes palabras al inglés:");

        for (String palabra : palabrasSeleccionadas) {
            System.out.print(palabra + ": ");
            String traduccionUsuario = scanner.nextLine().trim().toLowerCase();
            String traduccionCorrecta = diccionario.get(palabra).toLowerCase();

            if (traduccionUsuario.equals(traduccionCorrecta)) {
                respuestasCorrectas++;
            } else {
                respuestasIncorrectas++;
            }
        }

        scanner.close();

        System.out.println("\nRespuestas correctas: " + respuestasCorrectas);
        System.out.println("Respuestas incorrectas: " + respuestasIncorrectas);
    }
}


