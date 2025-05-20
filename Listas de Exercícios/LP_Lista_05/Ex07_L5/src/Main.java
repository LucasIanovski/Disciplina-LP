 public class Main {
    public static void main(String[] args) {
        // Cria uma matriz 5x5 já preenchida
        int[][] matriz = {{1,2,3,4,5},{2,2,2,2,2},{5,5,5,5,5},{9,0,1,2,3},{4,3,2,1,0}};
        int maiorLinha = 0, maiorColuna = 0, soma;
        // Percorre cada linha com foreach para calcular maior soma
        for (int[] linha : matriz) {
            soma = 0;
            for (int num : linha) soma += num;
            if (soma > maiorLinha) maiorLinha = soma;
        }
        // Percorre colunas com índice fixo
        for (int j = 0; j < matriz[0].length; j++) {
            soma = 0;
            for (int[] linha : matriz) soma += linha[j];
            if (soma > maiorColuna) maiorColuna = soma;
        }
        // Exibe os resultados
        System.out.println("Maior soma linha: " + maiorLinha);
        System.out.println("Maior soma coluna: " + maiorColuna);
    }
}