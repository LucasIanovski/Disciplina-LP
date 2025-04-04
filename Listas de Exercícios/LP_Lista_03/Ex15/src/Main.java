import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double dinheiro, troco, preco;
        int opcao;
        String bebida;

        System.out.print("Insira o dinheiro: R$ ");
        dinheiro = input.nextDouble();

        System.out.println("------------------------------"); // linha de separaçao
        System.out.println("Menu:");
        System.out.println("1. Café Expresso - R$ 0.50");
        System.out.println("2. Café Longo    - R$ 1.00");
        System.out.println("3. Capuccino     - R$ 2.50");
        System.out.println("4. Chocolate     - R$ 2.00");
        System.out.println("------------------------------"); // linha de separaçao
        System.out.print("Escolha uma opção: ");
        opcao = input.nextInt();

        switch (opcao) {
            case 1:
                bebida = "Café Expresso";
                preco = 0.50;
                break;
            case 2:
                bebida = "Café Longo";
                preco = 1.00;
                break;
            case 3:
                bebida = "Capuccino";
                preco = 2.50;
                break;
            case 4:
                bebida = "Chocolate";
                preco = 2.00;
                break;
            default:
                System.out.println("Opção inválida.");
                return; // Encerra o programa se a opção for inválida
        }

        if (dinheiro >= preco) {
            troco = dinheiro - preco;
            System.out.println("------------------------------");
            System.out.println("Bebida selecionada: " + bebida);
            System.out.printf("Seu troco: R$ %.2f\n", troco);
        } else {
            System.out.println("Saldo insuficiente para comprar " + bebida);
        }
    }
}
