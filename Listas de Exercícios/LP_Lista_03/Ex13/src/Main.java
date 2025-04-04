import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // relenbrando Math.pow(x, 2): eleva x ao quadrado.
        //Math.sqrt(...): calcula a raiz quadrada
        //Math.PI: constante de pi
        int opcao;
        double raio, base, altura, area, perimetro;

        System.out.println("Menu:");
        System.out.println("    1. Círculo");
        System.out.println("    2. Triângulo Retângulo");
        System.out.println("    3. Retângulo");
        System.out.print("Escolha uma opção: ");
        opcao = input.nextInt();

        switch (opcao) {
            case 1:
                System.out.print("Informe o raio: ");
                raio = input.nextDouble();
                area = Math.PI * Math.pow(raio, 2);
                perimetro = 2 * Math.PI * raio;
                System.out.println("Área = " + area);
                System.out.println("Perímetro = " + perimetro);
                break;

            case 2:
                System.out.print("Informe a base: ");
                base = input.nextDouble();
                System.out.print("Informe a altura: ");
                altura = input.nextDouble();
                area = (base * altura) / 2;
                perimetro = base + altura + Math.sqrt(Math.pow(base, 2) + Math.pow(altura, 2)); // Hipotenusa
                System.out.println("Área = " + area);
                System.out.println("Perímetro = " + perimetro);
                break;

            case 3:
                System.out.print("Informe a base: ");
                base = input.nextDouble();
                System.out.print("Informe a altura: ");
                altura = input.nextDouble();
                area = base * altura;
                perimetro = 2 * (base + altura);
                System.out.println("Área = " + area);
                System.out.println("Perímetro = " + perimetro);
                break;

            default:
                System.out.println("Opção inválida!");
        }
    }
}
