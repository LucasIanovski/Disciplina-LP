import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);


        System.out.print("Digite uma palavra ou frase: ");
        String texto = in.nextLine();


        String textoFormatado = texto.replaceAll("\\s+", "").toLowerCase();

        boolean resultado = verificarPalindromoRec(textoFormatado, 0, textoFormatado.length() - 1);

        if (resultado) {
            System.out.println("É palíndromo!");
        } else {
            System.out.println("Não é palíndromo!");
        }
    }

    // Função recursiva para verificar palíndromo
    public static boolean verificarPalindromoRec(String s, int inicio, int fim) {
        if (inicio >= fim) {
            return true;
        }
        if (s.charAt(inicio) != s.charAt(fim)) {
            return false;
        }
        // Chamada recursiva para o próximo par de caracteres
        return verificarPalindromoRec(s, inicio + 1, fim - 1);
    }
}
