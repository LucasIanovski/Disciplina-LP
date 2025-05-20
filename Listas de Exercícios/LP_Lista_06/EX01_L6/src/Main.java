import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // 1. Pegando o nome do usuario
        String name;
        System.out.println("Informe seu nome:");
        name = in.next();

        // 2. Gerando o menu
        gerarMenu(name);

        // 3. Pedindo um número inteiro positivo
        System.out.println("Digite um número inteiro positivo:");
        int n = in.nextInt();

        // 4. Chamando a função recursiva e mostrando o resultado
        int resultado = somaAte(n);
        if (resultado != -1) {
            System.out.println("A soma de 1 até " + n + " é: " + resultado);
        }

        System.out.println("\nPrograma finalizado.");
    }

    public static void gerarMenu(String name) {
        System.out.println("Bem-vindo: " + name);
        System.out.println("Menu:");
        System.out.println("OP1");
        System.out.println("OP2");
        System.out.println("OP3");
    }

    public static int somaAte(int n) {
        if (n <= 0) {
            System.out.println("Erro: o número deve ser maior que zero.");
            return -1;
        }
        if (n == 1) {
            return 1;
        }
        return n + somaAte(n - 1);
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
