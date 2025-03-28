import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double milimetros, resultado;  // nome da variável

        Scanner in = new Scanner(System.in); // Configura o Scanner

        System.out.println("Digite a medida em polegadas:");
        milimetros = in.nextDouble();  // Lê a primeira medida

        resultado = milimetros * 25.4;  // Calcula a conversão de milímetros para polegadas

        System.out.println("A medida em milimetros é " + resultado);  // Exibe o resultado
    }
}
