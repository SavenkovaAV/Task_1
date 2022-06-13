public class PseudorandomNumberGenerator {

    public static void printPseudorandomNumbers(Coefficients coefficients) {
        generateNumbers(coefficients.getA(), coefficients.getQuantityOfNumbers());
    }

    private static void generateNumbers(int a, int quantityOfNumbers) {
        double largeNumber = Math.pow(2, 31);
        double result = 1;

        for (int i = 1; i <= quantityOfNumbers; i++) {
            result = a * result + i;
            System.out.println(result % largeNumber);
        }
    }
}
