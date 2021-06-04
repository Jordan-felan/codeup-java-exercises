import java.util.Random;
import java.util.Scanner;

public class HighLow {
    public static int highLow() {

        Random random = new Random();

        // Use Scanner for getting input from user
        Scanner scanner = new Scanner(System.in);

        // Use the random generator to
        // pick a number between 0 and 99 (inclusive)
        int number = random.nextInt(100);
        int guess = -1;

        // Loop until the user has guessed the number
        while (guess!=number) {

            // Prompt the user for their next guess
            System.out.print("Enter your guess: ");

            // Read the users guess
            guess = scanner.nextInt();

            // Check if the guess is high, low or correct
            if (guess<number) {
                // Guess is too low
                System.out.println("HIGHER, please try again");

            } else if (guess>number) {
                // Guess is too high
                System.out.println("LOWER, please try again");

            } else {

                // Guess is correct !!
                System.out.println("GOOD GUESS, the number was " + number);
            }
        }
        return number;
    };

    public static void main(String[] args) {
        System.out.println(highLow());
    }
}
