import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int number, result;

        Scanner in = new Scanner(System.in); // Configura o Scanner

        System.out.println("Digite um número");
        number = in.nextInt();  // Lê o número inteiro
        result = number * number;    // Calcula o quadrado do número

        System.out.print("O Quadrado de " + number + " é " + result);  // Exibe o resultado


    }
}
