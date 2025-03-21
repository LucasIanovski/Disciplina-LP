import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int number, result;

        System.out.println("Write a number: ");

        Scanner in = new Scanner(System.in); //Configura o scanner para ler os dados que o usuário insere no teclado
        number = in.nextInt(); //Caso for usar string, usar apenas "in.next"

        result = number*2;
        System.out.println("Twice of " + number + " is: " + result); //Invés de usar "number*2", poderiamos criar outra variável e salvar o esta equação dentro dela
    }
}