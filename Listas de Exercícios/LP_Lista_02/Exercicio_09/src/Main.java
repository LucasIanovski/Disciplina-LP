import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double dkm, resultado;  // nome da variável

        Scanner in = new Scanner(System.in); // Configura o Scanner

        System.out.println("Digite a distancia em km:");
        dkm = in.nextDouble();  // Lê a primeira medida

        resultado = dkm / 1.609;  // Calcula a conversão de km para milhas

        System.out.println("A distancia em milhas é " + resultado);  // Exibe o resultado
    }
}
