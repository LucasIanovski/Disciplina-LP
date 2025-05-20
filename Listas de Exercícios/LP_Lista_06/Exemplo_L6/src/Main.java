import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // inicialização do programa
        String name ;
        Scanner in = new Scanner(System.in);
        System.out.println("informe seu nome");
        name= in.next();

        gerarMenu(name);
        System.out.println("\n Executa outras ações \n");
        gerarMenu(name);

    }

    public static void gerarMenu (String name) {

        System.out.println("Bem vindo:" + name );
        System.out.println("Menu");
        System.out.println("OP1");
        System.out.println("OP2");
        System.out.println("OP3");

    }
}

// Funcao menu
// public determina que eu posso acessar essa função em outros diretórios
// private tambem e uma função so que não pode ser acessada por outros diretorios