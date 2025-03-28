import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double milhas, resultado;  // nome da variável

        Scanner in = new Scanner(System.in); // Configura o Scanner

        System.out.println("Digite a distancia em milhas:");
        milhas = in.nextDouble();  // Lê a primeira medida

        resultado = milhas / 1.609;  // Calcula a conversão de milhas para km

        System.out.println("A distancia em km é " + resultado);  // Exibe o resultado
    }
}
