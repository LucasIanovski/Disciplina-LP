import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int number, result;

        System.out.println("Write a number: ");

        Scanner in = new Scanner(System.in); // Configura o scanner para ler os dados que o usuário insere no teclado
        number = in.nextInt(); // Lê o número inteiro inserido pelo usuário

        result = number * number; // Calcula o quadrado do número
        System.out.println("Square of " + number + " is: " + result); // Agora, a mensagem está correta para um cálculo de quadrado.

    }
}
