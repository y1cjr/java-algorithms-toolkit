import java.util.Scanner;

public class BronzeMedalistFinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        int third = Integer.MIN_VALUE;

        while (scanner.hasNextInt()) {
            int num = scanner.nextInt();

            if (num > first) {
                third = second;
                second = first;
                first = num;
            } else if (num > second && num != first) {
                third = second;
                second = num;
            } else if (num > third && num != second && num != first) {
                third = num;
            }
        }

        System.out.println(third);
    }
}
