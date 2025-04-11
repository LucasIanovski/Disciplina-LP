public class Main {
    public static void main(String[] args) {
        int i, j;

        for (i = 1; i <= 10; i++) {
            System.out.println("Tabuada do " + i);
            for (j = 0; j <= 10; j++) {
                System.out.println(i + " x " + j + " = " + (i * j));
            }
            System.out.println();
        }
    }
}
