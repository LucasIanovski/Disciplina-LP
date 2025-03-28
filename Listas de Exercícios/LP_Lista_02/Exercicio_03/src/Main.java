import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
      double number, result;

        Scanner in = new Scanner(System.in); // Configura o Scanner

        System.out.println("Digite um número");
        number = in.nextDouble();  // Lê o número real
        result = number / 5;       // Calcula a quinta parte do número

        System.out.print("A quinta parte de " + number + " é " + result);  // Exibe o resultado


    }
}
