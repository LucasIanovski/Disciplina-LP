public class Main {
    public static void main(String[] args) {

        int celsius;
        double fahrenheit;

        for (celsius = -80; celsius <= 80; celsius += 10) {
            fahrenheit = (9.0 / 5) * celsius + 32;
            System.out.println(celsius + "ºC = " + fahrenheit + "ºF");
        }

    }
}
