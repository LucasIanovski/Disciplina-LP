import java.util.Scanner; // Importa o Scanner para ler o que o usuário digita

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in); // Cria o leitor de teclado

        // 1. Pegando o nome do usuário
        String name;
        System.out.println("Informe seu nome:");
        name = in.next(); // Lê o nome e guarda na variável 'name'

        // 2. Gerando o menu
        gerarMenu(name); // Chama a função para mostrar o menu

        // 3. Definindo o vetor ordenado
        int[] numeros = {1, 3, 5, 7, 9, 11, 13, 15}; // Vetor já em ordem crescente

        // 4. Perguntando qual número o usuário quer buscar
        System.out.println("Digite o número que deseja buscar no vetor:");
        int valor = in.nextInt(); // Lê o valor digitado

        // 5. Chamando a função de busca binária (sem recursão)
        int posicao = buscaBinaria(numeros, valor); // Guarda a posição retornada

        // 6. Mostrando o resultado
        if (posicao != -1) {
            System.out.println("Número encontrado na posição: " + posicao);
        } else {
            System.out.println("Número não encontrado no vetor.");
        }

        System.out.println("\nPrograma finalizado."); // Mensagem de encerramento
    }

    // Função que mostra o menu na tela
    public static void gerarMenu(String name) {
        System.out.println("Bem-vindo: " + name);
        System.out.println("Menu:");
        System.out.println("1. Busca Binária (sem recursão)");
        System.out.println("2. (Outras opções)");
        System.out.println("3. (Futuras funcionalidades)");
    }

    // Função que realiza busca binária sem usar recursividade
    public static int buscaBinaria(int[] vetor, int valorBuscado) {
        int inicio = 0; // Começa na primeira posição do vetor
        int fim = vetor.length - 1; // Começa na última posição do vetor

        // Enquanto ainda houver elementos entre início e fim
        while (inicio <= fim) {
            int meio = (inicio + fim) / 2; // Calcula a posição do meio do intervalo

            if (vetor[meio] == valorBuscado) {
                return meio; // Achou o valor! Retorna a posição
            } else if (vetor[meio] < valorBuscado) {
                inicio = meio + 1; // O valor está na metade da direita
            } else {
                fim = meio - 1; // O valor está na metade da esquerda
            }
        }

        return -1; // Se saiu do while, o valor não foi encontrado
    }
}
