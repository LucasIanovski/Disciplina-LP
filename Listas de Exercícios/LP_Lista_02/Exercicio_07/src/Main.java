import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double Milimetros, resultado;

        Scanner in = new Scanner(System.in); // Configura o Scanner

        System.out.println("Digite a medida em milimetros:");
        Milimetros = in.nextDouble();  // Lê a primeira medida

        resultado = Milimetros / 25.4;  // Calcula a média das duas notas

        System.out.println(" A medida em polegadas é " + resultado);  // Exibe o resultado
    }
}
