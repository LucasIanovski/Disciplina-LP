import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Declaração de variáveis
        Scanner in = new Scanner(System.in);
        String nome;
        int n, resultado;

        // Pegando o nome do usuário
        System.out.print("Informe seu nome: ");
        nome = in.next();

        // Exibindo o menu
        mostrarMenu(nome);

        // Pedindo um número inteiro positivo
        do {
            System.out.print("Digite um número inteiro positivo: ");
            n = in.nextInt();
        } while (n <= 0); // Validação: só aceita números maiores que 0

        // Chamando a função normal que soma até N
        resultado = somaAteN(n);

        // Exibindo o resultado
        System.out.println("A soma de 1 até " + n + " é: " + resultado);
    }

    // Função para exibir o menu
    public static void mostrarMenu(String nome) {
        System.out.println("\nBem-vindo, " + nome);
        System.out.println("==== MENU ====");
        System.out.println("1. Somar até N");
        System.out.println("2. Outra opção");
        System.out.println("3. Sair");
    }

    // Função com laço for para somar os números de 1 até N
    public static int somaAteN(int n) {
        int soma = 0;
        for (int i = 1; i <= n; i++) {
            soma += i;
        }
        return soma;
    }
}


// Funcao menu
// public determina que eu posso acessar essa função em outros diretórios
// private tambem e uma função so que não pode ser acessada por outros diretorios


// correcao exercicio feito pelo profesor

//import java.util.Scanner;
//
//public class Main {
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//      do{
//System.out.println("digite um numero o número deve ser maior que zero.");
// n = in.nextInt();
// }while (n<=0);
//}
//
//public static int somaAntecessores(int n) {
//int soma = 0;
//
//for (int i=n; i>0;i--){
//  soma+=i;
// }
//return soma;
//}
//}
