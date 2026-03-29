import java.util.Scanner;

public class SquareRootCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double number = scanner.nextDouble();

        int result = (int) Math.floor(Math.sqrt(number));
        System.out.println(result);
    }
}
