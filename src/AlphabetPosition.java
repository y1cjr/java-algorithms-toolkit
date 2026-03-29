import java.util.Scanner;

public class AlphabetPosition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char letter = scanner.next().charAt(0);

        letter = Character.toLowerCase(letter);
        int position = letter - 'a' + 1;

        System.out.println(position);
    }
}
