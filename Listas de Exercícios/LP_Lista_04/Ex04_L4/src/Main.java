public class Main {
    public static void main(String[] args) {
        int c;
        double f;

        for (c = -80; c <= 80; c += 10) {
            f = (9.0 / 5) * c + 32;
            System.out.println(c + "°C = " + f + "°F");
        }
    }
}
