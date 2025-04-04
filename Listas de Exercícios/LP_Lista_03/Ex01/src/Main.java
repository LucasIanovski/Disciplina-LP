import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);     //Scanner é a classe usada para entrada de dados.
        double numero, raiz;

        System.out.println("Digite um numero: ");
        numero = input.nextDouble();

        if (numero >-0) {   //números negativos não têm raiz quadrada no sistema de números reais.
            raiz = Math.sqrt(numero);       //Math.sqrt() calcula a raiz quadrada.


            System.out.println("Raiz quadrada: " + raiz);
        }
        else {
            System.out.println("Valor inválido!");
        }
    }
}