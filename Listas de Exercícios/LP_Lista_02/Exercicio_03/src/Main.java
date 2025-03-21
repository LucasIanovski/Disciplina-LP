import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double number, result;

        System.out.println("Write a real number: ");

        Scanner in = new Scanner(System.in); // Configura o scanner para ler os dados que o usuário insere no teclado
        number = in.nextDouble(); // Lê o número real inserido pelo usuário

        result = number / 5; // Calcula a quinta parte do número
        System.out.println("The fifth part of " + number + " is: " + result); // Exibe o resultado

    }
}
