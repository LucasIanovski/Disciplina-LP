import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double a, b, c, delta, x1, x2;
        // obs se delta for <0 não há raizes reais
        // se delta for = 0 há apenas uma raiz real
        // se delta for >0 há duas raizes reais

        System.out.print("Digite o valor de a: ");
        a = input.nextDouble();

        // Se a for zero, não é uma equação do segundo grau
        if (a == 0) {
            System.out.println("Erro: O valor de 'a' não pode ser zero em uma equação do segundo grau.");
        } else {
            System.out.print("Digite o valor de b: ");
            b = input.nextDouble();
            System.out.print("Digite o valor de c: ");
            c = input.nextDouble();

            // Calcula do delta math.pow eleva um número a uma determina potência
            delta = Math.pow(b, 2) - (4 * a * c);

            // Verificação
            if (delta > 0) {
                x1 = (-b + Math.sqrt(delta)) / (2 * a);
                x2 = (-b - Math.sqrt(delta)) / (2 * a);
                System.out.println("Duas raízes reais:");
                System.out.println("x1 = " + x1);
                System.out.println("x2 = " + x2);
            } else if (delta == 0) {
                x1 = -b / (2 * a);
                System.out.println("Uma única raiz real: x = " + x1);
            } else {
                System.out.println("Não existem raízes reais, por que o delta é negativo.");
            }
        }
    }
}