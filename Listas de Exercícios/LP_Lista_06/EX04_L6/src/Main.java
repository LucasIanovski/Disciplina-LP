import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Entrada do nome
        System.out.print("Informe seu nome: ");
        String nome = in.next();

        // Menu estilo do professor
        gerarMenu(nome);

        // Entrada da string
        System.out.print("Digite a palavra ou frase: ");
        in.nextLine(); // limpa o buffer
        String texto = in.nextLine();

        // Verifica se é palíndromo
        boolean resultado = ehPalindromo(texto);

        // Exibe o resultado
        if (resultado) {
            System.out.println("É um palíndromo!");
        } else {
            System.out.println("Não é um palíndromo.");
        }
    }

    // Função para verificar se é palíndromo
    public static boolean ehPalindromo(String texto) {
        // Remove espaços e coloca tudo em minúsculas
        texto = texto.replaceAll("\\s+", "").toLowerCase();

        // Inverte a string
        String invertida = new StringBuilder(texto).reverse().toString();

        return texto.equals(invertida);
    }

    // Menu padrão
    public static void gerarMenu(String nome) {
        System.out.println("\nBem-vindo, " + nome + "!");
        System.out.println("----- MENU -----");
        System.out.println("1. Verificar palíndromo");
        System.out.println("2. (outras opções futuras)");
        System.out.println("-----------------\n");
    }
}
