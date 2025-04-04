import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int lado1, lado2, lado3;

        // (&&) exige que tds as cond sejam vdd, enquanto o (||) aceita pelo menos uma
        // tipos de trinagulos: Três lados iguais = Equilátero, Dois lados iguais = Isósceles, Todos diferentes = Escaleno

        // Entrada dos lados do triângulo
        System.out.print("Digite o primeiro lado: ");
        lado1 = input.nextInt();

        System.out.print("Digite o segundo lado: ");
        lado2 = input.nextInt();

        System.out.print("Digite o terceiro lado: ");
        lado3 = input.nextInt();

        // Verificar se os lados formam um triângulo
        if (lado1 + lado2 > lado3 && lado1 + lado3 > lado2 && lado2 + lado3 > lado1) {
            // Determinar o tipo de triângulo
            if (lado1 == lado2 && lado2 == lado3) { //&& operador lógico usado para verificar se duas ou mais condições são verdadeiras
                System.out.println("Triângulo Equilátero");
            } else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
                System.out.println("Triângulo Isósceles");
            } else {
                System.out.println("Triângulo Escaleno");
            }
        } else {
            System.out.println("Os valores não formam um triângulo.");
        }
    }
}
