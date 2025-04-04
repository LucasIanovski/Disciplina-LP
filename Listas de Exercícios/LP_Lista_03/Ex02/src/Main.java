import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);     //Scanner é a classe usada para entrada de dados.
        int num1, num2;

        System.out.println("Digite o primeiro número: ");
        num1 = input.nextInt();

        System.out.println("Digite o segundo número: ");
        num2 = input.nextInt();

        if (num1 > num2) {   //analisa se o num1 e maior que o num2
            System.out.println("O número maior é: " + num1);
        }
        else if (num2 > num1) {     //analisa se o num2 e maior que o num1
            System.out.println("O número maior é: " + num2);
        }
        else {      //caso nem uma das alternativas anteriores seja verdadeira
            System.out.println("Os dois números são iguais ");

        }
    }
}