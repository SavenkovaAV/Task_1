import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Locale.setDefault(Locale.ROOT);

        System.out.println("Введите требуемое количество чисел");
        int quantityOfNumbers = readNumber();
        System.out.println("Введите число");
        int a = readNumber();
        Coefficients coefficients = new Coefficients(a, quantityOfNumbers);
        PseudorandomNumberGenerator.printPseudorandomNumbers(coefficients);
    }

    private static int readNumber() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }
}
