public class Main {
    public static void main(String[] args) {
        // Vetor com 10 elementos
        int[] vetor = {1,2,3,4,5,6,7,8,9,10};
        // Loop para aplicar regra de modificação dos valores
        for (int i = 0; i < vetor.length; i++) {
            // Se o índice for par, soma 2. Se for ímpar, multiplica por 2
            vetor[i] = (i % 2 == 0) ? vetor[i] + 2 : vetor[i] * 2;
        }
        // Imprime todos os valores do vetor usando foreach
        for (int numero : vetor) {
            System.out.print(numero + " ");
        }
        System.out.println();
    }
}
