import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Switch e melhor usar quando tiver várias comparações com o mesmo valor
        //(como em menus, dias da semana, e formas de pagamento).
        int opcao, parcelas;
        double valorCompra, valorFinal;

        System.out.print("Insira o valor da compra: ");
        valorCompra = input.nextDouble();

        System.out.println("------------------------------");
        System.out.println("Menu:");
        System.out.println("    1. Débito");
        System.out.println("    2. Pix");
        System.out.println("    3. Crédito");
        System.out.println("------------------------------");
        System.out.print("Escolha a forma de pagamento: ");
        opcao = input.nextInt();

        switch (opcao) { //lembrar sempre de declarar qual variavel o switch vai verificar
            case 1:
                valorFinal = valorCompra * 0.95;
                System.out.println("Débito Selecionado");
                System.out.println("Valor final da compra: R$ " + valorFinal);
                break;

            case 2:
                valorFinal = valorCompra * 0.90;
                System.out.println("Pix Selecionado");
                System.out.println("Valor final da compra: R$ " + valorFinal);
                break;

            case 3:
                System.out.println("Crédito Selecionado");
                System.out.print("Escolha o número de parcelas (1 a 10): ");
                parcelas = input.nextInt();

                if (parcelas >= 1 && parcelas <= 4) {
                    valorFinal = valorCompra * 1.02;
                    System.out.println("Valor final da compra: R$ " + valorFinal);
                } else if (parcelas >= 5 && parcelas <= 10) {
                    valorFinal = valorCompra * 1.05;
                    System.out.println("Valor final da compra: R$ " + valorFinal);
                } else {
                    System.out.println("Número de parcelas inválido!");
                }
                break; // lembrar de usar para parar o switch depois de executar um case

            default:
                System.out.println("Forma de pagamento inválida!");
        }
    }
}
